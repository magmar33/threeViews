package com.example.threeviews.domain.three.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.threeviews.R
import org.w3c.dom.Text

class ThreeViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val tvThree = view.findViewById<TextView>(R.id.tvThree)
}