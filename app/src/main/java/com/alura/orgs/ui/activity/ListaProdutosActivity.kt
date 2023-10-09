package com.alura.orgs.ui.activity
import android.content.Intent

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.alura.orgs.dao.ProdutosDao
import com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.example.orgs.R

import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListaProdutosActivity : AppCompatActivity(R.layout.lista_produtos_activity) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        configuraRecyclerView() //ctrl+alt+M to create a function from a code block
        configuraFab() // configura o floating action button
    }

    private fun configuraFab() {
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }

    private fun configuraRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val dao = ProdutosDao()

        Log.i("MainActivity", "onCreate: ${dao.buscaTodos()}")

        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos())
    }
}