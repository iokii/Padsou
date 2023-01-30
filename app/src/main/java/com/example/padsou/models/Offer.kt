package com.example.padsou.models

data class Offer(
    val id:String = "",
    val label: String ="",
    val souslabel: String="",
    var listComment: MutableList<Comment> = mutableListOf<Comment>(),
    val nbrTested:Int = 0,
    val img: String="",
    val type: String = Filter.NULL.toString(),
    val pdp : String = "")