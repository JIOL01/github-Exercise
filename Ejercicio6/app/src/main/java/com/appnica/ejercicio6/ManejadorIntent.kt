package com.appnica.ejercicio6

import android.app.Activity
import android.content.Intent
import android.net.Uri

object ManejadorIntent {

    fun sendEmail(activity: Activity, address: String, subject: String = "", body: String = "") {
        val emailIntent = Intent(Intent.ACTION_SENDTO)
        emailIntent.data = Uri.parse("mailto:$address")
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        emailIntent.putExtra(Intent.EXTRA_TEXT, body)
        activity.startActivity(Intent.createChooser(emailIntent, "Enviar correo"))
    }

}