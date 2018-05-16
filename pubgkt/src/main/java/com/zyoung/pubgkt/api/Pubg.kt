package com.zyoung.pubgkt.api

import android.util.Log
import com.google.gson.Gson
import com.zyoung.mypubg.api.MatchesApi
import com.zyoung.pubgkt.api.bean.MatchInfo
import com.zyoung.pubgkt.api.bean.PlayerInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
        return player(region, playerName, null)
    }

    fun player(region: String, playerName: String, id: String?): Player? {
        var mGson: Gson = Gson()
        val retrofit: Retrofit = getRetrofit()
        val api: PlayerInfoApi = retrofit.create<PlayerInfoApi>(PlayerInfoApi::class.java)
        val call = api.getPlayerInfoByName(region, playerName, id, APP_KEY)
        val response = call.execute()
        if (response.isSuccessful) {
            val bean: PlayerInfo = response.body()!!
            return Player(bean)
        } else return null
    }

    fun getMatch(region: String, id: String): MatchInfo? {
        var mGson: Gson = Gson()
        val retrofit: Retrofit = getRetrofit()
        val api: MatchesApi = retrofit.create<MatchesApi>(MatchesApi::class.java)
        val call = api.getMatchInfo(region, id, APP_KEY)
        val response = call.execute()
        if (response.isSuccessful) {
            return response.body()
        }
        return null
    }

    fun getMatch(region: String, matches: List<PlayerInfo.DataBeanX.RelationshipsBean.MatchesBean.DataBean>): List<MatchInfo?> {
        var list = ArrayList<MatchInfo?>()
        matches.forEach { it ->
            var mGson: Gson = Gson()
            val retrofit: Retrofit = getRetrofit()
            val api: MatchesApi = retrofit.create<MatchesApi>(MatchesApi::class.java)
            val call = api.getMatchInfo(region, it.id, APP_KEY)
            val response = call.execute()
            if (response.isSuccessful) {
                list.add(response.body())
            }
        }
        return list
    }
}