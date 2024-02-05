package com.example.a06_intent_ex01

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a06_intent_ex01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var genero: String = ""


    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.buttonOk.setOnClickListener{
            val nome = binding.editNome.text.toString()
            val morada = binding.editMorada.text.toString()
            val telefone = binding.editTelefone.text.toString()
            val email = binding.editEmail.text.toString()
            val radioGroup = binding.radioGroup

            val selectedRadioButtonId = radioGroup.checkedRadioButtonId

            if (selectedRadioButtonId != -1) {
                val radioButton = findViewById<RadioButton>(selectedRadioButtonId)
                val genero = radioButton.text.toString()

                // Agora, você pode usar a variável 'genero' conforme necessário

                val i: Intent = Intent(this, MainActivity2::class.java)
                i.putExtra("nome", nome)
                i.putExtra("morada", morada)
                i.putExtra("telefone", telefone)
                i.putExtra("email", email)
                i.putExtra("genero", genero)

                startActivity(i)
            } else {
                // Nenhum RadioButton selecionado, exiba uma mensagem ou ação apropriada
                Toast.makeText(this, "Selecione uma opção de gênero", Toast.LENGTH_SHORT).show()
            }

        }
    }
}