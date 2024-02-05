package com.example.primeiraapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

 /*   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{
            var nome: String = binding.editNome.text.toString()
            binding.textResultado.text = "Olá $nome"
        }*/


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.buttonOla.setOnClickListener{
                var primeirNome: String = binding.editPrimeiroNome.text.toString()
                var ultimoNome: String = binding.editUltimoNome.text.toString()

             /*   if(primeirNome.isEmpty() || ultimoNome.isEmpty()){
                    binding.textResultado.text = "Não foi inserido nome ou apelido"
                } else{
                    binding.textResultado.text = "Olá $primeirNome $ultimoNome"
                }*/ //exercicio 1

                if(primeirNome.isEmpty() && ultimoNome.isEmpty()){
                    Toast.makeText(applicationContext,"Não foi inserido nenhum nome", Toast.LENGTH_SHORT).show()
                }else if(primeirNome.isEmpty()){
                    Toast.makeText(applicationContext,"Não foi inserido o primeiro nome", Toast.LENGTH_SHORT).show()
                } else if(ultimoNome.isEmpty()){
                    Toast.makeText(applicationContext,"Não foi inserido o último nome", Toast.LENGTH_SHORT).show()
                }else{
                    if(primeirNome.equals("Sofia", ignoreCase = true) && ultimoNome.equals("Carvalho", ignoreCase = true)){
                        Toast.makeText(applicationContext,"Hello BOSS", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(applicationContext,"Olá $primeirNome $ultimoNome", Toast.LENGTH_SHORT).show()
                    }

                }

            }
    }
}