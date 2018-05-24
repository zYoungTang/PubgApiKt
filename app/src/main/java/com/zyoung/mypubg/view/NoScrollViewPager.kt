package com.zyoung.mypubg.view

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * Created by zYoung on 2017/12/14.
 */

/**
 * 禁止滑动的 ViewPager
 */
class NoScrollViewPager : ViewPager {
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context) : super(context)

    override fun onInterceptHoverEvent(event: MotionEvent?): Boolean {
//        return super.onInterceptHoverEvent(event)
        return false
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
//        return super.onTouchEvent(ev)
        return false
    }
}
