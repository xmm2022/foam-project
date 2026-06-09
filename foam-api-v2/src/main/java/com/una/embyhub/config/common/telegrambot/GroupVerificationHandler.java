/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.annotation.PostConstruct
 *  jakarta.annotation.PreDestroy
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 *  org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery
 *  org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod
 *  org.telegram.telegrambots.meta.api.methods.groupadministration.BanChatMember
 *  org.telegram.telegrambots.meta.api.methods.groupadministration.RestrictChatMember
 *  org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember
 *  org.telegram.telegrambots.meta.api.methods.send.SendMessage
 *  org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage
 *  org.telegram.telegrambots.meta.api.objects.CallbackQuery
 *  org.telegram.telegrambots.meta.api.objects.ChatPermissions
 *  org.telegram.telegrambots.meta.api.objects.User
 *  org.telegram.telegrambots.meta.api.objects.message.Message
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow
 *  org.telegram.telegrambots.meta.exceptions.TelegramApiException
 *  org.telegram.telegrambots.meta.generics.TelegramClient
 */
package com.una.embyhub.config.common.telegrambot;

import com.una.embyhub.config.common.utils.TelegramClientUtils;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.botapimethods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.groupadministration.BanChatMember;
import org.telegram.telegrambots.meta.api.methods.groupadministration.RestrictChatMember;
import org.telegram.telegrambots.meta.api.methods.groupadministration.UnbanChatMember;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.ChatPermissions;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.message.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

@Component
public class GroupVerificationHandler {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(GroupVerificationHandler.class);
    @Autowired
    private TelegramClientUtils telegramClientUtils;
    private TelegramClient telegramClient;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(16);
    private final SecureRandom random = new SecureRandom();
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    private static final String REDIS_KEY_PREFIX_VERIFY = "telegram:verify:session:";

    @PostConstruct
    public void init() {
        if (this.telegramClientUtils.getTelegramClient() != null) {
            this.telegramClient = this.telegramClientUtils.getTelegramClient();
        }
    }

    @PreDestroy
    public void onShutdown() {
        log.info("\u6b63\u5728\u5173\u95ed\u7fa4\u7ec4\u9a8c\u8bc1\u8c03\u5ea6\u5668...");
        this.scheduler.shutdown();
    }

    public void handleNewMembers(Message message) {
        if (this.telegramClient == null) {
            return;
        }
        long chatId = message.getChatId();
        log.info("\u5f00\u59cb\u5904\u7406\u65b0\u6210\u5458\u5165\u7fa4\u9a8c\u8bc1: chatId={}, userCount={}", (Object)chatId, (Object)message.getNewChatMembers().size());
        for (User newUser : message.getNewChatMembers()) {
            if (newUser.getIsBot().booleanValue()) {
                log.info("\u5ffd\u7565\u673a\u5668\u4eba\u7528\u6237: {}", (Object)newUser.getId());
                continue;
            }
            log.info("\u51c6\u5907\u9650\u5236\u7528\u6237\u6743\u9650: userId={}, userName={}", (Object)newUser.getId(), (Object)newUser.getFirstName());
            this.restrictUser(chatId, newUser.getId());
            try {
                log.info("\u53d1\u9001\u9a8c\u8bc1\u6d88\u606f: userId={}", (Object)newUser.getId());
                this.sendAndScheduleArithmeticVerification(chatId, newUser);
            }
            catch (TelegramApiException e) {
                log.error("\u4e3a\u7528\u6237 {} \u53d1\u9001\u9a8c\u8bc1\u6d88\u606f\u5931\u8d25: {}", (Object)newUser.getId(), (Object)e.getMessage());
            }
        }
    }

    public void handleCallback(CallbackQuery callbackQuery) {
        if (this.telegramClient == null) {
            return;
        }
        String[] dataParts = callbackQuery.getData().split(":");
        if (dataParts.length != 3 || !"verify".equals(dataParts[0])) {
            return;
        }
        long chatId = callbackQuery.getMessage().getChatId();
        User clicker = callbackQuery.getFrom();
        long targetUserId = Long.parseLong(dataParts[1]);
        int userAnswer = Integer.parseInt(dataParts[2]);
        if (!clicker.getId().equals(targetUserId)) {
            this.answerCallbackQueryWithAlert(callbackQuery.getId(), "\u8fd9\u4e0d\u662f\u7ed9\u4f60\u7684\u9a8c\u8bc1\u3002");
            return;
        }
        String userKey = chatId + ":" + targetUserId;
        VerificationInfo verificationInfo = (VerificationInfo)this.redisTemplate.opsForValue().get((Object)(REDIS_KEY_PREFIX_VERIFY + userKey));
        if (verificationInfo == null) {
            this.answerCallbackQueryWithAlert(callbackQuery.getId(), "\u9a8c\u8bc1\u5df2\u8fc7\u671f\uff0c\u4f60\u53ef\u80fd\u5df2\u88ab\u8e22\u51fa\u7fa4\u7ec4\u3002");
            this.deleteMessage(chatId, callbackQuery.getMessage().getMessageId());
            return;
        }
        if (userAnswer == verificationInfo.getCorrectAnswer()) {
            log.info("\u7528\u6237 {} \u5728\u804a\u5929 {} \u4e2d\u9a8c\u8bc1\u6210\u529f\u3002", (Object)targetUserId, (Object)chatId);
            this.redisTemplate.delete((Object)(REDIS_KEY_PREFIX_VERIFY + userKey));
            this.unrestrictUser(chatId, targetUserId);
            this.answerCallbackQueryWithAlert(callbackQuery.getId(), "\u9a8c\u8bc1\u6210\u529f\uff0c\u6b22\u8fce\uff01");
            this.deleteMessage(chatId, verificationInfo.getMessageId());
        } else {
            log.warn("\u7528\u6237 {} \u5728\u804a\u5929 {} \u4e2d\u9a8c\u8bc1\u5931\u8d25\uff08\u7b54\u6848\u9519\u8bef\uff09\u3002", (Object)targetUserId, (Object)chatId);
            this.redisTemplate.delete((Object)(REDIS_KEY_PREFIX_VERIFY + userKey));
            this.answerCallbackQueryWithAlert(callbackQuery.getId(), "\u7b54\u6848\u9519\u8bef\uff0c\u4f60\u5df2\u88ab\u8e22\u51fa\u7fa4\u7ec4\u3002");
            this.kickUser(chatId, targetUserId, clicker.getFirstName(), verificationInfo.getMessageId(), "\u56de\u7b54\u9a8c\u8bc1\u95ee\u9898\u9519\u8bef");
        }
    }

    private void restrictUser(long chatId, long userId) {
        ChatPermissions restrictions = new ChatPermissions();
        restrictions.setCanSendMessages(Boolean.valueOf(false));
        restrictions.setCanSendOtherMessages(Boolean.valueOf(false));
        restrictions.setCanAddWebPagePreviews(Boolean.valueOf(false));
        RestrictChatMember restrictChatMember = RestrictChatMember.builder().chatId(Long.valueOf(chatId)).userId(Long.valueOf(userId)).permissions(restrictions).build();
        try {
            this.telegramClient.execute((BotApiMethod)restrictChatMember);
        }
        catch (TelegramApiException e) {
            log.error("\u9650\u5236\u65b0\u7528\u6237 {} \u6743\u9650\u5931\u8d25: {}", (Object)userId, (Object)e.getMessage());
        }
    }

    private boolean unrestrictUser(long chatId, long userId) {
        ChatPermissions fullPermissions = new ChatPermissions();
        fullPermissions.setCanSendMessages(Boolean.valueOf(true));
        fullPermissions.setCanSendOtherMessages(Boolean.valueOf(true));
        fullPermissions.setCanAddWebPagePreviews(Boolean.valueOf(true));
        RestrictChatMember unrestrictMember = RestrictChatMember.builder().chatId(Long.valueOf(chatId)).userId(Long.valueOf(userId)).permissions(fullPermissions).build();
        try {
            this.telegramClient.execute((BotApiMethod)unrestrictMember);
            return true;
        }
        catch (TelegramApiException e) {
            log.error("\u89e3\u9664\u7528\u6237 {} \u6743\u9650\u9650\u5236\u5931\u8d25: {}", (Object)userId, (Object)e.getMessage());
            return false;
        }
    }

    private void sendAndScheduleArithmeticVerification(long chatId, User newUser) throws TelegramApiException {
        int num1 = this.random.nextInt(10) + 1;
        int num2 = this.random.nextInt(10) + 1;
        int correctAnswer = num1 + num2;
        ArrayList<Integer> options = new ArrayList<Integer>();
        options.add(correctAnswer);
        while (options.size() < 4) {
            int wrongAnswer = correctAnswer + (this.random.nextInt(9) - 4);
            if (options.contains(wrongAnswer) || wrongAnswer <= 0) continue;
            options.add(wrongAnswer);
        }
        Collections.shuffle(options);
        List buttons = options.stream().map(option -> InlineKeyboardButton.builder().text(String.valueOf(option)).callbackData("verify:" + newUser.getId() + ":" + option).build()).collect(Collectors.toList());
        InlineKeyboardMarkup keyboard = InlineKeyboardMarkup.builder().keyboardRow(new InlineKeyboardRow(buttons)).build();
        String welcomeText = String.format("\u6b22\u8fce [%s](tg://user?id=%d)\uff01\n\u4e3a\u8bc1\u660e\u60a8\u662f\u4eba\u7c7b\uff0c\u8bf7\u57281\u5206\u949f\u5185\u56de\u7b54\u95ee\u9898\uff1a\n\n`%d + %d = ?`", newUser.getFirstName(), newUser.getId(), num1, num2);
        SendMessage verificationMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text(welcomeText).parseMode("Markdown").replyMarkup((ReplyKeyboard)keyboard).build();
        Message sentMessage = (Message)this.telegramClient.execute((BotApiMethod)verificationMessage);
        String userKey = chatId + ":" + newUser.getId();
        VerificationInfo info = new VerificationInfo(sentMessage.getMessageId(), correctAnswer);
        this.redisTemplate.opsForValue().set((Object)(REDIS_KEY_PREFIX_VERIFY + userKey), (Object)info, 70L, TimeUnit.SECONDS);
        String userName = newUser.getFirstName();
        this.scheduler.schedule(() -> {
            VerificationInfo stillPendingInfo = (VerificationInfo)this.redisTemplate.opsForValue().get((Object)(REDIS_KEY_PREFIX_VERIFY + userKey));
            if (stillPendingInfo != null) {
                this.redisTemplate.delete((Object)(REDIS_KEY_PREFIX_VERIFY + userKey));
                this.kickUser(chatId, newUser.getId(), userName, stillPendingInfo.getMessageId(), "\u9a8c\u8bc1\u8d85\u65f6");
            }
        }, 1L, TimeUnit.MINUTES);
    }

    private void kickUser(long chatId, long userId, String userName, int messageId, String reason) {
        this.deleteMessage(chatId, messageId);
        Integer notificationMessageId = null;
        try {
            String kickMessage = String.format("\u26a0\ufe0f [%s](tg://user?id=%d) \u56e0 %s \u5df2\u88ab\u79fb\u51fa\u7fa4\u7ec4\u3002", userName, userId, reason);
            SendMessage notification = SendMessage.builder().chatId(Long.valueOf(chatId)).text(kickMessage).parseMode("Markdown").build();
            Message sentNotification = (Message)this.telegramClient.execute((BotApiMethod)notification);
            notificationMessageId = sentNotification.getMessageId();
        }
        catch (TelegramApiException e) {
            log.warn("\u53d1\u9001\u8e22\u51fa\u901a\u77e5\u6d88\u606f\u5931\u8d25: {}", (Object)e.getMessage());
        }
        try {
            BanChatMember kickChatMember = BanChatMember.builder().chatId(Long.valueOf(chatId)).userId(Long.valueOf(userId)).build();
            this.telegramClient.execute((BotApiMethod)kickChatMember);
            log.info("\u5df2\u5c06\u7528\u6237 {} ({}) \u4ece\u804a\u5929 {} \u4e2d\u8e22\u51fa\u3002\u539f\u56e0: {}", new Object[]{userName, userId, chatId, reason});
            this.scheduler.schedule(() -> {
                try {
                    UnbanChatMember unbanChatMember = UnbanChatMember.builder().chatId(Long.valueOf(chatId)).userId(Long.valueOf(userId)).onlyIfBanned(Boolean.valueOf(true)).build();
                    this.telegramClient.execute((BotApiMethod)unbanChatMember);
                    log.info("\u5df2\u89e3\u9664\u7528\u6237 {} ({}) \u7684\u5c01\u7981\uff0c\u73b0\u5728\u53ef\u4ee5\u91cd\u65b0\u52a0\u5165\u7fa4\u7ec4", (Object)userName, (Object)userId);
                }
                catch (TelegramApiException e) {
                    log.warn("\u89e3\u9664\u7528\u6237 {} ({}) \u5c01\u7981\u5931\u8d25: {}", new Object[]{userName, userId, e.getMessage()});
                }
            }, 60L, TimeUnit.SECONDS);
        }
        catch (TelegramApiException e) {
            log.warn("\u65e0\u6cd5\u8e22\u51fa\u7528\u6237 {} ({}) (\u53ef\u80fd\u5df2\u88ab\u624b\u52a8\u6279\u51c6\u6216\u5df2\u79bb\u5f00): {}", new Object[]{userName, userId, e.getMessage()});
        }
        if (notificationMessageId != null) {
            int msgId = notificationMessageId;
            this.scheduler.schedule(() -> this.deleteMessage(chatId, msgId), 10L, TimeUnit.SECONDS);
        }
    }

    private void deleteMessage(long chatId, int messageId) {
        DeleteMessage deleteMessage = DeleteMessage.builder().chatId(Long.valueOf(chatId)).messageId(Integer.valueOf(messageId)).build();
        try {
            this.telegramClient.execute((BotApiMethod)deleteMessage);
        }
        catch (TelegramApiException e) {
            log.warn("\u5728\u804a\u5929 {} \u4e2d\u5220\u9664\u6d88\u606f {} \u5931\u8d25: {}", new Object[]{chatId, messageId, e.getMessage()});
        }
    }

    private void answerCallbackQueryWithAlert(String callbackQueryId, String text) {
        AnswerCallbackQuery answer = AnswerCallbackQuery.builder().callbackQueryId(callbackQueryId).text(text).showAlert(Boolean.valueOf(true)).build();
        try {
            this.telegramClient.execute((BotApiMethod)answer);
        }
        catch (TelegramApiException e) {
            log.error("\u56de\u5e94\u5e26\u5f39\u7a97\u8b66\u62a5\u7684\u56de\u8c03\u67e5\u8be2\u5931\u8d25: {}", (Object)e.getMessage());
        }
    }

    private static class VerificationInfo
    implements Serializable {
        private int messageId;
        private int correctAnswer;

        @Generated
        public int getMessageId() {
            return this.messageId;
        }

        @Generated
        public int getCorrectAnswer() {
            return this.correctAnswer;
        }

        @Generated
        public void setMessageId(int messageId) {
            this.messageId = messageId;
        }

        @Generated
        public void setCorrectAnswer(int correctAnswer) {
            this.correctAnswer = correctAnswer;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof VerificationInfo)) {
                return false;
            }
            VerificationInfo other = (VerificationInfo)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (this.getMessageId() != other.getMessageId()) {
                return false;
            }
            return this.getCorrectAnswer() == other.getCorrectAnswer();
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof VerificationInfo;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getMessageId();
            result = result * 59 + this.getCorrectAnswer();
            return result;
        }

        @Generated
        public String toString() {
            return "GroupVerificationHandler.VerificationInfo(messageId=" + this.getMessageId() + ", correctAnswer=" + this.getCorrectAnswer() + ")";
        }

        @Generated
        public VerificationInfo() {
        }

        @Generated
        public VerificationInfo(int messageId, int correctAnswer) {
            this.messageId = messageId;
            this.correctAnswer = correctAnswer;
        }
    }
}
