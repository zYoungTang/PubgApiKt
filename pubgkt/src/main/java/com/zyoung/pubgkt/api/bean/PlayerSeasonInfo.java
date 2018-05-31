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
public class PlayerSeasonInfo {

    /**
     * data : {"type":"playerSeason","attributes":{"gameModeStats":{"duo":{"assists":11,"boosts":93,"dBNOs":35,"dailyKills":6,"damageDealt":8056.225,"days":15,"headshotKills":23,"heals":126,"killPoints":1471.4192,"kills":47,"longestKill":231.1878,"longestTimeSurvived":1971.966,"losses":60,"maxKillStreaks":2,"mostSurvivalTime":1971.966,"revives":5,"rideDistance":87905.164,"roadKills":0,"roundMostKills":5,"roundsPlayed":61,"suicides":2,"teamKills":4,"timeSurvived":58950.83,"top10s":17,"vehicleDestroys":2,"walkDistance":74237.375,"weaponsAcquired":246,"weeklyKills":11,"winPoints":1576.041,"wins":1},"duo-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0},"solo":{"assists":0,"boosts":7,"dBNOs":0,"dailyKills":0,"damageDealt":750.8855,"days":4,"headshotKills":1,"heals":7,"killPoints":1048.2955,"kills":6,"longestKill":50.74198,"longestTimeSurvived":1718.662,"losses":6,"maxKillStreaks":1,"mostSurvivalTime":1718.662,"revives":0,"rideDistance":3607.1384,"roadKills":1,"roundMostKills":4,"roundsPlayed":6,"suicides":0,"teamKills":0,"timeSurvived":4336.9243,"top10s":1,"vehicleDestroys":0,"walkDistance":4907.314,"weaponsAcquired":20,"weeklyKills":0,"winPoints":1496.5887,"wins":0},"solo-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0},"squad":{"assists":43,"boosts":122,"dBNOs":65,"dailyKills":1,"damageDealt":11204.626,"days":12,"headshotKills":12,"heals":188,"killPoints":1554.6283,"kills":55,"longestKill":182.39775,"longestTimeSurvived":2178.595,"losses":89,"maxKillStreaks":3,"mostSurvivalTime":2178.595,"revives":31,"rideDistance":125483.016,"roadKills":0,"roundMostKills":4,"roundsPlayed":90,"suicides":2,"teamKills":4,"timeSurvived":83368.39,"top10s":32,"vehicleDestroys":6,"walkDistance":123853.99,"weaponsAcquired":374,"weeklyKills":2,"winPoints":1597.8589,"wins":1},"squad-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0}}},"relationships":{"matchesSquadFPP":{"data":[]},"season":{"data":{"type":"season","id":"division.bro.official.2018-05"}},"player":{"data":{"type":"player","id":"account.b502d588354c4588b71934a9df6d1c60"}},"matchesSolo":{"data":[{"type":"match","id":"2ab1b4d4-4cab-4aaa-a5b5-188ad3b9981a"},{"type":"match","id":"107395ca-d84d-4423-b453-55a58d1586ae"},{"type":"match","id":"335f6ccc-217a-4341-bb32-b00aabb32fb2"}]},"matchesSoloFPP":{"data":[]},"matchesDuo":{"data":[{"type":"match","id":"c93d626b-3a4b-4c1e-97fb-0f91d7a2c56a"},{"type":"match","id":"acdbcc59-71a7-4409-98d0-5b6852eff2ef"},{"type":"match","id":"045de4ef-c164-4219-b880-ee3c5acf11d6"},{"type":"match","id":"8aaacde0-7ffe-44f9-a717-1bb6cc578124"},{"type":"match","id":"abafc63a-7e94-469e-b24c-0fa55d572d4d"},{"type":"match","id":"2337d0f7-e26b-4013-b547-73b64dff20c5"},{"type":"match","id":"c3036f53-920c-4e6a-b070-67805e080edd"},{"type":"match","id":"49c16c12-3107-4f6f-bd1d-42993117176b"},{"type":"match","id":"7a45e5bb-a51b-422b-9930-8ead24ccf347"},{"type":"match","id":"0d4010f8-074f-46ed-bf3f-967ffaadfd09"},{"type":"match","id":"a6367a11-62c0-40ed-a00d-bf65f36e77eb"},{"type":"match","id":"17ebc656-3515-4eb8-8dd1-6cd3e7343af2"},{"type":"match","id":"08874b1a-69af-4648-b892-37b729c9a783"},{"type":"match","id":"994ff999-5761-42e2-9128-84380dedc725"},{"type":"match","id":"243c18a1-13ea-4861-8058-6c08fda43197"},{"type":"match","id":"93685fac-4cb1-417c-8285-3abbbd749562"},{"type":"match","id":"4b692fbd-d0d2-45f9-9617-08761e5f4f1f"},{"type":"match","id":"ddce5272-fe12-4c3f-b370-156cd01279aa"},{"type":"match","id":"187d41db-e8e9-47e1-bc94-f43216902730"},{"type":"match","id":"d43737fb-d874-419a-ad35-7e5258a205fe"},{"type":"match","id":"48f3a929-b9f7-449e-b352-7680fb34241d"},{"type":"match","id":"46fe3b90-032b-4b9f-9c6f-6824715b5a20"},{"type":"match","id":"0a918467-5474-4e51-9948-08a945187809"},{"type":"match","id":"2aeaa6dd-7e2f-4ffe-93af-e48405654398"},{"type":"match","id":"209dc11c-9672-4d84-86b6-4fd445796979"},{"type":"match","id":"abb23b8f-c824-43c4-ad5a-6d6b261d88a7"},{"type":"match","id":"dc5143f8-857a-41d5-9396-d68aff546bbe"},{"type":"match","id":"ef55c387-f223-4a5e-b5e6-78b9406836d1"},{"type":"match","id":"624c23b8-148b-423a-b92a-8e3a1f7fa064"},{"type":"match","id":"42a35b3b-fb0b-4f93-8bd3-0afbb63054ef"},{"type":"match","id":"6b0d2e60-820f-4fc9-a686-4fa3373262b1"}]},"matchesDuoFPP":{"data":[]},"matchesSquad":{"data":[{"type":"match","id":"fd685ab4-b48a-4653-8a3b-e5685a7d8ba4"},{"type":"match","id":"843d9d2f-0c34-4810-ae7f-2c3661d831f8"},{"type":"match","id":"35600960-03b4-44ea-826a-97f420ec08fa"},{"type":"match","id":"f2c88098-5ac2-421e-a1bd-1a819b3050bd"},{"type":"match","id":"54335b81-cef6-488f-bae7-1479029e3f66"},{"type":"match","id":"88bf8a77-0bbf-4cff-ba53-97854d26e52d"},{"type":"match","id":"d4f38390-4c81-41ec-8f29-24a73eea4858"},{"type":"match","id":"e4186b7b-b976-4351-aa0a-6846a77cbb50"},{"type":"match","id":"4af31936-86d2-411b-b12e-cf59fef63533"},{"type":"match","id":"a90ad239-2c93-41ca-9eae-249e97d0ad42"},{"type":"match","id":"8291d2c7-181d-4392-aaed-536e2155b5c1"},{"type":"match","id":"1b50397f-d8f1-42bd-9374-7273afa381b3"},{"type":"match","id":"fe5689f4-e87d-44e3-91d9-6e02bf5f71e3"},{"type":"match","id":"706ad5a5-d145-4514-8008-7f05261f3817"},{"type":"match","id":"f57326a7-7f92-42cc-a128-f42de5c186ad"},{"type":"match","id":"3887cd5e-a475-4348-9778-e0dc2cc9edea"},{"type":"match","id":"807c713b-a1d4-48b9-9cf8-5ff5b49c8bf0"},{"type":"match","id":"93557953-0307-4cfc-a55e-febacc3dce05"},{"type":"match","id":"b1b830b4-ee95-4b97-8c1c-741dad170ebb"},{"type":"match","id":"5e00f160-406b-4fc3-9a10-b212eaddfb41"},{"type":"match","id":"05bb0e24-61fc-4d38-b41e-0c70fb18d19a"},{"type":"match","id":"3a7e5c2d-db17-4700-a16d-5bcb23856e95"},{"type":"match","id":"b8d93539-d6cc-4235-aeeb-9dbc226d0b2b"}]}}}
     * links : {"self":"https://api.playbattlegrounds.com/shards/pc-as/players/account.b502d588354c4588b71934a9df6d1c60/seasons/division.bro.official.2018-05"}
     * meta : {}
     */

    private DataBeanXXXXX data;
    private LinksBean links;
    private MetaBean meta;

    public DataBeanXXXXX getData() {
        return data;
    }

    public void setData(DataBeanXXXXX data) {
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

    public static class DataBeanXXXXX {
        /**
         * type : playerSeason
         * attributes : {"gameModeStats":{"duo":{"assists":11,"boosts":93,"dBNOs":35,"dailyKills":6,"damageDealt":8056.225,"days":15,"headshotKills":23,"heals":126,"killPoints":1471.4192,"kills":47,"longestKill":231.1878,"longestTimeSurvived":1971.966,"losses":60,"maxKillStreaks":2,"mostSurvivalTime":1971.966,"revives":5,"rideDistance":87905.164,"roadKills":0,"roundMostKills":5,"roundsPlayed":61,"suicides":2,"teamKills":4,"timeSurvived":58950.83,"top10s":17,"vehicleDestroys":2,"walkDistance":74237.375,"weaponsAcquired":246,"weeklyKills":11,"winPoints":1576.041,"wins":1},"duo-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0},"solo":{"assists":0,"boosts":7,"dBNOs":0,"dailyKills":0,"damageDealt":750.8855,"days":4,"headshotKills":1,"heals":7,"killPoints":1048.2955,"kills":6,"longestKill":50.74198,"longestTimeSurvived":1718.662,"losses":6,"maxKillStreaks":1,"mostSurvivalTime":1718.662,"revives":0,"rideDistance":3607.1384,"roadKills":1,"roundMostKills":4,"roundsPlayed":6,"suicides":0,"teamKills":0,"timeSurvived":4336.9243,"top10s":1,"vehicleDestroys":0,"walkDistance":4907.314,"weaponsAcquired":20,"weeklyKills":0,"winPoints":1496.5887,"wins":0},"solo-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0},"squad":{"assists":43,"boosts":122,"dBNOs":65,"dailyKills":1,"damageDealt":11204.626,"days":12,"headshotKills":12,"heals":188,"killPoints":1554.6283,"kills":55,"longestKill":182.39775,"longestTimeSurvived":2178.595,"losses":89,"maxKillStreaks":3,"mostSurvivalTime":2178.595,"revives":31,"rideDistance":125483.016,"roadKills":0,"roundMostKills":4,"roundsPlayed":90,"suicides":2,"teamKills":4,"timeSurvived":83368.39,"top10s":32,"vehicleDestroys":6,"walkDistance":123853.99,"weaponsAcquired":374,"weeklyKills":2,"winPoints":1597.8589,"wins":1},"squad-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0}}}
         * relationships : {"matchesSquadFPP":{"data":[]},"season":{"data":{"type":"season","id":"division.bro.official.2018-05"}},"player":{"data":{"type":"player","id":"account.b502d588354c4588b71934a9df6d1c60"}},"matchesSolo":{"data":[{"type":"match","id":"2ab1b4d4-4cab-4aaa-a5b5-188ad3b9981a"},{"type":"match","id":"107395ca-d84d-4423-b453-55a58d1586ae"},{"type":"match","id":"335f6ccc-217a-4341-bb32-b00aabb32fb2"}]},"matchesSoloFPP":{"data":[]},"matchesDuo":{"data":[{"type":"match","id":"c93d626b-3a4b-4c1e-97fb-0f91d7a2c56a"},{"type":"match","id":"acdbcc59-71a7-4409-98d0-5b6852eff2ef"},{"type":"match","id":"045de4ef-c164-4219-b880-ee3c5acf11d6"},{"type":"match","id":"8aaacde0-7ffe-44f9-a717-1bb6cc578124"},{"type":"match","id":"abafc63a-7e94-469e-b24c-0fa55d572d4d"},{"type":"match","id":"2337d0f7-e26b-4013-b547-73b64dff20c5"},{"type":"match","id":"c3036f53-920c-4e6a-b070-67805e080edd"},{"type":"match","id":"49c16c12-3107-4f6f-bd1d-42993117176b"},{"type":"match","id":"7a45e5bb-a51b-422b-9930-8ead24ccf347"},{"type":"match","id":"0d4010f8-074f-46ed-bf3f-967ffaadfd09"},{"type":"match","id":"a6367a11-62c0-40ed-a00d-bf65f36e77eb"},{"type":"match","id":"17ebc656-3515-4eb8-8dd1-6cd3e7343af2"},{"type":"match","id":"08874b1a-69af-4648-b892-37b729c9a783"},{"type":"match","id":"994ff999-5761-42e2-9128-84380dedc725"},{"type":"match","id":"243c18a1-13ea-4861-8058-6c08fda43197"},{"type":"match","id":"93685fac-4cb1-417c-8285-3abbbd749562"},{"type":"match","id":"4b692fbd-d0d2-45f9-9617-08761e5f4f1f"},{"type":"match","id":"ddce5272-fe12-4c3f-b370-156cd01279aa"},{"type":"match","id":"187d41db-e8e9-47e1-bc94-f43216902730"},{"type":"match","id":"d43737fb-d874-419a-ad35-7e5258a205fe"},{"type":"match","id":"48f3a929-b9f7-449e-b352-7680fb34241d"},{"type":"match","id":"46fe3b90-032b-4b9f-9c6f-6824715b5a20"},{"type":"match","id":"0a918467-5474-4e51-9948-08a945187809"},{"type":"match","id":"2aeaa6dd-7e2f-4ffe-93af-e48405654398"},{"type":"match","id":"209dc11c-9672-4d84-86b6-4fd445796979"},{"type":"match","id":"abb23b8f-c824-43c4-ad5a-6d6b261d88a7"},{"type":"match","id":"dc5143f8-857a-41d5-9396-d68aff546bbe"},{"type":"match","id":"ef55c387-f223-4a5e-b5e6-78b9406836d1"},{"type":"match","id":"624c23b8-148b-423a-b92a-8e3a1f7fa064"},{"type":"match","id":"42a35b3b-fb0b-4f93-8bd3-0afbb63054ef"},{"type":"match","id":"6b0d2e60-820f-4fc9-a686-4fa3373262b1"}]},"matchesDuoFPP":{"data":[]},"matchesSquad":{"data":[{"type":"match","id":"fd685ab4-b48a-4653-8a3b-e5685a7d8ba4"},{"type":"match","id":"843d9d2f-0c34-4810-ae7f-2c3661d831f8"},{"type":"match","id":"35600960-03b4-44ea-826a-97f420ec08fa"},{"type":"match","id":"f2c88098-5ac2-421e-a1bd-1a819b3050bd"},{"type":"match","id":"54335b81-cef6-488f-bae7-1479029e3f66"},{"type":"match","id":"88bf8a77-0bbf-4cff-ba53-97854d26e52d"},{"type":"match","id":"d4f38390-4c81-41ec-8f29-24a73eea4858"},{"type":"match","id":"e4186b7b-b976-4351-aa0a-6846a77cbb50"},{"type":"match","id":"4af31936-86d2-411b-b12e-cf59fef63533"},{"type":"match","id":"a90ad239-2c93-41ca-9eae-249e97d0ad42"},{"type":"match","id":"8291d2c7-181d-4392-aaed-536e2155b5c1"},{"type":"match","id":"1b50397f-d8f1-42bd-9374-7273afa381b3"},{"type":"match","id":"fe5689f4-e87d-44e3-91d9-6e02bf5f71e3"},{"type":"match","id":"706ad5a5-d145-4514-8008-7f05261f3817"},{"type":"match","id":"f57326a7-7f92-42cc-a128-f42de5c186ad"},{"type":"match","id":"3887cd5e-a475-4348-9778-e0dc2cc9edea"},{"type":"match","id":"807c713b-a1d4-48b9-9cf8-5ff5b49c8bf0"},{"type":"match","id":"93557953-0307-4cfc-a55e-febacc3dce05"},{"type":"match","id":"b1b830b4-ee95-4b97-8c1c-741dad170ebb"},{"type":"match","id":"5e00f160-406b-4fc3-9a10-b212eaddfb41"},{"type":"match","id":"05bb0e24-61fc-4d38-b41e-0c70fb18d19a"},{"type":"match","id":"3a7e5c2d-db17-4700-a16d-5bcb23856e95"},{"type":"match","id":"b8d93539-d6cc-4235-aeeb-9dbc226d0b2b"}]}}
         */

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
            /**
             * gameModeStats : {"duo":{"assists":11,"boosts":93,"dBNOs":35,"dailyKills":6,"damageDealt":8056.225,"days":15,"headshotKills":23,"heals":126,"killPoints":1471.4192,"kills":47,"longestKill":231.1878,"longestTimeSurvived":1971.966,"losses":60,"maxKillStreaks":2,"mostSurvivalTime":1971.966,"revives":5,"rideDistance":87905.164,"roadKills":0,"roundMostKills":5,"roundsPlayed":61,"suicides":2,"teamKills":4,"timeSurvived":58950.83,"top10s":17,"vehicleDestroys":2,"walkDistance":74237.375,"weaponsAcquired":246,"weeklyKills":11,"winPoints":1576.041,"wins":1},"duo-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0},"solo":{"assists":0,"boosts":7,"dBNOs":0,"dailyKills":0,"damageDealt":750.8855,"days":4,"headshotKills":1,"heals":7,"killPoints":1048.2955,"kills":6,"longestKill":50.74198,"longestTimeSurvived":1718.662,"losses":6,"maxKillStreaks":1,"mostSurvivalTime":1718.662,"revives":0,"rideDistance":3607.1384,"roadKills":1,"roundMostKills":4,"roundsPlayed":6,"suicides":0,"teamKills":0,"timeSurvived":4336.9243,"top10s":1,"vehicleDestroys":0,"walkDistance":4907.314,"weaponsAcquired":20,"weeklyKills":0,"winPoints":1496.5887,"wins":0},"solo-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0},"squad":{"assists":43,"boosts":122,"dBNOs":65,"dailyKills":1,"damageDealt":11204.626,"days":12,"headshotKills":12,"heals":188,"killPoints":1554.6283,"kills":55,"longestKill":182.39775,"longestTimeSurvived":2178.595,"losses":89,"maxKillStreaks":3,"mostSurvivalTime":2178.595,"revives":31,"rideDistance":125483.016,"roadKills":0,"roundMostKills":4,"roundsPlayed":90,"suicides":2,"teamKills":4,"timeSurvived":83368.39,"top10s":32,"vehicleDestroys":6,"walkDistance":123853.99,"weaponsAcquired":374,"weeklyKills":2,"winPoints":1597.8589,"wins":1},"squad-fpp":{"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0}}
             */

            private GameModeStatsBean gameModeStats;

            public GameModeStatsBean getGameModeStats() {
                return gameModeStats;
            }

            public void setGameModeStats(GameModeStatsBean gameModeStats) {
                this.gameModeStats = gameModeStats;
            }

            public static class GameModeStatsBean {
                /**
                 * duo : {"assists":11,"boosts":93,"dBNOs":35,"dailyKills":6,"damageDealt":8056.225,"days":15,"headshotKills":23,"heals":126,"killPoints":1471.4192,"kills":47,"longestKill":231.1878,"longestTimeSurvived":1971.966,"losses":60,"maxKillStreaks":2,"mostSurvivalTime":1971.966,"revives":5,"rideDistance":87905.164,"roadKills":0,"roundMostKills":5,"roundsPlayed":61,"suicides":2,"teamKills":4,"timeSurvived":58950.83,"top10s":17,"vehicleDestroys":2,"walkDistance":74237.375,"weaponsAcquired":246,"weeklyKills":11,"winPoints":1576.041,"wins":1}
                 * duo-fpp : {"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0}
                 * solo : {"assists":0,"boosts":7,"dBNOs":0,"dailyKills":0,"damageDealt":750.8855,"days":4,"headshotKills":1,"heals":7,"killPoints":1048.2955,"kills":6,"longestKill":50.74198,"longestTimeSurvived":1718.662,"losses":6,"maxKillStreaks":1,"mostSurvivalTime":1718.662,"revives":0,"rideDistance":3607.1384,"roadKills":1,"roundMostKills":4,"roundsPlayed":6,"suicides":0,"teamKills":0,"timeSurvived":4336.9243,"top10s":1,"vehicleDestroys":0,"walkDistance":4907.314,"weaponsAcquired":20,"weeklyKills":0,"winPoints":1496.5887,"wins":0}
                 * solo-fpp : {"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0}
                 * squad : {"assists":43,"boosts":122,"dBNOs":65,"dailyKills":1,"damageDealt":11204.626,"days":12,"headshotKills":12,"heals":188,"killPoints":1554.6283,"kills":55,"longestKill":182.39775,"longestTimeSurvived":2178.595,"losses":89,"maxKillStreaks":3,"mostSurvivalTime":2178.595,"revives":31,"rideDistance":125483.016,"roadKills":0,"roundMostKills":4,"roundsPlayed":90,"suicides":2,"teamKills":4,"timeSurvived":83368.39,"top10s":32,"vehicleDestroys":6,"walkDistance":123853.99,"weaponsAcquired":374,"weeklyKills":2,"winPoints":1597.8589,"wins":1}
                 * squad-fpp : {"assists":0,"boosts":0,"dBNOs":0,"dailyKills":0,"damageDealt":0,"days":0,"headshotKills":0,"heals":0,"killPoints":0,"kills":0,"longestKill":0,"longestTimeSurvived":0,"losses":0,"maxKillStreaks":0,"mostSurvivalTime":0,"revives":0,"rideDistance":0,"roadKills":0,"roundMostKills":0,"roundsPlayed":0,"suicides":0,"teamKills":0,"timeSurvived":0,"top10s":0,"vehicleDestroys":0,"walkDistance":0,"weaponsAcquired":0,"weeklyKills":0,"winPoints":0,"wins":0}
                 */

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
            /**
             * matchesSquadFPP : {"data":[]}
             * season : {"data":{"type":"season","id":"division.bro.official.2018-05"}}
             * player : {"data":{"type":"player","id":"account.b502d588354c4588b71934a9df6d1c60"}}
             * matchesSolo : {"data":[{"type":"match","id":"2ab1b4d4-4cab-4aaa-a5b5-188ad3b9981a"},{"type":"match","id":"107395ca-d84d-4423-b453-55a58d1586ae"},{"type":"match","id":"335f6ccc-217a-4341-bb32-b00aabb32fb2"}]}
             * matchesSoloFPP : {"data":[]}
             * matchesDuo : {"data":[{"type":"match","id":"c93d626b-3a4b-4c1e-97fb-0f91d7a2c56a"},{"type":"match","id":"acdbcc59-71a7-4409-98d0-5b6852eff2ef"},{"type":"match","id":"045de4ef-c164-4219-b880-ee3c5acf11d6"},{"type":"match","id":"8aaacde0-7ffe-44f9-a717-1bb6cc578124"},{"type":"match","id":"abafc63a-7e94-469e-b24c-0fa55d572d4d"},{"type":"match","id":"2337d0f7-e26b-4013-b547-73b64dff20c5"},{"type":"match","id":"c3036f53-920c-4e6a-b070-67805e080edd"},{"type":"match","id":"49c16c12-3107-4f6f-bd1d-42993117176b"},{"type":"match","id":"7a45e5bb-a51b-422b-9930-8ead24ccf347"},{"type":"match","id":"0d4010f8-074f-46ed-bf3f-967ffaadfd09"},{"type":"match","id":"a6367a11-62c0-40ed-a00d-bf65f36e77eb"},{"type":"match","id":"17ebc656-3515-4eb8-8dd1-6cd3e7343af2"},{"type":"match","id":"08874b1a-69af-4648-b892-37b729c9a783"},{"type":"match","id":"994ff999-5761-42e2-9128-84380dedc725"},{"type":"match","id":"243c18a1-13ea-4861-8058-6c08fda43197"},{"type":"match","id":"93685fac-4cb1-417c-8285-3abbbd749562"},{"type":"match","id":"4b692fbd-d0d2-45f9-9617-08761e5f4f1f"},{"type":"match","id":"ddce5272-fe12-4c3f-b370-156cd01279aa"},{"type":"match","id":"187d41db-e8e9-47e1-bc94-f43216902730"},{"type":"match","id":"d43737fb-d874-419a-ad35-7e5258a205fe"},{"type":"match","id":"48f3a929-b9f7-449e-b352-7680fb34241d"},{"type":"match","id":"46fe3b90-032b-4b9f-9c6f-6824715b5a20"},{"type":"match","id":"0a918467-5474-4e51-9948-08a945187809"},{"type":"match","id":"2aeaa6dd-7e2f-4ffe-93af-e48405654398"},{"type":"match","id":"209dc11c-9672-4d84-86b6-4fd445796979"},{"type":"match","id":"abb23b8f-c824-43c4-ad5a-6d6b261d88a7"},{"type":"match","id":"dc5143f8-857a-41d5-9396-d68aff546bbe"},{"type":"match","id":"ef55c387-f223-4a5e-b5e6-78b9406836d1"},{"type":"match","id":"624c23b8-148b-423a-b92a-8e3a1f7fa064"},{"type":"match","id":"42a35b3b-fb0b-4f93-8bd3-0afbb63054ef"},{"type":"match","id":"6b0d2e60-820f-4fc9-a686-4fa3373262b1"}]}
             * matchesDuoFPP : {"data":[]}
             * matchesSquad : {"data":[{"type":"match","id":"fd685ab4-b48a-4653-8a3b-e5685a7d8ba4"},{"type":"match","id":"843d9d2f-0c34-4810-ae7f-2c3661d831f8"},{"type":"match","id":"35600960-03b4-44ea-826a-97f420ec08fa"},{"type":"match","id":"f2c88098-5ac2-421e-a1bd-1a819b3050bd"},{"type":"match","id":"54335b81-cef6-488f-bae7-1479029e3f66"},{"type":"match","id":"88bf8a77-0bbf-4cff-ba53-97854d26e52d"},{"type":"match","id":"d4f38390-4c81-41ec-8f29-24a73eea4858"},{"type":"match","id":"e4186b7b-b976-4351-aa0a-6846a77cbb50"},{"type":"match","id":"4af31936-86d2-411b-b12e-cf59fef63533"},{"type":"match","id":"a90ad239-2c93-41ca-9eae-249e97d0ad42"},{"type":"match","id":"8291d2c7-181d-4392-aaed-536e2155b5c1"},{"type":"match","id":"1b50397f-d8f1-42bd-9374-7273afa381b3"},{"type":"match","id":"fe5689f4-e87d-44e3-91d9-6e02bf5f71e3"},{"type":"match","id":"706ad5a5-d145-4514-8008-7f05261f3817"},{"type":"match","id":"f57326a7-7f92-42cc-a128-f42de5c186ad"},{"type":"match","id":"3887cd5e-a475-4348-9778-e0dc2cc9edea"},{"type":"match","id":"807c713b-a1d4-48b9-9cf8-5ff5b49c8bf0"},{"type":"match","id":"93557953-0307-4cfc-a55e-febacc3dce05"},{"type":"match","id":"b1b830b4-ee95-4b97-8c1c-741dad170ebb"},{"type":"match","id":"5e00f160-406b-4fc3-9a10-b212eaddfb41"},{"type":"match","id":"05bb0e24-61fc-4d38-b41e-0c70fb18d19a"},{"type":"match","id":"3a7e5c2d-db17-4700-a16d-5bcb23856e95"},{"type":"match","id":"b8d93539-d6cc-4235-aeeb-9dbc226d0b2b"}]}
             */

            private MatchesSquadFPPBean matchesSquadFPP;
            private SeasonBean season;
            private PlayerBean player;
            private MatchesSoloBean matchesSolo;
            private MatchesSoloFPPBean matchesSoloFPP;
            private MatchesDuoBean matchesDuo;
            private MatchesDuoFPPBean matchesDuoFPP;
            private MatchesSquadBean matchesSquad;

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

            public MatchesSquadBean getMatchesSquad() {
                return matchesSquad;
            }

            public void setMatchesSquad(MatchesSquadBean matchesSquad) {
                this.matchesSquad = matchesSquad;
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
                /**
                 * data : {"type":"season","id":"division.bro.official.2018-05"}
                 */

                private DataBean data;

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public static class DataBean {
                    /**
                     * type : season
                     * id : division.bro.official.2018-05
                     */

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
                /**
                 * data : {"type":"player","id":"account.b502d588354c4588b71934a9df6d1c60"}
                 */

                private DataBeanX data;

                public DataBeanX getData() {
                    return data;
                }

                public void setData(DataBeanX data) {
                    this.data = data;
                }

                public static class DataBeanX {
                    /**
                     * type : player
                     * id : account.b502d588354c4588b71934a9df6d1c60
                     */

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
                private List<DataBeanXX> data;

                public List<DataBeanXX> getData() {
                    return data;
                }

                public void setData(List<DataBeanXX> data) {
                    this.data = data;
                }

                public static class DataBeanXX {
                    /**
                     * type : match
                     * id : 2ab1b4d4-4cab-4aaa-a5b5-188ad3b9981a
                     */

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
                private List<DataBeanXXX> data;

                public List<DataBeanXXX> getData() {
                    return data;
                }

                public void setData(List<DataBeanXXX> data) {
                    this.data = data;
                }

                public static class DataBeanXXX {
                    /**
                     * type : match
                     * id : c93d626b-3a4b-4c1e-97fb-0f91d7a2c56a
                     */

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

            public static class MatchesDuoFPPBean {
                private List<?> data;

                public List<?> getData() {
                    return data;
                }

                public void setData(List<?> data) {
                    this.data = data;
                }
            }

            public static class MatchesSquadBean {
                private List<DataBeanXXXX> data;

                public List<DataBeanXXXX> getData() {
                    return data;
                }

                public void setData(List<DataBeanXXXX> data) {
                    this.data = data;
                }

                public static class DataBeanXXXX {
                    /**
                     * type : match
                     * id : fd685ab4-b48a-4653-8a3b-e5685a7d8ba4
                     */

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

    public static class LinksBean {
        /**
         * self : https://api.playbattlegrounds.com/shards/pc-as/players/account.b502d588354c4588b71934a9df6d1c60/seasons/division.bro.official.2018-05
         */

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