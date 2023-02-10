package gita.uz.productapp.utils

import android.util.Log
import com.mocklets.pluto.BuildConfig


fun myLog(message: String, tag: String = "TTT") {
    if (BuildConfig.DEBUG) {
        Log.d(tag, message)
    }
}