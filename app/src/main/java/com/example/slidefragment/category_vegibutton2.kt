package com.example.slidefragment

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class category_vegibutton2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catrgory_vegibutton)

        val imageButtontomato = findViewById<ImageButton>(R.id.imageButton4)
        imageButtontomato.setOnClickListener {
            val intent =
                Intent(applicationContext, TOMATO::class.java)
            startActivity(intent)
        }

        val imageButtonpotato = findViewById<ImageButton>(R.id.imageButton5)
        imageButtonpotato.setOnClickListener {
            val intent =
                Intent(applicationContext, POTATO::class.java)
            startActivity(intent)
        }
    }
}
