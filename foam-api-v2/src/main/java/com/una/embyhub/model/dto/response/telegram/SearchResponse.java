/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson2.annotation.JSONField
 *  lombok.Generated
 */
package com.una.embyhub.model.dto.response.telegram;

import com.alibaba.fastjson2.annotation.JSONField;
import java.util.List;
import java.util.Map;
import lombok.Generated;

public class SearchResponse {
    private Integer code;
    private String message;
    private SearchDataResponse data = new SearchDataResponse();

    @Generated
    public static SearchResponseBuilder builder() {
        return new SearchResponseBuilder();
    }

    @Generated
    public Integer getCode() {
        return this.code;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public SearchDataResponse getData() {
        return this.data;
    }

    @Generated
    public void setCode(Integer code) {
        this.code = code;
    }

    @Generated
    public void setMessage(String message) {
        this.message = message;
    }

    @Generated
    public void setData(SearchDataResponse data) {
        this.data = data;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SearchResponse)) {
            return false;
        }
        SearchResponse other = (SearchResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$code = this.getCode();
        Integer other$code = other.getCode();
        if (this$code == null ? other$code != null : !((Object)this$code).equals(other$code)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) {
            return false;
        }
        SearchDataResponse this$data = this.getData();
        SearchDataResponse other$data = other.getData();
        return !(this$data == null ? other$data != null : !((Object)this$data).equals(other$data));
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof SearchResponse;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : ((Object)$code).hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        SearchDataResponse $data = this.getData();
        result = result * 59 + ($data == null ? 43 : ((Object)$data).hashCode());
        return result;
    }

    @Generated
    public String toString() {
        return "SearchResponse(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + String.valueOf(this.getData()) + ")";
    }

    @Generated
    public SearchResponse() {
    }

    @Generated
    public SearchResponse(Integer code, String message, SearchDataResponse data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Generated
    public static class SearchResponseBuilder {
        @Generated
        private Integer code;
        @Generated
        private String message;
        @Generated
        private SearchDataResponse data;

        @Generated
        SearchResponseBuilder() {
        }

        @Generated
        public SearchResponseBuilder code(Integer code) {
            this.code = code;
            return this;
        }

        @Generated
        public SearchResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        @Generated
        public SearchResponseBuilder data(SearchDataResponse data) {
            this.data = data;
            return this;
        }

        @Generated
        public SearchResponse build() {
            return new SearchResponse(this.code, this.message, this.data);
        }

        @Generated
        public String toString() {
            return "SearchResponse.SearchResponseBuilder(code=" + this.code + ", message=" + this.message + ", data=" + String.valueOf(this.data) + ")";
        }
    }

    public static class SearchDataResponse {
        private Integer total;
        @JSONField(name="merged_by_type")
        private Map<String, List<LinkItem>> mergedByType;
        private List<ResultItem> results;

        @Generated
        public static SearchDataResponseBuilder builder() {
            return new SearchDataResponseBuilder();
        }

        @Generated
        public Integer getTotal() {
            return this.total;
        }

        @Generated
        public Map<String, List<LinkItem>> getMergedByType() {
            return this.mergedByType;
        }

        @Generated
        public List<ResultItem> getResults() {
            return this.results;
        }

        @Generated
        public void setTotal(Integer total) {
            this.total = total;
        }

        @Generated
        public void setMergedByType(Map<String, List<LinkItem>> mergedByType) {
            this.mergedByType = mergedByType;
        }

        @Generated
        public void setResults(List<ResultItem> results) {
            this.results = results;
        }

        @Generated
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof SearchDataResponse)) {
                return false;
            }
            SearchDataResponse other = (SearchDataResponse)o;
            if (!other.canEqual(this)) {
                return false;
            }
            Integer this$total = this.getTotal();
            Integer other$total = other.getTotal();
            if (this$total == null ? other$total != null : !((Object)this$total).equals(other$total)) {
                return false;
            }
            Map<String, List<LinkItem>> this$mergedByType = this.getMergedByType();
            Map<String, List<LinkItem>> other$mergedByType = other.getMergedByType();
            if (this$mergedByType == null ? other$mergedByType != null : !((Object)this$mergedByType).equals(other$mergedByType)) {
                return false;
            }
            List<ResultItem> this$results = this.getResults();
            List<ResultItem> other$results = other.getResults();
            return !(this$results == null ? other$results != null : !((Object)this$results).equals(other$results));
        }

        @Generated
        protected boolean canEqual(Object other) {
            return other instanceof SearchDataResponse;
        }

        @Generated
        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            Integer $total = this.getTotal();
            result = result * 59 + ($total == null ? 43 : ((Object)$total).hashCode());
            Map<String, List<LinkItem>> $mergedByType = this.getMergedByType();
            result = result * 59 + ($mergedByType == null ? 43 : ((Object)$mergedByType).hashCode());
            List<ResultItem> $results = this.getResults();
            result = result * 59 + ($results == null ? 43 : ((Object)$results).hashCode());
            return result;
        }

        @Generated
        public String toString() {
            return "SearchResponse.SearchDataResponse(total=" + this.getTotal() + ", mergedByType=" + String.valueOf(this.getMergedByType()) + ", results=" + String.valueOf(this.getResults()) + ")";
        }

        @Generated
        public SearchDataResponse() {
        }

        @Generated
        public SearchDataResponse(Integer total, Map<String, List<LinkItem>> mergedByType, List<ResultItem> results) {
            this.total = total;
            this.mergedByType = mergedByType;
            this.results = results;
        }

        @Generated
        public static class SearchDataResponseBuilder {
            @Generated
            private Integer total;
            @Generated
            private Map<String, List<LinkItem>> mergedByType;
            @Generated
            private List<ResultItem> results;

            @Generated
            SearchDataResponseBuilder() {
            }

            @Generated
            public SearchDataResponseBuilder total(Integer total) {
                this.total = total;
                return this;
            }

            @Generated
            public SearchDataResponseBuilder mergedByType(Map<String, List<LinkItem>> mergedByType) {
                this.mergedByType = mergedByType;
                return this;
            }

            @Generated
            public SearchDataResponseBuilder results(List<ResultItem> results) {
                this.results = results;
                return this;
            }

            @Generated
            public SearchDataResponse build() {
                return new SearchDataResponse(this.total, this.mergedByType, this.results);
            }

            @Generated
            public String toString() {
                return "SearchResponse.SearchDataResponse.SearchDataResponseBuilder(total=" + this.total + ", mergedByType=" + String.valueOf(this.mergedByType) + ", results=" + String.valueOf(this.results) + ")";
            }
        }

        public static class LinkBrief {
            private String type;
            private String url;
            private String password;

            @Generated
            public static LinkBriefBuilder builder() {
                return new LinkBriefBuilder();
            }

            @Generated
            public String getType() {
                return this.type;
            }

            @Generated
            public String getUrl() {
                return this.url;
            }

            @Generated
            public String getPassword() {
                return this.password;
            }

            @Generated
            public void setType(String type) {
                this.type = type;
            }

            @Generated
            public void setUrl(String url) {
                this.url = url;
            }

            @Generated
            public void setPassword(String password) {
                this.password = password;
            }

            @Generated
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (!(o instanceof LinkBrief)) {
                    return false;
                }
                LinkBrief other = (LinkBrief)o;
                if (!other.canEqual(this)) {
                    return false;
                }
                String this$type = this.getType();
                String other$type = other.getType();
                if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
                    return false;
                }
                String this$url = this.getUrl();
                String other$url = other.getUrl();
                if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
                    return false;
                }
                String this$password = this.getPassword();
                String other$password = other.getPassword();
                return !(this$password == null ? other$password != null : !this$password.equals(other$password));
            }

            @Generated
            protected boolean canEqual(Object other) {
                return other instanceof LinkBrief;
            }

            @Generated
            public int hashCode() {
                int PRIME = 59;
                int result = 1;
                String $type = this.getType();
                result = result * 59 + ($type == null ? 43 : $type.hashCode());
                String $url = this.getUrl();
                result = result * 59 + ($url == null ? 43 : $url.hashCode());
                String $password = this.getPassword();
                result = result * 59 + ($password == null ? 43 : $password.hashCode());
                return result;
            }

            @Generated
            public String toString() {
                return "SearchResponse.SearchDataResponse.LinkBrief(type=" + this.getType() + ", url=" + this.getUrl() + ", password=" + this.getPassword() + ")";
            }

            @Generated
            public LinkBrief() {
            }

            @Generated
            public LinkBrief(String type, String url, String password) {
                this.type = type;
                this.url = url;
                this.password = password;
            }

            @Generated
            public static class LinkBriefBuilder {
                @Generated
                private String type;
                @Generated
                private String url;
                @Generated
                private String password;

                @Generated
                LinkBriefBuilder() {
                }

                @Generated
                public LinkBriefBuilder type(String type) {
                    this.type = type;
                    return this;
                }

                @Generated
                public LinkBriefBuilder url(String url) {
                    this.url = url;
                    return this;
                }

                @Generated
                public LinkBriefBuilder password(String password) {
                    this.password = password;
                    return this;
                }

                @Generated
                public LinkBrief build() {
                    return new LinkBrief(this.type, this.url, this.password);
                }

                @Generated
                public String toString() {
                    return "SearchResponse.SearchDataResponse.LinkBrief.LinkBriefBuilder(type=" + this.type + ", url=" + this.url + ", password=" + this.password + ")";
                }
            }
        }

        public static class ResultItem {
            private String messageId;
            private String uniqueId;
            private String channel;
            private String datetime;
            private String title;
            private String content;
            private List<String> tags;
            private List<String> images;
            private List<LinkBrief> links;

            @Generated
            public static ResultItemBuilder builder() {
                return new ResultItemBuilder();
            }

            @Generated
            public String getMessageId() {
                return this.messageId;
            }

            @Generated
            public String getUniqueId() {
                return this.uniqueId;
            }

            @Generated
            public String getChannel() {
                return this.channel;
            }

            @Generated
            public String getDatetime() {
                return this.datetime;
            }

            @Generated
            public String getTitle() {
                return this.title;
            }

            @Generated
            public String getContent() {
                return this.content;
            }

            @Generated
            public List<String> getTags() {
                return this.tags;
            }

            @Generated
            public List<String> getImages() {
                return this.images;
            }

            @Generated
            public List<LinkBrief> getLinks() {
                return this.links;
            }

            @Generated
            public void setMessageId(String messageId) {
                this.messageId = messageId;
            }

            @Generated
            public void setUniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
            }

            @Generated
            public void setChannel(String channel) {
                this.channel = channel;
            }

            @Generated
            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            @Generated
            public void setTitle(String title) {
                this.title = title;
            }

            @Generated
            public void setContent(String content) {
                this.content = content;
            }

            @Generated
            public void setTags(List<String> tags) {
                this.tags = tags;
            }

            @Generated
            public void setImages(List<String> images) {
                this.images = images;
            }

            @Generated
            public void setLinks(List<LinkBrief> links) {
                this.links = links;
            }

            @Generated
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (!(o instanceof ResultItem)) {
                    return false;
                }
                ResultItem other = (ResultItem)o;
                if (!other.canEqual(this)) {
                    return false;
                }
                String this$messageId = this.getMessageId();
                String other$messageId = other.getMessageId();
                if (this$messageId == null ? other$messageId != null : !this$messageId.equals(other$messageId)) {
                    return false;
                }
                String this$uniqueId = this.getUniqueId();
                String other$uniqueId = other.getUniqueId();
                if (this$uniqueId == null ? other$uniqueId != null : !this$uniqueId.equals(other$uniqueId)) {
                    return false;
                }
                String this$channel = this.getChannel();
                String other$channel = other.getChannel();
                if (this$channel == null ? other$channel != null : !this$channel.equals(other$channel)) {
                    return false;
                }
                String this$datetime = this.getDatetime();
                String other$datetime = other.getDatetime();
                if (this$datetime == null ? other$datetime != null : !this$datetime.equals(other$datetime)) {
                    return false;
                }
                String this$title = this.getTitle();
                String other$title = other.getTitle();
                if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
                    return false;
                }
                String this$content = this.getContent();
                String other$content = other.getContent();
                if (this$content == null ? other$content != null : !this$content.equals(other$content)) {
                    return false;
                }
                List<String> this$tags = this.getTags();
                List<String> other$tags = other.getTags();
                if (this$tags == null ? other$tags != null : !((Object)this$tags).equals(other$tags)) {
                    return false;
                }
                List<String> this$images = this.getImages();
                List<String> other$images = other.getImages();
                if (this$images == null ? other$images != null : !((Object)this$images).equals(other$images)) {
                    return false;
                }
                List<LinkBrief> this$links = this.getLinks();
                List<LinkBrief> other$links = other.getLinks();
                return !(this$links == null ? other$links != null : !((Object)this$links).equals(other$links));
            }

            @Generated
            protected boolean canEqual(Object other) {
                return other instanceof ResultItem;
            }

            @Generated
            public int hashCode() {
                int PRIME = 59;
                int result = 1;
                String $messageId = this.getMessageId();
                result = result * 59 + ($messageId == null ? 43 : $messageId.hashCode());
                String $uniqueId = this.getUniqueId();
                result = result * 59 + ($uniqueId == null ? 43 : $uniqueId.hashCode());
                String $channel = this.getChannel();
                result = result * 59 + ($channel == null ? 43 : $channel.hashCode());
                String $datetime = this.getDatetime();
                result = result * 59 + ($datetime == null ? 43 : $datetime.hashCode());
                String $title = this.getTitle();
                result = result * 59 + ($title == null ? 43 : $title.hashCode());
                String $content = this.getContent();
                result = result * 59 + ($content == null ? 43 : $content.hashCode());
                List<String> $tags = this.getTags();
                result = result * 59 + ($tags == null ? 43 : ((Object)$tags).hashCode());
                List<String> $images = this.getImages();
                result = result * 59 + ($images == null ? 43 : ((Object)$images).hashCode());
                List<LinkBrief> $links = this.getLinks();
                result = result * 59 + ($links == null ? 43 : ((Object)$links).hashCode());
                return result;
            }

            @Generated
            public String toString() {
                return "SearchResponse.SearchDataResponse.ResultItem(messageId=" + this.getMessageId() + ", uniqueId=" + this.getUniqueId() + ", channel=" + this.getChannel() + ", datetime=" + this.getDatetime() + ", title=" + this.getTitle() + ", content=" + this.getContent() + ", tags=" + String.valueOf(this.getTags()) + ", images=" + String.valueOf(this.getImages()) + ", links=" + String.valueOf(this.getLinks()) + ")";
            }

            @Generated
            public ResultItem() {
            }

            @Generated
            public ResultItem(String messageId, String uniqueId, String channel, String datetime, String title, String content, List<String> tags, List<String> images, List<LinkBrief> links) {
                this.messageId = messageId;
                this.uniqueId = uniqueId;
                this.channel = channel;
                this.datetime = datetime;
                this.title = title;
                this.content = content;
                this.tags = tags;
                this.images = images;
                this.links = links;
            }

            @Generated
            public static class ResultItemBuilder {
                @Generated
                private String messageId;
                @Generated
                private String uniqueId;
                @Generated
                private String channel;
                @Generated
                private String datetime;
                @Generated
                private String title;
                @Generated
                private String content;
                @Generated
                private List<String> tags;
                @Generated
                private List<String> images;
                @Generated
                private List<LinkBrief> links;

                @Generated
                ResultItemBuilder() {
                }

                @Generated
                public ResultItemBuilder messageId(String messageId) {
                    this.messageId = messageId;
                    return this;
                }

                @Generated
                public ResultItemBuilder uniqueId(String uniqueId) {
                    this.uniqueId = uniqueId;
                    return this;
                }

                @Generated
                public ResultItemBuilder channel(String channel) {
                    this.channel = channel;
                    return this;
                }

                @Generated
                public ResultItemBuilder datetime(String datetime) {
                    this.datetime = datetime;
                    return this;
                }

                @Generated
                public ResultItemBuilder title(String title) {
                    this.title = title;
                    return this;
                }

                @Generated
                public ResultItemBuilder content(String content) {
                    this.content = content;
                    return this;
                }

                @Generated
                public ResultItemBuilder tags(List<String> tags) {
                    this.tags = tags;
                    return this;
                }

                @Generated
                public ResultItemBuilder images(List<String> images) {
                    this.images = images;
                    return this;
                }

                @Generated
                public ResultItemBuilder links(List<LinkBrief> links) {
                    this.links = links;
                    return this;
                }

                @Generated
                public ResultItem build() {
                    return new ResultItem(this.messageId, this.uniqueId, this.channel, this.datetime, this.title, this.content, this.tags, this.images, this.links);
                }

                @Generated
                public String toString() {
                    return "SearchResponse.SearchDataResponse.ResultItem.ResultItemBuilder(messageId=" + this.messageId + ", uniqueId=" + this.uniqueId + ", channel=" + this.channel + ", datetime=" + this.datetime + ", title=" + this.title + ", content=" + this.content + ", tags=" + String.valueOf(this.tags) + ", images=" + String.valueOf(this.images) + ", links=" + String.valueOf(this.links) + ")";
                }
            }
        }

        public static class LinkItem {
            private String url;
            private String password;
            private String note;
            private String datetime;
            private String source;
            private List<String> images;
            private String type;

            @Generated
            public static LinkItemBuilder builder() {
                return new LinkItemBuilder();
            }

            @Generated
            public String getUrl() {
                return this.url;
            }

            @Generated
            public String getPassword() {
                return this.password;
            }

            @Generated
            public String getNote() {
                return this.note;
            }

            @Generated
            public String getDatetime() {
                return this.datetime;
            }

            @Generated
            public String getSource() {
                return this.source;
            }

            @Generated
            public List<String> getImages() {
                return this.images;
            }

            @Generated
            public String getType() {
                return this.type;
            }

            @Generated
            public void setUrl(String url) {
                this.url = url;
            }

            @Generated
            public void setPassword(String password) {
                this.password = password;
            }

            @Generated
            public void setNote(String note) {
                this.note = note;
            }

            @Generated
            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            @Generated
            public void setSource(String source) {
                this.source = source;
            }

            @Generated
            public void setImages(List<String> images) {
                this.images = images;
            }

            @Generated
            public void setType(String type) {
                this.type = type;
            }

            @Generated
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (!(o instanceof LinkItem)) {
                    return false;
                }
                LinkItem other = (LinkItem)o;
                if (!other.canEqual(this)) {
                    return false;
                }
                String this$url = this.getUrl();
                String other$url = other.getUrl();
                if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
                    return false;
                }
                String this$password = this.getPassword();
                String other$password = other.getPassword();
                if (this$password == null ? other$password != null : !this$password.equals(other$password)) {
                    return false;
                }
                String this$note = this.getNote();
                String other$note = other.getNote();
                if (this$note == null ? other$note != null : !this$note.equals(other$note)) {
                    return false;
                }
                String this$datetime = this.getDatetime();
                String other$datetime = other.getDatetime();
                if (this$datetime == null ? other$datetime != null : !this$datetime.equals(other$datetime)) {
                    return false;
                }
                String this$source = this.getSource();
                String other$source = other.getSource();
                if (this$source == null ? other$source != null : !this$source.equals(other$source)) {
                    return false;
                }
                List<String> this$images = this.getImages();
                List<String> other$images = other.getImages();
                if (this$images == null ? other$images != null : !((Object)this$images).equals(other$images)) {
                    return false;
                }
                String this$type = this.getType();
                String other$type = other.getType();
                return !(this$type == null ? other$type != null : !this$type.equals(other$type));
            }

            @Generated
            protected boolean canEqual(Object other) {
                return other instanceof LinkItem;
            }

            @Generated
            public int hashCode() {
                int PRIME = 59;
                int result = 1;
                String $url = this.getUrl();
                result = result * 59 + ($url == null ? 43 : $url.hashCode());
                String $password = this.getPassword();
                result = result * 59 + ($password == null ? 43 : $password.hashCode());
                String $note = this.getNote();
                result = result * 59 + ($note == null ? 43 : $note.hashCode());
                String $datetime = this.getDatetime();
                result = result * 59 + ($datetime == null ? 43 : $datetime.hashCode());
                String $source = this.getSource();
                result = result * 59 + ($source == null ? 43 : $source.hashCode());
                List<String> $images = this.getImages();
                result = result * 59 + ($images == null ? 43 : ((Object)$images).hashCode());
                String $type = this.getType();
                result = result * 59 + ($type == null ? 43 : $type.hashCode());
                return result;
            }

            @Generated
            public String toString() {
                return "SearchResponse.SearchDataResponse.LinkItem(url=" + this.getUrl() + ", password=" + this.getPassword() + ", note=" + this.getNote() + ", datetime=" + this.getDatetime() + ", source=" + this.getSource() + ", images=" + String.valueOf(this.getImages()) + ", type=" + this.getType() + ")";
            }

            @Generated
            public LinkItem() {
            }

            @Generated
            public LinkItem(String url, String password, String note, String datetime, String source, List<String> images, String type) {
                this.url = url;
                this.password = password;
                this.note = note;
                this.datetime = datetime;
                this.source = source;
                this.images = images;
                this.type = type;
            }

            @Generated
            public static class LinkItemBuilder {
                @Generated
                private String url;
                @Generated
                private String password;
                @Generated
                private String note;
                @Generated
                private String datetime;
                @Generated
                private String source;
                @Generated
                private List<String> images;
                @Generated
                private String type;

                @Generated
                LinkItemBuilder() {
                }

                @Generated
                public LinkItemBuilder url(String url) {
                    this.url = url;
                    return this;
                }

                @Generated
                public LinkItemBuilder password(String password) {
                    this.password = password;
                    return this;
                }

                @Generated
                public LinkItemBuilder note(String note) {
                    this.note = note;
                    return this;
                }

                @Generated
                public LinkItemBuilder datetime(String datetime) {
                    this.datetime = datetime;
                    return this;
                }

                @Generated
                public LinkItemBuilder source(String source) {
                    this.source = source;
                    return this;
                }

                @Generated
                public LinkItemBuilder images(List<String> images) {
                    this.images = images;
                    return this;
                }

                @Generated
                public LinkItemBuilder type(String type) {
                    this.type = type;
                    return this;
                }

                @Generated
                public LinkItem build() {
                    return new LinkItem(this.url, this.password, this.note, this.datetime, this.source, this.images, this.type);
                }

                @Generated
                public String toString() {
                    return "SearchResponse.SearchDataResponse.LinkItem.LinkItemBuilder(url=" + this.url + ", password=" + this.password + ", note=" + this.note + ", datetime=" + this.datetime + ", source=" + this.source + ", images=" + String.valueOf(this.images) + ", type=" + this.type + ")";
                }
            }
        }
    }
}
