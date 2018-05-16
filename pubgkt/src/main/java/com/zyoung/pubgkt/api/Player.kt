package com.zyoung.pubgkt.api

import com.zyoung.pubgkt.api.bean.PlayerInfo

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 15:14
 */
class Player {
    lateinit var bean: PlayerInfo

    constructor(playerInfo: PlayerInfo) {
        bean = playerInfo
    }

    fun matches(): List<PlayerInfo.DataBeanX.RelationshipsBean.MatchesBean.DataBean> {
        return bean.data[0].relationships.matches.data
    }

    fun name(): String {
        return bean.data[0].attributes.name
    }

    fun createdAt(): String {
        return bean.data[0].attributes.createdAt
    }

    fun updatedAt(): String {
        return bean.data[0].attributes.updatedAt
    }

    fun id(): String {
        return bean.data[0].id
    }

    fun type(): String {
        return bean.data[0].type
    }

    fun links(): String {
        return bean.data[0].links.self
    }

    fun shareId(): String {
        return bean.data[0].attributes.shardId
    }
}