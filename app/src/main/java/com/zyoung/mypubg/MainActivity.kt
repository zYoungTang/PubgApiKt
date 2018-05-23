package com.zyoung.mypubg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.gson.Gson
import com.orhanobut.logger.Logger
import com.zyoung.pubgkt.api.wrapper.Player
import com.zyoung.pubgkt.api.Pubg
import com.zyoung.pubgkt.api.wrapper.Region
import com.zyoung.pubgkt.api.bean.MatchInfo
import com.zyoung.pubgkt.api.tools.L

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var mGson: Gson
    lateinit var pubg: Pubg
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_matches = findViewById<Button>(R.id.btn_matches)
        val btn_player = findViewById<Button>(R.id.btn_player)
        val btn_seasons = findViewById<Button>(R.id.btn_seasons)
        val btn_status = findViewById<Button>(R.id.btn_status)
        btn_matches.setOnClickListener(this)
        btn_player.setOnClickListener(this)
        btn_seasons.setOnClickListener(this)
        btn_status.setOnClickListener(this)

        pubg = Pubg(APP_KEY)
        mGson = Gson()
        Thread(Runnable {
            //            Player()
            val match = pubg.getMatch(Region.PC_AS, "d4d70a4f-a4f2-40cd-886e-e9440486d0b6")
            match.matchInfo.data.relationships.assets
//            seasons()

//            Log.d(TAG, mGson.toJson(pubg.status()))
        }).start()
    }

    override fun onClick(v: View?) {
        Thread(Runnable {
            when (v!!.id) {
                R.id.btn_player -> {
                    player = pubg.player(Region.PC_AS, "zYoungBB", null, null)!!
                    if (player != null) {
                        Logger.json(mGson.toJson(player))
                    } else {
                        L.e("error player = null!!")
                    }
                }

                R.id.btn_matches -> {
                    if (player != null) {
                        val matches = player.matches
                        val list: ArrayList<MatchInfo> = ArrayList()
//                    matches.forEach { match ->
                        var m = matches[0]
                        val match = pubg.getMatch(player.shareId, m.id)
                        var matchInfo = match.matchInfo
                        Logger.json(mGson.toJson(matchInfo))
                        var i: Int = 0
                        matchInfo.included.forEach { it ->
                            if (it.type == "participant") {
                                i++
                                L.e("${it.type} - ${it.name()}")
                            } else {
                                L.e("${it.type}")
                            }
                        }
                        L.d("size： ${matchInfo.included.size}  i:  $i")
                        list.add(matchInfo)
//                    }
                    } else {
                        L.e("player == null ")
                    }
                }

                R.id.btn_seasons -> {

                }

                R.id.btn_status -> {

                }
            }
        }).start()
    }

    private fun seasons() {
        val seasons = pubg.seasons(Region.PC_NA)
        L.d("CurrentSeason:   ${seasons!!.getCurrentSeason()!!.id}")
    }

    private fun Player() {
        val player: Player? = pubg.player(Region.PC_AS, "zYongBB", null, null)
        if (player != null) {
            //                Log.d(com.zyoung.pubgkt.api.TAG, mGson.toJson(player.bean))
//            L.d("Name: ${player.name},Region: ${player.shareId}")
            L.d(mGson.toJson(player))
            player.matches.forEach { it ->
                Log.d(TAG, "MID: ${it.id}")
                val bean = pubg.getMatch(player.shareId, it.id)
                Log.d(TAG, "Json: ${mGson.toJson(bean)}")
            }
//            val list = pubg.getMatch(player.shareId, player.matches)
//            list.forEach {
//                //                Log.d(TAG, "MATCH_JSON: ${it?.data?.attributes?.createdAt}")
//                L.d("MATCH_JSON: ${it?.data?.id}")
//            }
        } else {
            L.e("error player = null!!")
        }
    }
}