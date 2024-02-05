package com.example.a15_mvvm_menulogin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.a15_mvvm_menulogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.login().observe(this,{
            if(it){
                Toast.makeText(this,"Login OK", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"login Errado", Toast.LENGTH_SHORT).show()
            }
        })

        binding.buttonEnviarLogin.setOnClickListener{
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            viewModel.doLogin(email,password)
        }


    }
}