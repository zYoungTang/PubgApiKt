package com.zyoung.pubgkt.api

import com.zyoung.pubgkt.api.bean.PlayerInfo
import com.zyoung.pubgkt.api.bean.PlayerSeasonInfo
import retrofit2.Call
import retrofit2.http.*

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 11:31
 */
interface PlayerInfoApi {
    @Headers("Accept: application/vnd.api+json")
    @GET("shards/{region}/players")
    fun getPlayerInfo(
            @Path("region") region: String,
            @Query("filter[playerNames]") name: String?,
            @Query("filter[playerIds]") id: String?,
            @Query("filter[createdAt-start]") create_time: String?,
            @Header("Authorization") key: String
    ): Call<PlayerInfo>

    @Headers("Accept: application/vnd.api+json")
    @GET("shards/{region}/players/{playerID}/seasons/{seasonID}")
    fun getPlayerSeasonInfo(
            @Path("region") region: String,
            @Path("playerID") playerId: String,
            @Path("seasonID") seasonId: String,
            @Header("Authorization") key: String
    ): Call<PlayerSeasonInfo>
}