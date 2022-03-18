package com.generation.navagacaoedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class UsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        //Recuperar os dados salvos na Intent (usando o getExtra)
        val nome = intent.getStringExtra("NOME")
        val idade = intent.getIntExtra("IDADE", 0)

        val textDados = findViewById<TextView>(R.id.textDados)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        textDados.text = "Nome: $nome, idade: $idade"

        buttonVoltar.setOnClickListener {
            finish()
        }


    }
}