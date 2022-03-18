package com.generation.activitieseintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TerceiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener {
            finish()
        }

    }
}