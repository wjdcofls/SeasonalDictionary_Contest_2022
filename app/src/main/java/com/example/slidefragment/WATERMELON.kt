package com.example.slidefragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class WATERMELON : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watermelon)

        var mbtn_url: Button? = null

        mbtn_url = findViewById(R.id.button4)

        mbtn_url.setOnClickListener(View.OnClickListener {
            val urlintent =
                Intent(Intent.ACTION_VIEW, Uri.parse("http://caci.ca.ac.kr:8080/"))
            startActivity(urlintent)
        })


        val watermelonRecipe = findViewById<Button>(R.id.watermelonRecipe)
        watermelonRecipe.setOnClickListener {
            val intent =
                Intent(applicationContext, recipeOfWatermelon::class.java)
            startActivity(intent)
        }
    }
}
