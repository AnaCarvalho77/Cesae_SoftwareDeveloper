package com.example.convencoes_ex01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.convencoes_ex01.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}