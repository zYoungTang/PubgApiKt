package com.zyoung.pubgkt.api.wrapper

import com.zyoung.pubgkt.api.bean.PlayerSeasonInfo

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 15:14
 */
class PlayerSeason {
    var bean: PlayerSeasonInfo
    var duo: PlayerSeasonInfo.DataBeanXXXXX.AttributesBean.GameModeStatsBean.DuoBean
    var duofpp: PlayerSeasonInfo.DataBeanXXXXX.AttributesBean.GameModeStatsBean.DuofppBean
    var solo: PlayerSeasonInfo.DataBeanXXXXX.AttributesBean.GameModeStatsBean.SoloBean
    var solofpp: PlayerSeasonInfo.DataBeanXXXXX.AttributesBean.GameModeStatsBean.SolofppBean
    var squad: PlayerSeasonInfo.DataBeanXXXXX.AttributesBean.GameModeStatsBean.SquadBean
    var squadfpp: PlayerSeasonInfo.DataBeanXXXXX.AttributesBean.GameModeStatsBean.SquadfppBean

    constructor(playerInfo: PlayerSeasonInfo) {
        bean = playerInfo
        duo = bean.data.attributes.gameModeStats.duo
        duofpp = bean.data.attributes.gameModeStats.duofpp
        solo = bean.data.attributes.gameModeStats.solo
        solofpp = bean.data.attributes.gameModeStats.solofpp
        squad = bean.data.attributes.gameModeStats.squad
        squadfpp = bean.data.attributes.gameModeStats.squadfpp
    }
}