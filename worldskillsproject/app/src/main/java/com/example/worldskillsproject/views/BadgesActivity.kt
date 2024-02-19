package com.example.worldskillsproject.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worldskillsproject.databinding.ActivityBadgesBinding

class BadgesActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityBadgesBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMenuGeral.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }



    }
}