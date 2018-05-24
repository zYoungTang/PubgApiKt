package com.zyoung.pubgkt.api

import android.util.Log
import com.zyoung.mypubg.api.MatchesApi
import com.zyoung.pubgkt.api.api.SeasonsApi
import com.zyoung.pubgkt.api.api.StatusApi
import com.zyoung.pubgkt.api.bean.MatchInfo
import com.zyoung.pubgkt.api.bean.PlayerInfo
import com.zyoung.pubgkt.api.bean.PlayerSeasonInfo
import com.zyoung.pubgkt.api.wrapper.*
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


    fun player(region: String, playerName: String): Player? {
        return player(region, playerName, null, null)
    }

    fun player(region: String, playerName: String, createTime: String?, id: String?): Player? {
        val retrofit: Retrofit = getRetrofit()
        val api: PlayerInfoApi = retrofit.create<PlayerInfoApi>(PlayerInfoApi::class.java)
        val call = api.getPlayerInfo(region, playerName, id, createTime, APP_KEY)
        val response = call.execute()
        return if (response.isSuccessful) {
            val bean: PlayerInfo = response.body()!!
            Player(bean)
        } else null
    }

    fun playerSeason(region: String, player_id: String, season_id: String): PlayerSeason? {
        val retrofit: Retrofit = getRetrofit()
        val api: PlayerInfoApi = retrofit.create<PlayerInfoApi>(PlayerInfoApi::class.java)
        val call = api.getPlayerSeasonInfo(region, player_id, season_id, APP_KEY)
        val response = call.execute()
        return if (response.isSuccessful) {
            val bean: PlayerSeasonInfo = response.body()!!
            PlayerSeason(bean)
        } else null
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
        if (response.isSuccessful && response!!.body() != null) {
            return Seasons(response.body()!!)
        }
        return null
    }

    fun status(): Status? {
        val retrofit = getRetrofit()
        val api = retrofit.create(StatusApi::class.java)
        val call = api.getStatus()
        val response = call.execute()
        return if (response.isSuccessful) {
            Status(response!!.body()!!)
        } else null
    }
}