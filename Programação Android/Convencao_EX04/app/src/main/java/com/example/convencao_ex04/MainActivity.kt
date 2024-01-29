package com.example.convencao_ex04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.convencao_ex04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    binding.buttonVerificar.setOnClickListener{
        var numero : Int = binding.editNumber.text.toString().toInt()
        var aux : Int = 2
        var cont:Int = 0
        if(numero % 2 == 0){
            binding.textParImpar.text = "Número Par"

        }else{
            binding.textParImpar.text = "Número Impar"

        }

        while(aux < numero){
            if(numero % aux == 0) {
                cont++
            }
            aux++
        }
        if(cont > 0){
            binding.textPrimo.text = "Número Não Primo"
        }else{
            binding.textPrimo.text = "Número Primo"
        }

    }


    }
}