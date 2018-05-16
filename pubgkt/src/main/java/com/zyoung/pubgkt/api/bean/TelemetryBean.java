package com.zyoung.pubgkt.api.bean;

import java.util.List;

/**
 * Description :
 * <p>
 * Author : zYoung
 * <p>
 * Date :  2018/5/16 18:40
 */
public class TelemetryBean {
    private DataBeanXX data;
    private LinksBeanX links;
    private MetaBean meta;
    private List<IncludedBean> included;

    public DataBeanXX getData() {
        return data;
    }

    public void setData(DataBeanXX data) {
        this.data = data;
    }

    public LinksBeanX getLinks() {
        return links;
    }

    public void setLinks(LinksBeanX links) {
        this.links = links;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<IncludedBean> getIncluded() {
        return included;
    }

    public void setIncluded(List<IncludedBean> included) {
        this.included = included;
    }

    public static class DataBeanXX {
        private String type;
        private String id;
        private AttributesBean attributes;
        private RelationshipsBean relationships;
        private LinksBean links;

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

        public LinksBean getLinks() {
            return links;
        }

        public void setLinks(LinksBean links) {
            this.links = links;
        }

        public static class AttributesBean {
            private Object tags;
            private String mapName;
            private String createdAt;
            private int duration;
            private Object stats;
            private String gameMode;
            private String titleId;
            private String shardId;

            public Object getTags() {
                return tags;
            }

            public void setTags(Object tags) {
                this.tags = tags;
            }

            public String getMapName() {
                return mapName;
            }

            public void setMapName(String mapName) {
                this.mapName = mapName;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public Object getStats() {
                return stats;
            }

            public void setStats(Object stats) {
                this.stats = stats;
            }

            public String getGameMode() {
                return gameMode;
            }

            public void setGameMode(String gameMode) {
                this.gameMode = gameMode;
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
        }

        public static class RelationshipsBean {
            private RostersBean rosters;
            private AssetsBean assets;

            public RostersBean getRosters() {
                return rosters;
            }

            public void setRosters(RostersBean rosters) {
                this.rosters = rosters;
            }

            public AssetsBean getAssets() {
                return assets;
            }

            public void setAssets(AssetsBean assets) {
                this.assets = assets;
            }

            public static class RostersBean {
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

            public static class AssetsBean {
                private List<DataBeanX> data;

                public List<DataBeanX> getData() {
                    return data;
                }

                public void setData(List<DataBeanX> data) {
                    this.data = data;
                }

                public static class DataBeanX {
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

        public static class LinksBean {
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

    public static class LinksBeanX {
    }

    public static class MetaBean {
    }

    public static class IncludedBean {
        private String type;
        private String id;
        private AttributesBeanX attributes;
        private RelationshipsBeanX relationships;

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

        public AttributesBeanX getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBeanX attributes) {
            this.attributes = attributes;
        }

        public RelationshipsBeanX getRelationships() {
            return relationships;
        }

        public void setRelationships(RelationshipsBeanX relationships) {
            this.relationships = relationships;
        }

        public static class AttributesBeanX {
            private StatsBean stats;
            private String actor;
            private String shardId;

            public StatsBean getStats() {
                return stats;
            }

            public void setStats(StatsBean stats) {
                this.stats = stats;
            }

            public String getActor() {
                return actor;
            }

            public void setActor(String actor) {
                this.actor = actor;
            }

            public String getShardId() {
                return shardId;
            }

            public void setShardId(String shardId) {
                this.shardId = shardId;
            }

            public static class StatsBean {
                private int DBNOs;
                private int assists;
                private int boosts;
                private double damageDealt;
                private String deathType;
                private int headshotKills;
                private int heals;
                private int killPlace;
                private int killPoints;
                private double killPointsDelta;
                private int killStreaks;
                private int kills;
                private int lastKillPoints;
                private int lastWinPoints;
                private int longestKill;
                private int mostDamage;
                private String name;
                private String playerId;
                private int revives;
                private int rideDistance;
                private int roadKills;
                private int teamKills;
                private int timeSurvived;
                private int vehicleDestroys;
                private double walkDistance;
                private int weaponsAcquired;
                private int winPlace;
                private int winPoints;
                private double winPointsDelta;

                public int getDBNOs() {
                    return DBNOs;
                }

                public void setDBNOs(int DBNOs) {
                    this.DBNOs = DBNOs;
                }

                public int getAssists() {
                    return assists;
                }

                public void setAssists(int assists) {
                    this.assists = assists;
                }

                public int getBoosts() {
                    return boosts;
                }

                public void setBoosts(int boosts) {
                    this.boosts = boosts;
                }

                public double getDamageDealt() {
                    return damageDealt;
                }

                public void setDamageDealt(double damageDealt) {
                    this.damageDealt = damageDealt;
                }

                public String getDeathType() {
                    return deathType;
                }

                public void setDeathType(String deathType) {
                    this.deathType = deathType;
                }

                public int getHeadshotKills() {
                    return headshotKills;
                }

                public void setHeadshotKills(int headshotKills) {
                    this.headshotKills = headshotKills;
                }

                public int getHeals() {
                    return heals;
                }

                public void setHeals(int heals) {
                    this.heals = heals;
                }

                public int getKillPlace() {
                    return killPlace;
                }

                public void setKillPlace(int killPlace) {
                    this.killPlace = killPlace;
                }

                public int getKillPoints() {
                    return killPoints;
                }

                public void setKillPoints(int killPoints) {
                    this.killPoints = killPoints;
                }

                public double getKillPointsDelta() {
                    return killPointsDelta;
                }

                public void setKillPointsDelta(double killPointsDelta) {
                    this.killPointsDelta = killPointsDelta;
                }

                public int getKillStreaks() {
                    return killStreaks;
                }

                public void setKillStreaks(int killStreaks) {
                    this.killStreaks = killStreaks;
                }

                public int getKills() {
                    return kills;
                }

                public void setKills(int kills) {
                    this.kills = kills;
                }

                public int getLastKillPoints() {
                    return lastKillPoints;
                }

                public void setLastKillPoints(int lastKillPoints) {
                    this.lastKillPoints = lastKillPoints;
                }

                public int getLastWinPoints() {
                    return lastWinPoints;
                }

                public void setLastWinPoints(int lastWinPoints) {
                    this.lastWinPoints = lastWinPoints;
                }

                public int getLongestKill() {
                    return longestKill;
                }

                public void setLongestKill(int longestKill) {
                    this.longestKill = longestKill;
                }

                public int getMostDamage() {
                    return mostDamage;
                }

                public void setMostDamage(int mostDamage) {
                    this.mostDamage = mostDamage;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPlayerId() {
                    return playerId;
                }

                public void setPlayerId(String playerId) {
                    this.playerId = playerId;
                }

                public int getRevives() {
                    return revives;
                }

                public void setRevives(int revives) {
                    this.revives = revives;
                }

                public int getRideDistance() {
                    return rideDistance;
                }

                public void setRideDistance(int rideDistance) {
                    this.rideDistance = rideDistance;
                }

                public int getRoadKills() {
                    return roadKills;
                }

                public void setRoadKills(int roadKills) {
                    this.roadKills = roadKills;
                }

                public int getTeamKills() {
                    return teamKills;
                }

                public void setTeamKills(int teamKills) {
                    this.teamKills = teamKills;
                }

                public int getTimeSurvived() {
                    return timeSurvived;
                }

                public void setTimeSurvived(int timeSurvived) {
                    this.timeSurvived = timeSurvived;
                }

                public int getVehicleDestroys() {
                    return vehicleDestroys;
                }

                public void setVehicleDestroys(int vehicleDestroys) {
                    this.vehicleDestroys = vehicleDestroys;
                }

                public double getWalkDistance() {
                    return walkDistance;
                }

                public void setWalkDistance(double walkDistance) {
                    this.walkDistance = walkDistance;
                }

                public int getWeaponsAcquired() {
                    return weaponsAcquired;
                }

                public void setWeaponsAcquired(int weaponsAcquired) {
                    this.weaponsAcquired = weaponsAcquired;
                }

                public int getWinPlace() {
                    return winPlace;
                }

                public void setWinPlace(int winPlace) {
                    this.winPlace = winPlace;
                }

                public int getWinPoints() {
                    return winPoints;
                }

                public void setWinPoints(int winPoints) {
                    this.winPoints = winPoints;
                }

                public double getWinPointsDelta() {
                    return winPointsDelta;
                }

                public void setWinPointsDelta(double winPointsDelta) {
                    this.winPointsDelta = winPointsDelta;
                }
            }
        }

        public static class RelationshipsBeanX {
            private TeamBean team;
            private ParticipantsBean participants;

            public TeamBean getTeam() {
                return team;
            }

            public void setTeam(TeamBean team) {
                this.team = team;
            }

            public ParticipantsBean getParticipants() {
                return participants;
            }

            public void setParticipants(ParticipantsBean participants) {
                this.participants = participants;
            }

            public static class TeamBean {
                private Object data;

                public Object getData() {
                    return data;
                }

                public void setData(Object data) {
                    this.data = data;
                }
            }

            public static class ParticipantsBean {
                private List<DataBeanXXX> data;

                public List<DataBeanXXX> getData() {
                    return data;
                }

                public void setData(List<DataBeanXXX> data) {
                    this.data = data;
                }

                public static class DataBeanXXX {
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
    }
}
