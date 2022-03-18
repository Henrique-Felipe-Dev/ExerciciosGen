package com.generation.activitieseintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonA2 = findViewById<Button>(R.id.buttonA2)

        //Intent - Indicar qual tela receberá as ações
        val segundaTela = Intent(this, SegundaActivity::class.java)

        buttonA2.setOnClickListener {

            startActivity(segundaTela)

        }

        Log.d("CicloDeVida", "onCreate()")
    }

    override fun onStart() {
        super.onStart()

        Log.d("CicloDeVida", "onStart()")

    }

    override fun onResume() {
        super.onResume()

        Log.d("CicloDeVida", "onResume()")
    }

    override fun onPause() {
        super.onPause()

        Log.d("CicloDeVida", "onPause()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("CicloDeVida", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("CicloDeVida", "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("CicloDeVida", "onRestart()")

    }

}