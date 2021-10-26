package com.example.threeviews.domain.one.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.threeviews.R
import com.example.threeviews.domain.one.One


class OneAdapter(private val context: Context, private val data: MutableList<One>) : RecyclerView.Adapter<OneViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_one,parent,false)
        return OneViewHolder(view)
    }

    override fun onBindViewHolder(holder: OneViewHolder, position: Int) {
        val one = data[position]
        holder.tvTitle.text = one.title
        holder.tvDescription.text = one.description
        Glide.with(context).load(one.image).into(holder.imageView)

    }

    override fun getItemCount(): Int = data.size
}