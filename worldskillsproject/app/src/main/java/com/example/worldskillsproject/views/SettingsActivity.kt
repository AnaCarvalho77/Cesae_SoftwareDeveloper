package com.example.worldskillsproject.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worldskillsproject.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private val binding by lazy{ ActivitySettingsBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        binding.buttonMenuGeral.setOnClickListener {
//            startActivity(Intent(this, HomeActivity::class.java))
//        }
    }
}