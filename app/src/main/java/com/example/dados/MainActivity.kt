package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado01 = findViewById<ImageView>(R.id.dado01)
        val dado02 = findViewById<ImageView>(R.id.dado02)
        val btn = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.welcomeMessage)
        val shareButton = findViewById<FloatingActionButton>(R.id.share)

        val player = intent.getStringExtra("playername")
        val msg = getString(R.string.welcome, player)

        text.text = msg

        val images = listOf(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

        btn.setOnClickListener{
            dado01.setImageResource(images.random())
            dado02.setImageResource(images.random())
        }
        /*concluir aqui*/
        shareButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "VOCÊ É SORTUDO!")
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo de vida", "On start")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de vida", "On resume")
    }



    private fun getNumber(): Int {
        return (1..6).random()
    }

}