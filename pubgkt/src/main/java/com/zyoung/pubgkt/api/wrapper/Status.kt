package com.zyoung.pubgkt.api.wrapper

import com.zyoung.pubgkt.api.bean.StatusInfo

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/17 10:41
 */
class Status {
    var bean: StatusInfo
    var type: String
    var id: String
    var version: String
    var releasedAt: String

    constructor(status: StatusInfo) {
        bean = status
        type = bean.data.type
        id = bean.data.id
        version = bean.data.attributes.version
        releasedAt = bean.data.attributes.releasedAt
    }
}