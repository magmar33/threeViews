package com.example.threeviews.data.one

import android.content.Context
import com.example.threeviews.domain.one.One
import com.example.threeviews.presentation.one.OneFragment

object DummyOne {
    fun getData(context: Context): MutableList<One> {
        return mutableListOf(
            One("PRIMERA","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt.","https://fondosmil.com/fondo/14642.jpg"),
            One("SEGUNDA","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt.","https://fondosmil.com/fondo/14643.jpg"),
            One("TERCERA","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt.","https://fondosmil.com/fondo/14644.jpg"),
            One("CUARTA","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt.","https://fondosmil.com/fondo/14645.jpg"),
            One("QUINTA","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt.","https://fondosmil.com/fondo/14641.jpg")
        )
    }
}