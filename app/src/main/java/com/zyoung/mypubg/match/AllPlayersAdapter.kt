package com.zyoung.mypubg.match

import android.content.Context
import android.widget.Toast
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zyoung.mypubg.R
import com.zyoung.pubgkt.api.bean.MatchInfo

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/25 14:04
 */
class AllPlayersAdapter : BaseQuickAdapter<MatchInfo.IncludedBean, BaseViewHolder> {
    var listener: onSpecificPlayerListener? = null

    interface onSpecificPlayerListener {
        fun onClick(bean: MatchInfo.IncludedBean?)
    }

    constructor(layoutResId: Int, data: MutableList<MatchInfo.IncludedBean>?, l: onSpecificPlayerListener, context: Context) : super(layoutResId, data) {
        listener = l
        mContext = context
    }

    override fun convert(holder: BaseViewHolder?, bean: MatchInfo.IncludedBean?) {
        holder?.setText(R.id.tv_player_name, bean?.name())
        holder?.setOnClickListener(R.id.ll_player_name) {
            if (listener != null) {
                listener!!.onClick(bean)
                Toast.makeText(mContext, "Current player: ${bean?.name()}", Toast.LENGTH_SHORT).show()
            }
        }
    }

}