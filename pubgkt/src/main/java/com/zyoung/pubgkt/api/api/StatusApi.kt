package com.zyoung.pubgkt.api.api

import com.zyoung.pubgkt.api.bean.StatusInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/17 10:33
 */
interface StatusApi {
    @Headers("Accept: application/vnd.api+json")
    @GET("status")
    fun getStatus(): Call<StatusInfo>
}