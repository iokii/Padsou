package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.R
import com.example.padsou.ui.theme.GrayWhite

@Composable
fun FooterAdd(navController: NavController){
    Surface(color = Color.White,modifier = Modifier
        .padding(top = 730.dp)
        .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)))
    {

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(start = 70.dp),
            horizontalArrangement = Arrangement.spacedBy(60.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .clip(
                    RoundedCornerShape(15.dp)
                )
                .background(GrayWhite)
                .width(50.dp)
                .height(50.dp)
                .padding(10.dp)
                .clickable(onClick = {navController.navigate("home")})){

                    Image(
                        painter = painterResource(id = R.drawable.home_page),
                        contentDescription = "home-page",
                        modifier = Modifier
                            .width(40.dp)
                            .height(40.dp)
                    )


            }
            Box(modifier = Modifier
                .clip(
                    RoundedCornerShape(15.dp)
                )
                .background(GrayWhite)
                .width(50.dp)
                .height(50.dp)
                .padding(10.dp)
                .clickable(onClick = {navController.navigate("addPlan/1")})){
                Image(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "plus",
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                )
            }
            Box(modifier = Modifier
                .clip(
                    RoundedCornerShape(15.dp)
                )
                .background(GrayWhite)
                .width(50.dp)
                .height(50.dp)
                .padding(10.dp)
                .clickable(onClick = {navController.navigate("profil")})){
                Image(
                    painter = painterResource(id = R.drawable.profil),
                    contentDescription = "profil",
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                )
            }
        }
    }
}