package com.zyoung.pubgkt.api
import com.zyoung.pubgkt.api.bean.MatchInfo
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 14:08
 */
interface MatchesInfo {
    @GET("matches/{id}")
    fun getMatchInfo(@Path("id") id: String): MatchInfo
}