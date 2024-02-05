package com.example.a14_sqlite

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.a14_sqlite.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val db = DBHelper(this)


        var listaUtilizadores = db.utilizadorListSelectAll()

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, listaUtilizadores)
        binding.listViewUtilizadores.adapter = arrayAdapter
    }
}