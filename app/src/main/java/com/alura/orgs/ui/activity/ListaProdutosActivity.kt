package com.alura.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.alura.orgs.dao.ProdutosDao
import com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.example.orgs.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListaProdutosActivity : AppCompatActivity(R.layout.lista_produtos_activity) {
    private val dao = ProdutosDao() //DAO = Data Access Object
    private val adapter = ListaProdutosAdapter(context = this, produtos = dao.buscaTodos())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraRecyclerView() //ctrl+alt+M to create a function from a code block
        configuraFab() // configura o floating action button
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.buscaTodos())

    }

    private fun configuraFab() {
        val fab = findViewById<FloatingActionButton>(R.id.lista_produtos_activity_floatingActionButton)
        fab.setOnClickListener {
            vaiParaFormularioProduto()
        }
    }

    private fun vaiParaFormularioProduto() {
        val intent = Intent(this, FormularioProdutoActivity::class.java)
        startActivity(intent)
    }

    private fun configuraRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.lista_produtos_activity_recyclerView)
        recyclerView.adapter = adapter
    }
}