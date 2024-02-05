package com.example.convencao_ex05

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.convencao_ex05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonVerificar.setOnClickListener{
            var horasInseridas : Int = binding.editHoras.text.toString().toInt()
            var aux = 0
            var horas : Int = 0
            var dias : Int = 0
            var semana : Int = 0

            semana = horasInseridas/168
            dias = (horasInseridas % 168) / 24
            horas = horasInseridas%24

            binding.textSemanas.text = "$semana semanas"
            binding.textDias.text = "$dias dias"
            binding.textHoras.text = "$horas horas"

        }
    }
}