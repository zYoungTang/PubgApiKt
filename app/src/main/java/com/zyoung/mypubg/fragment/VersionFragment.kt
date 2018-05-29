package com.zyoung.mypubg.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.orhanobut.logger.Logger
import com.zyoung.mypubg.APP_KEY
import com.zyoung.mypubg.R
import com.zyoung.mypubg.R.id.*
import com.zyoung.pubgkt.api.Pubg
import kotlinx.android.synthetic.main.fragment_version.*

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/24 18:12
 */
class VersionFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_version, container, false)
        Thread(Runnable {
            val status = mPubg.status()
            Logger.json(mGson.toJson(status))
            activity?.runOnUiThread({
                tv_loading.visibility = View.GONE
                ll.visibility = View.VISIBLE
                tv_version.text = status!!.version
                tv_release_date.text = status!!.releasedAt
            })
        }).start()
        return view
    }
}