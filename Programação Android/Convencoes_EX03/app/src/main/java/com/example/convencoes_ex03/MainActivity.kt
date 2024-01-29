package com.example.convencoes_ex03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.convencoes_ex03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


//  o que percebi nos slides é que era para colocar este código aqui tb mas além de não me estar a fazer sentido
    // a página fica sempre a atualizar no tempo definido, porque está sempre a entrar no mainactivity
//        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this,MainActivity::class.java))
//            finish()
//        },3000)
   }
}