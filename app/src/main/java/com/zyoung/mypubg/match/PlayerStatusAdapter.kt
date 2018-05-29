package com.zyoung.mypubg.match

import android.content.Context
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zyoung.mypubg.R
import com.zyoung.mypubg.data.PlayerStatusBean

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/25 14:04
 */
class PlayerStatusAdapter : BaseQuickAdapter<PlayerStatusBean, BaseViewHolder> {
    constructor(layoutResId: Int, data: MutableList<PlayerStatusBean>?, context: Context) : super(layoutResId, data) {
        mContext = context
    }

    override fun convert(holder: BaseViewHolder?, bean: PlayerStatusBean?) {
        holder?.setText(R.id.tv_tittle, bean?.title)
                ?.setText(R.id.tv_content, bean?.content)
    }

}