package com.example.threeviews.data.two

import android.content.Context
import com.example.threeviews.domain.two.Two

object DummyTwo {
    fun getData(context: Context): MutableList<Two>{
        return mutableListOf(
            Two("https://www.coinshome.net/fs/hgQKbzbiQLgAAAFLrYOgLg6u.jpg"),
            Two("https://www.coinshome.net/fs/zW3BwcI0TVoAAAEpakMFQSFX.jpg"),
            Two("https://www.banxico.org.mx/multimedia/Maximiliano.png"),
            Two("https://3.bp.blogspot.com/-igvkSrHL4HA/U4FdMo2nZhI/AAAAAAAABDM/Ft2_Mf_8Syw/s1600/Maximiliano.png"),
            Two("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdv5QbbKqxhbD6Uxlk7D7o8EGjS0JP3B3mHA&usqp=CAU") ,
            Two("https://i.pinimg.com/736x/8e/7b/fd/8e7bfd62ba2de7db49c6e350771af42b.jpg"),
            Two("https://eldatonumismatico.files.wordpress.com/2020/06/e.png?w=655&h=333"),
        )
    }
}