package com.appnica.ejercicio5

import android.app.Activity
import android.content.Intent
import android.net.Uri

object ManejadorIntent {

    fun navigateToUrl(activity: Activity, url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        activity.startActivity(intent)
    }
}