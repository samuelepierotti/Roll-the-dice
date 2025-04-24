package com.example.rollthedice

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var messaggio : TextView
    private lateinit var image : ImageView
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button_lancia)
        button.setOnClickListener(View.OnClickListener {
            var random = (1..6).random()
            var toast = Toast.makeText(this, "Estratto numero $random", Toast.LENGTH_LONG)
            toast.show()
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("random", random)
            startActivity(intent)

        }
        )
    }
}