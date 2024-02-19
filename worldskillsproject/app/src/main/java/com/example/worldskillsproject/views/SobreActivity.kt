package com.example.worldskillsproject.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldskillsproject.R
import com.example.worldskillsproject.databinding.ActivitySobreBinding

class SobreActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySobreBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)
    }
}