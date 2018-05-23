package com.zyoung.pubgkt.api

import android.util.Log
import com.zyoung.mypubg.api.MatchesApi
import com.zyoung.pubgkt.api.api.SeasonsApi
import com.zyoung.pubgkt.api.api.StatusApi
import com.zyoung.pubgkt.api.bean.MatchInfo
import com.zyoung.pubgkt.api.bean.PlayerInfo
import com.zyoung.pubgkt.api.wrapper.Match
import com.zyoung.pubgkt.api.wrapper.Player
import com.zyoung.pubgkt.api.wrapper.Seasons
import com.zyoung.pubgkt.api.wrapper.Status
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 14:53
 */
class Pubg {
    var APP_KEY: String

    constructor(app_key: String) {
        APP_KEY = "Bearer $app_key"
    }

    companion object {
        fun getRetrofit(): Retrofit {
            return Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
    }

    fun player(region: String, playerName: String, createTime: String?, id: String?): Player? {
        val retrofit: Retrofit = getRetrofit()
        val api: PlayerInfoApi = retrofit.create<PlayerInfoApi>(PlayerInfoApi::class.java)
        val call = api.getPlayerInfoByName(region, playerName, id, createTime, APP_KEY)
        val response = call.execute()
        if (response.isSuccessful) {
            val bean: PlayerInfo = response.body()!!
            return Player(bean)
        } else return null
    }

    fun getMatch(region: String, id: String): Match {
        val retrofit: Retrofit = getRetrofit()
        val api: MatchesApi = retrofit.create<MatchesApi>(MatchesApi::class.java)
        val call = api.getMatchInfo(region, id, APP_KEY)
        val response = call.execute()
        if (response.isSuccessful) {
            return Match(response!!.body()!!)
        }
        return Match(MatchInfo())
    }

    fun getMatch(region: String, matches: List<PlayerInfo.DataBeanX.RelationshipsBean.MatchesBean.DataBean>): List<MatchInfo?> {
        var list = ArrayList<MatchInfo?>()
        matches.forEach { it ->
            val retrofit: Retrofit = getRetrofit()
            val api: MatchesApi = retrofit.create<MatchesApi>(MatchesApi::class.java)
            val call = api.getMatchInfo(region, it.id, APP_KEY)
            val response = call.execute()
            if (response.isSuccessful) {
                list.add(response.body())
            } else {
                Log.e(TAG, response.errorBody().toString())
            }
        }
        return list
    }

    fun seasons(region: String): Seasons? {
        val retrofit = getRetrofit()
        val api = retrofit.create(SeasonsApi::class.java)
        val call = api.getSeasons(region, APP_KEY)
        val response = call.execute()
        if (response.isSuccessful) {
            return Seasons(response?.body())
        }
        return null
    }

    fun status(): Status? {
        val retrofit = getRetrofit()
        val api = retrofit.create(StatusApi::class.java)
        val call = api.getStatus()
        val response = call.execute()
        if (response.isSuccessful) {
            return Status(response!!.body()!!)
        } else return null
    }
}