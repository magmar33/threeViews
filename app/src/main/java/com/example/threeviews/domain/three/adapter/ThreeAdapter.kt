package com.example.threeviews.domain.three.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.threeviews.R
import com.example.threeviews.domain.three.Three
import com.example.threeviews.domain.two.adapter.TwoViewHolder

class ThreeAdapter(private val context: Context, private val data: MutableList<Three>) : RecyclerView.Adapter<ThreeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThreeViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_three,parent,false)
        return ThreeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ThreeViewHolder, position: Int) {
        val three = data[position]
        holder.tvThree.text = three.name
    }

    override fun getItemCount(): Int = data.size

}