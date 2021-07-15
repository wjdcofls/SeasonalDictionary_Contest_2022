package com.example.slidefragment

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class category_fruitbutton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_fruitbutton)

        val imageButtonwatermelon = findViewById<ImageButton>(R.id.imageButton17)
        imageButtonwatermelon.setOnClickListener {
            val intent =
                Intent(applicationContext, WATERMELON::class.java)
            startActivity(intent)
        }
    }
}
