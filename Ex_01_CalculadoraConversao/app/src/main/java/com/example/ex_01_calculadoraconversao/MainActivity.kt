package com.example.ex_01_calculadoraconversao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex_01_calculadoraconversao.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonConverter.setOnClickListener{
            var taxaCambio: Double = 1.09
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            //var cambio = String.format("%.2f", euros * taxaCambio).toDouble()
            var cambio = (euros * taxaCambio * 100).roundToInt().toDouble()/100

            binding.textResultado.text="$cambio $"

        }


    }

}