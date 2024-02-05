package com.example.a06_intent_ex02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intent_ex02.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val i = intent

        val numero1 = i.extras?.getDouble("numero1",0.0)?:0.0
        val numero2 = i.extras?.getDouble("numero2",0.0)?:0.0

        val soma = numero1 + numero2
        val subtracao = numero1 - numero2
        val multiplicacao = numero1 * numero2
        val divisao = numero1 / numero2

        binding.textViewSomaResultado.text = "${soma}"
        binding.textViewSubtracaoResultado.text = "${subtracao}"
        binding.textViewMultiplicacaoResultado.text = "${multiplicacao}"
        binding.textViewDivisaoResultado.text = "${divisao}"

    }
}