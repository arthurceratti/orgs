package com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ResourceCursorAdapter
import android.widget.TextView
import com.example.orgs.R
import org.w3c.dom.Text


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.nome)
        nome.text = "Cesta de frutas"
        val descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, manga e maçã"
        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "19.99"
    }
}