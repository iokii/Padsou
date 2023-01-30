package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.GrayWhite
import com.example.padsou.ui.theme.integralcf

@Composable
fun FormProfil(navController: NavController){
    var pseudo by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Surface(color = GrayWhite,modifier = Modifier.clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
        .verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(600.dp)
            .padding(bottom = 50.dp,top = 50.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Column() {
                Text(text = "MON PSEUDO",
                    fontWeight = FontWeight.Bold,
                    fontFamily = integralcf
                )
                TextField(
                    value = pseudo,
                    onValueChange = { pseudo = it },
                    //label = { Text("Abonnement 1 an Basic-Fit")},
                    textStyle = TextStyle(color = Color.Gray,
                        fontWeight = FontWeight.Normal
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(25.dp))
                        .background(Color.White)
                        .width(300.dp)
                        .height(50.dp)
                )
            }
            Column() {
                Text(text = "ADRESSE E-MAIL",
                    fontWeight = FontWeight.Bold,
                    fontFamily = integralcf
                )
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    //label = { Text("Ne soit pas trop bavard, on s’en fou, va à l’essentiel") },
                    textStyle = TextStyle(color = Color.Gray,
                        fontWeight = FontWeight.Normal
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(25.dp))
                        .background(Color.White)
                        .width(300.dp)
                        .height(50.dp)
                )
            }
            Column() {
                Text(text = "MOT DE PASSE",
                    fontWeight = FontWeight.Bold,
                    fontFamily = integralcf
                )
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    //label = { Text("www.lienverstonbonplan.com") },
                    textStyle = TextStyle(color = Color.Gray,
                        fontWeight = FontWeight.Normal
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(25.dp))
                        .background(Color.White)
                        .width(300.dp)
                        .height(50.dp)
                )
            }

            PrimaryButton("ENREGISTRER",0){
                navController.navigate("addPlan/2")
            }
        }
    }
}