package com.zyoung.pubgkt.api.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Description :
 * <p>
 * Author : zYoung
 * <p>
 * Date :  2018/5/24 11:56
 */
public class PlayerSeasonBetaInfo {
    private DataBeanXX data;
    private LinksBean links;
    private MetaBean meta;

    public DataBeanXX getData() {
        return data;
    }

    public void setData(DataBeanXX data) {
        this.data = data;
    }

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

    public static class DataBeanXX {
        private String type;
        private AttributesBean attributes;
        private RelationshipsBean relationships;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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

        public static class AttributesBean {
            private GameModeStatsBean gameModeStats;

            public GameModeStatsBean getGameModeStats() {
                return gameModeStats;
            }

            public void setGameModeStats(GameModeStatsBean gameModeStats) {
                this.gameModeStats = gameModeStats;
            }

            public static class GameModeStatsBean {
                private DuoBean duo;
                @SerializedName("duo-fpp")
                private DuofppBean duofpp;
                private SoloBean solo;
                @SerializedName("solo-fpp")
                private SolofppBean solofpp;
                private SquadBean squad;
                @SerializedName("squad-fpp")
                private SquadfppBean squadfpp;

                public DuoBean getDuo() {
                    return duo;
                }

                public void setDuo(DuoBean duo) {
                    this.duo = duo;
                }

                public DuofppBean getDuofpp() {
                    return duofpp;
                }

                public void setDuofpp(DuofppBean duofpp) {
                    this.duofpp = duofpp;
                }

                public SoloBean getSolo() {
                    return solo;
                }

                public void setSolo(SoloBean solo) {
                    this.solo = solo;
                }

                public SolofppBean getSolofpp() {
                    return solofpp;
                }

                public void setSolofpp(SolofppBean solofpp) {
                    this.solofpp = solofpp;
                }

                public SquadBean getSquad() {
                    return squad;
                }

                public void setSquad(SquadBean squad) {
                    this.squad = squad;
                }

                public SquadfppBean getSquadfpp() {
                    return squadfpp;
                }

                public void setSquadfpp(SquadfppBean squadfpp) {
                    this.squadfpp = squadfpp;
                }

                public static class GameModeBean {
                    private int assists;
                    private int boosts;
                    private int dBNOs;
                    private int dailyKills;
                    private double damageDealt;
                    private int days;
                    private int headshotKills;
                    private int heals;
                    private double killPoints;
                    private int kills;
                    private double longestKill;
                    private double longestTimeSurvived;
                    private int losses;
                    private int maxKillStreaks;
                    private double mostSurvivalTime;
                    private double revives;
                    private double rideDistance;
                    private int roadKills;
                    private int roundMostKills;
                    private int roundsPlayed;
                    private int suicides;
                    private int teamKills;
                    private double timeSurvived;
                    private int top10s;
                    private int vehicleDestroys;
                    private double walkDistance;
                    private int weaponsAcquired;
                    private int weeklyKills;
                    private double winPoints;
                    private double wins;

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

                    public int getDBNOs() {
                        return dBNOs;
                    }

                    public void setDBNOs(int dBNOs) {
                        this.dBNOs = dBNOs;
                    }

                    public int getDailyKills() {
                        return dailyKills;
                    }

                    public void setDailyKills(int dailyKills) {
                        this.dailyKills = dailyKills;
                    }

                    public double getDamageDealt() {
                        return damageDealt;
                    }

                    public void setDamageDealt(double damageDealt) {
                        this.damageDealt = damageDealt;
                    }

                    public int getDays() {
                        return days;
                    }

                    public void setDays(int days) {
                        this.days = days;
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

                    public double getKillPoints() {
                        return killPoints;
                    }

                    public void setKillPoints(double killPoints) {
                        this.killPoints = killPoints;
                    }

                    public int getKills() {
                        return kills;
                    }

                    public void setKills(int kills) {
                        this.kills = kills;
                    }

                    public double getLongestKill() {
                        return longestKill;
                    }

                    public void setLongestKill(double longestKill) {
                        this.longestKill = longestKill;
                    }

                    public double getLongestTimeSurvived() {
                        return longestTimeSurvived;
                    }

                    public void setLongestTimeSurvived(double longestTimeSurvived) {
                        this.longestTimeSurvived = longestTimeSurvived;
                    }

                    public int getLosses() {
                        return losses;
                    }

                    public void setLosses(int losses) {
                        this.losses = losses;
                    }

                    public int getMaxKillStreaks() {
                        return maxKillStreaks;
                    }

                    public void setMaxKillStreaks(int maxKillStreaks) {
                        this.maxKillStreaks = maxKillStreaks;
                    }

                    public double getMostSurvivalTime() {
                        return mostSurvivalTime;
                    }

                    public void setMostSurvivalTime(double mostSurvivalTime) {
                        this.mostSurvivalTime = mostSurvivalTime;
                    }

                    public double getRevives() {
                        return revives;
                    }

                    public void setRevives(double revives) {
                        this.revives = revives;
                    }

                    public double getRideDistance() {
                        return rideDistance;
                    }

                    public void setRideDistance(double rideDistance) {
                        this.rideDistance = rideDistance;
                    }

                    public int getRoadKills() {
                        return roadKills;
                    }

                    public void setRoadKills(int roadKills) {
                        this.roadKills = roadKills;
                    }

                    public int getRoundMostKills() {
                        return roundMostKills;
                    }

                    public void setRoundMostKills(int roundMostKills) {
                        this.roundMostKills = roundMostKills;
                    }

                    public int getRoundsPlayed() {
                        return roundsPlayed;
                    }

                    public void setRoundsPlayed(int roundsPlayed) {
                        this.roundsPlayed = roundsPlayed;
                    }

                    public int getSuicides() {
                        return suicides;
                    }

                    public void setSuicides(int suicides) {
                        this.suicides = suicides;
                    }

                    public int getTeamKills() {
                        return teamKills;
                    }

                    public void setTeamKills(int teamKills) {
                        this.teamKills = teamKills;
                    }

                    public double getTimeSurvived() {
                        return timeSurvived;
                    }

                    public void setTimeSurvived(double timeSurvived) {
                        this.timeSurvived = timeSurvived;
                    }

                    public int getTop10s() {
                        return top10s;
                    }

                    public void setTop10s(int top10s) {
                        this.top10s = top10s;
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

                    public int getWeeklyKills() {
                        return weeklyKills;
                    }

                    public void setWeeklyKills(int weeklyKills) {
                        this.weeklyKills = weeklyKills;
                    }

                    public double getWinPoints() {
                        return winPoints;
                    }

                    public void setWinPoints(double winPoints) {
                        this.winPoints = winPoints;
                    }

                    public double getWins() {
                        return wins;
                    }

                    public void setWins(double wins) {
                        this.wins = wins;
                    }
                }

                public static class DuoBean extends GameModeBean {
                }

                public static class DuofppBean extends GameModeBean {
                }

                public static class SoloBean extends GameModeBean {
                }

                public static class SolofppBean extends GameModeBean {
                }

                public static class SquadBean extends GameModeBean {
                }

                public static class SquadfppBean extends GameModeBean {
                }
            }
        }

        public static class RelationshipsBean {
            private MatchesSquadBean matchesSquad;
            private MatchesSquadFPPBean matchesSquadFPP;
            private SeasonBean season;
            private PlayerBean player;
            private MatchesSoloBean matchesSolo;
            private MatchesSoloFPPBean matchesSoloFPP;
            private MatchesDuoBean matchesDuo;
            private MatchesDuoFPPBean matchesDuoFPP;

            public MatchesSquadBean getMatchesSquad() {
                return matchesSquad;
            }

            public void setMatchesSquad(MatchesSquadBean matchesSquad) {
                this.matchesSquad = matchesSquad;
            }

            public MatchesSquadFPPBean getMatchesSquadFPP() {
                return matchesSquadFPP;
            }

            public void setMatchesSquadFPP(MatchesSquadFPPBean matchesSquadFPP) {
                this.matchesSquadFPP = matchesSquadFPP;
            }

            public SeasonBean getSeason() {
                return season;
            }

            public void setSeason(SeasonBean season) {
                this.season = season;
            }

            public PlayerBean getPlayer() {
                return player;
            }

            public void setPlayer(PlayerBean player) {
                this.player = player;
            }

            public MatchesSoloBean getMatchesSolo() {
                return matchesSolo;
            }

            public void setMatchesSolo(MatchesSoloBean matchesSolo) {
                this.matchesSolo = matchesSolo;
            }

            public MatchesSoloFPPBean getMatchesSoloFPP() {
                return matchesSoloFPP;
            }

            public void setMatchesSoloFPP(MatchesSoloFPPBean matchesSoloFPP) {
                this.matchesSoloFPP = matchesSoloFPP;
            }

            public MatchesDuoBean getMatchesDuo() {
                return matchesDuo;
            }

            public void setMatchesDuo(MatchesDuoBean matchesDuo) {
                this.matchesDuo = matchesDuo;
            }

            public MatchesDuoFPPBean getMatchesDuoFPP() {
                return matchesDuoFPP;
            }

            public void setMatchesDuoFPP(MatchesDuoFPPBean matchesDuoFPP) {
                this.matchesDuoFPP = matchesDuoFPP;
            }

            public static class MatchesSquadBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }

            public static class MatchesSquadFPPBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }

            public static class SeasonBean {
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

            public static class PlayerBean {
                private DataBeanX data;

                public DataBeanX getData() {
                    return data;
                }

                public void setData(DataBeanX data) {
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

            public static class MatchesSoloBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }

            public static class MatchesSoloFPPBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }

            public static class MatchesDuoBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }

            public static class MatchesDuoFPPBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }
        }
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
}
