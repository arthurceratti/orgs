package com.alura.orgs.ui.activity
import android.app.Activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.example.orgs.R

import com.alura.orgs.model.Produto
import java.math.BigDecimal


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste", descricao = "primeiro", valor = BigDecimal("19.99")),
            Produto(nome = "teste2", descricao = "segundo", valor = BigDecimal("25.5")),
            Produto(nome = "teste3", descricao = "terceiro", valor = BigDecimal("50.5")),
            Produto(nome = "teste4", descricao = "quarto", valor = BigDecimal("75.5")),
            ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}