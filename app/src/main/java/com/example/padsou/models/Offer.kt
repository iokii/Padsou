package com.example.padsou.models

data class Offer (
    val label : String,
    val souslabel : String,
    val listComment : List<Comment>,
    val nbrTested:Int,
    val img : String,
    val type : Enum<Filter>
)