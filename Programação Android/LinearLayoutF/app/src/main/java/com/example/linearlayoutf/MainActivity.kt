package com.example.linearlayoutf

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayoutf.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        binding.buttonConversorDolar.setOnClickListener{
            var taxaCambio: Double = 1.09
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            //var cambio = String.format("%.2f", euros * taxaCambio).toDouble()
            var cambio = (euros * taxaCambio * 100).roundToInt().toDouble()/100

            /*binding.textCambio.text="$cambio $"*/
            Toast.makeText(applicationContext, "Dólares: $$cambio", Toast.LENGTH_SHORT).show()

        }

        binding.buttonConversorReal.setOnClickListener{
            var taxaCambio: Double = 5.41
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            //var cambio = String.format("%.2f", euros * taxaCambio).toDouble()
            var cambio = (euros * taxaCambio * 100).roundToInt().toDouble()/100

            /*binding.textCambio.text="$cambio Reais"*/
            Toast.makeText(applicationContext, "Reais: R$$cambio", Toast.LENGTH_SHORT).show()

        }

        binding.buttonConversorPeso.setOnClickListener{
            var taxaCambio: Double = 18.77
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            //var cambio = String.format("%.2f", euros * taxaCambio).toDouble()
            var cambio = (euros * taxaCambio * 100).roundToInt().toDouble()/100

            /*binding.textCambio.text="$cambio Pesos Mexicanos"*/
           Toast.makeText(applicationContext, "Pesos: $$cambio ", Toast.LENGTH_SHORT).show()

        }


    }
}