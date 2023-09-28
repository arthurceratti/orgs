package com.alura.orgs.ui.activity
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.alura.orgs.model.Produto
import com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.example.orgs.R
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
            Produto(nome = "Teste1", descricao = "descricao produto", valor = BigDecimal(val: "19.99") as List<Produto>),
        )




    }
}