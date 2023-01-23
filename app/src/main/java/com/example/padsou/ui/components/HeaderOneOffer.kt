package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.padsou.models.Offer
import com.example.padsou.ui.theme.integralcf

@Composable
fun HeaderOneOffer(offer: Offer){

    Box(
        Modifier
            .fillMaxWidth()


    ){
        
        AsyncImage(model = offer.img,
            contentDescription = "image de fond",
            Modifier
                .height(200.dp)
                .clip(
                    RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp)
                ) ,
            contentScale = ContentScale.Crop,

        )
        Box(modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .clip(
                RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp)
            )
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color.Black,
                        Color.Black.copy(alpha = 0f)
                    ),
                    startX = 0f,
                    endX = 500f
                )
            )

        )

        Column(
            Modifier.padding(top = 60.dp,start=80.dp)
        ) {
            Text(text = offer.label,Modifier, Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf
            )
            Text(text = offer.souslabel,Modifier, Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf)
        }

    }


}