package com.generation.activitieseintents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonA1 = findViewById<Button>(R.id.buttonA1)
        val buttonA3 = findViewById<Button>(R.id.buttonA3)

        val intentTerceira = Intent(this, TerceiraActivity::class.java)

        buttonA3.setOnClickListener {
            startActivity(intentTerceira)
        }

        buttonA1.setOnClickListener {
            finish()
        }

    }

}