package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.GrayWhite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.padsou.R

@Composable
fun FormAdd(pageId:Int){
    if (pageId == 1){
        var titre by remember { mutableStateOf("") }
        var description by remember { mutableStateOf("") }
        var lien by remember { mutableStateOf("") }
        Surface(color = GrayWhite,modifier = Modifier.clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .padding(bottom = 20.dp),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.width(150.dp),
                    horizontalArrangement = Arrangement.SpaceAround){
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(Color.Gray)
                        .width(50.dp)
                        .height(10.dp)){
                    }
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(Color.Gray)
                        .width(50.dp)
                        .height(10.dp)){
                    }
                }
                Column() {
                    Text(text = "TITRE", style = TextStyle(fontWeight = FontWeight.Bold))
                    TextField(
                        value = titre,
                        onValueChange = { titre = it },
                        //label = { Text("Abonnement 1 an Basic-Fit")},
                        textStyle = TextStyle(color = Color.Gray),
                        modifier = Modifier
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color.White)
                            .width(300.dp)
                            .height(50.dp)
                    )
                }
                Column() {
                    Text(text = "DESCRIPTION", style = TextStyle(fontWeight = FontWeight.Bold))
                    TextField(
                        value = description,
                        onValueChange = { description = it },
                        //label = { Text("Ne soit pas trop bavard, on s’en fou, va à l’essentiel") },
                        textStyle = TextStyle(color = Color.Gray),
                        modifier = Modifier
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color.White)
                            .width(300.dp)
                            .height(150.dp)
                    )
                }
                Column() {
                    Text(text = "LIEN", style = TextStyle(fontWeight = FontWeight.Bold))
                    TextField(
                        value = lien,
                        onValueChange = { lien = it },
                        //label = { Text("www.lienverstonbonplan.com") },
                        textStyle = TextStyle(color = Color.Gray),
                        modifier = Modifier
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color.White)
                            .width(300.dp)
                            .height(50.dp)
                    )
                }

                Button(onClick = { /*TODO*/ }, modifier = Modifier
                    .width(300.dp)
                    .height(80.dp)
                    .clip(RoundedCornerShape(25.dp))) {
                    Text(text = "SUIVANT", color = Color.White, modifier = Modifier.background(DarkBlue))
                }
            }
        }
    }

    if (pageId == 2){
        Surface(color = GrayWhite,modifier = Modifier.clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.width(180.dp),
                    horizontalArrangement = Arrangement.SpaceAround){
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(DarkBlue)
                        .width(70.dp)
                        .height(10.dp)){
                    }
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(Color.Gray)
                        .width(70.dp)
                        .height(10.dp)){
                    }
                }
                
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "PHOTO DU BON PLAN", style = TextStyle(fontWeight = FontWeight.Bold))
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(DarkBlue)
                        .width(200.dp)
                        .height(200.dp)){
                        Text(text = "+", fontSize = 130.sp, color = Color.White,modifier = Modifier.padding(start = 65.dp))
                    }
                }

                Button(onClick = { /*TODO*/ }, modifier = Modifier
                    .width(300.dp)
                    .height(80.dp)
                    .clip(RoundedCornerShape(25.dp))) {
                    Text(text = "AJOUTER CE BON PLAN", color = Color.White, modifier = Modifier.background(DarkBlue))
                }
            }
        }
    }

}