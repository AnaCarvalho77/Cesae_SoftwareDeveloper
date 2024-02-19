package com.example.worldskillsproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.worldskillsproject.R
import com.example.worldskillsproject.model.Profissao

class ProfissoesListAdapter(val listaProfissoes:ArrayList<Profissao>, val onClickListener: OnClickListener) : RecyclerView.Adapter<ProfissoesListAdapter.ProfissaoViewHolder>() {
    class ProfissaoViewHolder (ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val button : Button = itemView.findViewById(R.id.button_cluster)

    }
    class OnClickListener(val clickListener:(profissao : Profissao) -> Unit){
        fun onClick (profissao : Profissao) = clickListener(profissao)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfissaoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_cluster,parent,false)
        return ProfissaoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaProfissoes.size
    }

    override fun onBindViewHolder(holder: ProfissaoViewHolder, position: Int) {
        val profissao = listaProfissoes[position]
        holder.button.setText(profissao.nome)

        holder.itemView.setOnClickListener{
            onClickListener.onClick(profissao)
        }
    }
}