package gita.uz.productapp.utils

import android.util.Log
import androidx.viewbinding.BuildConfig


fun myLog(message: String, tag: String = "TTT") {
    if (BuildConfig.DEBUG) {
        Log.d(tag, message)
    }
}