package com.example.worldskillsproject.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldskillsproject.adapter.ClusterListAdapter
import com.example.worldskillsproject.databinding.ActivityClusterBinding
import com.example.worldskillsproject.model.Cluster
import com.google.firebase.firestore.FirebaseFirestore

class ClusterActivity : AppCompatActivity() {

    private val binding by lazy { ActivityClusterBinding.inflate(layoutInflater) }
    private val db by lazy { FirebaseFirestore.getInstance() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaCluster = ArrayList<Cluster>()

        db.collection("Cluster").get()
            .addOnSuccessListener {
                for (doc in it.documents) {
                    val nome = doc.get("Nome").toString()
                    val id = doc.get("ID_cluster").toString().toInt()
                    listaCluster.add(Cluster(id, nome))

                }
                          binding.recyclerCluster.layoutManager = LinearLayoutManager(this)
                          binding.recyclerCluster.adapter = ClusterListAdapter(listaCluster, ClusterListAdapter.OnClickListener{ cluster ->
                              val clusterId = cluster.id
                              val intent = Intent(this,ProfissoesActivity::class.java)
                              intent.putExtra("clusterId", clusterId)
                              startActivity(intent)

                          } )

                     }
                                               

    }
}