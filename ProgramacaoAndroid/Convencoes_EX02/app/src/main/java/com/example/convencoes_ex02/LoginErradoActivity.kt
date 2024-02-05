package com.example.convencoes_ex02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.convencoes_ex02.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityLoginErradoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Toast.makeText(applicationContext, "LoginInválido", Toast.LENGTH_SHORT).show()

        binding.buttonBack.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}