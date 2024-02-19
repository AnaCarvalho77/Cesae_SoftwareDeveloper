package com.example.worldskillsproject.views

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.worldskillsproject.databinding.ActivityHomeBinding
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {

    private val binding by lazy{ ActivityHomeBinding.inflate(layoutInflater)}
    private val auth by lazy{ FirebaseAuth.getInstance()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)





        binding.buttonSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        binding.buttonProfissoes.setOnClickListener{
            startActivity(Intent(this,ClusterActivity::class.java))
        }










        }

    override fun onResume() {
        super.onResume()

        val currentUser = auth.currentUser
        Log.d("HomeActivity", "currentUser: $currentUser")

        if(currentUser == null){
            binding.buttonMessages.visibility = View.INVISIBLE
            binding.buttonBadges.visibility = View.INVISIBLE
            binding.buttonLoginPerfil.setOnClickListener{
                startActivity(Intent(this, LoginActivity::class.java))
            }
            binding.imageRecomendacoes.visibility = View.GONE
            binding.buttonRecomendacoes.visibility = View.GONE
        }else{
            binding.buttonMessages.visibility = View.VISIBLE
            binding.buttonMessages.setOnClickListener {
                startActivity(Intent(this, MessageActivity::class.java))
            }
            binding.buttonBadges.visibility = View.VISIBLE
            binding.buttonBadges.setOnClickListener{
                startActivity(Intent(this, BadgesActivity::class.java))
            }

            binding.buttonLoginPerfil.setOnClickListener{
                startActivity(Intent(this, UtilizadorActivity::class.java))
            }

            binding.imageRecomendacoes.visibility = View.VISIBLE
            binding.buttonRecomendacoes.visibility = View.VISIBLE

        }

        binding.buttonMenuGeral.visibility = View.INVISIBLE
    }
    }