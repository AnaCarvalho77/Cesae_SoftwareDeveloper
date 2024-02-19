package com.example.worldskillsproject.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldskillsproject.databinding.ActivityRecomendacoesBinding
import com.google.firebase.Firebase
import com.google.firebase.firestore.FirebaseFirestore

class RecomendacoesActivity : AppCompatActivity() {
    class RecomendacoesActivity : AppCompatActivity() {
        private val binding by lazy {
            ActivityRecomendacoesBinding.inflate(layoutInflater)
        }

        // Conteúdo da base de dados
        private val db by lazy {
            FirebaseFirestore.getInstance()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}
}