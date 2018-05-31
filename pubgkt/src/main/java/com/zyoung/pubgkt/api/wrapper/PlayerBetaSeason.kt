package com.zyoung.pubgkt.api.wrapper

import com.zyoung.pubgkt.api.bean.PlayerSeasonBetaInfo

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 15:14
 */
class PlayerBetaSeason {
    var bean: PlayerSeasonBetaInfo
    var duo: PlayerSeasonBetaInfo.DataBeanXX.AttributesBean.GameModeStatsBean.DuoBean
    var duofpp: PlayerSeasonBetaInfo.DataBeanXX.AttributesBean.GameModeStatsBean.DuofppBean
    var solo: PlayerSeasonBetaInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SoloBean
    var solofpp: PlayerSeasonBetaInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SolofppBean
    var squad: PlayerSeasonBetaInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SquadBean
    var squadfpp: PlayerSeasonBetaInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SquadfppBean

    constructor(playerInfo: PlayerSeasonBetaInfo) {
        bean = playerInfo
        duo = bean.data.attributes.gameModeStats.duo
        duofpp = bean.data.attributes.gameModeStats.duofpp
        solo = bean.data.attributes.gameModeStats.solo
        solofpp = bean.data.attributes.gameModeStats.solofpp
        squad = bean.data.attributes.gameModeStats.squad
        squadfpp = bean.data.attributes.gameModeStats.squadfpp
    }
}