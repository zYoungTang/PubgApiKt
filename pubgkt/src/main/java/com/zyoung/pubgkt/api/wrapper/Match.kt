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

    constructor(matchInfo: MatchInfo) {
        this.matchInfo = matchInfo
        participants = getParticipants() as ArrayList<MatchInfo.IncludedBean>
        roster = getRosters() as ArrayList<MatchInfo.IncludedBean>
    }

    fun getParticipants(): List<MatchInfo.IncludedBean> {
        return matchInfo.included.filter { it -> it.type == "participant" }
    }

    fun getRosters(): List<MatchInfo.IncludedBean> {
        return matchInfo.included.filter { it -> it.type == "roster" }
    }
}