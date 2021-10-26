package com.example.threeviews.domain.one.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.threeviews.R

class OneViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvTitle = view.findViewById<TextView>(R.id.tv_title)
    val tvDescription = view.findViewById<TextView>(R.id.tv_description)
    val imageView = view.findViewById<ImageView>(R.id.imageView)
}