package com.zyoung.mypubg.match

import android.content.Context
import android.view.View
import android.widget.Toast
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zyoung.mypubg.R
import com.zyoung.pubgkt.api.wrapper.Match

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/25 14:04
 */
class MatchAdapter : BaseQuickAdapter<Match, BaseViewHolder> {
    constructor(layoutResId: Int, data: MutableList<Match>?, mContext: Context) : super(layoutResId, data) {
        this.mContext = mContext
    }

    override fun convert(holder: BaseViewHolder?, item: Match?) {
        val createTime = item?.matchInfo?.data?.attributes?.createdAt
        var item = item!!
        val gameMode = item.matchInfo.data.attributes.gameMode

        holder?.setText(R.id.tv_gameTime, createTime)
                ?.setText(R.id.tv_gameMode, gameMode)

        holder?.setOnClickListener(R.id.ll_item) {
            Toast.makeText(mContext, createTime, Toast.LENGTH_SHORT).show()
            item.matchInfo.data
        }
    }

}