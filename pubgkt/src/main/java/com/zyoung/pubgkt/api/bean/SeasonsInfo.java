package com.zyoung.pubgkt.api.bean;

import java.util.List;

/**
 * Description :
 * <p>
 * Author : zYoung
 * <p>
 * Date :  2018/5/16 18:17
 */
public class SeasonsInfo {
    private LinksBean links;
    private MetaBean meta;
    private List<DataBean> data;

    public LinksBean getLinks() {
        return links;
    }

    public void setLinks(LinksBean links) {
        this.links = links;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class LinksBean {
        private String self;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }
    }

    public static class MetaBean {
    }

    public static class DataBean {
        private String type;
        private String id;
        private AttributesBean attributes;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public static class AttributesBean {
            private boolean isCurrentSeason;
            private boolean isOffseason;

            public boolean isIsCurrentSeason() {
                return isCurrentSeason;
            }

            public void setIsCurrentSeason(boolean isCurrentSeason) {
                this.isCurrentSeason = isCurrentSeason;
            }

            public boolean isIsOffseason() {
                return isOffseason;
            }

            public void setIsOffseason(boolean isOffseason) {
                this.isOffseason = isOffseason;
            }
        }
    }
}
