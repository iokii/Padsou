package com.example.padsou.models

data class Offer(
    val label: String ="",
    val souslabel: String="",
    val listComment: List<Comment> = listOf<Comment>(),
    val nbrTested:Int = 0,
    val img: String="",
    val type: String = Filter.NULL.toString(),
    val pdp : String = "")