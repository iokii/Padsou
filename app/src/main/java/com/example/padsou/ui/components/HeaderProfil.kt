package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.padsou.R
import com.example.padsou.ui.theme.integralcf

@Composable
fun HeaderProfil(){
    Row(modifier = Modifier
        .fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically) {
        Column(modifier = Modifier
            .height(150.dp)
            .padding(start = 50.dp, top = 50.dp)) {
            Text(text = "MON PROFIL",
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf,
                style = TextStyle(color = Color.White),
            )
            Text(text = "Modifie tes infos affichées aux \nautres sur l'app",
                fontWeight = FontWeight.Normal,
                style = TextStyle(color = Color.White)
            )
        }
        Column(modifier = Modifier
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.pluswhite),
                contentDescription = "pluswhite",
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
            )
        }
    }
}