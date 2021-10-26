package com.example.threeviews.domain.two.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.threeviews.R
import com.example.threeviews.domain.two.Two

class TwoAdapter(private val context: Context, private val data: MutableList<Two>) : RecyclerView.Adapter<TwoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwoViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_two,parent,false)
        return TwoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TwoViewHolder, position: Int) {
        val two = data[position]

        Glide.with(context).load(two.image).into(holder.imageTwo)
    }

    override fun getItemCount(): Int = data.size

}