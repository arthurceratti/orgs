package com.alura.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.EditText
import com.example.orgs.R

class FormularioProdutoActivity :
    AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val campoNome = findViewById<EditText>(R.id.nome)
        val nome = campoNome.text.toString()
        Log.i("FormularioProduto","onCreate:$nome")

    }


}