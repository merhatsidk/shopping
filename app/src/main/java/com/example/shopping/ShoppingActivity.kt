package com.example.shopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        var welEditText = findViewById<TextView>(R.id.welcome)
        welEditText.text = "Welcome"
        var electronics = findViewById<ImageView>(R.id.electronics)
        var clothings = findViewById<ImageView>(R.id.clothing)
        var beauty = findViewById<ImageView>(R.id.beauty)
        var food = findViewById<ImageView>(R.id.food)

        electronics.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        clothings.setOnClickListener {
            Toast.makeText(
                this,
                "You have chosen the Clothing category of shopping",
                Toast.LENGTH_LONG
            ).show()
        }

        beauty.setOnClickListener {
            Toast.makeText(
                this,
                "You have chosen the Beauty category of shopping",
                Toast.LENGTH_LONG
            ).show()
        }

        food.setOnClickListener {
            Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_LONG)
                .show()
        }


    }
}