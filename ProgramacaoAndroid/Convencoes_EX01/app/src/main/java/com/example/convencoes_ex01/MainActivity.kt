package com.example.convencoes_ex01

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.convencoes_ex01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonClicked.setOnClickListener{
            Toast.makeText(applicationContext, "Botão Clicado", Toast.LENGTH_SHORT).show()
        }

        binding.buttonConnection.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            //ou
            //startActivity(Intent(this,MainActivity2::class.java))
        }



    }
}