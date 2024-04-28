package com.appnica.ejercicio1

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.ejercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.BtnMensaje.setOnClickListener{

            val txtMen = findViewById<TextView>(R.id.txtNombre)
            val editMen = findViewById<EditText>(R.id.edtMensaje)

            if (editMen.text.isEmpty()){
                Toast.makeText(this, "Ingrese un texto", Toast.LENGTH_SHORT).show()
            }else
                ManejadorIntent.mensajeDinamico(txtMen, "${editMen.text}")
        }
    }
}