package com.example.worldskillsproject.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldskillsproject.adapter.ProfissoesListAdapter
import com.example.worldskillsproject.databinding.ActivityProfissoesBinding
import com.example.worldskillsproject.model.Profissao
import com.google.firebase.firestore.FirebaseFirestore

class ProfissoesActivity : AppCompatActivity() {
    private val binding by lazy{ ActivityProfissoesBinding.inflate(layoutInflater)}
    private val db by lazy { FirebaseFirestore.getInstance() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val intent = intent

        val clusterId = intent.extras?.getString("clusterId")


        val listaProfissoes = ArrayList<Profissao>()

        db.collection("Profissao").whereEqualTo("ID_cluster",clusterId).get()
            .addOnSuccessListener {
                for (doc in it.documents) {
                    val nome = doc.get("Nome").toString()
                    val id = doc.get("ID_profissao").toString().toInt()
                    val descricao = doc.get("Descricao").toString()
                    val link = doc.get("Link").toString()
                    listaProfissoes.add(Profissao(id, nome, descricao, link))

                }
                binding.recyclerProfissoes.layoutManager = LinearLayoutManager(this)
                binding.recyclerProfissoes.adapter = ProfissoesListAdapter(listaProfissoes, ProfissoesListAdapter.OnClickListener{ profissao ->
                    val idProfissao = profissao.id
                    val descricaoProfissao = profissao.desccricao
                    val nomeProfissao = profissao.nome
                    val linkProfissao = profissao.link

                    val intent = Intent(this,ProfissaoActivity::class.java)
                    intent.putExtra("idProfissao", idProfissao)
                    intent.putExtra("nomeProfissao", nomeProfissao)
                    intent.putExtra("descricaoProfissao", descricaoProfissao)
                    intent.putExtra("linkProfissao", linkProfissao)
                    startActivity(intent)

                } )

            }


    }
}