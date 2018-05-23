package com.zyoung.pubgkt.api.bean;

/**
 * Description :
 * <p>
 * Author : zYoung
 * <p>
 * Date :  2018/5/17 10:34
 */
public class StatusInfo {
    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
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
            private String version;
            private String releasedAt;

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public String getReleasedAt() {
                return releasedAt;
            }

            public void setReleasedAt(String releasedAt) {
                this.releasedAt = releasedAt;
            }
        }
    }
}
