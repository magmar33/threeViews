package com.example.threeviews.domain.two.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.threeviews.R

class TwoViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val imageTwo = view.findViewById<ImageView>(R.id.imageViewTwo)
}