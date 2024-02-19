package com.example.worldskillsproject.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldskillsproject.R
import com.example.worldskillsproject.databinding.ActivityContactosBinding

class ContactosActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityContactosBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)
    }
}