package com.example.usandolistview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.usandolistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dados: ArrayList<Filme>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        carregar()

        val adapter = FilmeAdapter(this, dados)

        binding.listview.adapter = adapter
        binding.listview.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this,
            "Você clicou em ${dados.get(position)}",
            Toast.LENGTH_LONG).show()
    }

    private fun carregar(){
        dados = ArrayList<Filme>().apply {
            add(Filme("Godzilla", "A18", 2022))
            add(Filme("Rio", "Livre", 2015))
            add(Filme("Star Trek", "Livre", 2012))
            add(Filme("Matrix", "A16", 1999))
            add(Filme("Star Wars", "A12", 1985))
            add(Filme("Duna", "A14", 2023))
        }
    }

}