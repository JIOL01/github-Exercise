package com.appnica.ejercicio1

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.widget.EditText
import android.widget.TextView

object ManejadorIntent {

    fun mensajeDinamico(textView: TextView, nuevo: String){
        textView.text = nuevo
    }
}