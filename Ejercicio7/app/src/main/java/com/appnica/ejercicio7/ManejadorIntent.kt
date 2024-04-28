package com.appnica.ejercicio7

import android.app.Activity
import android.content.Intent
import android.provider.Settings

object ManejadorIntent {

    fun ConfigTelf(activity: Activity) {
        val intent = Intent(Settings.ACTION_SETTINGS)
        activity.startActivity(intent)
    }
}