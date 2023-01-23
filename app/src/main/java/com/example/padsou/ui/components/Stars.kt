package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.padsou.R

@Composable
fun stars(note : Int){
    var star : Int = note
    var unstar : Int = 5-note

    if (star > 5)
        star = 5
    else if (star<0)
        star = 0

    Row(Modifier.padding(top = 10.dp)) {
        if (star != 0) {
            for (i in 1..star) {
                Image(painter = painterResource(id = R.drawable.star),
                    contentDescription = "Star",
                    modifier = Modifier
                        .size(25.dp)
                )
            }
        }
        if (unstar != 0){
            for (i in 1..unstar){
                Image(painter = painterResource(id = R.drawable.unstar),
                    contentDescription = "unStar",
                    modifier = Modifier
                        .size(25.dp)
                )
            }
        }
    }
    

}