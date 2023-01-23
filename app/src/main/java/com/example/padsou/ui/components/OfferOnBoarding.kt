package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.padsou.R
import com.example.padsou.models.Offer
import com.example.padsou.ui.theme.integralcf
import okhttp3.internal.notify


@Composable
fun OfferOnBoarding(offer: Offer){
    Column(modifier = Modifier.padding(bottom = 20.dp)){
        Box(modifier = Modifier.padding(bottom = 10.dp)){
            AsyncImage(
                model = offer.img,
                contentDescription = offer.label,
                modifier = Modifier
                    .width(110.dp)
                    .height(80.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop
            )
            Row(modifier = Modifier
                .padding(start = (110 / 2 - 15).dp)
                .offset(y = (60).dp)){
                Box(modifier = Modifier
                    .size(35.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                ){
                    AsyncImage(
                        model = offer.pdp,
                        contentDescription = "",
                        modifier = Modifier
                            .width(30.dp)
                            .height(30.dp)
                            .clip(CircleShape)
                            .align(Alignment.Center),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
        Column(verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(top = 5.dp, start = 5.dp)) {
            Text(text = offer.label,
                modifier = Modifier,
                fontSize = 8.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf
            )
            Text(text = offer.souslabel,
                modifier = Modifier,
                fontSize = 7.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = integralcf
            )
        }

    }
}