package com.generation.navagacaoedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Navegação e a Passagem de dados entre Activities

        val buttonCadastro = findViewById<Button>(R.id.buttonCadastro)
        
        //Criando as instancias dos EditText
        val editNome = findViewById<EditText>(R.id.editNome)
        val editIdade = findViewById<EditText>(R.id.editIdade)

        val intentUsuario = Intent(this, UsuarioActivity::class.java)



        buttonCadastro.setOnClickListener {
            
            //Recuperando o valor de cada uma das caixas de texto
            val nome = editNome.text.toString()
            val idade = editIdade.text.toString()
            
            //Validação dos campos
            if(nome.isEmpty() || idade.isEmpty()){
                Toast.makeText(
                    this, "Preencha todos os campos",
                    Toast.LENGTH_LONG
                ).show()
            }else{

                    //Salvar os dados para recuperar na outra activity (usando putExtra)
                    intentUsuario.putExtra("NOME", nome)
                    intentUsuario.putExtra("IDADE", idade.toInt())

                    startActivity(intentUsuario)
            }

        }

    }
}