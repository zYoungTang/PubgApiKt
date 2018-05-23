package com.zyoung.pubgkt.api.tools;

import android.util.Log;

import static com.zyoung.pubgkt.api.ConstKt.DEBUG;
import static com.zyoung.pubgkt.api.ConstKt.TAG;

/**
 * Description :
 * <p>
 * Author : zYoung
 * <p>
 * Date :  2018/4/27 10:09
 */
public class L {
    //    public static String str = " - " + Thread.currentThread().getName();
    public static String str = "";

    public static void i(String msg) {
        i(TAG, msg);
//        Logger.i(msg);
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(tag, msg + str);
        }
    }

    public static void e(String msg) {
        e(TAG, msg);
//        Logger.e(msg);
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            Log.e(tag, msg + str);
        }
    }

    public static void d(String msg) {
        d(TAG, msg);
//        Logger.d(msg);
    }

    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.d(tag, msg + str);
        }
    }

    public static void w(String msg) {
        w(TAG, msg);
//        Logger.w(msg);
    }

    public static void w(String tag, String msg) {
        if (DEBUG) {
            Log.e(tag, msg + str);
        }
    }

    public static void v(String msg) {
        v(TAG, msg);
//        Logger.v(msg);
    }

    public static void v(String tag, String msg) {
        if (DEBUG) {
            Log.v(tag, msg + str);
        }
    }
}
