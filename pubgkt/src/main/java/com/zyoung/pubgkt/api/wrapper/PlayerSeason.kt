package com.zyoung.pubgkt.api.wrapper

import com.zyoung.pubgkt.api.bean.PlayerInfo
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
    var duo: PlayerSeasonInfo.DataBeanXX.AttributesBean.GameModeStatsBean.DuoBean
    var duofpp: PlayerSeasonInfo.DataBeanXX.AttributesBean.GameModeStatsBean.DuofppBean
    var solo: PlayerSeasonInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SoloBean
    var solofpp: PlayerSeasonInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SolofppBean
    var squad: PlayerSeasonInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SquadBean
    var squadfpp: PlayerSeasonInfo.DataBeanXX.AttributesBean.GameModeStatsBean.SquadfppBean

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