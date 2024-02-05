package com.example.a06_intent_ex02

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intent_ex02.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.editNumero2.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                val numero2Text = binding.editNumero2.text.toString()

                if (numero2Text.isNotEmpty()) {

                    val numero1 = intent.extras?.getDouble("numero1",0.0)?:0.0

                    val numero2 = numero2Text.toDouble()
                    val i: Intent = Intent(this, MainActivity3::class.java)
                    i.putExtra("numero2", numero2)
                    i.putExtra("numero1",numero1)
                    startActivity(i)
                } else {
                    Toast.makeText(this, "Não colocou o segundo número", Toast.LENGTH_SHORT).show()
                }

                return@setOnKeyListener true
            }
            false
        }
    }




    }
