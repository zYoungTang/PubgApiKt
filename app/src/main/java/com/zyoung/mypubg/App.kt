package com.zyoung.mypubg

import android.app.Application
import com.google.gson.Gson
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import com.zyoung.pubgkt.api.Pubg

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 18:23
 */
class app : Application() {
    override fun onCreate() {
        super.onCreate()
        val prettyFormatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .tag(TAG)
                .methodCount(0)
                .methodOffset(0)
                .build()
        Logger.addLogAdapter(AndroidLogAdapter(prettyFormatStrategy))
    }

}