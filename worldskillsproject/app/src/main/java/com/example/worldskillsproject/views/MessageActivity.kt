package com.example.worldskillsproject.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worldskillsproject.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityMessageBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}