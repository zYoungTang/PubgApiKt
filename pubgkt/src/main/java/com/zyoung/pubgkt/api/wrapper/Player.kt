package com.zyoung.pubgkt.api.wrapper

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import com.zyoung.pubgkt.api.bean.PlayerInfo

@SuppressLint("ParcelCreator")
/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 15:14
 */
class Player : Parcelable {
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeInt(flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    var bean: PlayerInfo
    var matches: List<PlayerInfo.DataBeanX.RelationshipsBean.MatchesBean.DataBean>
    var name: String
    var createdAt: String
    var updatedAt: String
    var id: String
    var type: String
    var links: String
    var shareId: String

    constructor(playerInfo: PlayerInfo) {
        bean = playerInfo
        matches = bean.data[0].relationships.matches.data
        name = bean.data[0].attributes.name
        createdAt = bean.data[0].attributes.createdAt
        updatedAt = bean.data[0].attributes.updatedAt
        id = bean.data[0].id
        type = bean.data[0].type
        links = bean.data[0].links.self
        shareId = bean.data[0].attributes.shardId
    }
}