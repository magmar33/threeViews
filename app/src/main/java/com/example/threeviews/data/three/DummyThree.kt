package com.example.threeviews.data.three

import android.content.Context
import com.example.threeviews.domain.three.Three

object DummyThree {
    fun getData(context: Context): MutableList<Three>{
        return mutableListOf(
            Three("Colores"),
            Three("Ajustes"),
            Three("Configuracion"),
            Three("Ayuda"),
            Three("Soporte")
        )

    }

}