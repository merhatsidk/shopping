package com.example.shopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView1)
        val products = ArrayList<Product>()
        products.add(Product("semi conductor Diodes", 2000.0,"diodes","1","These diodes are manufactured right from Chain in a small town","Black"))
        products.add(Product("Transistors", 700.0,"transistors","2","These Transistors are manufactured  from china in a small town","Black"))
        products.add(Product("Watches", 300.0,"watches","3","These Watches are USA MADE","Red"))
        products.add(Product("Monitors", 400.0,"monitors","4","These Monitors are manufactured from USA","Blue"))

        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(products)
        recyclerview.adapter = adapter

        adapter.onItemClick = { product:Product ->
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("product", product)
            startActivity(intent)
        }
    }
}