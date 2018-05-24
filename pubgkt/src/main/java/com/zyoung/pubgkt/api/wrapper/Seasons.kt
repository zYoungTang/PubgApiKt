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
    var bean: SeasonsInfo
    var seasons: List<SeasonsInfo.DataBean>

    constructor(seasonsInfo: SeasonsInfo) {
        bean = seasonsInfo
        seasons = bean.data
    }

    /**
     * return current season
     */
    fun getCurrentSeason(): SeasonsInfo.DataBean? {
        for (season in seasons) {
            if (season.attributes.isIsCurrentSeason) {
                return season
            }
        }
        return null
    }

    /**
     * return the count of seasons
     */
    fun count(): Int {
        return seasons.size
    }
}