package com.zyoung.pubgkt.api.wrapper

import com.zyoung.pubgkt.api.bean.SeasonsInfo

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/16 18:28
 */
class Seasons {
    var bean: SeasonsInfo?

    constructor(seasonsInfo: SeasonsInfo?) {
        bean = seasonsInfo
    }

    /**
     * return current season
     */
    fun getCurrentSeason(): SeasonsInfo.DataBean? {
        if (bean != null) {
            for (b in bean!!.data) {
                if (b.attributes.isIsCurrentSeason == true) {
                    return b
                }
            }
        }
        return null
    }

    /**
     * return the count of seasons
     */
    fun count(): Int? {
        return bean?.data?.size
    }
}