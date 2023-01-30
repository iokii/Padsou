package com.example.padsou.models

data class Offer(
    var id:String = "",
    var label: String ="",
    var souslabel: String="",
    var listComment: MutableList<Commentaire> = mutableListOf<Commentaire>(),
    var nbrTested:Int = 0,
    var img: String="",
    var link: String="",
    var type: String = Filter.NULL.toString(),
    var pdp : String = "")