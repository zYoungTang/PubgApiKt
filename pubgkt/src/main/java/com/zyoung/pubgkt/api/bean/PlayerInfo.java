package com.zyoung.pubgkt.api.bean;

import java.util.List;

/**
 * Description :
 * <p>
 * Author : zYoung
 * <p>
 * Date :  2018/5/16 11:30
 * <p>
 * @author zYoung
 */
public class PlayerInfo {
    private LinksBean links;
    private MetaBean meta;
    private List<DataBeanX> data;

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

    public List<DataBeanX> getData() {
        return data;
    }

    public void setData(List<DataBeanX> data) {
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

    public static class DataBeanX {
        private String type;
        private String id;
        private AttributesBean attributes;
        private RelationshipsBean relationships;
        private LinksBeanX links;

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

        public RelationshipsBean getRelationships() {
            return relationships;
        }

        public void setRelationships(RelationshipsBean relationships) {
            this.relationships = relationships;
        }

        public LinksBeanX getLinks() {
            return links;
        }

        public void setLinks(LinksBeanX links) {
            this.links = links;
        }

        public static class AttributesBean {
            private String name;
            private Object stats;
            private String titleId;
            private String shardId;
            private String createdAt;
            private String updatedAt;
            private String patchVersion;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Object getStats() {
                return stats;
            }

            public void setStats(Object stats) {
                this.stats = stats;
            }

            public String getTitleId() {
                return titleId;
            }

            public void setTitleId(String titleId) {
                this.titleId = titleId;
            }

            public String getShardId() {
                return shardId;
            }

            public void setShardId(String shardId) {
                this.shardId = shardId;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public String getPatchVersion() {
                return patchVersion;
            }

            public void setPatchVersion(String patchVersion) {
                this.patchVersion = patchVersion;
            }
        }

        public static class RelationshipsBean {
            private AssetsBean assets;
            private MatchesBean matches;

            public AssetsBean getAssets() {
                return assets;
            }

            public void setAssets(AssetsBean assets) {
                this.assets = assets;
            }

            public MatchesBean getMatches() {
                return matches;
            }

            public void setMatches(MatchesBean matches) {
                this.matches = matches;
            }

            public static class AssetsBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }

            public static class MatchesBean {
                private List<DataBean> data;

                public List<DataBean> getData() {
                    return data;
                }

                public void setData(List<DataBean> data) {
                    this.data = data;
                }

                public static class DataBean {
                    private String type;
                    private String id;

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
                }
            }
        }

        public static class LinksBeanX {
            private String schema;
            private String self;

            public String getSchema() {
                return schema;
            }

            public void setSchema(String schema) {
                this.schema = schema;
            }

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }
        }
    }
}
