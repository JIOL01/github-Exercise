package com.appnica.ejercicio4

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.ejercicio4.databinding.ActivityMainBinding

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

        binding.btnLlamar.setOnClickListener{

            val phoneNum: EditText = findViewById(R.id.edtLlamar)

            if (phoneNum.text.isEmpty() || phoneNum.text.length < 8){

                Toast.makeText(this, "Ingrese un número de teléfono valido", Toast.LENGTH_SHORT).show()

            }else{
                ManejadorIntent.callPhoneNumber(this, "${phoneNum.text}")
            }
        }
    }
}