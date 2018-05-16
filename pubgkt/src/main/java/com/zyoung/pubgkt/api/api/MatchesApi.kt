package com.zyoung.mypubg.api

import com.zyoung.pubgkt.api.bean.MatchInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 14:08
 */
interface MatchesApi {
    @Headers("Accept: application/vnd.api+json")
    @GET("shards/{region}/matches/{id}")
    fun getMatchInfo(
            @Path("region") region: String,
            @Path("id") id: String,
            @Header("Authorization") key: String): Call<MatchInfo>
}