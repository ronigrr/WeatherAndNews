package com.kotlinpractice.weatherandnews.models

import java.io.Serializable

data class Main (
    val temp : Double,
    val temp_min : Double,
    val temp_max : Double,
    val pressure : Int,
    val humidity : Int,
    val sea_level : Double,
    val grnd_levek : Double
):Serializable

