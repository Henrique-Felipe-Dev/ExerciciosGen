package com.generation.appdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criamos uma referencia do buttonD6
        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        /*
        Listener de clique - Vai ficar verificando o momento que o usuário clicar no botão e definir
        o que vai acontecer no momento do clique
         */

        buttonD6.setOnClickListener {
            //Toast.makeText(this, "Clicamos no Botão", Toast.LENGTH_SHORT).show()
            rolarDados(6)
        }

    }

    fun rolarDados(lados: Int){
        // 1 até numeroLados
        val valor = (1..lados).random()

        //Armazenando a referencia do textResultado em uma variável
        val textResultado = findViewById<TextView>(R.id.textResultado)

        //Mudamos o texto com o atributo text
        textResultado.text = valor.toString()

        /*
        val imageResource = imgD6(valor)

        val imageDado = findViewById<ImageView>(R.id.imageDado)

        imageDado.setImageResource(imageResource)
         */
        
    }

    /*
    private fun imgD6(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
     */

}