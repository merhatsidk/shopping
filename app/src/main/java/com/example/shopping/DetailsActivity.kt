package com.example.shopping

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        var intent = intent
        var product = intent.getSerializableExtra("product") as Product
        var title = findViewById<TextView>(R.id.title)
        var color = findViewById<TextView>(R.id.color)
        var itemid = findViewById<TextView>(R.id.itemid)
        var details = findViewById<TextView>(R.id.details)
        var image = findViewById<ImageView>(R.id.image)

        title.text = product.Title
        color.text = "Color: " + product.color
        itemid.text = "Wallmart # " + product.itemid
        details.text = "Item Description : \n" + product.desc

        val path: Uri =
            Uri.parse("android.resource://com.example.shopping/drawable/" + product.image)

        image.setImageURI(path)
    }
}