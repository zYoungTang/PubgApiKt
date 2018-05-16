package com.zyoung.pubgkt.api.api

import com.zyoung.pubgkt.api.bean.SeasonsInfo
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
 * Date :  2018/5/16 18:16
 */
interface SeasonsApi {
    @Headers("Accept: application/vnd.api+json")
    @GET("shards/{region}/seasons")
    fun getSeasons(@Path("region") region: String,
                   @Header("Authorization") key: String
    ): Call<SeasonsInfo>
}