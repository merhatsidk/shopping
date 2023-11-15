package com.example.shopping

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(var blist: ArrayList<Product>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    var onItemClick: ((Product) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.shoping_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        var imgStr = blist[position].image
        holder.name.text = blist[position].Title
        holder.price.text = "Price: " + blist[position].price.toString()
        holder.color.text = "Color: " + blist[position].color

        val otherPath: Uri =
            Uri.parse("android.resource://com.example.shopping/drawable/$imgStr")

        holder.image.setImageURI(otherPath)
    }

    override fun getItemCount(): Int {
        return blist.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(blist[absoluteAdapterPosition])
            }
        }

        val name: TextView = itemView.findViewById(R.id.name)
        val price: TextView = itemView.findViewById(R.id.price)
        val color: TextView = itemView.findViewById(R.id.color)
        val image: ImageView = itemView.findViewById(R.id.image);
    }
}