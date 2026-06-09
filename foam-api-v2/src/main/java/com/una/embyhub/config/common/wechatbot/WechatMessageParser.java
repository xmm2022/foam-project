/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.util.StringUtils
 */
package com.una.embyhub.config.common.wechatbot;

import com.una.embyhub.model.dto.request.wechat.WechatBotMessage;
import java.io.StringReader;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class WechatMessageParser {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WechatMessageParser.class);

    public static Optional<WechatBotMessage> parseIncoming(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(xml)));
            String msgType = WechatMessageParser.getText(document, "MsgType");
            String event = WechatMessageParser.getText(document, "Event");
            String eventKey = WechatMessageParser.getText(document, "EventKey");
            String toUser = WechatMessageParser.getText(document, "ToUserName");
            String fromUser = WechatMessageParser.getText(document, "FromUserName");
            String content = WechatMessageParser.getText(document, "Content");
            if (!StringUtils.hasText((String)content) && StringUtils.hasText((String)eventKey)) {
                content = eventKey;
            }
            if (fromUser == null || content == null) {
                return Optional.empty();
            }
            WechatBotMessage message = new WechatBotMessage();
            message.setMsgType(msgType);
            message.setEvent(event);
            message.setEventKey(eventKey);
            message.setToUser(toUser);
            message.setFromUser(fromUser);
            message.setContent(content.trim());
            return Optional.of(message);
        }
        catch (Exception e) {
            log.error("\u89e3\u6790\u4f01\u4e1a\u5fae\u4fe1 XML \u6d88\u606f\u5931\u8d25", (Throwable)e);
            return Optional.empty();
        }
    }

    public static String buildTextResponse(WechatBotMessage request, String content) {
        long timestamp = Instant.now().getEpochSecond();
        return "<xml>" + WechatMessageParser.wrap("ToUserName", WechatMessageParser.cdata(request.getFromUser())) + WechatMessageParser.wrap("FromUserName", WechatMessageParser.cdata(request.getToUser())) + WechatMessageParser.wrap("CreateTime", String.valueOf(timestamp)) + WechatMessageParser.wrap("MsgType", WechatMessageParser.cdata("text")) + WechatMessageParser.wrap("Content", WechatMessageParser.cdata(content)) + "</xml>";
    }

    public static String buildNewsResponse(WechatBotMessage request, List<NewsArticle> articles) {
        if (articles == null || articles.isEmpty()) {
            return WechatMessageParser.buildTextResponse(request, "\u6ca1\u6709\u627e\u5230\u76f8\u5173\u5185\u5bb9");
        }
        long timestamp = Instant.now().getEpochSecond();
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        sb.append(WechatMessageParser.wrap("ToUserName", WechatMessageParser.cdata(request.getFromUser())));
        sb.append(WechatMessageParser.wrap("FromUserName", WechatMessageParser.cdata(request.getToUser())));
        sb.append(WechatMessageParser.wrap("CreateTime", String.valueOf(timestamp)));
        sb.append(WechatMessageParser.wrap("MsgType", WechatMessageParser.cdata("news")));
        sb.append(WechatMessageParser.wrap("ArticleCount", String.valueOf(Math.min(articles.size(), 8))));
        sb.append("<Articles>");
        for (int i = 0; i < Math.min(articles.size(), 8); ++i) {
            NewsArticle article = articles.get(i);
            sb.append("<item>");
            sb.append(WechatMessageParser.wrap("Title", WechatMessageParser.cdata(article.getTitle())));
            sb.append(WechatMessageParser.wrap("Description", WechatMessageParser.cdata(article.getDescription())));
            sb.append(WechatMessageParser.wrap("PicUrl", WechatMessageParser.cdata(article.getPicUrl())));
            sb.append(WechatMessageParser.wrap("Url", WechatMessageParser.cdata(article.getUrl() != null ? article.getUrl() : "")));
            sb.append("</item>");
        }
        sb.append("</Articles>");
        sb.append("</xml>");
        return sb.toString();
    }

    private static String getText(Document document, String tagName) {
        Node node = document.getElementsByTagName(tagName).item(0);
        return node == null ? null : node.getTextContent();
    }

    private static String wrap(String tag, String value) {
        return "<" + tag + ">" + value + "</" + tag + ">";
    }

    private static String cdata(String value) {
        return "<![CDATA[" + (value == null ? "" : value) + "]]>";
    }

    @Generated
    private WechatMessageParser() {
    }

    public static class NewsArticle {
        private String title;
        private String description;
        private String picUrl;
        private String url;

        @Generated
        public String getTitle() {
            return this.title;
        }

        @Generated
        public String getDescription() {
            return this.description;
        }

        @Generated
        public String getPicUrl() {
            return this.picUrl;
        }

        @Generated
        public String getUrl() {
            return this.url;
        }

        @Generated
        public void setTitle(String title) {
            this.title = title;
        }

        @Generated
        public void setDescription(String description) {
            this.description = description;
        }

        @Generated
        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        @Generated
        public void setUrl(String url) {
            this.url = url;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof NewsArticle)) {
                return false;
            }
            NewsArticle other = (NewsArticle)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$title = this.getTitle();
            String other$title = other.getTitle();
            if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
                return false;
            }
            String this$description = this.getDescription();
            String other$description = other.getDescription();
            if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
                return false;
            }
            String this$picUrl = this.getPicUrl();
            String other$picUrl = other.getPicUrl();
            if (this$picUrl == null ? other$picUrl != null : !this$picUrl.equals(other$picUrl)) {
                return false;
            }
            String this$url = this.getUrl();
            String other$url = other.getUrl();
            return !(this$url == null ? other$url != null : !this$url.equals(other$url));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof NewsArticle;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $title = this.getTitle();
            result = result * 59 + ($title == null ? 43 : $title.hashCode());
            String $description = this.getDescription();
            result = result * 59 + ($description == null ? 43 : $description.hashCode());
            String $picUrl = this.getPicUrl();
            result = result * 59 + ($picUrl == null ? 43 : $picUrl.hashCode());
            String $url = this.getUrl();
            result = result * 59 + ($url == null ? 43 : $url.hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "WechatMessageParser.NewsArticle(title=" + this.getTitle() + ", description=" + this.getDescription() + ", picUrl=" + this.getPicUrl() + ", url=" + this.getUrl() + ")";
        }

        @Generated
        public NewsArticle(String title, String description, String picUrl, String url) {
            this.title = title;
            this.description = description;
            this.picUrl = picUrl;
            this.url = url;
        }

        @Generated
        public NewsArticle() {
        }
    }
}
