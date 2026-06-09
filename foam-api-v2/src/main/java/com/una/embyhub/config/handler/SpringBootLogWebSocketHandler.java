/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ch.qos.logback.classic.Level
 *  ch.qos.logback.classic.Logger
 *  ch.qos.logback.classic.LoggerContext
 *  ch.qos.logback.classic.spi.ILoggingEvent
 *  ch.qos.logback.classic.spi.IThrowableProxy
 *  ch.qos.logback.classic.spi.ThrowableProxyUtil
 *  ch.qos.logback.core.Appender
 *  ch.qos.logback.core.AppenderBase
 *  ch.qos.logback.core.Context
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 *  org.springframework.web.servlet.mvc.method.annotation.SseEmitter
 *  org.springframework.web.socket.CloseStatus
 *  org.springframework.web.socket.TextMessage
 *  org.springframework.web.socket.WebSocketMessage
 *  org.springframework.web.socket.WebSocketSession
 *  org.springframework.web.socket.handler.TextWebSocketHandler
 */
package com.una.embyhub.config.handler;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SpringBootLogWebSocketHandler
extends TextWebSocketHandler {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(SpringBootLogWebSocketHandler.class);
    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();
    private static final DateTimeFormatter LOG_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter LOG_FILE_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final int HISTORY_RETENTION_DAYS = 3;
    private static final int DEFAULT_HISTORY_LIMIT = 500;
    private static final int MAX_HISTORY_LIMIT = 5000;
    private final Path historyDirectory;
    private final Object historyWriteLock = new Object();
    private volatile LocalDate lastCleanupDate;
    private final Map<String, WebSocketSession> sessions = new ConcurrentHashMap<String, WebSocketSession>();
    private final Map<String, Level> sessionLogLevels = new ConcurrentHashMap<String, Level>();
    private final Map<String, SseEmitter> sseEmitters = new ConcurrentHashMap<String, SseEmitter>();
    private final Map<String, Level> sseLogLevels = new ConcurrentHashMap<String, Level>();
    private final Map<String, Object> sseSendLocks = new ConcurrentHashMap<String, Object>();
    private final LogWebSocketAppender logAppender;

    public SpringBootLogWebSocketHandler(@Value(value="${foam.log.history-dir:}") String configuredHistoryDir) {
        this.historyDirectory = this.resolveHistoryDirectory(configuredHistoryDir);
        this.logAppender = new LogWebSocketAppender();
        LoggerContext loggerContext = (LoggerContext)LoggerFactory.getILoggerFactory();
        this.logAppender.setContext((Context)loggerContext);
        this.logAppender.start();
        ch.qos.logback.classic.Logger rootLogger = loggerContext.getLogger("ROOT");
        rootLogger.addAppender((Appender)this.logAppender);
        log.info("Spring Boot \u65e5\u5fd7\u5386\u53f2\u76ee\u5f55: {}", (Object)this.historyDirectory.toAbsolutePath());
    }

    public void afterConnectionEstablished(WebSocketSession session) {
        String sessionId = session.getId();
        this.sessions.put(sessionId, session);
        Level logLevel = this.getLogLevelFromSession(session);
        this.sessionLogLevels.put(sessionId, logLevel);
        log.info("\u65b0\u7684WebSocket\u8fde\u63a5\u5efa\u7acb\uff0c\u4f1a\u8bddID: {}, \u65e5\u5fd7\u7ea7\u522b\u8fc7\u6ee4: {}", (Object)sessionId, (Object)logLevel);
        this.sendMessage(sessionId, "\u5df2\u8fde\u63a5\u5230\u65e5\u5fd7\u670d\u52a1\uff0c\u5f53\u524d\u65e5\u5fd7\u7ea7\u522b: " + String.valueOf(logLevel));
    }

    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        String sessionId = session.getId();
        this.sessions.remove(sessionId);
        this.sessionLogLevels.remove(sessionId);
        log.info("WebSocket\u8fde\u63a5\u5173\u95ed\uff0c\u4f1a\u8bddID: {}", (Object)sessionId);
    }

    private Level getLogLevelFromSession(WebSocketSession session) {
        try {
            String[] pairs;
            URI uri = session.getUri();
            if (uri == null) {
                return Level.INFO;
            }
            String query = uri.getQuery();
            if (query == null || query.isEmpty()) {
                return Level.INFO;
            }
            ConcurrentHashMap<String, String> parameters = new ConcurrentHashMap<String, String>();
            for (String pair : pairs = query.split("&")) {
                int idx = pair.indexOf("=");
                String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), StandardCharsets.UTF_8.name()) : pair;
                String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), StandardCharsets.UTF_8.name()) : "";
                parameters.put(key, value);
            }
            String levelParam = (String)parameters.get("level");
            if (levelParam != null && !levelParam.isEmpty()) {
                return Level.toLevel((String)levelParam.toUpperCase(), (Level)Level.INFO);
            }
        }
        catch (Exception e) {
            log.error("\u89e3\u6790\u65e5\u5fd7\u7ea7\u522b\u53c2\u6570\u5931\u8d25: {}", (Object)e.getMessage());
        }
        return Level.INFO;
    }

    private void sendMessage(String sessionId, String message) {
        WebSocketSession session = this.sessions.get(sessionId);
        if (session != null && session.isOpen()) {
            try {
                session.sendMessage((WebSocketMessage)new TextMessage((CharSequence)message));
            }
            catch (IOException e) {
                log.error("\u53d1\u9001\u6d88\u606f\u5931\u8d25: {}", (Object)e.getMessage());
            }
        }
    }

    public SseEmitter createSseEmitter(Level level, Integer historyLimit) {
        Level resolvedLevel = level == null ? Level.INFO : level;
        int resolvedHistoryLimit = this.normalizeHistoryLimit(historyLimit);
        SseEmitter emitter = new SseEmitter(Long.valueOf(0L));
        String emitterId = UUID.randomUUID().toString();
        this.sseEmitters.put(emitterId, emitter);
        this.sseLogLevels.put(emitterId, resolvedLevel);
        this.sseSendLocks.put(emitterId, new Object());
        emitter.onCompletion(() -> this.removeSseEmitter(emitterId));
        emitter.onTimeout(() -> this.removeSseEmitter(emitterId));
        emitter.onError(ex -> this.removeSseEmitter(emitterId));
        boolean connected = this.sendSseEvent(emitterId, "connected", "\u5df2\u8fde\u63a5\u5230\u65e5\u5fd7\u670d\u52a1\uff0c\u5f53\u524d\u65e5\u5fd7\u7ea7\u522b: " + String.valueOf(resolvedLevel) + "\uff0c\u5386\u53f2\u4fdd\u7559\u5929\u6570: 3");
        if (!connected) {
            this.removeSseEmitter(emitterId);
            return emitter;
        }
        this.replayRecentHistoryToSse(emitterId, resolvedLevel, resolvedHistoryLimit);
        return emitter;
    }

    private void removeSseEmitter(String emitterId) {
        this.sseEmitters.remove(emitterId);
        this.sseLogLevels.remove(emitterId);
        this.sseSendLocks.remove(emitterId);
    }

    private int normalizeHistoryLimit(Integer historyLimit) {
        if (historyLimit == null || historyLimit <= 0) {
            return 500;
        }
        return Math.min(historyLimit, 5000);
    }

    private Path resolveHistoryDirectory(String configuredHistoryDir) {
        if (configuredHistoryDir != null && !configuredHistoryDir.isBlank()) {
            return Paths.get(configuredHistoryDir.trim(), new String[0]);
        }
        return Paths.get("data", "log");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean sendSseEvent(String emitterId, String eventName, String data) {
        SseEmitter emitter = this.sseEmitters.get(emitterId);
        Object lock = this.sseSendLocks.get(emitterId);
        if (emitter == null || lock == null) {
            return false;
        }
        try {
            Object object = lock;
            synchronized (object) {
                emitter.send(SseEmitter.event().name(eventName).data((Object)data));
            }
            return true;
        }
        catch (Exception ex) {
            this.removeSseEmitter(emitterId);
            return false;
        }
    }

    private void replayRecentHistoryToSse(String emitterId, Level minLevel, int historyLimit) {
        try {
            this.cleanupExpiredHistoryFiles(LocalDate.now(DEFAULT_ZONE));
            List<Path> historyFiles = this.listHistoryFilesWithinRetention();
            if (historyFiles.isEmpty()) {
                return;
            }
            ArrayDeque<String> recentLines = new ArrayDeque<String>(historyLimit);
            for (Path historyFile : historyFiles) {
                this.collectRecentHistoryLines(historyFile, minLevel, historyLimit, recentLines);
            }
            for (String line : recentLines) {
                if (this.sendSseEvent(emitterId, "log", line)) continue;
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void collectRecentHistoryLines(Path historyFile, Level minLevel, int historyLimit, Deque<String> recentLines) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(historyFile, StandardCharsets.UTF_8);){
            String line;
            while ((line = reader.readLine()) != null) {
                ParsedHistoryLine parsed = this.parseHistoryLine(line);
                if (parsed == null || !parsed.level().isGreaterOrEqual(minLevel)) continue;
                recentLines.addLast(parsed.message());
                if (recentLines.size() <= historyLimit) continue;
                recentLines.removeFirst();
            }
        }
    }

    private ParsedHistoryLine parseHistoryLine(String line) {
        int secondTab;
        if (line == null || line.isEmpty()) {
            return null;
        }
        int firstTab = line.indexOf(9);
        int n = secondTab = firstTab < 0 ? -1 : line.indexOf(9, firstTab + 1);
        if (firstTab <= 0 || secondTab <= firstTab) {
            return null;
        }
        String levelString = line.substring(firstTab + 1, secondTab);
        String message = this.unescapeHistoryLog(line.substring(secondTab + 1));
        return new ParsedHistoryLine(Level.toLevel((String)levelString, (Level)Level.INFO), message);
    }

    private List<Path> listHistoryFilesWithinRetention() throws IOException {
        if (!Files.exists(this.historyDirectory, new LinkOption[0])) {
            return List.of();
        }
        LocalDate minDate = LocalDate.now(DEFAULT_ZONE).minusDays(2L);
        try (Stream<Path> stream = Files.list(this.historyDirectory);){
            List<Path> list = stream.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).filter(path -> this.isWithinRetention((Path)path, minDate)).sorted(Comparator.comparing(path -> path.getFileName().toString())).toList();
            return list;
        }
    }

    private boolean isWithinRetention(Path path, LocalDate minDate) {
        LocalDate fileDate = this.parseHistoryFileDate(path);
        return fileDate != null && !fileDate.isBefore(minDate);
    }

    private LocalDate parseHistoryFileDate(Path path) {
        String filename = path.getFileName().toString();
        if (!filename.endsWith(".log")) {
            return null;
        }
        String datePart = filename.substring(0, filename.length() - 4);
        try {
            return LocalDate.parse(datePart, LOG_FILE_DATE_FORMATTER);
        }
        catch (Exception ex) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void persistHistoryLog(ILoggingEvent event, String formattedLog) {
        try {
            long timestamp = event.getTimeStamp();
            LocalDate eventDate = Instant.ofEpochMilli(timestamp).atZone(DEFAULT_ZONE).toLocalDate();
            String fileName = eventDate.format(LOG_FILE_DATE_FORMATTER) + ".log";
            String cleanLog = this.escapeHistoryLog(formattedLog);
            String line = timestamp + "\t" + String.valueOf(event.getLevel()) + "\t" + cleanLog + System.lineSeparator();
            Object object = this.historyWriteLock;
            synchronized (object) {
                Files.createDirectories(this.historyDirectory, new FileAttribute[0]);
                Files.writeString(this.historyDirectory.resolve(fileName), (CharSequence)line, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
                this.cleanupExpiredHistoryFiles(eventDate);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void cleanupExpiredHistoryFiles(LocalDate nowDate) throws IOException {
        if (nowDate == null) {
            return;
        }
        LocalDate lastDate = this.lastCleanupDate;
        if (Objects.equals(lastDate, nowDate)) {
            return;
        }
        Object object = this.historyWriteLock;
        synchronized (object) {
            if (Objects.equals(this.lastCleanupDate, nowDate)) {
                return;
            }
            if (Files.exists(this.historyDirectory, new LinkOption[0])) {
                LocalDate minDate = nowDate.minusDays(2L);
                try (Stream<Path> stream = Files.list(this.historyDirectory);){
                    stream.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).forEach(path -> {
                        LocalDate fileDate = this.parseHistoryFileDate((Path)path);
                        if (fileDate != null && fileDate.isBefore(minDate)) {
                            try {
                                Files.deleteIfExists(path);
                            }
                            catch (IOException iOException) {
                                // empty catch block
                            }
                        }
                    });
                }
            }
            this.lastCleanupDate = nowDate;
        }
    }

    private String formatLogLine(ILoggingEvent event) {
        String stackTrace;
        String timestamp = Instant.ofEpochMilli(event.getTimeStamp()).atZone(DEFAULT_ZONE).toLocalDateTime().format(LOG_TIME_FORMATTER);
        StringBuilder builder = new StringBuilder(String.format("[%s] [%s] [%s] %s", timestamp, event.getLevel(), event.getLoggerName(), event.getFormattedMessage()));
        if (event.getThrowableProxy() != null && StringUtils.hasText((String)(stackTrace = ThrowableProxyUtil.asString((IThrowableProxy)event.getThrowableProxy())))) {
            builder.append(System.lineSeparator()).append(stackTrace.stripTrailing());
        }
        return builder.toString();
    }

    private String escapeHistoryLog(String message) {
        if (message == null || message.isEmpty()) {
            return "";
        }
        StringBuilder escaped = new StringBuilder(message.length() + 16);
        for (int i = 0; i < message.length(); ++i) {
            char ch = message.charAt(i);
            if (ch == '\\') {
                escaped.append("\\\\");
                continue;
            }
            if (ch == '\r') {
                escaped.append("\\r");
                continue;
            }
            if (ch == '\n') {
                escaped.append("\\n");
                continue;
            }
            escaped.append(ch);
        }
        return escaped.toString();
    }

    private String unescapeHistoryLog(String message) {
        if (message == null || message.isEmpty()) {
            return "";
        }
        StringBuilder unescaped = new StringBuilder(message.length());
        for (int i = 0; i < message.length(); ++i) {
            char ch = message.charAt(i);
            if (ch == '\\' && i + 1 < message.length()) {
                char next;
                if ((next = message.charAt(++i)) == '\\') {
                    unescaped.append('\\');
                    continue;
                }
                if (next == 'n') {
                    unescaped.append('\n');
                    continue;
                }
                if (next == 'r') {
                    unescaped.append('\r');
                    continue;
                }
                unescaped.append('\\').append(next);
                continue;
            }
            unescaped.append(ch);
        }
        return unescaped.toString();
    }

    private class LogWebSocketAppender
    extends AppenderBase<ILoggingEvent> {
        private LogWebSocketAppender() {
        }

        protected void append(ILoggingEvent event) {
            String formattedLog = SpringBootLogWebSocketHandler.this.formatLogLine(event);
            SpringBootLogWebSocketHandler.this.persistHistoryLog(event, formattedLog);
            SpringBootLogWebSocketHandler.this.sessions.keySet().forEach(sessionId -> {
                Level sessionLevel = SpringBootLogWebSocketHandler.this.sessionLogLevels.getOrDefault(sessionId, Level.INFO);
                if (event.getLevel().isGreaterOrEqual(sessionLevel)) {
                    SpringBootLogWebSocketHandler.this.sendMessage((String)sessionId, formattedLog);
                }
            });
            SpringBootLogWebSocketHandler.this.sseEmitters.forEach((emitterId, ignored) -> {
                Level sseLevel = SpringBootLogWebSocketHandler.this.sseLogLevels.getOrDefault(emitterId, Level.INFO);
                if (event.getLevel().isGreaterOrEqual(sseLevel)) {
                    SpringBootLogWebSocketHandler.this.sendSseEvent((String)emitterId, "log", formattedLog);
                }
            });
        }
    }

    private record ParsedHistoryLine(Level level, String message) {
    }
}
