package com.zyoung.mypubg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.zyoung.pubgkt.api.Player
import com.zyoung.pubgkt.api.Pubg

class MainActivity : AppCompatActivity() {
    lateinit var mGson: Gson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pubg = Pubg(APP_KEY)
        mGson = Gson()
        Thread(Runnable {
            //            val player: Player? = pubg.player(com.zyoung.pubgkt.api.Region.PC_AS, "xTongBB")
            val player: Player? = pubg.player(com.zyoung.pubgkt.api.Region.PC_NA, "shroud", "account.d50fdc18fcad49c691d38466bed6f8fd")
            if (player != null) {
//                Log.d(com.zyoung.pubgkt.api.TAG, mGson.toJson(player.bean))
                Log.d(com.zyoung.pubgkt.api.TAG, "Name: ${player.name()},Region: ${player.shareId()}")
//                player.matches().forEach { it ->
//                    Log.d(TAG, "MID: ${it.id}")
//                    val bean = pubg.getMatch(player.shareId(), it.id)
//                    Log.d(TAG, "Json: ${mGson.toJson(bean)}")
//                }
                val list = pubg.getMatch(player.shareId(), player.matches())
                list.forEach {
                    Log.d(TAG, "MATCH_JSON: ${it?.data?.attributes?.createdAt}")
                }
            } else {

            }
        }).start()
    }
}