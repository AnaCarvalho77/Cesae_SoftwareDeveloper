package com.example.worldskillsproject.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worldskillsproject.databinding.ActivityUtilizadorBinding
import com.google.firebase.auth.FirebaseAuth

class UtilizadorActivity : AppCompatActivity() {
    private val binding by lazy{ ActivityUtilizadorBinding.inflate(layoutInflater)}
    val auth by lazy {FirebaseAuth.getInstance()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMenuGeral.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        binding.buttonLogout.setOnClickListener{
            auth.signOut()
            finish()
        }
    }
}