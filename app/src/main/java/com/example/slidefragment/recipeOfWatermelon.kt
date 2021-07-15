package com.example.slidefragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class recipeOfWatermelon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_of_watermelon)

        var watermelonjuice: Button? = null

        var subakhwachae: Button? = null

        watermelonjuice = findViewById(R.id.watermelonJuice)

        watermelonjuice.setOnClickListener(View.OnClickListener {
            val urlintent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/x8n3j8XwF1o"))
            startActivity(urlintent)
        })


        subakhwachae = findViewById(R.id.subakHwaChae)

        subakhwachae.setOnClickListener(View.OnClickListener {
            val urlintent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/wAktJuv7REY"))
            startActivity(urlintent)
        })




    }
}
