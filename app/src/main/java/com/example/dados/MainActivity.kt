package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<ImageView>(R.id.dado01)
        val dado02 = findViewById<ImageView>(R.id.dado02)
        val btn = findViewById<Button>(R.id.button)

        val images = listOf(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

        btn.setOnClickListener{
            dado01.setImageResource(images.random())
            dado02.setImageResource(images.random())
        }

    }

    private fun getNumber(): Int {
        return (1..6).random()
    }

}