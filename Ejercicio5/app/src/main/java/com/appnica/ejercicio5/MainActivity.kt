package com.appnica.ejercicio5

import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.appnica.ejercicio5.databinding.ActivityMainBinding

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

        binding.BtnLink.setOnClickListener{

            val urlEdit: EditText = findViewById(R.id.edtUrl)

            if (urlEdit.text.toString().isEmpty()){
                ManejadorIntent.navigateToUrl(this, "https://www.google.com")
            }else{
                ManejadorIntent.navigateToUrl(this, "${urlEdit.text}")
            }

        }
    }
}