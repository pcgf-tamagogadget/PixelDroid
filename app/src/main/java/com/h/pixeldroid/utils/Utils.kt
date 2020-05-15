package com.h.pixeldroid.utils

import android.content.Context
import android.net.ConnectivityManager
import androidx.room.Room
import com.h.pixeldroid.db.AppDatabase

class Utils {
    companion object {
        fun hasInternet(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            return cm.activeNetwork != null
        }


    }
}