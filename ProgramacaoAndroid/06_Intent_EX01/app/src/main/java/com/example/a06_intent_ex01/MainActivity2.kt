package com.example.a06_intent_ex01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intent_ex01.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")
        val morada = i.extras?.getString("morada")
        val telefone = i.extras?.getString("telefone")
        val email = i.extras?.getString("email")
        val genero = i.extras?.getString("genero")

        binding.textWelcome.text = "${nome} do género ${genero}, mora em ${morada}, o contacto é o ${telefone} e o email é ${email}"
    }
}