package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<TextView>(R.id.textView)
        val dado02 = findViewById<TextView>(R.id.textView2)
        val btn = findViewById<Button>(R.id.button)

        dado01.text = getNumber().toString()
        dado02.text = getNumber().toString()
    }

    private fun getNumber(): Int {
        return (1..6).random()
    }

}