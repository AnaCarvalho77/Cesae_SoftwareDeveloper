package com.example.linearlayout_ex04

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayout_ex04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonEntrar.setOnClickListener{
            val user = "user"
            val pass = "pass"
            var username: String = binding.editUsername.text.toString()
            var password: String = binding.editPassword.text.toString()
            var limparUsername = binding.editUsername.text.clear()
            var limparPassword = binding.editPassword.text.clear()



            if(username.equals(user) && password.equals(pass)){
                Toast.makeText(applicationContext, "Login Válido", Toast.LENGTH_SHORT).show()
                limparUsername
                limparPassword
            }else{
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
                limparUsername
                limparPassword
            }

        }



    }
}