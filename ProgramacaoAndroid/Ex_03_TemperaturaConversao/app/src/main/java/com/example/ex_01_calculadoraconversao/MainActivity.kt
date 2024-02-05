package com.example.ex_03_temperaturaraconversao

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
            var celsius: Double = binding.editCelsius.text.toString().toDouble()
            //var fahrenheit = String.format("%.2f", celsius * 1.8 + 32).toDouble()
            var fahrenheit = ((celsius * 1.8 + 32)*100).roundToInt().toDouble()/100

            binding.textResultado.text="$fahrenheit"

        }


    }

}