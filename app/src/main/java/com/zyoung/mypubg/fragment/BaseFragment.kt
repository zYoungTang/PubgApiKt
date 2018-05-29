package com.zyoung.mypubg.fragment

import android.content.Context
import android.support.v4.app.Fragment
import com.google.gson.Gson
import com.zyoung.mypubg.APP_KEY
import com.zyoung.pubgkt.api.Pubg

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/24 18:12
 */
open class BaseFragment : Fragment() {
    lateinit var mContext: Context
    lateinit var mGson: Gson
    lateinit var mPubg: Pubg

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context != null) {
            mContext = context!!
            mGson = Gson()
            mPubg = Pubg(APP_KEY)
        }

    }

}