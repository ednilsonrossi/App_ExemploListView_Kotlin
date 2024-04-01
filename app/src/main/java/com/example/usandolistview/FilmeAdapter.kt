package com.example.usandolistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class FilmeAdapter(context: Context, datasource: List<Filme>):
    ArrayAdapter<Filme>(context, R.layout.filme_list_item, datasource) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView

        if(itemView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                    as LayoutInflater

            itemView = inflater.inflate(R.layout.filme_list_item, null)
        }

        val filme: Filme? = getItem(position)

        if(itemView != null && filme != null){
            itemView.findViewById<TextView>(R.id.textview_titulo).text = filme.titulo
            itemView.findViewById<TextView>(R.id.textview_ano).text = filme.ano.toString()
            itemView.findViewById<TextView>(R.id.textview_classificacao).text = filme.classificacao
        }

        return itemView!!
    }
}