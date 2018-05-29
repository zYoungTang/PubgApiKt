package com.zyoung.pubgkt.api.wrapper

import com.zyoung.pubgkt.api.bean.MatchInfo

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/23 18:22
 */
class Match {
    var matchInfo: MatchInfo
    var participants: ArrayList<MatchInfo.IncludedBean>
    var roster: ArrayList<MatchInfo.IncludedBean>
    var player: Player

    constructor(matchInfo: MatchInfo, player: Player) {
        this.player = player
        this.matchInfo = matchInfo
        participants = getParticipants() as ArrayList<MatchInfo.IncludedBean>
        roster = getRosters() as ArrayList<MatchInfo.IncludedBean>
    }

    /**
     * 获取比赛中所有玩家数据
     */
    fun getParticipants(): List<MatchInfo.IncludedBean> {
        return matchInfo.included.filter { it -> it.type == "participant" }
    }

    fun getRosters(): List<MatchInfo.IncludedBean> {
        return matchInfo.included.filter { it -> it.type == "roster" }
    }

    /**
     * 获取我们搜索的玩家比赛数据
     */
    fun getPlayerStatus(): MatchInfo.IncludedBean{
        val players = getParticipants()
        for (p in players) {
            if (p.attributes.stats.name == player.name) {
                return p
            }
        }
        return MatchInfo.IncludedBean()
    }
}