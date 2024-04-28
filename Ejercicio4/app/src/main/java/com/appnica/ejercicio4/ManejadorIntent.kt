package com.appnica.ejercicio4

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.widget.EditText

object ManejadorIntent {

    fun callPhoneNumber(activity: Activity, phone: String) {
        val callIntent = Intent(Intent.ACTION_DIAL)
        callIntent.data = Uri.parse("tel:$phone")
        activity.startActivity(callIntent)
    }

}