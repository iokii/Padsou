package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.padsou.R
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.GrayWhite

@Composable
fun FooterAdd(){
    Surface(color = Color.White,modifier = Modifier
        .padding(top = 580.dp)
        .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .clip(
                    RoundedCornerShape(15.dp)
                )
                .background(GrayWhite)
                .width(60.dp)
                .height(60.dp)
                .padding(10.dp)){
                Image(
                    painter = painterResource(id = R.drawable.home_page),
                    contentDescription = "home-page",
                    modifier = Modifier.width(40.dp).height(40.dp)
                )
            }
            Box(modifier = Modifier
                .clip(
                    RoundedCornerShape(15.dp)
                )
                .background(GrayWhite)
                .width(60.dp)
                .height(60.dp)
                .padding(10.dp)){
                Image(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "plus",
                    modifier = Modifier.width(40.dp).height(40.dp)
                )
            }
            Box(modifier = Modifier
                .clip(
                    RoundedCornerShape(15.dp)
                )
                .background(GrayWhite)
                .width(60.dp)
                .height(60.dp)
                .padding(10.dp)){
                Image(
                    painter = painterResource(id = R.drawable.profil),
                    contentDescription = "profil",
                    modifier = Modifier.width(40.dp).height(40.dp)
                )
            }
        }
    }
}