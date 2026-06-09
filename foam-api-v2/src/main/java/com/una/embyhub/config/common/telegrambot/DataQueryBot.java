/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.JSONObject
 *  com.alibaba.fastjson2.JSONWriter$Feature
 *  com.baomidou.mybatisplus.core.conditions.Wrapper
 *  com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper
 *  com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper
 *  com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper
 *  embyclient.ApiException
 *  jakarta.annotation.PostConstruct
 *  jakarta.annotation.PreDestroy
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Value
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 *  org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer
 *  org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery
 *  org.telegram.telegrambots.meta.api.methods.AnswerInlineQuery
 *  org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands
 *  org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatAdministrators
 *  org.telegram.telegrambots.meta.api.methods.send.SendMessage
 *  org.telegram.telegrambots.meta.api.methods.send.SendPhoto
 *  org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage
 *  org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia
 *  org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText
 *  org.telegram.telegrambots.meta.api.objects.CallbackQuery
 *  org.telegram.telegrambots.meta.api.objects.InputFile
 *  org.telegram.telegrambots.meta.api.objects.LinkPreviewOptions
 *  org.telegram.telegrambots.meta.api.objects.MessageEntity
 *  org.telegram.telegrambots.meta.api.objects.Update
 *  org.telegram.telegrambots.meta.api.objects.User
 *  org.telegram.telegrambots.meta.api.objects.chat.Chat
 *  org.telegram.telegrambots.meta.api.objects.chatmember.ChatMember
 *  org.telegram.telegrambots.meta.api.objects.chatmember.ChatMemberUpdated
 *  org.telegram.telegrambots.meta.api.objects.commands.BotCommand
 *  org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScope
 *  org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault
 *  org.telegram.telegrambots.meta.api.objects.inlinequery.InlineQuery
 *  org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent
 *  org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputTextMessageContent
 *  org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult
 *  org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultArticle
 *  org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultArticle$InlineQueryResultArticleBuilder
 *  org.telegram.telegrambots.meta.api.objects.media.InputMedia
 *  org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto
 *  org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto$InputMediaPhotoBuilder
 *  org.telegram.telegrambots.meta.api.objects.message.MaybeInaccessibleMessage
 *  org.telegram.telegrambots.meta.api.objects.message.Message
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton
 *  org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow
 *  org.telegram.telegrambots.meta.exceptions.TelegramApiException
 */
package com.una.embyhub.config.common.telegrambot;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.una.embyhub.config.common.exception.BizException;
import com.una.embyhub.config.common.telegrambot.GroupVerificationHandler;
import com.una.embyhub.config.common.utils.ConfigCacheLoaderUtils;
import com.una.embyhub.config.common.utils.NotifyChannelCacheLoaderUtils;
import com.una.embyhub.config.common.utils.RedisLockUtils;
import com.una.embyhub.config.common.utils.TelegramClientUtils;
import com.una.embyhub.mapper.UserOauthBindingMapper;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserSave;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserUpdate;
import com.una.embyhub.model.dto.request.embyuser.EmbyUserUpdateData;
import com.una.embyhub.model.dto.request.requestlist.RequestListSave;
import com.una.embyhub.model.dto.response.embynotifydata.TelegramResponse;
import com.una.embyhub.model.dto.response.embyuser.EmbyUserCustomResponse;
import com.una.embyhub.model.dto.response.embyuser.InsertUserResponse;
import com.una.embyhub.model.dto.response.nullbr.MovieListResponse;
import com.una.embyhub.model.dto.response.tmdb.TmdbResponse;
import com.una.embyhub.model.entity.BaseEntity;
import com.una.embyhub.model.entity.EmbyInfo;
import com.una.embyhub.model.entity.EmbyUser;
import com.una.embyhub.model.entity.EmbyUserRegisterRecord;
import com.una.embyhub.model.entity.SystemConfig;
import com.una.embyhub.model.entity.UserOauthBinding;
import com.una.embyhub.pointsbot.PointsBot;
import com.una.embyhub.pointsbot.telegram.Chat;
import com.una.embyhub.pointsbot.telegram.Message;
import com.una.embyhub.pointsbot.telegram.TelegramBotApiClient;
import com.una.embyhub.pointsbot.telegram.Update;
import com.una.embyhub.service.CardSecurityManagementService;
import com.una.embyhub.service.EmbyInfoService;
import com.una.embyhub.service.EmbyUserRegisterRecordService;
import com.una.embyhub.service.EmbyUserService;
import com.una.embyhub.service.NullbrService;
import com.una.embyhub.service.SystemConfigService;
import com.una.embyhub.service.TelegramAuthService;
import com.una.embyhub.service.TelegramRequestSubmitService;
import com.una.embyhub.service.TmdbService;
import com.una.embyhub.service.impl.TelegramPanServiceImpl;
import embyclient.ApiException;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.lang.invoke.CallSite;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.AnswerInlineQuery;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatAdministrators;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.LinkPreviewOptions;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.chatmember.ChatMember;
import org.telegram.telegrambots.meta.api.objects.chatmember.ChatMemberUpdated;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScope;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.api.objects.inlinequery.InlineQuery;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.inputmessagecontent.InputTextMessageContent;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.meta.api.objects.inlinequery.result.InlineQueryResultArticle;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.api.objects.message.MaybeInaccessibleMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class DataQueryBot
implements LongPollingSingleThreadUpdateConsumer {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(DataQueryBot.class);
    private TelegramBotApiClient telegramClient;
    @Autowired
    private NullbrService nullbrService;
    @Autowired
    private TmdbService tmdbService;
    @Value(value="${tmdb.imageUrl}")
    private String imageUrl;
    @Autowired
    private TelegramClientUtils telegramClientUtils;
    @Autowired
    private GroupVerificationHandler groupVerificationHandler;
    @Autowired
    private NotifyChannelCacheLoaderUtils notifyChannelCacheLoaderUtils;
    @Autowired
    private ConfigCacheLoaderUtils configCacheLoaderUtils;
    @Autowired
    private SystemConfigService systemConfigService;
    @Autowired
    private EmbyUserService embyUserService;
    @Autowired
    private EmbyUserRegisterRecordService embyUserRegisterRecordService;
    @Autowired
    private EmbyInfoService embyInfoService;
    @Autowired
    private CardSecurityManagementService cardSecurityManagementService;
    @Autowired
    private UserOauthBindingMapper userOauthBindingMapper;
    @Autowired
    private TelegramAuthService telegramAuthService;
    @Autowired
    private TelegramRequestSubmitService telegramRequestSubmitService;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private RedisLockUtils redisLockUtils;
    private static final String SEARCH_CACHE_PREFIX = "bot:search:results:";
    private static final String RESOURCE_CACHE_PREFIX = "bot:search:resource:";
    private static final String INLINE_RESULT_CACHE_PREFIX = "bot:inline:result:";
    private static final String RATE_LIMIT_PREFIX = "bot:rate:";
    private static final String REQUEST_SUBMIT_LOCK_PREFIX = "bot:request:submit:lock:";
    private static final String TELEGRAM_REGISTER_LOCK_PREFIX = "bot:register:lock:";
    private static final long CACHE_TTL_MINUTES = 15L;
    private static final long REQUEST_SUBMIT_LOCK_SECONDS = 10L;
    private static final long TELEGRAM_REGISTER_LOCK_SECONDS = 180L;
    private static final int INLINE_RESULT_LIMIT = 20;
    private static final long GROUP_COMMAND_CLEANUP_SECONDS = 5L;
    private static final long REGISTER_RATE_LIMIT_MAX_COUNT = 5L;
    private static final long REGISTER_RATE_LIMIT_WINDOW_SECONDS = TimeUnit.MINUTES.toSeconds(10L);
    private static final String REGISTER_RATE_LIMIT_WINDOW_TEXT = "10 \u5206\u949f";
    private static final int TELEGRAM_REGISTER_QUOTA_UPDATE_RETRY_COUNT = 3;
    private static final String REQUEST_GUIDE_TEXT = "\u53d1\u9001 `/request \u7247\u540d` \u641c\u7d22 TMDB\uff0c\u9009\u62e9\u7ed3\u679c\u540e\u70b9\u51fb\u63d0\u4ea4\u6c42\u7247\u3002\n\u4e5f\u53ef\u4ee5\u4f7f\u7528 `@\u673a\u5668\u4eba \u5f71\u7247\u540d` \u5185\u8054\u641c\u7d22\uff0c\u4f53\u9a8c\u66f4\u597d\uff1b";
    private static final String REQUEST_GUIDE_AFTER_BIND_TEXT = "\ud83c\udfac \u73b0\u5728\u53ef\u4ee5\u53d1\u9001 `/request \u7247\u540d` \u641c\u7d22 TMDB \u5e76\u63d0\u4ea4\u6c42\u7247\u3002\n\ud83d\udca1 \u4e5f\u53ef\u4ee5\u4f7f\u7528 `@\u673a\u5668\u4eba \u5f71\u7247\u540d` \u5185\u8054\u641c\u7d22\uff0c\u4f53\u9a8c\u66f4\u597d\uff1b";
    private static final int PAGE_SIZE = 5;
    private static final int RESOURCE_PAGE_SIZE = 5;
    @Autowired
    private TelegramPanServiceImpl telegramPanService;
    @Autowired
    private PointsBot pointsBot;
    private final Map<Long, PendingCreateUser> pendingCreateUsers = new ConcurrentHashMap<Long, PendingCreateUser>();
    private final Map<Long, PendingCardBatch> pendingCardBatches = new ConcurrentHashMap<Long, PendingCardBatch>();
    private final Map<Long, PendingUserEdit> pendingUserEdits = new ConcurrentHashMap<Long, PendingUserEdit>();
    private final Map<Long, PendingExtendBatch> pendingExtendBatches = new ConcurrentHashMap<Long, PendingExtendBatch>();
    private final ScheduledExecutorService transientMessageCleaner = Executors.newSingleThreadScheduledExecutor(r -> {
        Thread thread = new Thread(r, "telegram-transient-message-cleaner");
        thread.setDaemon(true);
        return thread;
    });

    @PreDestroy
    public void shutdownTransientMessageCleaner() {
        this.transientMessageCleaner.shutdownNow();
    }

    private void saveSearchResults(long chatId, List<TmdbResponse.Result> results) {
        this.redisTemplate.opsForValue().set((Object)(SEARCH_CACHE_PREFIX + chatId), results, 15L, TimeUnit.MINUTES);
    }

    private List<TmdbResponse.Result> getSearchResults(long chatId) {
        return (List)this.redisTemplate.opsForValue().get((Object)(SEARCH_CACHE_PREFIX + chatId));
    }

    private void saveResourceCache(long chatId, MovieListResponse response) {
        this.redisTemplate.opsForValue().set((Object)(RESOURCE_CACHE_PREFIX + chatId), (Object)response, 15L, TimeUnit.MINUTES);
    }

    private MovieListResponse getResourceCache(long chatId) {
        return (MovieListResponse)this.redisTemplate.opsForValue().get((Object)(RESOURCE_CACHE_PREFIX + chatId));
    }

    private void saveInlineResult(String token, TmdbResponse.Result result) {
        this.redisTemplate.opsForValue().set((Object)(INLINE_RESULT_CACHE_PREFIX + token), (Object)result, 15L, TimeUnit.MINUTES);
    }

    private TmdbResponse.Result getInlineResult(String token) {
        return (TmdbResponse.Result)this.redisTemplate.opsForValue().get((Object)(INLINE_RESULT_CACHE_PREFIX + token));
    }

    @PostConstruct
    public void initCommands() {
        if (this.telegramClient == null) {
            return;
        }
        ArrayList<BotCommand> commands = new ArrayList<BotCommand>();
        commands.add(new BotCommand("start", "\u6b22\u8fce\u4e0e\u5e2e\u52a9\u4fe1\u606f"));
        commands.add(new BotCommand("myaccount", "\u67e5\u8be2\u5f53\u524d Telegram \u5173\u8054\u8d26\u53f7"));
        commands.add(new BotCommand("bind", "\u7ed1\u5b9a Emby \u8d26\u53f7"));
        commands.add(new BotCommand("unbind", "\u89e3\u9664 Telegram \u7ed1\u5b9a"));
        commands.add(new BotCommand("request", "\u641c\u7d22 TMDB \u5e76\u6c42\u7247"));
        commands.add(new BotCommand("register", "Telegram \u79c1\u804a\u6ce8\u518c Emby \u8d26\u53f7"));
        commands.add(new BotCommand("createuser", "\u521b\u5efa\u65b0\u7684Emby\u7528\u6237"));
        commands.add(new BotCommand("generatecards", "\u6279\u91cf\u751f\u6210\u5361\u5bc6"));
        commands.add(new BotCommand("extendusers", "\u6279\u91cf\u5ef6\u671f\u7528\u6237"));
        commands.add(new BotCommand("edituser", "\u641c\u7d22\u5e76\u4fee\u6539\u7528\u6237"));
        commands.add(new BotCommand("checkin", "\u6bcf\u65e5\u7b7e\u5230"));
        commands.add(new BotCommand("points", "\u67e5\u8be2\u79ef\u5206"));
        commands.add(new BotCommand("leaderboard", "\u79ef\u5206\u6392\u884c\u699c"));
        commands.add(new BotCommand("lottery", "\u62bd\u5956"));
        commands.add(new BotCommand("transfer", "\u79ef\u5206\u4e92\u8f6c"));
        commands.add(new BotCommand("redeem", "\u79ef\u5206\u5151\u6362\u8d26\u53f7"));
        commands.add(new BotCommand("recharge", "\u79ef\u5206\u7eed\u8d39\u8d26\u53f7"));
        commands.add(new BotCommand("renew", "\u7ba1\u7406\u5458\u7eed\u671f\u8d26\u53f7"));
        commands.add(new BotCommand("exchange", "\u67e5\u770b\u53ef\u5151\u6362\u9879\u76ee"));
        commands.add(new BotCommand("prizes", "\u79ef\u5206\u5956\u54c1\u5217\u8868"));
        commands.add(new BotCommand("blackjack", "21\u70b9\u6e38\u620f"));
        commands.add(new BotCommand("dice", "\u9ab0\u5b50\u6bd4\u5927\u5c0f"));
        commands.add(new BotCommand("slots", "\u8001\u864e\u673a"));
        SetMyCommands setMyCommands = SetMyCommands.builder().commands(commands).scope((BotCommandScope)BotCommandScopeDefault.builder().build()).build();
        try {
            this.telegramClient.execute(setMyCommands);
            log.info("\u6210\u529f\u8bbe\u7f6e\u673a\u5668\u4eba\u547d\u4ee4\u3002");
        }
        catch (TelegramApiException e) {
            log.error("\u8bbe\u7f6e\u673a\u5668\u4eba\u547d\u4ee4\u5931\u8d25", (Throwable)e);
        }
    }

    public void attachMtProtoClient(TelegramBotApiClient telegramClient) {
        this.telegramClient = telegramClient;
        this.pointsBot.attachSharedClient(telegramClient);
        this.initCommands();
    }

    public void consume(org.telegram.telegrambots.meta.api.objects.Update update) {
        if (update.hasInlineQuery()) {
            this.handleInlineQuery(update.getInlineQuery());
            return;
        }
        if (update.hasChatMember()) {
            this.handleChatMemberUpdated(update.getChatMember());
            return;
        }
        if (update.hasCallbackQuery() && this.isPointsBotCallback(update.getCallbackQuery())) {
            this.consumePointsBot(update);
            return;
        }
        if (update.hasCallbackQuery() && this.isPanCallback(update.getCallbackQuery())) {
            this.telegramPanService.onCallback(update.getCallbackQuery());
        }
        if (update.hasMessage() && update.getMessage().hasText()) {
            this.handleTextMessage(update.getMessage());
        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            if (StringUtils.hasText((String)data) && data.startsWith("verify:")) {
                this.groupVerificationHandler.handleCallback(callbackQuery);
            } else {
                this.handleCallbackQuery(callbackQuery);
            }
        }
        if (update.hasMessage()) {
            this.consumePointsBot(update);
        }
    }

    private boolean isPanCallback(CallbackQuery callbackQuery) {
        if (callbackQuery == null || callbackQuery.getMessage() == null || !StringUtils.hasText((String)callbackQuery.getData())) {
            return false;
        }
        String data = callbackQuery.getData();
        return "home".equalsIgnoreCase(data) || "noop".equalsIgnoreCase(data) || data.startsWith("home:") || data.startsWith("cat:");
    }

    private boolean isPointsBotCallback(CallbackQuery callbackQuery) {
        if (callbackQuery == null || !StringUtils.hasText((String)callbackQuery.getData())) {
            return false;
        }
        String data = callbackQuery.getData();
        return data.startsWith("bj_") || data.startsWith("lottery_prize_");
    }

    private void consumePointsBot(org.telegram.telegrambots.meta.api.objects.Update update) {
        try {
            Update pointsUpdate = this.toPointsBotUpdate(update);
            if (pointsUpdate != null) {
                this.pointsBot.consume(pointsUpdate);
            }
        }
        catch (Exception e) {
            log.warn("\u8f6c\u53d1\u79ef\u5206\u673a\u5668\u4eba\u6d88\u606f\u5931\u8d25", (Throwable)e);
        }
    }

    private Update toPointsBotUpdate(org.telegram.telegrambots.meta.api.objects.Update update) {
        if (update.hasMessage()) {
            return Update.message(this.toPointsBotMessage(update.getMessage()));
        }
        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            com.una.embyhub.pointsbot.telegram.User from = this.toPointsBotUser(callbackQuery.getFrom());
            Message message = this.toPointsBotMessage(callbackQuery.getMessage(), from);
            return Update.callbackQuery(new com.una.embyhub.pointsbot.telegram.CallbackQuery(callbackQuery.getId(), callbackQuery.getData(), message, from));
        }
        return null;
    }

    private Message toPointsBotMessage(org.telegram.telegrambots.meta.api.objects.message.Message source) {
        if (source == null) {
            return null;
        }
        return Message.builder().messageId(this.toLong(source.getMessageId())).chatId(source.getChatId() == null ? 0L : source.getChatId()).chat(this.toPointsBotChat(source.getChat())).from(this.toPointsBotUser(source.getFrom())).text(source.getText()).entities(this.toPointsBotEntities(source.getEntities())).photo(source.hasPhoto()).video(source.hasVideo()).animation(source.hasAnimation()).document(source.hasDocument()).audio(source.hasAudio()).voice(source.hasVoice()).sticker(source.hasSticker()).build();
    }

    private Message toPointsBotMessage(MaybeInaccessibleMessage source, com.una.embyhub.pointsbot.telegram.User from) {
        if (source == null) {
            return null;
        }
        return Message.builder().messageId(this.toLong(source.getMessageId())).chatId(source.getChatId() == null ? 0L : source.getChatId()).chat(this.toPointsBotChat(source.getChat())).from(from).entities(List.of()).build();
    }

    private Chat toPointsBotChat(org.telegram.telegrambots.meta.api.objects.chat.Chat source) {
        if (source == null) {
            return null;
        }
        return new Chat(source.getId() == null ? 0L : source.getId(), Boolean.TRUE.equals(source.isGroupChat()), Boolean.TRUE.equals(source.isSuperGroupChat()));
    }

    private com.una.embyhub.pointsbot.telegram.User toPointsBotUser(User source) {
        if (source == null) {
            return null;
        }
        return new com.una.embyhub.pointsbot.telegram.User(source.getId(), source.getUserName(), source.getFirstName(), source.getLastName(), source.getIsBot());
    }

    private List<com.una.embyhub.pointsbot.telegram.MessageEntity> toPointsBotEntities(List<MessageEntity> source) {
        if (CollectionUtils.isEmpty(source)) {
            return List.of();
        }
        ArrayList<com.una.embyhub.pointsbot.telegram.MessageEntity> entities = new ArrayList<com.una.embyhub.pointsbot.telegram.MessageEntity>();
        for (MessageEntity entity : source) {
            if (!"text_mention".equals(entity.getType())) continue;
            entities.add(new com.una.embyhub.pointsbot.telegram.MessageEntity(entity.getType(), this.toPointsBotUser(entity.getUser())));
        }
        return entities;
    }

    private long toLong(Integer value) {
        return value == null ? 0L : value.longValue();
    }

    private void handleChatMemberUpdated(ChatMemberUpdated chatMemberUpdated) {
        if (!this.isTelegramLeaveAutoDeleteEnabled()) {
            return;
        }
        if (chatMemberUpdated == null || chatMemberUpdated.getChat() == null) {
            return;
        }
        Long chatId = chatMemberUpdated.getChat().getId();
        if (!this.isConfiguredTelegramGroup(chatId)) {
            return;
        }
        ChatMember oldMember = chatMemberUpdated.getOldChatMember();
        ChatMember newMember = chatMemberUpdated.getNewChatMember();
        String oldStatus = this.getChatMemberStatus(oldMember);
        String newStatus = this.getChatMemberStatus(newMember);
        if (!this.isActiveMemberStatus(oldStatus) || !this.isLeftStatus(newStatus)) {
            return;
        }
        User telegramUser = this.getChatMemberUser(newMember);
        if (telegramUser == null) {
            telegramUser = this.getChatMemberUser(oldMember);
        }
        if (telegramUser == null || telegramUser.getId() == null) {
            return;
        }
        Long telegramUserId = telegramUser.getId();
        try {
            EmbyUser boundUser = this.telegramAuthService.unbindByTelegramId(telegramUserId);
            if (boundUser == null) {
                log.info("Telegram \u7528\u6237 {} \u5df2\u9000\u7fa4\uff0c\u4f46\u672a\u627e\u5230 Emby \u7ed1\u5b9a", (Object)telegramUserId);
                return;
            }
            if (boundUser.getId() == null) {
                log.warn("Telegram \u7528\u6237 {} \u5df2\u89e3\u7ed1\uff0c\u4f46\u7ed1\u5b9a\u7684 Emby \u7528\u6237\u7f3a\u5c11\u672c\u5730 ID\uff0c\u8df3\u8fc7\u5220\u9664", (Object)telegramUserId);
                return;
            }
            if (boundUser.getIsAdmin() != null && boundUser.getIsAdmin() == 1) {
                log.warn("Telegram \u7528\u6237 {} \u5df2\u89e3\u7ed1\u7ba1\u7406\u5458\u8d26\u53f7 {}\uff0c\u7ba1\u7406\u5458 Emby \u8d26\u53f7\u4e0d\u81ea\u52a8\u5220\u9664", (Object)telegramUserId, (Object)boundUser.getEmbyUserName());
                return;
            }
            this.embyUserService.deleteByUserId(List.of(boundUser.getId()));
            log.info("Telegram \u7528\u6237 {} \u9000\u7fa4\uff0c\u5df2\u89e3\u7ed1\u5e76\u5220\u9664 Emby \u7528\u6237 {}({})", new Object[]{telegramUserId, boundUser.getEmbyUserName(), boundUser.getId()});
        }
        catch (ApiException e) {
            log.error("Telegram \u7528\u6237 {} \u9000\u7fa4\u540e\u5220\u9664 Emby \u8d26\u53f7\u5931\u8d25", (Object)telegramUserId, (Object)e);
        }
        catch (Exception e) {
            log.error("\u5904\u7406 Telegram \u7528\u6237 {} \u9000\u7fa4\u6e05\u7406\u5931\u8d25", (Object)telegramUserId, (Object)e);
        }
    }

    private boolean isConfiguredTelegramGroup(Long chatId) {
        if (chatId == null) {
            return false;
        }
        TelegramResponse telegramResponse = this.telegramClientUtils.getTelegramResponse();
        if (telegramResponse == null || !StringUtils.hasText((String)telegramResponse.getBotChatGroupId())) {
            return false;
        }
        try {
            return chatId.equals(Long.parseLong(telegramResponse.getBotChatGroupId()));
        }
        catch (NumberFormatException e) {
            log.warn("Telegram \u7fa4\u7ec4 ID \u914d\u7f6e\u65e0\u6548: {}", (Object)telegramResponse.getBotChatGroupId());
            return false;
        }
    }

    private boolean isTelegramLeaveAutoDeleteEnabled() {
        return this.configCacheLoaderUtils.getConfigValue("telegram_leave_auto_delete_enabled") != null;
    }

    private String getChatMemberStatus(ChatMember chatMember) {
        return chatMember == null ? null : chatMember.getStatus();
    }

    private User getChatMemberUser(ChatMember chatMember) {
        return chatMember == null ? null : chatMember.getUser();
    }

    private boolean isActiveMemberStatus(String status) {
        return "creator".equalsIgnoreCase(status) || "administrator".equalsIgnoreCase(status) || "member".equalsIgnoreCase(status) || "restricted".equalsIgnoreCase(status);
    }

    private boolean isLeftStatus(String status) {
        return "left".equalsIgnoreCase(status) || "kicked".equalsIgnoreCase(status);
    }

    private boolean isUserAdmin(long chatId, long userId) {
        if (chatId == userId) {
            return true;
        }
        try {
            GetChatAdministrators getAdmins = new GetChatAdministrators(String.valueOf(chatId));
            getAdmins.setChatId(Long.valueOf(chatId));
            ArrayList admins = (ArrayList)this.telegramClient.execute(getAdmins);
            for (ChatMember admin : admins) {
                if (!admin.getUser().getId().equals(userId)) continue;
                return true;
            }
        }
        catch (TelegramApiException e) {
            log.error("\u65e0\u6cd5\u83b7\u53d6\u804a\u5929 {} \u7684\u7ba1\u7406\u5458\u5217\u8868: {}", (Object)chatId, (Object)e.getMessage());
        }
        return false;
    }

    private boolean requiresAdmin(String command) {
        return "/createuser".equalsIgnoreCase(command) || "/generatecards".equalsIgnoreCase(command) || "/extendusers".equalsIgnoreCase(command) || "/edituser".equalsIgnoreCase(command) || "/updateuserinfo".equalsIgnoreCase(command) || "/resetpassword".equalsIgnoreCase(command);
    }

    private boolean hasAdminPermission(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        return this.checkAdminPermission(chatId, userId, message.isUserMessage());
    }

    private boolean hasAdminPermission(CallbackQuery callbackQuery) {
        if (callbackQuery == null || callbackQuery.getMessage() == null || callbackQuery.getFrom() == null) {
            return false;
        }
        long chatId = callbackQuery.getMessage().getChatId();
        long userId = callbackQuery.getFrom().getId();
        MaybeInaccessibleMessage maybeMessage = callbackQuery.getMessage();
        boolean isPrivateChat = maybeMessage instanceof org.telegram.telegrambots.meta.api.objects.message.Message && ((org.telegram.telegrambots.meta.api.objects.message.Message)maybeMessage).isUserMessage();
        return this.checkAdminPermission(chatId, userId, isPrivateChat);
    }

    private boolean isBotOwner(long userId) {
        String notifyChannelValue = this.notifyChannelCacheLoaderUtils.getNotifyChannelValue("telegram");
        if (!StringUtils.hasText((String)notifyChannelValue)) {
            return false;
        }
        TelegramResponse telegramResponse = (TelegramResponse)JSONObject.parseObject((String)notifyChannelValue, TelegramResponse.class);
        if (telegramResponse == null || !StringUtils.hasText((String)telegramResponse.getBotChatId())) {
            return false;
        }
        try {
            return userId == Long.parseLong(telegramResponse.getBotChatId());
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean checkAdminPermission(long chatId, long userId, boolean isPrivateChat) {
        if (!isPrivateChat) {
            return false;
        }
        if (!this.isBotOwner(userId)) {
            this.sendMessage(chatId, "\u274c \u62b1\u6b49\uff0c\u53ea\u6709\u62e5\u6709\u8005\u624d\u80fd\u4f7f\u7528\u6b64\u673a\u5668\u4eba\u3002");
            return false;
        }
        return true;
    }

    private void handleTextMessage(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        long chatId = message.getChatId();
        if (message.getFrom() == null || message.getFrom().getId() == null) {
            log.warn("\u5ffd\u7565\u7f3a\u5c11\u53d1\u9001\u8005\u4fe1\u606f\u7684 Telegram \u6587\u672c\u6d88\u606f: chatId={}, messageId={}", (Object)chatId, (Object)message.getMessageId());
            return;
        }
        long userId = message.getFrom().getId();
        String text = message.getText();
        if (!StringUtils.hasText((String)text)) {
            return;
        }
        String[] parts = text.split("\\s+", 2);
        String command = parts[0];
        String argument = parts.length > 1 ? parts[1] : "";
        String normalizedCommand = command.toLowerCase();
        if (normalizedCommand.contains("@")) {
            normalizedCommand = normalizedCommand.substring(0, normalizedCommand.indexOf(64));
        }
        if (normalizedCommand.startsWith("/")) {
            this.scheduleGroupCommandCleanup(message);
        }
        if (this.requiresAdmin(normalizedCommand) && !this.hasAdminPermission(message)) {
            return;
        }
        switch (normalizedCommand) {
            case "/start": {
                if (argument.startsWith("bind_")) {
                    this.handleBindCommand(message, argument);
                    break;
                }
                if (argument.startsWith("login_")) {
                    this.handleLoginCommand(message, argument);
                    break;
                }
                if (this.isBotOwner(userId)) {
                    String welcomeMessage = "\ud83c\udfac *\u6b22\u8fce\u4f7f\u7528 \u667a\u80fd \u673a\u5668\u4eba\uff01*\n\n\ud83d\udccb *\u53ef\u7528\u547d\u4ee4\u5217\u8868\uff1a*\n\n\ud83d\udd0d `/request <\u5173\u952e\u8bcd>` - \u641c\u7d22 TMDB \u5e76\u63d0\u4ea4\u6c42\u7247\n   \u793a\u4f8b\uff1a`/request \u77ac\u606f\u5168\u5b87\u5b99`\n\n\ud83d\udd17 `/bind <\u7528\u6237\u540d> <\u5bc6\u7801>` - \u79c1\u804a\u7ed1\u5b9a Emby \u8d26\u53f7\n\n\ud83d\udd13 `/unbind` - \u79c1\u804a\u89e3\u9664 Telegram \u7ed1\u5b9a\n\n\ud83c\udd95 `/register <\u7528\u6237\u540d> <\u5bc6\u7801>` - \u5f00\u653e\u65f6\u79c1\u804a\u6ce8\u518c\u5e76\u81ea\u52a8\u7ed1\u5b9a\n\n\ud83d\udc64 `/createuser <\u7528\u6237\u540d> <\u5929\u6570> <\u5907\u6ce8>` - \u521b\u5efa\u65b0\u7528\u6237\n   \u793a\u4f8b\uff1a`/createuser test 30 \u673a\u5668\u4eba\u521b\u5efa`\n\n\ud83c\udfab `/generatecards <\u6570\u91cf> <\u5929\u6570>` - \u6279\u91cf\u751f\u6210\u5361\u5bc6\n   \u793a\u4f8b\uff1a`/generatecards 10 30`\n\n\u23f0 `/extendusers <\u5ef6\u671f\u5929\u6570> [\u8fc7\u671f\u5929\u6570\u8303\u56f4]` - \u6279\u91cf\u5ef6\u671f\u7528\u6237\n   \u793a\u4f8b\uff1a`/extendusers 15 30`\n\n\u270f\ufe0f `/edituser <\u7528\u6237\u540d\u5173\u952e\u8bcd>` - \u641c\u7d22\u5e76\u4fee\u6539\u7528\u6237\n   \u793a\u4f8b\uff1a`/edituser test`\n   \u9009\u62e9\u7528\u6237\u540e\u53ef\u4f7f\u7528\u4ee5\u4e0b\u547d\u4ee4\uff1a\n   \u2022 `/updateuserinfo <\u5230\u671f\u65f6\u95f4> <\u6c42\u7247\u6b21\u6570> <\u5907\u6ce8>`\n   \u2022 `/resetpassword <\u65b0\u5bc6\u7801>`\n   \u2022 `/enableuser` - \u542f\u7528\u7528\u6237\n   \u2022 `/disableuser` - \u7981\u7528\u7528\u6237\n   \u2022 `/setexpiry <\u5230\u671f\u65f6\u95f4>` - \u8bbe\u7f6e\u5230\u671f\u65f6\u95f4\u5e76\u542f\u7528\n\n\ud83d\udca1 *\u63d0\u793a\uff1a* \u70b9\u51fb\u547d\u4ee4\u53ef\u5feb\u901f\u590d\u5236";
                    this.sendMessage(chatId, welcomeMessage);
                    break;
                }
                String userWelcomeMessage = "\ud83c\udfac *\u6b22\u8fce\u4f7f\u7528 \u667a\u80fd \u673a\u5668\u4eba\uff01*\n\n\ud83d\udccb *\u8bf4\u660e\uff1a*\n\u60a8\u53ef\u4ee5\u641c\u7d22 TMDB \u5e76\u63d0\u4ea4\u6c42\u7247\u3002\n\n\ud83d\udc64 *\u81ea\u52a9\u67e5\u8be2\uff1a*\n\u53d1\u9001 `/myaccount` \u53ef\u67e5\u8be2\u5f53\u524d Telegram \u8d26\u53f7\u5173\u8054\u7684 Emby \u8d26\u53f7\u3002\n\n\ud83d\udd0d *\u6c42\u7247\uff1a*\n\u53d1\u9001 `/request \u7247\u540d` \u641c\u7d22 TMDB\uff0c\u9009\u62e9\u7ed3\u679c\u540e\u70b9\u51fb\u63d0\u4ea4\u6c42\u7247\u3002\n\u4e5f\u53ef\u4ee5\u4f7f\u7528 `@\u673a\u5668\u4eba \u5f71\u7247\u540d` \u5185\u8054\u641c\u7d22\uff0c\u4f53\u9a8c\u66f4\u597d\uff1b\n\n\ud83c\udd95 *\u6ce8\u518c\uff1a*\n\u7ba1\u7406\u5458\u5f00\u542f Telegram \u79c1\u804a\u6ce8\u518c\u540e\uff0c\u53ef\u53d1\u9001 `/register \u7528\u6237\u540d \u5bc6\u7801` \u81ea\u52a9\u6ce8\u518c\u3002\n\n\ud83d\udd17 *\u7ed1\u5b9a\u4e0e\u767b\u5f55\uff1a*\n\u8bf7\u5728 Foam \u7f51\u9875\u7aef\u70b9\u51fb\u300c\u7ed1\u5b9a Telegram\u300d\uff0c\u6216\u79c1\u804a\u53d1\u9001 `/bind \u7528\u6237\u540d \u5bc6\u7801`\u3002\n\u9700\u8981\u89e3\u9664\u7ed1\u5b9a\u65f6\u53d1\u9001 `/unbind`\u3002";
                this.sendMessage(chatId, userWelcomeMessage);
                break;
            }
            case "/myaccount": {
                this.handleMyAccountCommand(message);
                break;
            }
            case "/bind": {
                this.handleCredentialBindCommand(message, argument);
                break;
            }
            case "/unbind": {
                this.handleTelegramUnbindCommand(message);
                break;
            }
            case "/register": {
                this.handleTelegramRegisterCommand(message, argument);
                break;
            }
            case "/search": 
            case "/request": {
                if (!message.isUserMessage()) {
                    this.sendMessage(chatId, "\ud83d\udd12 \u6c42\u7247\u53ea\u652f\u6301\u79c1\u804a\u673a\u5668\u4eba\uff0c\u8bf7\u79c1\u804a\u53d1\u9001 `/request \u7247\u540d`\u3002");
                    return;
                }
                if (argument.isEmpty()) {
                    this.sendMessage(chatId, "\ud83d\udd0d \u8bf7\u8f93\u5165\u8981\u641c\u7d22\u7684\u5173\u952e\u8bcd\u3002\n\u4f8b\u5982\uff1a`/request \u77ac\u606f\u5168\u5b87\u5b99`");
                    return;
                }
                if (this.telegramAuthService.findBoundUser(userId) == null) {
                    this.sendBindRequiredMessage(chatId);
                    return;
                }
                if (!this.tryAcquireRateLimit("search:" + userId, 10L, 60L)) {
                    this.sendMessage(chatId, "\u23f3 \u641c\u7d22\u592a\u9891\u7e41\u4e86\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
                    return;
                }
                try {
                    TmdbResponse tmdbResponse = this.tmdbService.searchDataTelegram(argument, 1);
                    if (tmdbResponse == null || tmdbResponse.getResults() == null || tmdbResponse.getResults().isEmpty()) {
                        this.sendMessage(chatId, "\ud83d\udd0e \u672a\u627e\u5230\u5173\u4e8e `" + this.escapeMarkdown(argument) + "` \u7684\u4efb\u4f55\u7ed3\u679c\u3002");
                        return;
                    }
                    List<TmdbResponse.Result> validResults = tmdbResponse.getResults().stream().filter(r -> r.getPosterPath() != null && !r.getPosterPath().isEmpty() && r.getId() != 0 && r.getMediaType() != null && (r.getTitle() != null || r.getName() != null)).collect(Collectors.toList());
                    if (validResults.isEmpty()) {
                        this.sendMessage(chatId, "\ud83e\udded \u672a\u627e\u5230\u53ef\u4f9b\u663e\u793a\u7684\u6709\u6548\u7ed3\u679c\uff0c\u8bf7\u5c1d\u8bd5\u5176\u4ed6\u5173\u952e\u8bcd\u3002");
                        return;
                    }
                    this.saveSearchResults(chatId, validResults);
                    this.sendOrEditRequestCard(chatId, null, 0);
                }
                catch (Exception e) {
                    log.error("TMDB API \u641c\u7d22\u5931\u8d25: {}", (Object)e.getMessage());
                    this.sendMessage(chatId, "\u274c \u641c\u7d22 `" + this.escapeMarkdown(argument) + "` \u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc\u6216\u7a0d\u540e\u91cd\u8bd5\u3002");
                }
                break;
            }
            case "/createuser": {
                this.handleCreateUserCommand(message, argument);
                break;
            }
            case "/generatecards": {
                this.handleGenerateCardsCommand(message, argument);
                break;
            }
            case "/extendusers": {
                this.handleExtendUsersCommand(message, argument);
                break;
            }
            case "/edituser": {
                this.handleEditUserCommand(message, argument);
                break;
            }
            case "/updateuserinfo": {
                this.handleUpdateUserInfoCommand(message, argument);
                break;
            }
            case "/resetpassword": {
                this.handleResetPasswordCommand(message, argument);
                break;
            }
            case "/enableuser": {
                this.handleEnableUserCommand(message);
                break;
            }
            case "/disableuser": {
                this.handleDisableUserCommand(message);
                break;
            }
            case "/setexpiry": {
                this.handleSetExpiryCommand(message, argument);
                break;
            }
        }
    }

    private void handleCreateUserCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        int days;
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        String[] args = argument.split("\\s+", 3);
        if (args.length < 3) {
            this.sendMessage(chatId, "\u7528\u6cd5\uff1a`/createuser <\u7528\u6237\u540d> <\u5929\u6570> <\u5907\u6ce8>`\n\u793a\u4f8b\uff1a`/createuser test 30 \u673a\u5668\u4eba\u521b\u5efa`");
            return;
        }
        String embyUserName = args[0];
        try {
            days = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e) {
            this.sendMessage(chatId, "\u5929\u6570\u5b57\u6bb5\u5fc5\u987b\u662f\u6570\u5b57\uff0c\u4f8b\u5982\uff1a`/createuser test 30 \u5907\u6ce8`");
            return;
        }
        if (days <= 0) {
            this.sendMessage(chatId, "\u5929\u6570\u5fc5\u987b\u5927\u4e8e 0\u3002");
            return;
        }
        String remarks = args[2].trim();
        if (!StringUtils.hasText((String)remarks)) {
            this.sendMessage(chatId, "\u5907\u6ce8\u4e0d\u80fd\u4e3a\u7a7a\u3002");
            return;
        }
        List servers = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyInfoService.lambdaQuery().eq(EmbyInfo::getEnabled, (Object)1)).eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).list();
        if (servers == null || servers.isEmpty()) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u53ef\u7528\u670d\u52a1\u5668\uff0c\u8bf7\u5148\u5728\u540e\u53f0\u914d\u7f6e\u3002");
            return;
        }
        this.pendingCreateUsers.put(userId, new PendingCreateUser(chatId, embyUserName, days, remarks));
        ArrayList<InlineKeyboardRow> rows = new ArrayList<InlineKeyboardRow>();
        for (EmbyInfo server : servers) {
            InlineKeyboardButton button = InlineKeyboardButton.builder().text(this.buildServerLabel(server)).callbackData("create_server:" + server.getId()).build();
            rows.add(new InlineKeyboardRow(new InlineKeyboardButton[]{button}));
        }
        InlineKeyboardMarkup keyboard = InlineKeyboardMarkup.builder().keyboard(rows).build();
        SendMessage selectServerMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text("\u8bf7\u9009\u62e9\u8981\u521b\u5efa\u7528\u6237\u7684\u670d\u52a1\u5668\uff1a").replyMarkup((ReplyKeyboard)keyboard).build();
        try {
            org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(selectServerMessage);
            this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
        }
        catch (TelegramApiException e) {
            log.error("\u53d1\u9001\u670d\u52a1\u5668\u9009\u62e9\u5217\u8868\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u53d1\u9001\u670d\u52a1\u5668\u5217\u8868\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleCallbackQuery(CallbackQuery callbackQuery) {
        String data = callbackQuery.getData();
        if (!StringUtils.hasText((String)data)) {
            this.answerCallbackQuery(callbackQuery.getId());
            return;
        }
        this.answerCallbackQuery(callbackQuery.getId());
        String[] parts = data.split(":");
        String action = parts[0];
        if ("submit_inline_request".equals(action)) {
            if (parts.length == 3) {
                this.handleInlineRequestSubmit(callbackQuery, parts[1], parts[2]);
            }
            return;
        }
        if (callbackQuery.getMessage() == null) {
            return;
        }
        long chatId = callbackQuery.getMessage().getChatId();
        Integer messageId = callbackQuery.getMessage().getMessageId();
        switch (action) {
            case "noop": {
                break;
            }
            case "confirm_unbind": {
                this.handleTelegramUnbindConfirm(callbackQuery);
                break;
            }
            case "cancel_unbind": {
                this.editMessageTextSilently(chatId, messageId, "\u5df2\u53d6\u6d88\u89e3\u9664\u7ed1\u5b9a\u3002");
                break;
            }
            case "page": {
                if (parts.length != 2) break;
                int newPage = Integer.parseInt(parts[1]);
                this.sendOrEditResultListPage(chatId, messageId, newPage);
                break;
            }
            case "select": {
                if (parts.length != 2) break;
                int selectedIndex = Integer.parseInt(parts[1]);
                this.showItemDetails(chatId, messageId, selectedIndex, 0);
                break;
            }
            case "resource_page": {
                if (parts.length != 3) break;
                int itemIndex = Integer.parseInt(parts[1]);
                int resourcePage = Integer.parseInt(parts[2]);
                this.showItemDetails(chatId, messageId, itemIndex, resourcePage);
                break;
            }
            case "request_page": {
                if (parts.length != 2) break;
                try {
                    int selectedIndex = Integer.parseInt(parts[1]);
                    this.sendOrEditRequestCard(chatId, messageId, selectedIndex);
                }
                catch (NumberFormatException ex) {
                    this.sendMessage(chatId, "\u6c42\u7247\u9009\u62e9\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u641c\u7d22\u3002");
                }
                break;
            }
            case "submit_request": {
                if (parts.length != 2) break;
                try {
                    int selectedIndex = Integer.parseInt(parts[1]);
                    this.handleRequestSubmit(callbackQuery, selectedIndex);
                }
                catch (NumberFormatException ex) {
                    this.sendMessage(chatId, "\u6c42\u7247\u9009\u62e9\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u641c\u7d22\u3002");
                }
                break;
            }
            case "back_to_list": {
                if (parts.length != 2) break;
                int pageToGoBackTo = Integer.parseInt(parts[1]);
                this.sendOrEditResultListPage(chatId, messageId, pageToGoBackTo);
                break;
            }
            case "create_server": {
                if (parts.length != 2) break;
                try {
                    long serverId = Long.parseLong(parts[1]);
                    this.processCreateUserSelection(callbackQuery, serverId);
                }
                catch (NumberFormatException ex) {
                    this.sendMessage(chatId, "\u670d\u52a1\u5668\u9009\u62e9\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u5c1d\u8bd5\u3002");
                }
                break;
            }
            case "card_server": {
                if (parts.length != 2) break;
                try {
                    long serverId = Long.parseLong(parts[1]);
                    this.processCardBatchSelection(callbackQuery, serverId);
                }
                catch (NumberFormatException ex) {
                    this.sendMessage(chatId, "\u670d\u52a1\u5668\u9009\u62e9\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u5c1d\u8bd5\u3002");
                }
                break;
            }
            case "edit_user": {
                if (parts.length != 2) break;
                try {
                    long userId = Long.parseLong(parts[1]);
                    this.handleUserSelection(callbackQuery, userId);
                }
                catch (NumberFormatException ex) {
                    this.sendMessage(chatId, "\u7528\u6237\u9009\u62e9\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u641c\u7d22\u3002");
                }
                break;
            }
            case "extend_server": {
                if (parts.length != 2) break;
                try {
                    long serverId = Long.parseLong(parts[1]);
                    this.processExtendBatchSelection(callbackQuery, serverId);
                    break;
                }
                catch (NumberFormatException ex) {
                    this.sendMessage(chatId, "\u670d\u52a1\u5668\u9009\u62e9\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u5c1d\u8bd5\u3002");
                }
            }
        }
    }

    private void handleInlineQuery(InlineQuery inlineQuery) {
        String query;
        if (inlineQuery == null || inlineQuery.getFrom() == null) {
            return;
        }
        long telegramUserId = inlineQuery.getFrom().getId();
        String string = query = inlineQuery.getQuery() == null ? "" : inlineQuery.getQuery().trim();
        if (!StringUtils.hasText((String)query)) {
            this.answerInlineQuery(inlineQuery.getId(), List.of(), 1, true);
            return;
        }
        if (!this.tryAcquireRateLimit("inline_search:" + telegramUserId, 20L, 60L)) {
            this.answerInlineQuery(inlineQuery.getId(), List.of(this.buildInlineInfoArticle("rate_limit", "\u641c\u7d22\u592a\u9891\u7e41\u4e86", "\u8bf7\u7a0d\u540e\u518d\u8bd5", "\u641c\u7d22\u592a\u9891\u7e41\u4e86\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002")), 1, true);
            return;
        }
        if (this.telegramAuthService.findBoundUser(telegramUserId) == null) {
            this.answerInlineQuery(inlineQuery.getId(), List.of(this.buildInlineInfoArticle("bind_required", "\u8bf7\u5148\u7ed1\u5b9a Emby \u8d26\u53f7", "\u7ed1\u5b9a\u540e\u624d\u80fd\u901a\u8fc7 Telegram \u641c\u7d22\u5e76\u63d0\u4ea4\u6c42\u7247", "\u8bf7\u5148\u79c1\u804a\u673a\u5668\u4eba\u4f7f\u7528 /bind \u7528\u6237\u540d \u5bc6\u7801 \u7ed1\u5b9a Emby \u8d26\u53f7\u3002")), 1, true);
            return;
        }
        try {
            List<TmdbResponse.Result> validResults;
            TmdbResponse tmdbResponse = this.tmdbService.searchDataTelegram(query, 1);
            List<TmdbResponse.Result> list = validResults = tmdbResponse == null || tmdbResponse.getResults() == null ? List.of() : tmdbResponse.getResults().stream().filter(this::isValidTmdbRequestResult).limit(20L).collect(Collectors.toList());
            if (validResults.isEmpty()) {
                this.answerInlineQuery(inlineQuery.getId(), List.of(this.buildInlineInfoArticle("empty", "\u6ca1\u6709\u627e\u5230\u7ed3\u679c", "\u6362\u4e2a\u5173\u952e\u8bcd\u518d\u8bd5\u8bd5", "\u6ca1\u6709\u627e\u5230 \u201c" + query + "\u201d \u7684 TMDB \u7ed3\u679c\u3002")), 1, true);
                return;
            }
            boolean allowSubmit = this.isPrivateInlineChat(inlineQuery.getChatType());
            ArrayList<InlineQueryResult> inlineResults = new ArrayList<InlineQueryResult>();
            for (TmdbResponse.Result result : validResults) {
                String token = this.buildInlineResultToken(result);
                this.saveInlineResult(token, result);
                inlineResults.add(this.buildInlineArticleResult(token, result, allowSubmit));
            }
            this.answerInlineQuery(inlineQuery.getId(), inlineResults, 0, true);
        }
        catch (Exception e) {
            log.error("Telegram inline TMDB \u641c\u7d22\u5931\u8d25: telegramUserId={}, query={}", new Object[]{telegramUserId, query, e});
            this.answerInlineQuery(inlineQuery.getId(), List.of(this.buildInlineInfoArticle("error", "\u641c\u7d22\u5931\u8d25", "\u8bf7\u7a0d\u540e\u518d\u8bd5", "\u641c\u7d22\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002")), 1, true);
        }
    }

    private boolean isValidTmdbRequestResult(TmdbResponse.Result result) {
        return !(result == null || !StringUtils.hasText((String)result.getPosterPath()) || result.getId() == 0 || !StringUtils.hasText((String)result.getMediaType()) || !"movie".equals(result.getMediaType()) && !"tv".equals(result.getMediaType()) || !StringUtils.hasText((String)result.getTitle()) && !StringUtils.hasText((String)result.getName()));
    }

    private boolean isPrivateInlineChat(String chatType) {
        return !StringUtils.hasText((String)chatType) || "private".equalsIgnoreCase(chatType) || "sender".equalsIgnoreCase(chatType);
    }

    private InlineQueryResult buildInlineArticleResult(String token, TmdbResponse.Result result, boolean allowSubmit) {
        String posterUrl = this.buildTmdbImageUrl(result.getPosterPath());
        InlineQueryResultArticle.InlineQueryResultArticleBuilder builder = InlineQueryResultArticle.builder().id(token).thumbnailUrl(posterUrl).thumbnailWidth(Integer.valueOf(120)).thumbnailHeight(Integer.valueOf(180)).title(this.buildInlineResultTitle(result)).description(this.buildInlineResultDescription(result)).inputMessageContent((InputMessageContent)InputTextMessageContent.builder().messageText(this.buildInlineSelectedMessage(result, posterUrl)).parseMode("HTML").linkPreviewOptions(LinkPreviewOptions.builder().urlField(posterUrl).preferLargeMedia(Boolean.valueOf(true)).showAboveText(Boolean.valueOf(true)).build()).build()).replyMarkup(this.buildInlineResultKeyboard(token, result, allowSubmit));
        return builder.build();
    }

    private InlineQueryResult buildInlineInfoArticle(String id, String title, String description, String messageText) {
        return InlineQueryResultArticle.builder().id(id).title(title).description(description).inputMessageContent((InputMessageContent)InputTextMessageContent.builder().messageText(messageText).build()).build();
    }

    private InlineKeyboardMarkup buildInlineResultKeyboard(String token, TmdbResponse.Result result, boolean allowSubmit) {
        InlineKeyboardButton tmdbButton = InlineKeyboardButton.builder().text("\ud83c\udf5f TMDB").url(this.buildTmdbPageUrl(result)).build();
        if (!allowSubmit) {
            return InlineKeyboardMarkup.builder().keyboard(List.of(new InlineKeyboardRow(new InlineKeyboardButton[]{tmdbButton}))).build();
        }
        InlineKeyboardButton submitButton = InlineKeyboardButton.builder().text("\ud83c\udfac \u63d0\u4ea4\u6c42\u7247").callbackData("submit_inline_request:" + token).build();
        return InlineKeyboardMarkup.builder().keyboard(List.of(new InlineKeyboardRow(new InlineKeyboardButton[]{tmdbButton, submitButton}))).build();
    }

    private String buildInlineResultToken(TmdbResponse.Result result) {
        return result.getMediaType() + ":" + result.getId();
    }

    private String buildTmdbPageUrl(TmdbResponse.Result result) {
        return "https://www.themoviedb.org/" + ("tv".equals(result.getMediaType()) ? "tv" : "movie") + "/" + result.getId();
    }

    private String buildInlineResultTitle(TmdbResponse.Result result) {
        String year;
        String title = this.resolveTmdbTitle(result);
        String originalTitle = this.resolveTmdbOriginalTitle(result);
        String releaseDate = this.resolveTmdbReleaseDate(result);
        String string = year = StringUtils.hasText((String)releaseDate) && releaseDate.length() >= 4 ? " (" + releaseDate.substring(0, 4) + ")" : "";
        if (StringUtils.hasText((String)originalTitle) && !originalTitle.equals(title)) {
            return this.formatMediaTypeToEmoji(result.getMediaType()) + " " + title + " - " + originalTitle + year;
        }
        return this.formatMediaTypeToEmoji(result.getMediaType()) + " " + title + year;
    }

    private String buildInlineResultDescription(TmdbResponse.Result result) {
        String overview = StringUtils.hasText((String)result.getOverview()) ? result.getOverview() : "\u6682\u65e0\u7b80\u4ecb";
        return this.abbreviate("\u7b80\u4ecb\uff1a -" + overview, 120);
    }

    private String buildInlineSelectedMessage(TmdbResponse.Result result, String posterUrl) {
        StringBuilder builder = new StringBuilder();
        builder.append(this.formatMediaTypeToEmoji(result.getMediaType())).append(" \u300a").append(this.resolveTmdbTitle(result));
        String originalTitle = this.resolveTmdbOriginalTitle(result);
        if (StringUtils.hasText((String)originalTitle) && !originalTitle.equals(this.resolveTmdbTitle(result))) {
            builder.append(" - ").append(originalTitle);
        }
        builder.append("\u300b\n\n");
        this.appendInlineMeta(builder, "\ud83d\uddd3", "\u5e74\u4efd", this.resolveTmdbYear(result));
        this.appendInlineMeta(builder, "\ud83e\udded", "\u5730\u533a", this.buildRegionText(result));
        this.appendInlineMeta(builder, "\ud83c\udf9a", "\u7c7b\u578b", this.formatMediaTypeText(result.getMediaType()));
        this.appendInlineMeta(builder, "\ud83c\udff7", "\u6807\u7b7e", this.buildGenreText(result));
        this.appendInlineMeta(builder, "\ud83d\udcab", "\u8bc4\u5206", this.buildScoreText(result));
        builder.append("\n");
        builder.append(this.buildOverviewText(result));
        builder.append("\n\n");
        builder.append("\u2728 \u770b\u8d77\u6765\u4e0d\u9519\u7684\u8bdd\uff0c\u70b9\u4e0b\u9762\u6309\u94ae\u628a\u5b83\u4e22\u8fdb\u6c42\u7247\u961f\u5217\u3002");
        String messageText = this.abbreviate(builder.toString(), 980);
        if (!StringUtils.hasText((String)posterUrl)) {
            return this.escapeTelegramHtml(messageText);
        }
        return "<a href=\"" + this.escapeTelegramHtmlAttribute(posterUrl) + "\">&#8205;</a>" + this.escapeTelegramHtml(messageText);
    }

    private String escapeTelegramHtml(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }

    private String escapeTelegramHtmlAttribute(String value) {
        return this.escapeTelegramHtml(value).replace("\"", "&quot;");
    }

    private void appendInlineMeta(StringBuilder builder, String icon, String label, String value) {
        if (!StringUtils.hasText((String)value)) {
            return;
        }
        builder.append(icon).append(" ").append(label).append(" | ").append(value).append("\n");
    }

    private String resolveTmdbYear(TmdbResponse.Result result) {
        String date = this.resolveTmdbReleaseDate(result);
        return StringUtils.hasText((String)date) && date.length() >= 4 ? date.substring(0, 4) : "\u672a\u77e5";
    }

    private String buildRegionText(TmdbResponse.Result result) {
        if (result.getOriginCountry() != null && !result.getOriginCountry().isEmpty()) {
            return result.getOriginCountry().stream().filter(StringUtils::hasText).map(this::displayCountryName).collect(Collectors.joining(" / "));
        }
        String language = this.displayLanguageName(result.getOriginalLanguage());
        return StringUtils.hasText((String)language) ? language + "\u8bed\u533a" : "\u672a\u77e5";
    }

    private String buildGenreText(TmdbResponse.Result result) {
        if (result.getGenreIds() == null || result.getGenreIds().isEmpty()) {
            return "\u5f85\u8865\u5168";
        }
        List names = result.getGenreIds().stream().map(id -> this.resolveGenreName((Integer)id, result.getMediaType())).filter(StringUtils::hasText).distinct().limit(4L).collect(Collectors.toList());
        return names.isEmpty() ? "\u5f85\u8865\u5168" : String.join((CharSequence)" / ", names);
    }

    private String buildScoreText(TmdbResponse.Result result) {
        if (result.getVoteAverage() == null || result.getVoteAverage() <= 0.0) {
            return "\u6682\u65e0\u8bc4\u5206";
        }
        String score = String.format("%.1f", result.getVoteAverage());
        if (result.getVoteCount() != null && result.getVoteCount() > 0) {
            return score + " / 10\uff08" + result.getVoteCount() + " \u4eba\u8bc4\uff09";
        }
        return score + " / 10";
    }

    private String buildOverviewText(TmdbResponse.Result result) {
        String overview = StringUtils.hasText((String)result.getOverview()) ? result.getOverview() : "\u6682\u65e0\u7b80\u4ecb\u3002";
        return this.abbreviate("\ud83d\udcd6 " + overview, 1200);
    }

    private String displayCountryName(String countryCode) {
        if (!StringUtils.hasText((String)countryCode)) {
            return "";
        }
        try {
            Locale locale = new Locale.Builder().setRegion(countryCode.trim().toUpperCase(Locale.ROOT)).build();
            String displayName = locale.getDisplayCountry(Locale.SIMPLIFIED_CHINESE);
            return StringUtils.hasText((String)displayName) ? displayName : countryCode;
        }
        catch (Exception ignored) {
            return countryCode;
        }
    }

    private String displayLanguageName(String languageCode) {
        if (!StringUtils.hasText((String)languageCode)) {
            return "";
        }
        try {
            Locale locale = Locale.forLanguageTag(languageCode.trim().toLowerCase(Locale.ROOT));
            String displayName = locale.getDisplayLanguage(Locale.SIMPLIFIED_CHINESE);
            return StringUtils.hasText((String)displayName) ? displayName : languageCode;
        }
        catch (Exception ignored) {
            return languageCode;
        }
    }

    private String resolveGenreName(Integer genreId, String mediaType) {
        if (genreId == null) {
            return null;
        }
        Map<Integer, String> genres = "tv".equals(mediaType) ? this.tvGenreNames() : this.movieGenreNames();
        return genres.getOrDefault(genreId, null);
    }

    private Map<Integer, String> movieGenreNames() {
        LinkedHashMap<Integer, String> genres = new LinkedHashMap<Integer, String>();
        genres.put(28, "\u52a8\u4f5c");
        genres.put(12, "\u5192\u9669");
        genres.put(16, "\u52a8\u753b");
        genres.put(35, "\u559c\u5267");
        genres.put(80, "\u72af\u7f6a");
        genres.put(99, "\u7eaa\u5f55\u7247");
        genres.put(18, "\u5267\u60c5");
        genres.put(10751, "\u5bb6\u5ead");
        genres.put(14, "\u5947\u5e7b");
        genres.put(36, "\u5386\u53f2");
        genres.put(27, "\u6050\u6016");
        genres.put(10402, "\u97f3\u4e50");
        genres.put(9648, "\u60ac\u7591");
        genres.put(10749, "\u7231\u60c5");
        genres.put(878, "\u79d1\u5e7b");
        genres.put(10770, "\u7535\u89c6\u7535\u5f71");
        genres.put(53, "\u60ca\u609a");
        genres.put(10752, "\u6218\u4e89");
        genres.put(37, "\u897f\u90e8");
        return genres;
    }

    private Map<Integer, String> tvGenreNames() {
        LinkedHashMap<Integer, String> genres = new LinkedHashMap<Integer, String>();
        genres.put(10759, "\u52a8\u4f5c\u5192\u9669");
        genres.put(16, "\u52a8\u753b");
        genres.put(35, "\u559c\u5267");
        genres.put(80, "\u72af\u7f6a");
        genres.put(99, "\u7eaa\u5f55\u7247");
        genres.put(18, "\u5267\u60c5");
        genres.put(10751, "\u5bb6\u5ead");
        genres.put(10762, "\u513f\u7ae5");
        genres.put(9648, "\u60ac\u7591");
        genres.put(10763, "\u65b0\u95fb");
        genres.put(10764, "\u771f\u4eba\u79c0");
        genres.put(10765, "\u79d1\u5e7b\u5947\u5e7b");
        genres.put(10766, "\u80a5\u7682\u5267");
        genres.put(10767, "\u8131\u53e3\u79c0");
        genres.put(10768, "\u6218\u4e89\u653f\u6cbb");
        genres.put(37, "\u897f\u90e8");
        return genres;
    }

    private void answerInlineQuery(String inlineQueryId, List<InlineQueryResult> results, int cacheTime, boolean personal) {
        try {
            AnswerInlineQuery answerInlineQuery = AnswerInlineQuery.builder().inlineQueryId(inlineQueryId).results(results).cacheTime(Integer.valueOf(cacheTime)).isPersonal(Boolean.valueOf(personal)).nextOffset("").build();
            this.telegramClient.execute(answerInlineQuery);
        }
        catch (TelegramApiException e) {
            log.error("\u54cd\u5e94 Telegram inline query \u5931\u8d25: {}", (Object)e.getMessage(), (Object)e);
        }
    }

    private void handleGenerateCardsCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        int day;
        int count;
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        String[] args = argument.split("\\s+");
        if (args.length < 2) {
            this.sendMessage(chatId, "\u7528\u6cd5\uff1a`/generatecards <\u6570\u91cf> <\u5929\u6570>`\n\u793a\u4f8b\uff1a`/generatecards 10 30`");
            return;
        }
        try {
            count = Integer.parseInt(args[0]);
            day = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e) {
            this.sendMessage(chatId, "\u6570\u91cf\u548c\u5929\u6570\u90fd\u5fc5\u987b\u662f\u6570\u5b57\uff0c\u4f8b\u5982\uff1a`/generatecards 10 30`");
            return;
        }
        if (count <= 0 || day <= 0) {
            this.sendMessage(chatId, "\u6570\u91cf\u548c\u5929\u6570\u5fc5\u987b\u5927\u4e8e 0\u3002");
            return;
        }
        List<EmbyInfo> servers = this.loadAvailableServers();
        if (servers.isEmpty()) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u53ef\u7528\u670d\u52a1\u5668\uff0c\u8bf7\u5148\u5728\u540e\u53f0\u914d\u7f6e\u3002");
            return;
        }
        this.pendingCardBatches.put(userId, new PendingCardBatch(chatId, count, day));
        InlineKeyboardMarkup keyboard = this.buildServerSelectionKeyboard(servers, "card_server:");
        SendMessage selectServerMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text("\u8bf7\u9009\u62e9\u8981\u751f\u6210\u5361\u5bc6\u7684\u670d\u52a1\u5668\uff1a").replyMarkup((ReplyKeyboard)keyboard).build();
        try {
            org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(selectServerMessage);
            this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
        }
        catch (TelegramApiException e) {
            log.error("\u53d1\u9001\u670d\u52a1\u5668\u9009\u62e9\u5217\u8868\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u53d1\u9001\u670d\u52a1\u5668\u5217\u8868\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleExtendUsersCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        Integer extensionDay;
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        String[] args = argument.split("\\s+");
        if (args.length < 1 || !StringUtils.hasText((String)args[0])) {
            this.sendMessage(chatId, "\u7528\u6cd5\uff1a`/extendusers <\u5ef6\u671f\u5929\u6570> [\u8fc7\u671f\u5929\u6570\u8303\u56f4]`\n\u793a\u4f8b\uff1a`/extendusers 15 30`\n\u9009\u62e9\u670d\u52a1\u5668\u540e\u5ef6\u671f\u8be5\u670d\u52a1\u5668\u7684\u7528\u6237");
            return;
        }
        Integer expiredRange = null;
        try {
            extensionDay = Integer.parseInt(args[0]);
            if (args.length > 1) {
                expiredRange = Integer.parseInt(args[1]);
            }
        }
        catch (NumberFormatException e) {
            this.sendMessage(chatId, "\u53c2\u6570\u5fc5\u987b\u4e3a\u6570\u5b57\uff0c\u4f8b\u5982\uff1a`/extendusers 15 30`");
            return;
        }
        if (extensionDay == null || extensionDay <= 0) {
            this.sendMessage(chatId, "\u5ef6\u671f\u5929\u6570\u5fc5\u987b\u5927\u4e8e 0\u3002");
            return;
        }
        List servers = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyInfoService.lambdaQuery().eq(EmbyInfo::getEnabled, (Object)1)).eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).list();
        if (CollectionUtils.isEmpty((Collection)servers)) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u53ef\u7528\u670d\u52a1\u5668\uff0c\u8bf7\u5148\u5728\u540e\u53f0\u914d\u7f6e\u3002");
            return;
        }
        this.pendingExtendBatches.put(userId, new PendingExtendBatch(chatId, extensionDay, expiredRange));
        InlineKeyboardMarkup keyboard = this.buildServerSelectionKeyboard(servers, "extend_server:");
        SendMessage selectServerMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text("\u8bf7\u9009\u62e9\u8981\u5ef6\u671f\u7528\u6237\u7684\u670d\u52a1\u5668\uff1a").replyMarkup((ReplyKeyboard)keyboard).build();
        try {
            org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(selectServerMessage);
            this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
        }
        catch (TelegramApiException e) {
            log.error("\u53d1\u9001\u670d\u52a1\u5668\u9009\u62e9\u5217\u8868\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u53d1\u9001\u670d\u52a1\u5668\u5217\u8868\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleEditUserCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        String keyword = argument.trim();
        if (!StringUtils.hasText((String)keyword)) {
            this.sendMessage(chatId, "\u8bf7\u8f93\u5165\u8981\u641c\u7d22\u7684\u7528\u6237\u540d\u5173\u952e\u8bcd\uff0c\u4f8b\u5982\uff1a`/edituser test`");
            return;
        }
        List users = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyUserService.lambdaQuery().like(EmbyUser::getEmbyUserName, (Object)keyword)).orderByAsc(EmbyUser::getEmbyUserName)).last("limit 10")).list();
        if (users == null || users.isEmpty()) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u5339\u914d\u7684\u7528\u6237\u3002");
            return;
        }
        ArrayList<InlineKeyboardRow> rows = new ArrayList<InlineKeyboardRow>();
        for (EmbyUser user : users) {
            String statusEmoji = user.getUserStatus() != null && user.getUserStatus() == 1 ? "\ud83d\udd34 " : "\ud83d\udfe2 ";
            InlineKeyboardButton button = InlineKeyboardButton.builder().text(statusEmoji + user.getEmbyUserName() + this.formatExpirationDate(user.getExpirationDate())).callbackData("edit_user:" + user.getId()).build();
            rows.add(new InlineKeyboardRow(new InlineKeyboardButton[]{button}));
        }
        InlineKeyboardMarkup keyboard = InlineKeyboardMarkup.builder().keyboard(rows).build();
        SendMessage sendMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text("\ud83d\udc65 *\u8bf7\u9009\u62e9\u8981\u4fee\u6539\u7684\u7528\u6237*\uff08\u6700\u591a\u663e\u793a10\u4e2a\uff09\uff1a").parseMode("Markdown").replyMarkup((ReplyKeyboard)keyboard).build();
        this.pendingUserEdits.remove(userId);
        try {
            org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(sendMessage);
            this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
        }
        catch (TelegramApiException e) {
            log.error("\u53d1\u9001\u7528\u6237\u5217\u8868\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u53d1\u9001\u7528\u6237\u5217\u8868\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleUpdateUserInfoCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        Integer requestCount;
        LocalDateTime dateTime;
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        PendingUserEdit pending = this.pendingUserEdits.get(userId);
        if (pending == null) {
            this.sendMessage(chatId, "\u8bf7\u5148\u4f7f\u7528 /edituser \u641c\u7d22\u5e76\u9009\u62e9\u7528\u6237\u3002");
            return;
        }
        String[] args = argument.split("\\s+", 4);
        if (args.length < 4) {
            this.sendMessage(chatId, "\ud83d\udcdd *\u7528\u6cd5\uff1a*\n`/updateuserinfo <\u5230\u671f\u65f6\u95f4> <\u6c42\u7247\u6b21\u6570> <\u5907\u6ce8>`\n\n\u23f0 *\u65f6\u95f4\u683c\u5f0f\uff1a* `yyyy-MM-dd HH:mm:ss`\n\ud83d\udccc *\u793a\u4f8b\uff1a*\n`/updateuserinfo 2025-12-31 23:59:59 10 VIP\u7528\u6237`\n\n\ud83d\udca1 \u5907\u6ce8\u53ef\u5305\u542b\u7a7a\u683c");
            return;
        }
        String dateTimeStr = args[0] + " " + args[1];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        try {
            dateTime = LocalDateTime.parse(dateTimeStr, formatter);
            requestCount = Integer.parseInt(args[2]);
        }
        catch (DateTimeParseException e) {
            this.sendMessage(chatId, "\u274c \u65e5\u671f\u65f6\u95f4\u683c\u5f0f\u9519\u8bef\uff01\n\u6b63\u786e\u683c\u5f0f\uff1a`yyyy-MM-dd HH:mm:ss`\n\u793a\u4f8b\uff1a`2025-12-31 23:59:59`");
            return;
        }
        catch (NumberFormatException e) {
            this.sendMessage(chatId, "\u274c \u6c42\u7247\u6b21\u6570\u5fc5\u987b\u662f\u6570\u5b57\uff01");
            return;
        }
        String remarks = args[3];
        EmbyUserUpdateData updateData = new EmbyUserUpdateData();
        updateData.setId(pending.getUserId());
        updateData.setExpirationDate(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
        updateData.setRequestPackagesCount(requestCount);
        updateData.setRemarks(remarks);
        try {
            this.embyUserService.updateUserDataByBot(updateData);
            this.sendMessage(chatId, "\u2705 \u7528\u6237\u4fe1\u606f\u5df2\u66f4\u65b0\u3002");
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u66f4\u65b0\u5931\u8d25\uff1a" + e.getMessage());
        }
        catch (Exception e) {
            log.error("\u66f4\u65b0\u7528\u6237\u4fe1\u606f\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u66f4\u65b0\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleMyAccountCommand(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        EmbyUser user;
        long chatId = message.getChatId();
        if (!message.isUserMessage()) {
            this.sendMessage(chatId, "\ud83d\udd12 \u8bf7\u79c1\u804a\u673a\u5668\u4eba\u540e\u4f7f\u7528 `/myaccount` \u67e5\u8be2\u4f60\u7684\u5173\u8054\u8d26\u53f7\u3002");
            return;
        }
        long telegramUserId = message.getFrom().getId();
        String telegramId = String.valueOf(telegramUserId);
        String telegramUsername = message.getFrom().getUserName();
        LinkedHashMap<Long, TelegramAccountMatch> matches = new LinkedHashMap<Long, TelegramAccountMatch>();
        UserOauthBinding binding = (UserOauthBinding)this.userOauthBindingMapper.selectOne((Wrapper)((LambdaQueryWrapper)new LambdaQueryWrapper().eq(UserOauthBinding::getProvider, (Object)"telegram")).eq(UserOauthBinding::getProviderUserId, (Object)telegramId));
        if (binding != null && binding.getUserId() != null && (user = (EmbyUser)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyUserService.lambdaQuery().eq(EmbyUser::getId, (Object)binding.getUserId())).eq(BaseEntity::getDelFlag, (Object)0)).one()) != null) {
            matches.put(user.getId(), new TelegramAccountMatch(user, "Telegram \u767b\u5f55\u7ed1\u5b9a"));
        }
        ArrayList<CallSite> redeemDetails = new ArrayList<CallSite>();
        redeemDetails.add((CallSite)((Object)("Telegram\u79ef\u5206\u5151\u6362(" + telegramId + ")")));
        if (StringUtils.hasText((String)telegramUsername)) {
            Object normalizedUsername = telegramUsername.startsWith("@") ? telegramUsername : "@" + telegramUsername;
            redeemDetails.add((CallSite)((Object)("Telegram\u79ef\u5206\u5151\u6362(" + (String)normalizedUsername + ")")));
        }
        List redeemRecords = ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyUserRegisterRecordService.lambdaQuery().eq(BaseEntity::getDelFlag, (Object)0)).in(EmbyUserRegisterRecord::getRegisterChannelDetail, redeemDetails)).orderByDesc(EmbyUserRegisterRecord::getId)).list();
        for (EmbyUserRegisterRecord record : redeemRecords) {
            EmbyUser user2;
            if (record.getUserId() == null || matches.containsKey(record.getUserId()) || (user2 = (EmbyUser)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyUserService.lambdaQuery().eq(EmbyUser::getId, (Object)record.getUserId())).eq(BaseEntity::getDelFlag, (Object)0)).one()) == null) continue;
            matches.put(user2.getId(), new TelegramAccountMatch(user2, "Telegram \u79ef\u5206\u5151\u6362\u8bb0\u5f55"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\ud83d\udd0e *\u8d26\u53f7\u67e5\u8be2\u7ed3\u679c*\n\n");
        sb.append("\ud83c\udd94 *Telegram ID\uff1a* `").append(telegramId).append("`\n");
        if (StringUtils.hasText((String)telegramUsername)) {
            Object normalizedUsername = telegramUsername.startsWith("@") ? telegramUsername : "@" + telegramUsername;
            sb.append("\ud83d\udc64 *Telegram \u7528\u6237\u540d\uff1a* `").append((String)normalizedUsername).append("`\n");
        }
        if (matches.isEmpty()) {
            sb.append("\n\ud83e\uddd0 \u672a\u627e\u5230\u4e0e\u4f60\u5f53\u524d Telegram \u8d26\u53f7\u5173\u8054\u7684 Emby \u8d26\u53f7\u3002\n\n").append("\ud83d\udd17 \u5982\u679c\u4f60\u5df2\u7ecf\u5728\u7f51\u9875\u7aef\u7ed1\u5b9a\u8fc7 Telegram\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\uff1b\u5982\u679c\u8fd8\u672a\u7ed1\u5b9a\uff0c\u8bf7\u5148\u5728 Foam \u7f51\u9875\u7aef\u5b8c\u6210\u7ed1\u5b9a\u3002");
            this.sendMessage(chatId, sb.toString());
            return;
        }
        sb.append("\n\u2705 \u5171\u627e\u5230 *").append(matches.size()).append("* \u4e2a\u5173\u8054\u8d26\u53f7\uff1a\n\n");
        int index = 1;
        for (TelegramAccountMatch match : matches.values()) {
            EmbyUser user3 = match.getUser();
            sb.append(index++).append(". \ud83d\udc64 `").append(user3.getEmbyUserName()).append("`\n");
            sb.append("\ud83d\udccc \u6765\u6e90\uff1a").append(match.getSource()).append("\n");
            sb.append("\ud83d\udcca \u72b6\u6001\uff1a").append(user3.getUserStatus() != null && user3.getUserStatus() == 1 ? "\u7981\u7528" : "\u542f\u7528").append("\n");
            sb.append("\u23f0 \u5230\u671f\uff1a").append(this.formatDateTime(user3.getExpirationDate())).append("\n");
            if (user3.getEmbyInfoId() != null) {
                EmbyInfo server = (EmbyInfo)this.embyInfoService.getById(user3.getEmbyInfoId());
                sb.append("\ud83d\udda5\ufe0f \u670d\u52a1\u5668\uff1a").append(this.buildServerLabel(server)).append("\n");
            }
            if (index > matches.size()) continue;
            sb.append("\n");
        }
        this.sendMessage(chatId, sb.toString());
    }

    private void handleBindCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        long chatId = message.getChatId();
        long telegramUserId = message.getFrom().getId();
        String telegramUsername = message.getFrom().getUserName();
        String sessionId = argument.substring("bind_".length()).trim();
        if (!StringUtils.hasText((String)sessionId)) {
            this.sendMessage(chatId, "\u274c \u65e0\u6548\u7684\u7ed1\u5b9a\u94fe\u63a5\uff0c\u8bf7\u8fd4\u56de\u7f51\u9875\u91cd\u65b0\u70b9\u51fb\u7ed1\u5b9a\u3002");
            return;
        }
        if (sessionId.matches("\\d+")) {
            this.sendMessage(chatId, "\u23f0 \u8be5\u7ed1\u5b9a\u94fe\u63a5\u5df2\u8fc7\u671f\u6216\u7248\u672c\u8fc7\u65e7\uff0c\u8bf7\u8fd4\u56de\u7f51\u9875\u91cd\u65b0\u70b9\u51fb\u7ed1\u5b9a\u3002");
            return;
        }
        try {
            EmbyUserCustomResponse result = this.telegramAuthService.completeBind(sessionId, telegramUserId, telegramUsername, null);
            if (result == null) {
                this.sendMessage(chatId, "\u23f0 \u7ed1\u5b9a\u94fe\u63a5\u5df2\u8fc7\u671f\uff0c\u8bf7\u8fd4\u56de\u7f51\u9875\u91cd\u65b0\u70b9\u51fb\u7ed1\u5b9a\u3002");
                return;
            }
            String successMessage = "\u2705 *\u7ed1\u5b9a\u6210\u529f\uff01*\n\n\ud83c\udf89 \u60a8\u7684 Telegram \u8d26\u6237\u5df2\u6210\u529f\u7ed1\u5b9a\u5230 Emby \u7528\u6237\uff1a\n\ud83d\udc64 \u7528\u6237\u540d\uff1a`" + result.getEmbyUserName() + "`\n\n\ud83c\udfac \u73b0\u5728\u53ef\u4ee5\u53d1\u9001 `/request \u7247\u540d` \u641c\u7d22 TMDB \u5e76\u63d0\u4ea4\u6c42\u7247\u3002\n\ud83d\udca1 \u4e5f\u53ef\u4ee5\u4f7f\u7528 `@\u673a\u5668\u4eba \u5f71\u7247\u540d` \u5185\u8054\u641c\u7d22\uff0c\u4f53\u9a8c\u66f4\u597d\uff1b";
            this.sendMessage(chatId, successMessage);
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u274c " + e.getMessage());
        }
        catch (Exception e) {
            log.error("Telegram \u4e00\u6b21\u6027\u4f1a\u8bdd\u7ed1\u5b9a\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u274c \u7ed1\u5b9a\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleCredentialBindCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        long telegramUserId;
        long chatId = message.getChatId();
        if (chatId != (telegramUserId = message.getFrom().getId().longValue())) {
            this.sendMessage(chatId, "\ud83d\udd12 \u8bf7\u79c1\u804a\u673a\u5668\u4eba\u4f7f\u7528 `/bind \u7528\u6237\u540d \u5bc6\u7801` \u7ed1\u5b9a\u8d26\u53f7\u3002");
            return;
        }
        if (!this.tryAcquireRateLimit("bind:" + telegramUserId, 5L, 600L)) {
            this.sendMessage(chatId, "\u23f3 \u7ed1\u5b9a\u5c1d\u8bd5\u592a\u9891\u7e41\u4e86\uff0c\u8bf7 10 \u5206\u949f\u540e\u518d\u8bd5\u3002");
            return;
        }
        String[] args = argument.trim().split("\\s+", 2);
        if (args.length < 2 || !StringUtils.hasText((String)args[0]) || !StringUtils.hasText((String)args[1])) {
            this.sendMessage(chatId, "\ud83d\udcdd \u7528\u6cd5\uff1a`/bind \u7528\u6237\u540d \u5bc6\u7801`");
            return;
        }
        EmbyUser boundUser = this.telegramAuthService.findBoundUser(telegramUserId);
        if (boundUser != null) {
            this.sendMessage(chatId, "\u2139\ufe0f \u5f53\u524d Telegram \u5df2\u7ed1\u5b9a Emby \u8d26\u53f7\uff1a`" + this.escapeMarkdown(boundUser.getEmbyUserName()) + "`\n\ud83d\udd01 \u5982\u9700\u66f4\u6362\u7ed1\u5b9a\uff0c\u8bf7\u5148\u53d1\u9001 `/unbind`\u3002");
            return;
        }
        try {
            EmbyUserCustomResponse result = this.telegramAuthService.bindByCredentials(telegramUserId, message.getFrom().getUserName(), null, args[0], args[1]);
            this.sendMessage(chatId, "\u2705 \u7ed1\u5b9a\u6210\u529f\uff1a`" + result.getEmbyUserName() + "`\n\ud83c\udfac \u73b0\u5728\u53ef\u4ee5\u53d1\u9001 `/request \u7247\u540d` \u641c\u7d22 TMDB \u5e76\u63d0\u4ea4\u6c42\u7247\u3002\n\ud83d\udca1 \u4e5f\u53ef\u4ee5\u4f7f\u7528 `@\u673a\u5668\u4eba \u5f71\u7247\u540d` \u5185\u8054\u641c\u7d22\uff0c\u4f53\u9a8c\u66f4\u597d\uff1b");
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u274c " + e.getMessage());
        }
        catch (Exception e) {
            log.error("Telegram \u79c1\u804a\u7ed1\u5b9a\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u274c \u7ed1\u5b9a\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleTelegramUnbindCommand(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        long telegramUserId;
        long chatId = message.getChatId();
        if (chatId != (telegramUserId = message.getFrom().getId().longValue())) {
            this.sendMessage(chatId, "\ud83d\udd12 \u89e3\u7ed1\u53ea\u652f\u6301\u79c1\u804a\u673a\u5668\u4eba\uff0c\u8bf7\u79c1\u804a\u53d1\u9001 `/unbind`\u3002");
            return;
        }
        if (!this.tryAcquireRateLimit("unbind:" + telegramUserId, 5L, 600L)) {
            this.sendMessage(chatId, "\u23f3 \u89e3\u7ed1\u64cd\u4f5c\u592a\u9891\u7e41\u4e86\uff0c\u8bf7 10 \u5206\u949f\u540e\u518d\u8bd5\u3002");
            return;
        }
        EmbyUser boundUser = this.findTelegramBoundUserForUnbind(telegramUserId);
        if (boundUser == null) {
            this.sendMessage(chatId, "\u2139\ufe0f \u5f53\u524d Telegram \u8d26\u53f7\u6ca1\u6709\u7ed1\u5b9a Emby \u8d26\u53f7\u3002");
            return;
        }
        InlineKeyboardButton confirmButton = InlineKeyboardButton.builder().text("\u2705 \u786e\u8ba4\u89e3\u7ed1").callbackData("confirm_unbind").build();
        InlineKeyboardButton cancelButton = InlineKeyboardButton.builder().text("\u21a9\ufe0f \u53d6\u6d88").callbackData("cancel_unbind").build();
        InlineKeyboardMarkup keyboard = InlineKeyboardMarkup.builder().keyboard(List.of(new InlineKeyboardRow(new InlineKeyboardButton[]{confirmButton, cancelButton}))).build();
        SendMessage confirmMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text("\u26a0\ufe0f *\u786e\u8ba4\u89e3\u9664 Telegram \u7ed1\u5b9a\uff1f*\n\n\u5f53\u524d\u7ed1\u5b9a\u8d26\u53f7\uff1a`" + this.escapeMarkdown(boundUser.getEmbyUserName()) + "`\n\n\u89e3\u7ed1\u540e\u4e0d\u4f1a\u5220\u9664 Emby \u8d26\u53f7\uff0c\u4f46\u5c06\u65e0\u6cd5\u901a\u8fc7 Telegram \u767b\u5f55\u3001\u6c42\u7247\u6216\u4f7f\u7528\u9700\u8981\u7ed1\u5b9a\u8eab\u4efd\u7684\u529f\u80fd\u3002").parseMode("Markdown").replyMarkup((ReplyKeyboard)keyboard).build();
        try {
            this.telegramClient.execute(confirmMessage);
        }
        catch (TelegramApiException e) {
            log.error("\u53d1\u9001 Telegram \u89e3\u7ed1\u786e\u8ba4\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u274c \u53d1\u9001\u89e3\u7ed1\u786e\u8ba4\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleTelegramUnbindConfirm(CallbackQuery callbackQuery) {
        if (callbackQuery == null || callbackQuery.getFrom() == null || callbackQuery.getMessage() == null) {
            return;
        }
        long telegramUserId = callbackQuery.getFrom().getId();
        long chatId = callbackQuery.getMessage().getChatId();
        Integer messageId = callbackQuery.getMessage().getMessageId();
        if (chatId != telegramUserId) {
            this.sendMessage(chatId, "\ud83d\udd12 \u89e3\u7ed1\u53ea\u5141\u8bb8\u672c\u4eba\u79c1\u804a\u786e\u8ba4\u3002");
            return;
        }
        if (!this.tryAcquireRateLimit("unbind_confirm:" + telegramUserId, 3L, 600L)) {
            this.editMessageTextSilently(chatId, messageId, "\u23f3 \u89e3\u7ed1\u786e\u8ba4\u592a\u9891\u7e41\u4e86\uff0c\u8bf7 10 \u5206\u949f\u540e\u518d\u8bd5\u3002");
            return;
        }
        try {
            EmbyUser unboundUser = this.telegramAuthService.unbindByTelegramId(telegramUserId);
            if (unboundUser == null) {
                this.editMessageTextSilently(chatId, messageId, "\u2139\ufe0f \u5f53\u524d Telegram \u8d26\u53f7\u6ca1\u6709\u7ed1\u5b9a Emby \u8d26\u53f7\u3002");
                return;
            }
            this.editMessageTextSilently(chatId, messageId, "\u2705 \u5df2\u89e3\u9664 Telegram \u7ed1\u5b9a\uff1a`" + this.escapeMarkdown(unboundUser.getEmbyUserName()) + "`\n\ud83d\udce6 Emby \u8d26\u53f7\u4ecd\u7136\u4fdd\u7559\uff0c\u9700\u8981\u65f6\u53ef\u91cd\u65b0\u4f7f\u7528 `/bind \u7528\u6237\u540d \u5bc6\u7801` \u7ed1\u5b9a\u3002");
        }
        catch (BizException e) {
            this.editMessageTextSilently(chatId, messageId, "\u274c " + e.getMessage());
        }
        catch (Exception e) {
            log.error("Telegram \u79c1\u804a\u89e3\u7ed1\u5931\u8d25", (Throwable)e);
            this.editMessageTextSilently(chatId, messageId, "\u274c \u89e3\u7ed1\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private EmbyUser findTelegramBoundUserForUnbind(Long telegramUserId) {
        if (telegramUserId == null) {
            return null;
        }
        UserOauthBinding binding = (UserOauthBinding)this.userOauthBindingMapper.selectOne((Wrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)((LambdaQueryWrapper)new LambdaQueryWrapper().eq(UserOauthBinding::getProvider, (Object)"telegram")).eq(UserOauthBinding::getProviderUserId, (Object)String.valueOf(telegramUserId))).eq(BaseEntity::getDelFlag, (Object)0)).last("limit 1"));
        if (binding == null || binding.getUserId() == null) {
            return null;
        }
        return (EmbyUser)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyUserService.lambdaQuery().eq(EmbyUser::getId, (Object)binding.getUserId())).eq(BaseEntity::getDelFlag, (Object)0)).one();
    }

    /*
     * Exception decompiling
     */
    private void handleTelegramRegisterCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private boolean isTelegramBotRegistrationEnabled() {
        return this.configCacheLoaderUtils.getConfigValue("telegram_bot_register_enabled") != null;
    }

    private boolean tryReserveTelegramRegisterQuota() {
        for (int i = 0; i < 3; ++i) {
            SystemConfig registerConfig = (SystemConfig)((LambdaQueryChainWrapper)this.systemConfigService.lambdaQuery().eq(SystemConfig::getConfigKey, (Object)"telegram_bot_register_enabled")).one();
            if (registerConfig == null || !Integer.valueOf(1).equals(registerConfig.getIsEnabled())) {
                return false;
            }
            String currentValue = registerConfig.getConfigValue();
            JSONObject currentConfig = this.parseTelegramRegisterConfig(currentValue);
            int maxCount = currentConfig.getIntValue("maxCount");
            int usedCount = currentConfig.getIntValue("usedCount");
            if (maxCount <= 0) {
                return false;
            }
            if (usedCount >= maxCount) {
                return false;
            }
            currentConfig.put((Object)"usedCount", (Object)(usedCount + 1));
            boolean updated = ((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)this.systemConfigService.lambdaUpdate().set(SystemConfig::getConfigValue, (Object)currentConfig.toJSONString(new JSONWriter.Feature[0]))).eq(SystemConfig::getId, (Object)registerConfig.getId())).eq(currentValue != null, SystemConfig::getConfigValue, (Object)currentValue)).isNull(currentValue == null, SystemConfig::getConfigValue)).update();
            if (!updated) continue;
            this.configCacheLoaderUtils.refreshCache();
            return true;
        }
        return false;
    }

    private void releaseTelegramRegisterQuota() {
        try {
            SystemConfig registerConfig = (SystemConfig)((LambdaQueryChainWrapper)this.systemConfigService.lambdaQuery().eq(SystemConfig::getConfigKey, (Object)"telegram_bot_register_enabled")).one();
            if (registerConfig == null) {
                return;
            }
            JSONObject currentConfig = this.parseTelegramRegisterConfig(registerConfig.getConfigValue());
            int usedCount = currentConfig.getIntValue("usedCount");
            currentConfig.put((Object)"usedCount", (Object)Math.max(0, usedCount - 1));
            ((LambdaUpdateChainWrapper)((LambdaUpdateChainWrapper)this.systemConfigService.lambdaUpdate().set(SystemConfig::getConfigValue, (Object)currentConfig.toJSONString(new JSONWriter.Feature[0]))).eq(SystemConfig::getId, (Object)registerConfig.getId())).update();
            this.configCacheLoaderUtils.refreshCache();
        }
        catch (Exception e) {
            log.warn("\u5f52\u8fd8 Telegram \u6ce8\u518c\u540d\u989d\u5931\u8d25", (Throwable)e);
        }
    }

    private JSONObject parseTelegramRegisterConfig(String value) {
        JSONObject config = new JSONObject();
        config.put((Object)"defaultDays", (Object)0);
        config.put((Object)"maxCount", (Object)0);
        config.put((Object)"usedCount", (Object)0);
        if (!StringUtils.hasText((String)value)) {
            return config;
        }
        String text = value.trim();
        if (text.startsWith("{")) {
            try {
                JSONObject parsed = JSONObject.parseObject((String)text);
                config.put((Object)"defaultDays", (Object)this.parseNonNegativeInt(parsed.getString("defaultDays")));
                config.put((Object)"maxCount", (Object)this.parseNonNegativeInt(parsed.getString("maxCount")));
                config.put((Object)"usedCount", (Object)this.parseNonNegativeInt(parsed.getString("usedCount")));
                return config;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        config.put((Object)"defaultDays", (Object)this.parseNonNegativeInt(text));
        return config;
    }

    private int parseNonNegativeInt(String value) {
        if (!StringUtils.hasText((String)value)) {
            return 0;
        }
        try {
            return Math.max(0, Integer.parseInt(value.trim()));
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    private String buildTelegramRegisterChannelDetail(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        String telegramUsername = message.getFrom().getUserName();
        if (StringUtils.hasText((String)telegramUsername)) {
            Object normalizedUsername = telegramUsername.startsWith("@") ? telegramUsername : "@" + telegramUsername;
            return "Telegram\u5f00\u653e\u6ce8\u518c(" + (String)normalizedUsername + ")";
        }
        return "Telegram\u5f00\u653e\u6ce8\u518c(" + message.getFrom().getId() + ")";
    }

    private void sendBindRequiredMessage(long chatId) {
        this.sendMessage(chatId, "\ud83d\udd17 \u8bf7\u5148\u7ed1\u5b9a Emby \u8d26\u53f7\u540e\u518d\u6c42\u7247\uff1a\n1. \ud83c\udf10 \u7f51\u9875\u4e2a\u4eba\u8d44\u6599\u4e2d\u70b9\u51fb\u7ed1\u5b9a Telegram\n2. \ud83e\udd16 \u6216\u79c1\u804a\u53d1\u9001 `/bind \u7528\u6237\u540d \u5bc6\u7801`\n\ud83c\udd95 \u5982\u679c\u8fd8\u6ca1\u6709\u8d26\u53f7\uff0c\u7ba1\u7406\u5458\u5f00\u542f Telegram \u79c1\u804a\u6ce8\u518c\u540e\u53ef\u53d1\u9001 `/register \u7528\u6237\u540d \u5bc6\u7801`\u3002");
    }

    private String escapeMarkdown(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("\\", "\\\\").replace("_", "\\_").replace("*", "\\*").replace("`", "\\`").replace("[", "\\[");
    }

    private void handleLoginCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        long chatId = message.getChatId();
        long telegramUserId = message.getFrom().getId();
        String sessionId = argument.substring("login_".length()).trim();
        if (!StringUtils.hasText((String)sessionId)) {
            this.sendMessage(chatId, "\u274c \u65e0\u6548\u7684\u767b\u5f55\u94fe\u63a5\uff0c\u7f3a\u5c11\u4f1a\u8bddID\u3002");
            return;
        }
        EmbyUserCustomResponse result = this.telegramAuthService.completeLogin(sessionId, telegramUserId);
        if (result != null) {
            String successMessage = "\u2705 *\u767b\u5f55\u6210\u529f\uff01*\n\n\ud83c\udf89 \u6b22\u8fce\u56de\u6765\uff0c" + result.getEmbyUserName() + "\uff01\n\n\u8bf7\u8fd4\u56de\u7f51\u9875\u5b8c\u6210\u767b\u5f55\u3002";
            this.sendMessage(chatId, successMessage);
        } else {
            String telegramId = String.valueOf(telegramUserId);
            UserOauthBinding binding = (UserOauthBinding)this.userOauthBindingMapper.selectOne((Wrapper)((LambdaQueryWrapper)new LambdaQueryWrapper().eq(UserOauthBinding::getProvider, (Object)"telegram")).eq(UserOauthBinding::getProviderUserId, (Object)telegramId));
            if (binding == null) {
                this.sendMessage(chatId, "\u274c \u767b\u5f55\u5931\u8d25\uff1a\u60a8\u7684 Telegram \u8d26\u6237\u5c1a\u672a\u7ed1\u5b9a Emby \u8d26\u6237\u3002\n\n\ud83d\udd17 \u8bf7\u5148\u5728\u7f51\u9875\u7aef\u767b\u5f55\u540e\u7ed1\u5b9a Telegram\u3002");
            } else {
                this.sendMessage(chatId, "\u274c \u767b\u5f55\u5931\u8d25\uff1a\u767b\u5f55\u94fe\u63a5\u5df2\u8fc7\u671f\u6216\u65e0\u6548\u3002\n\n\ud83d\udd01 \u8bf7\u8fd4\u56de\u7f51\u9875\u91cd\u65b0\u70b9\u51fb Telegram \u767b\u5f55\u3002");
            }
        }
    }

    private void handleResetPasswordCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        PendingUserEdit pending = this.pendingUserEdits.get(userId);
        if (pending == null) {
            this.sendMessage(chatId, "\u8bf7\u5148\u4f7f\u7528 /edituser \u641c\u7d22\u5e76\u9009\u62e9\u7528\u6237\u3002");
            return;
        }
        String newPassword = argument.trim();
        if (!StringUtils.hasText((String)newPassword)) {
            this.sendMessage(chatId, "\u7528\u6cd5\uff1a`/resetpassword <\u65b0\u5bc6\u7801>`");
            return;
        }
        EmbyUserUpdate update = new EmbyUserUpdate();
        update.setId(pending.getUserId());
        update.setEmbyUserPassword(newPassword);
        try {
            this.embyUserService.updateUser(update);
            this.sendMessage(chatId, "\u5bc6\u7801\u5df2\u91cd\u7f6e\u3002");
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u91cd\u7f6e\u5931\u8d25\uff1a" + e.getMessage());
        }
        catch (Exception e) {
            log.error("\u91cd\u7f6e\u5bc6\u7801\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u91cd\u7f6e\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleEnableUserCommand(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        boolean isExpired;
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        PendingUserEdit pending = this.pendingUserEdits.get(userId);
        if (pending == null) {
            this.sendMessage(chatId, "\u8bf7\u5148\u4f7f\u7528 `/edituser` \u641c\u7d22\u5e76\u9009\u62e9\u7528\u6237\u3002");
            return;
        }
        EmbyUser user = (EmbyUser)this.embyUserService.getById(Long.valueOf(pending.getUserId()));
        if (user == null) {
            this.sendMessage(chatId, "\u274c \u7528\u6237\u4e0d\u5b58\u5728\u3002");
            this.pendingUserEdits.remove(userId);
            return;
        }
        if (user.getUserStatus() != null && user.getUserStatus() == 0) {
            this.sendMessage(chatId, "\u26a0\ufe0f \u8be5\u7528\u6237\u5df2\u5904\u4e8e\u542f\u7528\u72b6\u6001\u3002");
            return;
        }
        Date now = new Date();
        boolean bl = isExpired = user.getExpirationDate() != null && user.getExpirationDate().before(now);
        if (isExpired) {
            this.sendMessage(chatId, "\u26a0\ufe0f \u8be5\u7528\u6237\u5df2\u8fc7\u671f\uff0c\u8bf7\u5148\u8bbe\u7f6e\u65b0\u7684\u8fc7\u671f\u65f6\u95f4\uff1a\n\n\u4f7f\u7528 `/setexpiry <\u5230\u671f\u65f6\u95f4>`\n\u65f6\u95f4\u683c\u5f0f\uff1a`yyyy-MM-dd HH:mm:ss`\n\u793a\u4f8b\uff1a`/setexpiry 2025-12-31 23:59:59`");
            return;
        }
        try {
            this.embyUserService.enableUserByBot(pending.getUserId());
            this.sendMessage(chatId, "\u2705 \u7528\u6237 `" + user.getEmbyUserName() + "` \u5df2\u542f\u7528\u3002");
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u274c \u542f\u7528\u5931\u8d25\uff1a" + e.getMessage());
        }
        catch (Exception e) {
            log.error("\u542f\u7528\u7528\u6237\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u274c \u542f\u7528\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleDisableUserCommand(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        PendingUserEdit pending = this.pendingUserEdits.get(userId);
        if (pending == null) {
            this.sendMessage(chatId, "\u8bf7\u5148\u4f7f\u7528 `/edituser` \u641c\u7d22\u5e76\u9009\u62e9\u7528\u6237\u3002");
            return;
        }
        EmbyUser user = (EmbyUser)this.embyUserService.getById(Long.valueOf(pending.getUserId()));
        if (user == null) {
            this.sendMessage(chatId, "\u274c \u7528\u6237\u4e0d\u5b58\u5728\u3002");
            this.pendingUserEdits.remove(userId);
            return;
        }
        if (user.getUserStatus() != null && user.getUserStatus() == 1) {
            this.sendMessage(chatId, "\u26a0\ufe0f \u8be5\u7528\u6237\u5df2\u5904\u4e8e\u7981\u7528\u72b6\u6001\u3002");
            return;
        }
        try {
            this.embyUserService.disableUserByBot(pending.getUserId());
            this.sendMessage(chatId, "\u2705 \u7528\u6237 `" + user.getEmbyUserName() + "` \u5df2\u7981\u7528\u3002");
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u274c \u7981\u7528\u5931\u8d25\uff1a" + e.getMessage());
        }
        catch (Exception e) {
            log.error("\u7981\u7528\u7528\u6237\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u274c \u7981\u7528\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleSetExpiryCommand(org.telegram.telegrambots.meta.api.objects.message.Message message, String argument) {
        LocalDateTime dateTime;
        long chatId = message.getChatId();
        long userId = message.getFrom().getId();
        if (!this.hasAdminPermission(message)) {
            return;
        }
        PendingUserEdit pending = this.pendingUserEdits.get(userId);
        if (pending == null) {
            this.sendMessage(chatId, "\u8bf7\u5148\u4f7f\u7528 `/edituser` \u641c\u7d22\u5e76\u9009\u62e9\u7528\u6237\u3002");
            return;
        }
        EmbyUser user = (EmbyUser)this.embyUserService.getById(Long.valueOf(pending.getUserId()));
        if (user == null) {
            this.sendMessage(chatId, "\u274c \u7528\u6237\u4e0d\u5b58\u5728\u3002");
            this.pendingUserEdits.remove(userId);
            return;
        }
        String[] args = argument.split("\\s+", 2);
        if (args.length < 2 || !StringUtils.hasText((String)args[0]) || !StringUtils.hasText((String)args[1])) {
            this.sendMessage(chatId, "\ud83d\udcdd *\u7528\u6cd5\uff1a*\n`/setexpiry <\u5230\u671f\u65f6\u95f4>`\n\n\u23f0 *\u65f6\u95f4\u683c\u5f0f\uff1a* `yyyy-MM-dd HH:mm:ss`\n\ud83d\udccc *\u793a\u4f8b\uff1a*\n`/setexpiry 2025-12-31 23:59:59`");
            return;
        }
        String dateTimeStr = args[0] + " " + args[1];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        try {
            dateTime = LocalDateTime.parse(dateTimeStr, formatter);
        }
        catch (DateTimeParseException e) {
            this.sendMessage(chatId, "\u274c \u65e5\u671f\u65f6\u95f4\u683c\u5f0f\u9519\u8bef\uff01\n\u6b63\u786e\u683c\u5f0f\uff1a`yyyy-MM-dd HH:mm:ss`\n\u793a\u4f8b\uff1a`2025-12-31 23:59:59`");
            return;
        }
        if (dateTime.isBefore(LocalDateTime.now())) {
            this.sendMessage(chatId, "\u274c \u5230\u671f\u65f6\u95f4\u5fc5\u987b\u662f\u672a\u6765\u65f6\u95f4\uff01");
            return;
        }
        try {
            EmbyUserUpdateData updateData = new EmbyUserUpdateData();
            updateData.setId(pending.getUserId());
            updateData.setExpirationDate(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            this.embyUserService.updateUserDataByBot(updateData);
            this.embyUserService.enableUserByBot(pending.getUserId());
            String formattedDate = dateTime.format(formatter);
            this.sendMessage(chatId, "\u2705 \u7528\u6237 `" + user.getEmbyUserName() + "` \u5df2\u542f\u7528\u3002\n\u23f0 \u65b0\u5230\u671f\u65f6\u95f4\uff1a`" + formattedDate + "`");
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u274c \u64cd\u4f5c\u5931\u8d25\uff1a" + e.getMessage());
        }
        catch (Exception e) {
            log.error("\u8bbe\u7f6e\u8fc7\u671f\u65f6\u95f4\u5e76\u542f\u7528\u7528\u6237\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u274c \u64cd\u4f5c\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void sendOrEditResultListPage(long chatId, Integer messageId, int page) {
        block13: {
            List<TmdbResponse.Result> results = this.getSearchResults(chatId);
            if (results == null || results.isEmpty()) {
                this.sendMessage(chatId, "\u641c\u7d22\u7ed3\u679c\u5df2\u8fc7\u671f\u6216\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u641c\u7d22\u3002");
                return;
            }
            ArrayList<InlineKeyboardRow> keyboardRows = new ArrayList<InlineKeyboardRow>();
            int startIndex = page * 5;
            int endIndex = Math.min(startIndex + 5, results.size());
            for (int i = startIndex; i < endIndex; ++i) {
                TmdbResponse.Result result = results.get(i);
                String title = result.getTitle() != null ? result.getTitle() : result.getName();
                String releaseDate = result.getReleaseDate() != null ? result.getReleaseDate() : result.getFirstAirDate();
                String year = releaseDate != null && releaseDate.length() >= 4 ? " (" + releaseDate.substring(0, 4) + ")" : "";
                String mediaTypeEmoji = this.formatMediaTypeToEmoji(result.getMediaType());
                InlineKeyboardButton button = InlineKeyboardButton.builder().text(mediaTypeEmoji + " " + title + year).callbackData("select:" + i).build();
                keyboardRows.add(new InlineKeyboardRow(new InlineKeyboardButton[]{button}));
            }
            ArrayList<InlineKeyboardButton> navButtons = new ArrayList<InlineKeyboardButton>();
            if (page > 0) {
                navButtons.add(InlineKeyboardButton.builder().text("\u2b05\ufe0f \u4e0a\u4e00\u9875").callbackData("page:" + (page - 1)).build());
            }
            navButtons.add(InlineKeyboardButton.builder().text("\u7b2c " + (page + 1) + " \u9875").callbackData("noop").build());
            if (endIndex < results.size()) {
                navButtons.add(InlineKeyboardButton.builder().text("\u4e0b\u4e00\u9875 \u27a1\ufe0f").callbackData("page:" + (page + 1)).build());
            }
            if (!navButtons.isEmpty()) {
                keyboardRows.add(new InlineKeyboardRow(navButtons));
            }
            InlineKeyboardMarkup keyboard = InlineKeyboardMarkup.builder().keyboard(keyboardRows).build();
            String messageText = "\ud83d\udd0d \u4e3a\u60a8\u627e\u5230 *" + results.size() + "* \u4e2a\u76f8\u5173\u7ed3\u679c\uff0c\u8bf7\u9009\u62e9\uff1a";
            try {
                if (messageId == null) {
                    SendMessage sendMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text(messageText).parseMode("Markdown").replyMarkup((ReplyKeyboard)keyboard).build();
                    org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(sendMessage);
                    this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
                    break block13;
                }
                try {
                    EditMessageText editMessage = EditMessageText.builder().chatId(Long.valueOf(chatId)).messageId(messageId).text(messageText).parseMode("Markdown").replyMarkup(keyboard).build();
                    this.telegramClient.execute(editMessage);
                }
                catch (TelegramApiException editEx) {
                    if (editEx.getMessage() != null && editEx.getMessage().contains("message is not modified")) {
                        log.debug("\u6d88\u606f\u5185\u5bb9\u65e0\u53d8\u5316\uff0c\u8df3\u8fc7\u7f16\u8f91");
                        return;
                    }
                    log.warn("\u7f16\u8f91\u6d88\u606f\u5931\u8d25\uff0c\u5c1d\u8bd5\u5220\u9664\u5e76\u91cd\u65b0\u53d1\u9001: {}", (Object)editEx.getMessage());
                    try {
                        DeleteMessage deleteMessage = DeleteMessage.builder().chatId(Long.valueOf(chatId)).messageId(messageId).build();
                        this.telegramClient.execute(deleteMessage);
                    }
                    catch (TelegramApiException deleteEx) {
                        log.warn("\u5220\u9664\u6d88\u606f\u5931\u8d25: {}", (Object)deleteEx.getMessage());
                    }
                    SendMessage sendMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text(messageText).parseMode("Markdown").replyMarkup((ReplyKeyboard)keyboard).build();
                    org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(sendMessage);
                    this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
                }
            }
            catch (TelegramApiException e) {
                log.error("\u53d1\u9001\u6216\u7f16\u8f91\u5217\u8868\u9875\u5931\u8d25", (Throwable)e);
            }
        }
    }

    private void sendOrEditRequestCard(long chatId, Integer messageId, int index) {
        List<TmdbResponse.Result> results = this.getSearchResults(chatId);
        if (results == null || results.isEmpty()) {
            this.sendMessage(chatId, "\u641c\u7d22\u7ed3\u679c\u5df2\u8fc7\u671f\uff0c\u8bf7\u91cd\u65b0\u4f7f\u7528 `/request \u7247\u540d` \u641c\u7d22\u3002");
            return;
        }
        if (index < 0 || index >= results.size()) {
            this.sendMessage(chatId, "\u6c42\u7247\u9009\u62e9\u65e0\u6548\uff0c\u8bf7\u91cd\u65b0\u641c\u7d22\u3002");
            return;
        }
        TmdbResponse.Result result = results.get(index);
        String caption = this.buildRequestCardCaption(result, index, results.size());
        InlineKeyboardMarkup keyboard = this.buildRequestCardKeyboard(index, results.size(), result);
        String posterUrl = this.buildTmdbImageUrl(result.getPosterPath());
        if (!StringUtils.hasText((String)posterUrl)) {
            this.sendOrEditRequestTextCard(chatId, messageId, caption, keyboard);
            return;
        }
        try {
            if (messageId == null) {
                this.sendRequestPhotoCard(chatId, posterUrl, caption, keyboard);
                return;
            }
            InputMediaPhoto media = ((InputMediaPhoto.InputMediaPhotoBuilder)((InputMediaPhoto.InputMediaPhotoBuilder)InputMediaPhoto.builder().media(posterUrl)).caption(caption)).build();
            EditMessageMedia editMedia = EditMessageMedia.builder().chatId(Long.valueOf(chatId)).messageId(messageId).media((InputMedia)media).replyMarkup(keyboard).build();
            this.telegramClient.execute(editMedia);
        }
        catch (TelegramApiException e) {
            log.warn("\u7f16\u8f91 Telegram \u6c42\u7247\u5361\u7247\u5931\u8d25\uff0c\u5c1d\u8bd5\u5220\u9664\u540e\u91cd\u53d1: {}", (Object)e.getMessage());
            this.deleteMessageSilently(chatId, messageId);
            try {
                this.sendRequestPhotoCard(chatId, posterUrl, caption, keyboard);
            }
            catch (TelegramApiException ex) {
                log.error("\u53d1\u9001 Telegram \u6c42\u7247\u5361\u7247\u5931\u8d25", (Throwable)ex);
                this.sendOrEditRequestTextCard(chatId, null, caption, keyboard);
            }
        }
    }

    private void sendRequestPhotoCard(long chatId, String posterUrl, String caption, InlineKeyboardMarkup keyboard) throws TelegramApiException {
        SendPhoto sendPhoto = SendPhoto.builder().chatId(Long.valueOf(chatId)).photo(new InputFile(posterUrl)).caption(caption).replyMarkup((ReplyKeyboard)keyboard).build();
        this.telegramClient.execute(sendPhoto);
    }

    private void sendOrEditRequestTextCard(long chatId, Integer messageId, String caption, InlineKeyboardMarkup keyboard) {
        try {
            if (messageId == null) {
                SendMessage sendMessage = SendMessage.builder().chatId(Long.valueOf(chatId)).text(caption).replyMarkup((ReplyKeyboard)keyboard).build();
                org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(sendMessage);
                this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
                return;
            }
            this.telegramClient.execute(EditMessageText.builder().chatId(Long.valueOf(chatId)).messageId(messageId).text(caption).replyMarkup(keyboard).build());
        }
        catch (TelegramApiException e) {
            log.error("\u53d1\u9001\u6216\u7f16\u8f91 Telegram \u6c42\u7247\u6587\u672c\u5361\u7247\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u663e\u793a\u6c42\u7247\u7ed3\u679c\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u641c\u7d22\u3002");
        }
    }

    private InlineKeyboardMarkup buildRequestCardKeyboard(int index, int total, TmdbResponse.Result result) {
        ArrayList<InlineKeyboardRow> rows = new ArrayList<InlineKeyboardRow>();
        ArrayList<InlineKeyboardButton> navButtons = new ArrayList<InlineKeyboardButton>();
        if (index > 0) {
            navButtons.add(InlineKeyboardButton.builder().text("\u4e0a\u4e00\u90e8").callbackData("request_page:" + (index - 1)).build());
        }
        navButtons.add(InlineKeyboardButton.builder().text(index + 1 + " / " + total).callbackData("noop").build());
        if (index < total - 1) {
            navButtons.add(InlineKeyboardButton.builder().text("\u4e0b\u4e00\u90e8").callbackData("request_page:" + (index + 1)).build());
        }
        rows.add(new InlineKeyboardRow(navButtons));
        InlineKeyboardButton tmdbButton = InlineKeyboardButton.builder().text("\ud83c\udf5f TMDB").url(this.buildTmdbPageUrl(result)).build();
        InlineKeyboardButton submitButton = InlineKeyboardButton.builder().text("\ud83c\udfac \u63d0\u4ea4\u6c42\u7247").callbackData("submit_request:" + index).build();
        rows.add(new InlineKeyboardRow(new InlineKeyboardButton[]{tmdbButton, submitButton}));
        return InlineKeyboardMarkup.builder().keyboard(rows).build();
    }

    private String buildRequestCardCaption(TmdbResponse.Result result, int index, int total) {
        String title = this.resolveTmdbTitle(result);
        String releaseDate = this.resolveTmdbReleaseDate(result);
        String year = StringUtils.hasText((String)releaseDate) && releaseDate.length() >= 4 ? " (" + releaseDate.substring(0, 4) + ")" : "";
        String overview = StringUtils.hasText((String)result.getOverview()) ? result.getOverview() : "\u6682\u65e0\u7b80\u4ecb\u3002";
        String rating = result.getVoteAverage() == null ? "0.0" : String.format("%.1f", result.getVoteAverage());
        String caption = this.formatMediaTypeToEmoji(result.getMediaType()) + " " + title + year + "\n\n\u7b80\u4ecb\uff1a" + overview + "\n\n\u7c7b\u578b\uff1a" + this.formatMediaTypeText(result.getMediaType()) + "    \u8bc4\u5206\uff1a" + rating + "/10\n\u7ed3\u679c\uff1a" + (index + 1) + " / " + total;
        return this.abbreviate(caption, 980);
    }

    private String formatMediaTypeText(String mediaType) {
        if ("tv".equals(mediaType)) {
            return "\u5267\u96c6";
        }
        if ("movie".equals(mediaType)) {
            return "\u7535\u5f71";
        }
        return "\u672a\u77e5";
    }

    private String abbreviate(String value, int maxLength) {
        if (value == null || value.length() <= maxLength) {
            return value;
        }
        return value.substring(0, Math.max(0, maxLength - 3)) + "...";
    }

    private void showItemDetails(long chatId, Integer messageId, int index, int resourcePage) {
        Object resourceInfo;
        List<TmdbResponse.Result> results = this.getSearchResults(chatId);
        if (results == null || index < 0 || index >= results.size()) {
            this.sendMessage(chatId, "\u65e0\u6cd5\u83b7\u53d6\u8be5\u6761\u76ee\u7684\u8be6\u7ec6\u4fe1\u606f\uff0c\u8bf7\u91cd\u8bd5\u3002");
            return;
        }
        TmdbResponse.Result result = results.get(index);
        Object caption = this.buildCaption(result);
        MovieListResponse resourceResponse = null;
        int totalResources = 0;
        int totalPages = 0;
        try {
            if (resourcePage == 0) {
                resourceResponse = this.nullbrService.select(String.valueOf(result.getId()), result.getMediaType());
                this.saveResourceCache(chatId, resourceResponse);
            } else {
                resourceResponse = this.getResourceCache(chatId);
            }
            if (resourceResponse != null && resourceResponse.getMovieList115DTOList() != null) {
                totalResources = resourceResponse.getMovieList115DTOList().size();
                totalPages = (int)Math.ceil((double)totalResources / 5.0);
                resourceInfo = this.formatNullbrResponsePaged(resourceResponse, resourcePage, 5);
            } else {
                resourceInfo = "\u274c *\u672a\u627e\u5230\u76f8\u5173\u8d44\u6e90*";
            }
        }
        catch (Exception e) {
            log.error("\u5728\u8be6\u60c5\u9875\u83b7\u53d6\u8d44\u6e90\u65f6\u51fa\u9519: {}", (Object)e.getMessage());
            resourceInfo = "\u274c \u83b7\u53d6\u8d44\u6e90\u4fe1\u606f\u5931\u8d25\uff1a" + e.getMessage();
        }
        caption = (String)caption + "\n\n" + (String)resourceInfo;
        InlineKeyboardMarkup keyboard = this.buildDetailViewKeyboard(index, resourcePage, totalPages);
        int MAX_CAPTION_LENGTH = 1024;
        if (((String)caption).length() > 1024) {
            caption = ((String)caption).substring(0, 1014) + "...";
        }
        try {
            InputMediaPhoto media = ((InputMediaPhoto.InputMediaPhotoBuilder)((InputMediaPhoto.InputMediaPhotoBuilder)((InputMediaPhoto.InputMediaPhotoBuilder)InputMediaPhoto.builder().media(this.imageUrl + result.getPosterPath())).caption((String)caption)).parseMode("Markdown")).build();
            EditMessageMedia editMedia = EditMessageMedia.builder().chatId(Long.valueOf(chatId)).messageId(messageId).media((InputMedia)media).replyMarkup(keyboard).build();
            this.telegramClient.execute(editMedia);
        }
        catch (TelegramApiException e) {
            String errorMessage;
            String string = errorMessage = e.getMessage() != null ? e.getMessage().toLowerCase() : "";
            if (errorMessage.contains("caption") && errorMessage.contains("long")) {
                log.warn("Caption \u4ecd\u7136\u8fc7\u957f\uff0c\u5c1d\u8bd5\u53d1\u9001\u4e0d\u5e26\u8d44\u6e90\u7684\u8be6\u60c5\u3002");
                String shortCaption = this.buildCaption(result) + "\n\n\u26a0\ufe0f *\u8d44\u6e90\u4fe1\u606f\u8fc7\u957f\uff0c\u8bf7\u4f7f\u7528\u5206\u9875\u67e5\u770b*";
                if (shortCaption.length() > 1024) {
                    shortCaption = shortCaption.substring(0, 1014) + "...";
                }
                try {
                    InputMediaPhoto media = ((InputMediaPhoto.InputMediaPhotoBuilder)((InputMediaPhoto.InputMediaPhotoBuilder)((InputMediaPhoto.InputMediaPhotoBuilder)InputMediaPhoto.builder().media(this.imageUrl + result.getPosterPath())).caption(shortCaption)).parseMode("Markdown")).build();
                    EditMessageMedia editMedia = EditMessageMedia.builder().chatId(Long.valueOf(chatId)).messageId(messageId).media((InputMedia)media).replyMarkup(keyboard).build();
                    this.telegramClient.execute(editMedia);
                }
                catch (TelegramApiException ex) {
                    log.error("\u5c1d\u8bd5\u53d1\u9001\u77edCaption\u65f6\u518d\u6b21\u5931\u8d25\u3002", (Throwable)ex);
                    this.sendMessage(chatId, "\u663e\u793a\u8be6\u60c5\u5931\u8d25\uff1a\u5185\u5bb9\u8fc7\u957f\u3002");
                }
            }
            log.error("\u7f16\u8f91\u6d88\u606f\u4ee5\u663e\u793a\u8be6\u60c5\u65f6\u5931\u8d25\u3002", (Throwable)e);
            this.sendMessage(chatId, "\u663e\u793a\u8be6\u60c5\u5931\u8d25\uff1a" + e.getMessage());
        }
    }

    private void handleRequestSubmit(CallbackQuery callbackQuery, int index) {
        long telegramUserId;
        long chatId = callbackQuery.getMessage().getChatId();
        if (chatId != (telegramUserId = callbackQuery.getFrom().getId().longValue())) {
            this.sendMessage(chatId, "\ud83d\udd12 \u8bf7\u79c1\u804a\u673a\u5668\u4eba\u63d0\u4ea4\u6c42\u7247\uff0c\u907f\u514d\u6cc4\u9732\u8d26\u53f7\u7ed1\u5b9a\u4fe1\u606f\u3002");
            return;
        }
        if (!this.tryAcquireRateLimit("request:" + telegramUserId, 3L, 60L)) {
            this.sendMessage(chatId, "\u23f3 \u6c42\u7247\u63d0\u4ea4\u592a\u9891\u7e41\u4e86\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
            return;
        }
        if (!this.tryAcquireRequestSubmitLock(telegramUserId)) {
            this.sendMessage(chatId, "\u23f3 \u6b63\u5728\u5904\u7406\u4e0a\u4e00\u6b21\u6c42\u7247\u63d0\u4ea4\uff0c\u8bf7\u52ff\u91cd\u590d\u70b9\u51fb\u3002");
            return;
        }
        EmbyUser embyUser = this.telegramAuthService.findBoundUser(telegramUserId);
        if (embyUser == null) {
            this.sendMessage(chatId, "\ud83d\udd17 \u8bf7\u5148\u7ed1\u5b9a Emby \u8d26\u53f7\uff1a\n1. \ud83c\udf10 \u7f51\u9875\u4e2a\u4eba\u8d44\u6599\u4e2d\u70b9\u51fb\u7ed1\u5b9a Telegram\n2. \ud83e\udd16 \u6216\u79c1\u804a\u53d1\u9001 `/bind \u7528\u6237\u540d \u5bc6\u7801`");
            return;
        }
        List<TmdbResponse.Result> results = this.getSearchResults(chatId);
        if (results == null || index < 0 || index >= results.size()) {
            this.sendMessage(chatId, "\u23f0 \u641c\u7d22\u7ed3\u679c\u5df2\u8fc7\u671f\uff0c\u8bf7\u91cd\u65b0\u4f7f\u7528 `/request \u7247\u540d` \u641c\u7d22\u3002");
            return;
        }
        TmdbResponse.Result result = results.get(index);
        try {
            RequestListSave requestListSave = this.buildRequestListSave(result);
            TelegramRequestSubmitService.TelegramRequestSubmitResult submitResult = this.telegramRequestSubmitService.submit(embyUser.getId(), telegramUserId, requestListSave);
            String title = this.resolveTmdbTitle(result);
            this.sendMessage(chatId, this.buildRequestSubmitSuccessMessage(title, submitResult));
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u274c " + e.getMessage());
        }
        catch (Exception e) {
            log.error("Telegram \u63d0\u4ea4\u6c42\u7247\u5931\u8d25: telegramUserId={}, index={}", new Object[]{telegramUserId, index, e});
            this.sendMessage(chatId, "\u274c \u63d0\u4ea4\u6c42\u7247\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private void handleInlineRequestSubmit(CallbackQuery callbackQuery, String mediaType, String tmdbId) {
        long responseChatId;
        long telegramUserId = callbackQuery.getFrom().getId();
        Long callbackChatId = callbackQuery.getMessage() == null ? null : callbackQuery.getMessage().getChatId();
        long l = responseChatId = callbackChatId == null ? telegramUserId : callbackChatId;
        if (callbackChatId != null && callbackChatId != telegramUserId) {
            this.sendMessage(responseChatId, "\ud83d\udd12 \u8bf7\u79c1\u804a\u673a\u5668\u4eba\u63d0\u4ea4\u6c42\u7247\uff0c\u7fa4\u804a\u91cc\u4e0d\u5141\u8bb8\u63d0\u4ea4\u3002");
            return;
        }
        if (!this.tryAcquireRateLimit("request:" + telegramUserId, 3L, 60L)) {
            this.sendMessage(responseChatId, "\u23f3 \u6c42\u7247\u63d0\u4ea4\u592a\u9891\u7e41\u4e86\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
            return;
        }
        if (!this.tryAcquireRequestSubmitLock(telegramUserId)) {
            this.sendMessage(responseChatId, "\u23f3 \u6b63\u5728\u5904\u7406\u4e0a\u4e00\u6b21\u6c42\u7247\u63d0\u4ea4\uff0c\u8bf7\u52ff\u91cd\u590d\u70b9\u51fb\u3002");
            return;
        }
        EmbyUser embyUser = this.telegramAuthService.findBoundUser(telegramUserId);
        if (embyUser == null) {
            this.sendBindRequiredMessage(responseChatId);
            return;
        }
        TmdbResponse.Result result = this.getInlineResult(mediaType + ":" + tmdbId);
        if (result == null) {
            this.sendMessage(responseChatId, "\u23f0 \u641c\u7d22\u7ed3\u679c\u5df2\u8fc7\u671f\uff0c\u8bf7\u91cd\u65b0 `@\u673a\u5668\u4eba \u7247\u540d` \u641c\u7d22\u3002");
            return;
        }
        try {
            RequestListSave requestListSave = this.buildRequestListSave(result);
            TelegramRequestSubmitService.TelegramRequestSubmitResult submitResult = this.telegramRequestSubmitService.submit(embyUser.getId(), telegramUserId, requestListSave);
            this.sendMessage(responseChatId, this.buildRequestSubmitSuccessMessage(this.resolveTmdbTitle(result), submitResult));
        }
        catch (BizException e) {
            this.sendMessage(responseChatId, "\u274c " + e.getMessage());
        }
        catch (Exception e) {
            log.error("Telegram inline \u63d0\u4ea4\u6c42\u7247\u5931\u8d25: telegramUserId={}, mediaType={}, tmdbId={}", new Object[]{telegramUserId, mediaType, tmdbId, e});
            this.sendMessage(responseChatId, "\u274c \u63d0\u4ea4\u6c42\u7247\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
    }

    private RequestListSave buildRequestListSave(TmdbResponse.Result result) {
        RequestListSave save = new RequestListSave();
        String mediaType = "tv".equals(result.getMediaType()) ? "tv" : "movie";
        save.setName(this.resolveTmdbTitle(result));
        save.setOriginalName(this.resolveTmdbOriginalTitle(result));
        save.setType(mediaType);
        save.setScore(result.getVoteAverage() == null ? "0" : String.format("%.1f", result.getVoteAverage()));
        save.setOverview(result.getOverview());
        save.setReleaseDate(this.parseTmdbDate(this.resolveTmdbReleaseDate(result)));
        save.setImageUrl(this.buildTmdbImageUrl(result.getPosterPath()));
        save.setBackdropPath(this.buildTmdbImageUrl(result.getBackdropPath()));
        save.setTmdbUrl("https://www.themoviedb.org/" + mediaType + "/" + result.getId());
        save.setTmdbId(result.getId());
        if ("tv".equals(mediaType)) {
            save.setParentTmdbId(result.getId());
        }
        return save;
    }

    private String resolveTmdbTitle(TmdbResponse.Result result) {
        String title = StringUtils.hasText((String)result.getTitle()) ? result.getTitle() : result.getName();
        return StringUtils.hasText((String)title) ? title : "\u672a\u77e5\u6807\u9898";
    }

    private String buildRequestSubmitSuccessMessage(String title, TelegramRequestSubmitService.TelegramRequestSubmitResult submitResult) {
        StringBuilder message = new StringBuilder("\u2705 \u6c42\u7247\u5df2\u63d0\u4ea4\uff1a`").append(title).append("`\n");
        if (submitResult != null && submitResult.getChargeResult() != null) {
            if (submitResult.getChargeResult().isPointsEnabled() && submitResult.getChargeResult().getPointsCost() > 0) {
                message.append("\ud83d\udc8e \u672c\u6b21\u6d88\u8017 ").append(submitResult.getChargeResult().getPointsCost()).append(" \u79ef\u5206\uff0c\u5f53\u524d\u4f59\u989d ").append(submitResult.getChargeResult().getBalanceAfter()).append("\u3002\n");
            } else if (submitResult.getChargeResult().isPointsEnabled() && submitResult.getChargeResult().getDailyFreeCount() > 0) {
                message.append("\ud83c\udf81 \u672c\u6b21\u4f7f\u7528\u4eca\u65e5\u514d\u8d39\u6b21\u6570 ").append(submitResult.getChargeResult().getTodayUsedAfter()).append("/").append(submitResult.getChargeResult().getDailyFreeCount()).append("\u3002\n");
            } else if (submitResult.getChargeResult().isPointsEnabled()) {
                message.append("\ud83c\udf81 \u672c\u6b21\u65e0\u9700\u6d88\u8017\u79ef\u5206\u3002\n");
            } else if (submitResult.getRemainingRequestPackagesCount() != null) {
                message.append("\ud83c\udfab \u672c\u6b21\u4f7f\u7528\u7f51\u9875\u6c42\u7247\u6b21\u6570\uff0c\u5269\u4f59 ").append(submitResult.getRemainingRequestPackagesCount()).append(" \u6b21\u3002\n");
            } else {
                message.append("\ud83c\udfab \u672c\u6b21\u4f7f\u7528\u7f51\u9875\u6c42\u7247\u6b21\u6570\u3002\n");
            }
        }
        message.append("\ud83d\udccc \u8bf7\u5728\u7f51\u9875\u6c42\u7247\u4e2d\u5fc3\u67e5\u770b\u8fdb\u5ea6\u3002");
        return message.toString();
    }

    private String resolveTmdbOriginalTitle(TmdbResponse.Result result) {
        String title = StringUtils.hasText((String)result.getOriginalTitle()) ? result.getOriginalTitle() : result.getOriginalName();
        return StringUtils.hasText((String)title) ? title : this.resolveTmdbTitle(result);
    }

    private String resolveTmdbReleaseDate(TmdbResponse.Result result) {
        return StringUtils.hasText((String)result.getReleaseDate()) ? result.getReleaseDate() : result.getFirstAirDate();
    }

    private Date parseTmdbDate(String value) {
        if (!StringUtils.hasText((String)value)) {
            return null;
        }
        try {
            return Date.from(LocalDate.parse(value).atStartOfDay(ZoneId.systemDefault()).toInstant());
        }
        catch (Exception ignored) {
            return null;
        }
    }

    private String buildTmdbImageUrl(String path) {
        if (!StringUtils.hasText((String)path)) {
            return null;
        }
        if (path.startsWith("http://") || path.startsWith("https://")) {
            return path;
        }
        return this.imageUrl + path;
    }

    private String formatNullbrResponsePaged(MovieListResponse response, int page, int pageSize) {
        if (response == null || response.getMovieList115DTOList() == null || response.getMovieList115DTOList().isEmpty()) {
            return "\u274c *\u672a\u627e\u5230\u76f8\u5173\u8d44\u6e90*";
        }
        List<MovieListResponse.MovieList115DTO> allItems = response.getMovieList115DTOList();
        int totalItems = allItems.size();
        int totalPages = (int)Math.ceil((double)totalItems / (double)pageSize);
        int startIndex = page * pageSize;
        int endIndex = Math.min(startIndex + pageSize, totalItems);
        if (startIndex >= totalItems) {
            return "\u274c *\u6ca1\u6709\u66f4\u591a\u8d44\u6e90\u4e86*";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\ud83d\udd17 *\u8d44\u6e90\u5217\u8868* (").append(page + 1).append("/").append(totalPages).append("):\n\n");
        for (int i = startIndex; i < endIndex; ++i) {
            MovieListResponse.MovieList115DTO item = allItems.get(i);
            String cleanTitle = this.extractMovieTitle(item.getTitle());
            String cloudProvider = this.extractCloudProvider(item.getShareLink());
            sb.append("\ud83d\udcc1 [").append(cleanTitle);
            if (!cloudProvider.isEmpty()) {
                sb.append(" (").append(cloudProvider).append(")");
            }
            sb.append("](").append(item.getShareLink()).append(") ");
            if (StringUtils.hasText((String)item.getSize())) {
                sb.append("   \ud83d\udcbe `").append(item.getSize()).append("`");
                if (StringUtils.hasText((String)item.getResolution())) {
                    sb.append(" \ud83d\udcfa `").append(item.getResolution()).append("`");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private String extractCloudProvider(String shareLink) {
        if (shareLink == null || shareLink.isEmpty()) {
            return "";
        }
        String link = shareLink.toLowerCase();
        if (link.contains("115.com") || link.contains("115cdn.com")) {
            return "115";
        }
        if (link.contains("quark") || link.contains("\u5938\u514b")) {
            return "\u5938\u514b";
        }
        if (link.contains("pan.baidu.com") || link.contains("\u767e\u5ea6")) {
            return "\u767e\u5ea6";
        }
        if (link.contains("aliyundrive") || link.contains("alipan") || link.contains("\u963f\u91cc")) {
            return "\u963f\u91cc";
        }
        if (link.contains("xunlei") || link.contains("\u8fc5\u96f7")) {
            return "\u8fc5\u96f7";
        }
        if (link.contains("uc.cn") || link.contains("drive.uc")) {
            return "UC";
        }
        if (link.contains("123pan") || link.contains("123\u4e91\u76d8")) {
            return "123\u76d8";
        }
        if (link.contains("lanzou") || link.contains("\u84dd\u594f")) {
            return "\u84dd\u594f";
        }
        if (link.contains("tianyi") || link.contains("\u5929\u7ffc") || link.contains("189.cn")) {
            return "\u5929\u7ffc";
        }
        if (link.contains("weiyun") || link.contains("\u5fae\u4e91")) {
            return "\u5fae\u4e91";
        }
        return "";
    }

    private String extractMovieTitle(String filename) {
        if (filename == null || filename.isEmpty()) {
            return "\u672a\u77e5\u8d44\u6e90";
        }
        int firstBracket = filename.indexOf(91);
        int secondBracket = filename.indexOf(93);
        if (firstBracket >= 0 && secondBracket > firstBracket) {
            String bracketContent = filename.substring(firstBracket + 1, secondBracket);
            StringBuilder chineseTitle = new StringBuilder();
            char[] cArray = bracketContent.toCharArray();
            int n = cArray.length;
            for (int i = 0; i < n; ++i) {
                char c = cArray[i];
                if (Character.toString(c).matches("[\\u4e00-\\u9fa5]")) {
                    chineseTitle.append(c);
                    continue;
                }
                if (chineseTitle.length() > 0) break;
            }
            if (chineseTitle.length() > 0) {
                return chineseTitle.toString();
            }
            String[] parts = bracketContent.split("[_\\[]");
            if (parts.length > 0 && !parts[0].isEmpty()) {
                return parts[0].replaceAll("\\d{4}$", "").trim();
            }
        }
        if (!filename.matches(".*[\\[\\]()_@#].*")) {
            return filename;
        }
        StringBuilder chineseTitle = new StringBuilder();
        for (char c : filename.toCharArray()) {
            if (!Character.toString(c).matches("[\\u4e00-\\u9fa5]")) continue;
            chineseTitle.append(c);
        }
        if (chineseTitle.length() >= 2) {
            return chineseTitle.toString();
        }
        return filename.length() > 30 ? filename.substring(0, 30) + "..." : filename;
    }

    private InlineKeyboardMarkup buildDetailViewKeyboard(int index, int resourcePage, int totalResourcePages) {
        int currentPage = index / 5;
        ArrayList<InlineKeyboardRow> rows = new ArrayList<InlineKeyboardRow>();
        if (totalResourcePages > 1) {
            ArrayList<InlineKeyboardButton> pageButtons = new ArrayList<InlineKeyboardButton>();
            if (resourcePage > 0) {
                pageButtons.add(InlineKeyboardButton.builder().text("\u2b05\ufe0f \u4e0a\u9875\u8d44\u6e90").callbackData("resource_page:" + index + ":" + (resourcePage - 1)).build());
            }
            pageButtons.add(InlineKeyboardButton.builder().text("\ud83d\udcc4 " + (resourcePage + 1) + "/" + totalResourcePages).callbackData("noop").build());
            if (resourcePage < totalResourcePages - 1) {
                pageButtons.add(InlineKeyboardButton.builder().text("\u4e0b\u9875\u8d44\u6e90 \u27a1\ufe0f").callbackData("resource_page:" + index + ":" + (resourcePage + 1)).build());
            }
            rows.add(new InlineKeyboardRow(pageButtons));
        }
        InlineKeyboardButton requestButton = InlineKeyboardButton.builder().text("\ud83d\udcdd \u63d0\u4ea4\u6c42\u7247").callbackData("submit_request:" + index).build();
        rows.add(new InlineKeyboardRow(new InlineKeyboardButton[]{requestButton}));
        InlineKeyboardButton backButton = InlineKeyboardButton.builder().text("\ud83d\udd19 \u8fd4\u56de\u5217\u8868").callbackData("back_to_list:" + currentPage).build();
        rows.add(new InlineKeyboardRow(new InlineKeyboardButton[]{backButton}));
        return InlineKeyboardMarkup.builder().keyboard(rows).build();
    }

    private String buildCaption(TmdbResponse.Result result) {
        String title = result.getTitle() != null ? result.getTitle() : result.getName();
        String releaseDate = result.getReleaseDate() != null ? result.getReleaseDate() : result.getFirstAirDate();
        String year = releaseDate != null && releaseDate.length() >= 4 ? " (" + releaseDate.substring(0, 4) + ")" : "";
        String mediaType = result.getMediaType() != null ? result.getMediaType().replace("tv", "\u7535\u89c6\u5267").replace("movie", "\u7535\u5f71") : "\u672a\u77e5";
        double rating = result.getVoteAverage();
        String overview = result.getOverview() != null && !result.getOverview().isEmpty() ? result.getOverview() : "\u6682\u65e0\u7b80\u4ecb\u3002";
        String ratingStr = String.format("%.1f", rating);
        return String.format("\ud83c\udfac *%s%s*\n\n**\u7c7b\u578b**: %s\n\n\u2b50 **\u8bc4\u5206**: %s / 10\n\n**\u7b80\u4ecb**:\n%s", title, year, mediaType, ratingStr, overview);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void processCreateUserSelection(CallbackQuery callbackQuery, long serverId) {
        if (!this.hasAdminPermission(callbackQuery)) {
            return;
        }
        long userId = callbackQuery.getFrom().getId();
        PendingCreateUser pending = this.pendingCreateUsers.get(userId);
        long chatId = callbackQuery.getMessage().getChatId();
        if (pending == null) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u5f85\u521b\u5efa\u7684\u7528\u6237\u4fe1\u606f\uff0c\u8bf7\u91cd\u65b0\u4f7f\u7528 /createuser \u547d\u4ee4\u3002");
            return;
        }
        EmbyUserSave embyUserSave = new EmbyUserSave();
        embyUserSave.setEmbyUserName(pending.getUserName());
        embyUserSave.setDay(pending.getDay());
        embyUserSave.setRemarks(pending.getRemarks());
        embyUserSave.setEmbyInfoId(serverId);
        try {
            InsertUserResponse response = this.embyUserService.insertUser(embyUserSave);
            StringBuilder sb = new StringBuilder();
            sb.append("\u2705 \u7528\u6237\u521b\u5efa\u6210\u529f\uff01\n");
            sb.append("\u7528\u6237\u540d\uff1a").append(response.getEmbyUserName()).append("\n");
            sb.append("\u5bc6\u7801\uff1a").append(response.getEmbyUserPassword()).append("\n");
            sb.append("\u5230\u671f\u65f6\u95f4\uff1a").append(response.getExpirationDate());
            EmbyInfo server = (EmbyInfo)this.embyInfoService.getById(Long.valueOf(serverId));
            if (server != null) {
                sb.append("\n\u670d\u52a1\u5668\uff1a").append(this.buildServerLabel(server));
            }
            this.sendMessage(chatId, sb.toString());
        }
        catch (ApiException e) {
            this.sendMessage(chatId, "\u521b\u5efa\u7528\u6237\u5931\u8d25\uff1a" + e.getResponseBody());
        }
        catch (Exception e) {
            log.error("\u521b\u5efa\u7528\u6237\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u521b\u5efa\u7528\u6237\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\uff0c" + e.getMessage());
        }
        finally {
            this.pendingCreateUsers.remove(userId);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void processCardBatchSelection(CallbackQuery callbackQuery, long serverId) {
        if (!this.hasAdminPermission(callbackQuery)) {
            return;
        }
        long userId = callbackQuery.getFrom().getId();
        PendingCardBatch pending = this.pendingCardBatches.get(userId);
        long chatId = callbackQuery.getMessage().getChatId();
        if (pending == null) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u5f85\u751f\u6210\u7684\u5361\u5bc6\u4fe1\u606f\uff0c\u8bf7\u91cd\u65b0\u4f7f\u7528 /generatecards \u547d\u4ee4\u3002");
            return;
        }
        try {
            List<String> cards = this.cardSecurityManagementService.addCardSecurityManagementList(pending.getCount(), pending.getDay(), serverId, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("\u2705 \u5361\u5bc6\u751f\u6210\u6210\u529f\uff0c\u5171 ").append(cards.size()).append(" \u5f20\u3002\n");
            for (String card : cards) {
                sb.append(card).append("\n");
            }
            this.sendMessage(chatId, sb.toString());
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u751f\u6210\u5361\u5bc6\u5931\u8d25\uff1a" + e.getMessage());
        }
        catch (Exception e) {
            log.error("\u751f\u6210\u5361\u5bc6\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u751f\u6210\u5361\u5bc6\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
        finally {
            this.pendingCardBatches.remove(userId);
        }
    }

    private void handleUserSelection(CallbackQuery callbackQuery, long selectedUserId) {
        if (!this.hasAdminPermission(callbackQuery)) {
            return;
        }
        EmbyUser user = (EmbyUser)this.embyUserService.getById(Long.valueOf(selectedUserId));
        long operatorId = callbackQuery.getFrom().getId();
        long chatId = callbackQuery.getMessage().getChatId();
        if (user == null) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u8be5\u7528\u6237\uff0c\u8bf7\u91cd\u65b0\u641c\u7d22\u3002");
            return;
        }
        this.pendingUserEdits.put(operatorId, new PendingUserEdit(chatId, selectedUserId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("\ud83d\udccb *\u7528\u6237\u8be6\u7ec6\u4fe1\u606f*\n");
        sb.append("\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\n\n");
        sb.append("\ud83d\udc64 *\u7528\u6237\u540d\uff1a* `").append(user.getEmbyUserName()).append("`\n");
        sb.append("\ud83c\udd94 *\u7528\u6237ID\uff1a* `").append(user.getId()).append("`\n");
        if (StringUtils.hasText((String)user.getEmbyUserId())) {
            sb.append("\ud83d\udd17 *Emby ID\uff1a* `").append(user.getEmbyUserId()).append("`\n");
        }
        String statusText = user.getUserStatus() != null && user.getUserStatus() == 1 ? "\ud83d\udd34 \u7981\u7528" : "\ud83d\udfe2 \u542f\u7528";
        sb.append("\ud83d\udcca *\u7528\u6237\u72b6\u6001\uff1a* ").append(statusText).append("\n");
        String adminText = user.getIsAdmin() != null && user.getIsAdmin() == 1 ? "\u662f" : "\u5426";
        sb.append("\ud83d\udc51 *\u7ba1\u7406\u5458\uff1a* ").append(adminText).append("\n\n");
        sb.append("\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\n");
        if (user.getExpirationDate() != null) {
            String formattedDate = user.getExpirationDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(formatter);
            sb.append("\u23f0 *\u5230\u671f\u65f6\u95f4\uff1a* `").append(formattedDate).append("`\n");
        } else {
            sb.append("\u23f0 *\u5230\u671f\u65f6\u95f4\uff1a* \u672a\u8bbe\u7f6e\n");
        }
        sb.append("\ud83c\udfac *\u6c42\u7247\u6b21\u6570\uff1a* ").append(user.getRequestPackagesCount() != null ? user.getRequestPackagesCount() : 0).append("\n");
        if (StringUtils.hasText((String)user.getRemarks())) {
            sb.append("\ud83d\udcdd *\u5907\u6ce8\uff1a* ").append(user.getRemarks()).append("\n");
        }
        if (user.getEmbyInfoId() != null) {
            EmbyInfo serverInfo = (EmbyInfo)this.embyInfoService.getById(user.getEmbyInfoId());
            String serverLabel = this.buildServerLabel(serverInfo);
            sb.append("\ud83d\udda5\ufe0f *\u670d\u52a1\u5668\uff1a* ").append(serverLabel).append("\n");
        }
        if (StringUtils.hasText((String)user.getEmail())) {
            sb.append("\ud83d\udce7 *\u90ae\u7bb1\uff1a* ").append(user.getEmail()).append("\n");
        }
        if (user.getCreateDatetime() != null) {
            String createTime = user.getCreateDatetime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(formatter);
            sb.append("\ud83d\udcc5 *\u521b\u5efa\u65f6\u95f4\uff1a* `").append(createTime).append("`\n");
        }
        sb.append("\n\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\n");
        sb.append("\u26a1 *\u53ef\u7528\u64cd\u4f5c\uff1a*\n\n");
        sb.append("1\ufe0f\u20e3 *\u66f4\u65b0\u7528\u6237\u4fe1\u606f\uff1a*\n");
        sb.append("`/updateuserinfo <\u5230\u671f\u65f6\u95f4> <\u6c42\u7247\u6b21\u6570> <\u5907\u6ce8>`\n");
        sb.append("   \u65f6\u95f4\u683c\u5f0f\uff1a`yyyy-MM-dd HH:mm:ss`\n");
        sb.append("   \u793a\u4f8b\uff1a`/updateuserinfo 2025-12-31 23:59:59 10 VIP\u7528\u6237`\n\n");
        sb.append("2\ufe0f\u20e3 *\u91cd\u7f6e\u5bc6\u7801\uff1a*\n");
        sb.append("`/resetpassword <\u65b0\u5bc6\u7801>`\n");
        sb.append("   \u793a\u4f8b\uff1a`/resetpassword newpass123`\n\n");
        sb.append("3\ufe0f\u20e3 *\u542f\u7528\u7528\u6237\uff1a* `/enableuser`\n");
        sb.append("4\ufe0f\u20e3 *\u7981\u7528\u7528\u6237\uff1a* `/disableuser`\n");
        sb.append("5\ufe0f\u20e3 *\u8bbe\u7f6e\u5230\u671f\u65f6\u95f4\u5e76\u542f\u7528\uff1a*\n");
        sb.append("`/setexpiry <\u5230\u671f\u65f6\u95f4>`\n");
        sb.append("   \u793a\u4f8b\uff1a`/setexpiry 2025-12-31 23:59:59`");
        this.sendMessage(chatId, sb.toString());
    }

    private String buildServerLabel(EmbyInfo server) {
        if (server == null) {
            return "\u672a\u77e5\u670d\u52a1\u5668";
        }
        if (StringUtils.hasText((String)server.getServerName())) {
            return server.getServerName();
        }
        if (StringUtils.hasText((String)server.getEmbyUrl())) {
            return server.getEmbyUrl();
        }
        return "\u670d\u52a1\u5668-" + server.getId();
    }

    private List<EmbyInfo> loadAvailableServers() {
        return ((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)((LambdaQueryChainWrapper)this.embyInfoService.lambdaQuery().eq(EmbyInfo::getEnabled, (Object)1)).eq(EmbyInfo::getStatus, (Object)0)).eq(BaseEntity::getDelFlag, (Object)0)).list();
    }

    private InlineKeyboardMarkup buildServerSelectionKeyboard(List<EmbyInfo> servers, String callbackPrefix) {
        ArrayList<InlineKeyboardRow> rows = new ArrayList<InlineKeyboardRow>();
        for (EmbyInfo server : servers) {
            InlineKeyboardButton button = InlineKeyboardButton.builder().text(this.buildServerLabel(server)).callbackData(callbackPrefix + server.getId()).build();
            rows.add(new InlineKeyboardRow(new InlineKeyboardButton[]{button}));
        }
        return InlineKeyboardMarkup.builder().keyboard(rows).build();
    }

    private String formatExpirationDate(Date date) {
        if (date == null) {
            return " (\u65e0\u5230\u671f\u65f6\u95f4)";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(formatter);
        return " \u5230\u671f:" + formattedDate;
    }

    private String formatDateTime(Date date) {
        if (date == null) {
            return "\u672a\u8bbe\u7f6e";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(formatter);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void processExtendBatchSelection(CallbackQuery callbackQuery, long serverId) {
        if (!this.hasAdminPermission(callbackQuery)) {
            return;
        }
        long userId = callbackQuery.getFrom().getId();
        PendingExtendBatch pending = this.pendingExtendBatches.get(userId);
        long chatId = callbackQuery.getMessage().getChatId();
        if (pending == null) {
            this.sendMessage(chatId, "\u672a\u627e\u5230\u5f85\u5ef6\u671f\u7684\u53c2\u6570\u4fe1\u606f\uff0c\u8bf7\u91cd\u65b0\u4f7f\u7528 /extendusers \u547d\u4ee4\u3002");
            return;
        }
        try {
            int updated = this.embyUserService.extendExpiredUser(serverId, pending.getExpiredRange(), pending.getExtensionDay());
            this.sendMessage(chatId, "\u2705 \u5df2\u4e3a " + updated + " \u4f4d\u7528\u6237\u5ef6\u671f " + pending.getExtensionDay() + " \u5929\u3002");
        }
        catch (BizException e) {
            this.sendMessage(chatId, "\u5ef6\u671f\u5931\u8d25\uff1a" + e.getMessage());
        }
        catch (Exception e) {
            log.error("\u6279\u91cf\u5ef6\u671f\u5931\u8d25", (Throwable)e);
            this.sendMessage(chatId, "\u6279\u91cf\u5ef6\u671f\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u3002");
        }
        finally {
            this.pendingExtendBatches.remove(userId);
        }
    }

    private String formatMediaTypeToEmoji(String rawType) {
        if (rawType == null) {
            return "\u2754";
        }
        switch (rawType) {
            case "movie": {
                return "\ud83c\udfa5";
            }
            case "tv": {
                return "\ud83d\udcfa";
            }
        }
        return "\u2754";
    }

    private void sendMessage(long chatId, String text) {
        SendMessage message = SendMessage.builder().chatId(Long.valueOf(chatId)).text(text).parseMode("Markdown").build();
        try {
            org.telegram.telegrambots.meta.api.objects.message.Message sentMessage = (org.telegram.telegrambots.meta.api.objects.message.Message)this.telegramClient.execute(message);
            this.scheduleGroupMessageCleanup(chatId, sentMessage == null ? null : sentMessage.getMessageId());
        }
        catch (TelegramApiException e) {
            log.error("\u53d1\u9001\u6d88\u606f\u5931\u8d25", (Throwable)e);
        }
    }

    private void scheduleGroupCommandCleanup(org.telegram.telegrambots.meta.api.objects.message.Message message) {
        if (message == null || message.isUserMessage()) {
            return;
        }
        this.scheduleGroupMessageCleanup(message.getChatId(), message.getMessageId());
    }

    private void scheduleGroupMessageCleanup(long chatId, Integer messageId) {
        if (messageId == null || chatId >= 0L) {
            return;
        }
        this.transientMessageCleaner.schedule(() -> this.deleteMessageSilently(chatId, messageId), 5L, TimeUnit.SECONDS);
    }

    private void editMessageTextSilently(long chatId, Integer messageId, String text) {
        if (messageId == null) {
            return;
        }
        try {
            EditMessageText editMessage = EditMessageText.builder().chatId(Long.valueOf(chatId)).messageId(messageId).text(text).parseMode("Markdown").build();
            this.telegramClient.execute(editMessage);
        }
        catch (TelegramApiException e) {
            log.debug("\u7f16\u8f91 Telegram \u6d88\u606f\u5931\u8d25: {}", (Object)e.getMessage());
        }
    }

    private void deleteMessageSilently(long chatId, Integer messageId) {
        if (messageId == null) {
            return;
        }
        try {
            DeleteMessage deleteMessage = DeleteMessage.builder().chatId(Long.valueOf(chatId)).messageId(messageId).build();
            this.telegramClient.execute(deleteMessage);
        }
        catch (TelegramApiException e) {
            log.debug("\u5220\u9664 Telegram \u4e34\u65f6\u6d88\u606f\u5931\u8d25: {}", (Object)e.getMessage());
        }
    }

    private boolean tryAcquireRateLimit(String keySuffix, long maxCount, long windowSeconds) {
        String key = RATE_LIMIT_PREFIX + keySuffix;
        try {
            Long count = this.redisTemplate.opsForValue().increment((Object)key);
            if (count == null) {
                return true;
            }
            Long ttl = this.redisTemplate.getExpire((Object)key, TimeUnit.SECONDS);
            if (count == 1L || ttl == null || ttl < 0L) {
                this.redisTemplate.expire((Object)key, windowSeconds, TimeUnit.SECONDS);
            }
            return count <= maxCount;
        }
        catch (Exception e) {
            log.warn("Telegram Bot \u9650\u6d41\u8ba1\u6570\u5931\u8d25\uff0c\u6309\u653e\u884c\u5904\u7406: key={}", (Object)key, (Object)e);
            return true;
        }
    }

    private boolean tryAcquireRequestSubmitLock(long telegramUserId) {
        String key = REQUEST_SUBMIT_LOCK_PREFIX + telegramUserId;
        try {
            return Boolean.TRUE.equals(this.redisTemplate.opsForValue().setIfAbsent((Object)key, (Object)"1", 10L, TimeUnit.SECONDS));
        }
        catch (Exception e) {
            log.warn("Telegram \u6c42\u7247\u63d0\u4ea4\u9501\u5199\u5165\u5931\u8d25\uff0c\u6309\u653e\u884c\u5904\u7406: key={}", (Object)key, (Object)e);
            return true;
        }
    }

    private void answerCallbackQuery(String callbackQueryId) {
        AnswerCallbackQuery answer = new AnswerCallbackQuery(callbackQueryId);
        try {
            this.telegramClient.execute(answer);
        }
        catch (TelegramApiException e) {
            log.error("\u54cd\u5e94\u56de\u8c03\u5931\u8d25: {}", (Object)e.getMessage());
        }
    }

    private static class PendingCreateUser {
        private final long chatId;
        private final String userName;
        private final int day;
        private final String remarks;

        PendingCreateUser(long chatId, String userName, int day, String remarks) {
            this.chatId = chatId;
            this.userName = userName;
            this.day = day;
            this.remarks = remarks;
        }

        public long getChatId() {
            return this.chatId;
        }

        public String getUserName() {
            return this.userName;
        }

        public int getDay() {
            return this.day;
        }

        public String getRemarks() {
            return this.remarks;
        }
    }

    private static class PendingCardBatch {
        private final long chatId;
        private final int count;
        private final int day;

        PendingCardBatch(long chatId, int count, int day) {
            this.chatId = chatId;
            this.count = count;
            this.day = day;
        }

        public long getChatId() {
            return this.chatId;
        }

        public int getCount() {
            return this.count;
        }

        public int getDay() {
            return this.day;
        }
    }

    private static class PendingExtendBatch {
        private final long chatId;
        private final int extensionDay;
        private final Integer expiredRange;

        PendingExtendBatch(long chatId, int extensionDay, Integer expiredRange) {
            this.chatId = chatId;
            this.extensionDay = extensionDay;
            this.expiredRange = expiredRange;
        }

        public long getChatId() {
            return this.chatId;
        }

        public int getExtensionDay() {
            return this.extensionDay;
        }

        public Integer getExpiredRange() {
            return this.expiredRange;
        }
    }

    private static class PendingUserEdit {
        private final long chatId;
        private final long userId;

        PendingUserEdit(long chatId, long userId) {
            this.chatId = chatId;
            this.userId = userId;
        }

        public long getChatId() {
            return this.chatId;
        }

        public long getUserId() {
            return this.userId;
        }
    }

    private static class TelegramAccountMatch {
        private final EmbyUser user;
        private final String source;

        TelegramAccountMatch(EmbyUser user, String source) {
            this.user = user;
            this.source = source;
        }

        public EmbyUser getUser() {
            return this.user;
        }

        public String getSource() {
            return this.source;
        }
    }
}
