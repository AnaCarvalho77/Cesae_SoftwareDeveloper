package com.example.a06_intent_ex02

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intent_ex02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.editNumero1.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                val numero1Text = binding.editNumero1.text.toString()

                if (numero1Text.isNotEmpty()) {
                    val numero1 = numero1Text.toDouble()
                    val i: Intent = Intent(this, MainActivity2::class.java)
                    i.putExtra("numero1", numero1)
                    startActivity(i)
                } else {
                    Toast.makeText(this, "Não colocou o primeiro número", Toast.LENGTH_SHORT).show()
                }

                return@setOnKeyListener true
            }
            false
        }
    }



    }
