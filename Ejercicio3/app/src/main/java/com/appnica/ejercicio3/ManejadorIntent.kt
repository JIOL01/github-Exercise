package com.appnica.ejercicio3

import android.app.Activity
import android.content.Intent

object ManejadorIntent {

    fun share(activity: Activity, linkShare: String, titleShare: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_SUBJECT, titleShare)
        intent.putExtra(Intent.EXTRA_TEXT, linkShare)
        activity.startActivity(Intent.createChooser(intent, "Compartir"))
    }
}