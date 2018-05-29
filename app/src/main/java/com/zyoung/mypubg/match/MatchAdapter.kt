package com.zyoung.mypubg.match

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.google.gson.Gson
import com.orhanobut.logger.Logger
import com.zyoung.mypubg.R
import com.zyoung.mypubg.activity.MatchInfoActivity
import com.zyoung.pubgkt.api.tools.L
import com.zyoung.pubgkt.api.wrapper.Match
import com.zyoung.pubgkt.api.wrapper.Player

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/25 14:04
 */
class MatchAdapter : BaseQuickAdapter<Match, BaseViewHolder> {
    var player: Player

    constructor(layoutResId: Int, data: MutableList<Match>?, mContext: Context, player: Player) : super(layoutResId, data) {
        this.mContext = mContext
        this.player = player
    }

    override fun convert(holder: BaseViewHolder?, match: Match?) {
        val createTime = match?.matchInfo?.data?.attributes?.createdAt
        var item = match!!
        val gameMode = item.matchInfo.data.attributes.gameMode

        holder?.setText(R.id.tv_gameTime, createTime)
                ?.setText(R.id.tv_gameMode, gameMode)

        holder?.setOnClickListener(R.id.ll_item) {
            for (status in match.getParticipants()) {
                if (status.attributes.stats.name == player.name) {
                    L.e("here")
                    val gson = Gson()
                    Logger.json(gson.toJson(status.attributes.stats))
                    break
                }
            }
            var gson = Gson()
            Toast.makeText(mContext, createTime, Toast.LENGTH_SHORT).show()
            item.matchInfo.data
            var intent = Intent(mContext, MatchInfoActivity::class.java)
            intent.putExtra("data", gson.toJson(match))
            mContext.startActivity(intent)
        }
    }
}