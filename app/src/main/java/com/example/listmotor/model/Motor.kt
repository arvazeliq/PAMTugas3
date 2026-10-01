package com.example.listmotor.model

import androidx.annotation.DrawableRes

data class Motor(
    val id: Int = 0,
    val name: String = "",
    val series: String = "",
    val category: String = "",
    @DrawableRes val image: Int = 0
)