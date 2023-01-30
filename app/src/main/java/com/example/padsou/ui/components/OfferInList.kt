package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.padsou.models.Offer
import com.example.padsou.ui.theme.integralcf


@Composable
fun OfferInList(offer: Offer, navController: NavController, id: String){
    Column(modifier = Modifier.padding(bottom = 20.dp).clickable { navController.navigate("oneOffer/UXSrnEdtpCV7cJdmsptk") }){
        Box(modifier = Modifier.padding(bottom = 10.dp)){
            AsyncImage(
                model = offer.img,
                contentDescription = offer.label,
                modifier = Modifier
                    .width(144.dp)
                    .height(90.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop
            )
            Row(modifier = Modifier
                .padding(start = (144 / 2 - 15).dp)
                .offset(y = (75).dp)){
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
            modifier = Modifier.padding(top = 15.dp, start = 15.dp)) {
            Text(text = offer.label,
                modifier = Modifier,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf
            )
            Text(text = offer.souslabel,
                modifier = Modifier,
                fontSize = 11.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = integralcf
            )
        }

    }
}