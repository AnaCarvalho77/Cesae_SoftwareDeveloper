package com.example.worldskillsproject.views

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.worldskillsproject.databinding.ActivityHomeBinding
import com.example.worldskillsproject.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityLoginBinding.inflate(layoutInflater)}
    private val auth by lazy{ FirebaseAuth.getInstance()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonMenuGeral.setOnClickListener {
            startActivity(Intent(this, ActivityHomeBinding::class.java))
        }

        binding.buttonLogin.setOnClickListener{
            val email = binding.editEmail.text.toString()
            val password = binding.editPassword.text.toString()

            if(email.isEmpty() && password.isEmpty()){
                Toast.makeText(this, "Digite o email e a palavra-passe", Toast.LENGTH_SHORT).show()
            }else if(email.isEmpty()){
                Toast.makeText(this, "Digite o email", Toast.LENGTH_SHORT).show()
            }else if(password.isEmpty()){
                Toast.makeText(this,  "Digite a palavra-passe", Toast.LENGTH_SHORT).show()
            }else{
                auth.signInWithEmailAndPassword(email,password)
                    .addOnSuccessListener {
                        if(auth.currentUser?.isEmailVerified == true){
                            Toast.makeText(this,"Login OK", Toast.LENGTH_SHORT).show()
                            finish()
                        }else{
                            Toast.makeText(this, "Login Incorreto", Toast.LENGTH_SHORT).show()
                        }
                    }
                    .addOnFailureListener{
                        Toast.makeText(this, "Erro Login: ${it.message}", Toast.LENGTH_SHORT).show()
                    }

            }



        }

        binding.textRecuperar.setOnClickListener{
            startActivity(Intent(this, RecuperarPassActivity::class.java))

        }


    }


}