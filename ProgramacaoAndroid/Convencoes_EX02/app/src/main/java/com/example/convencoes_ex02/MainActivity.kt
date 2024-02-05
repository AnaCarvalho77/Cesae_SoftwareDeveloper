package com.example.convencoes_ex02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.convencoes_ex02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonLogin.setOnClickListener{
            val user = "user"
            val pass = "pass"
            var username: String = binding.editUsername.text.toString()
            var password: String = binding.editPassword.text.toString()
            var limparUsername = binding.editUsername.text.clear()
            var limparPassword = binding.editPassword.text.clear()



            if(username.equals(user) && password.equals(pass)){
                startActivity(Intent(this,LoginOKActivity::class.java))
                limparUsername
                limparPassword
            }else{
                startActivity(Intent(this,LoginErradoActivity::class.java))
                limparUsername
                limparPassword
            }
        }

    }
}