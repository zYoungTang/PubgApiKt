package com.zyoung.pubgkt.api

import com.zyoung.pubgkt.api.bean.PlayerInfo
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
    fun getPlayerInfoByName(
            @Path("region") region: String,
            @Query("filter[playerNames]") name: String?,
            @Query("filter[playerIds]") id: String?,
            @Query("filter[createdAt-start]") create_time: String?,
            @Header("Authorization") key: String
    ): Call<PlayerInfo>
}