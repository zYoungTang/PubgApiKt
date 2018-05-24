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
import com.zyoung.pubgkt.api.Pubg
import kotlinx.android.synthetic.main.fragment_version.*

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/24 18:12
 */
class VersionFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_version, container, false)

        Thread(Runnable {
            var mPubg = Pubg(APP_KEY)
            var gson = Gson()
            val status = mPubg.status()
            Logger.json(gson.toJson(status))
            tv_gameInfo.post({
                tv_gameInfo.text = status!!.version
            })
        }).start()



        return view
    }
}