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
class SeasonsAdapter : BaseQuickAdapter<String, BaseViewHolder> {

    constructor(layoutResId: Int, data: MutableList<String>?, context: Context) : super(layoutResId, data) {
        mContext = context
    }

    override fun convert(holder: BaseViewHolder?, string: String?) {
        holder?.setText(R.id.tv_season, string)
    }

}