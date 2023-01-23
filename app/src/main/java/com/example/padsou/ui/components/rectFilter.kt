package com.example.padsou.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsou.ui.theme.integralcf


@Composable
fun rectFilter(img: Painter, color: Color, title: String, font: FontFamily){
    val selected = remember { mutableStateOf(false) }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier= Modifier
            .clickable {
                selected.value = !selected.value
            }
            .size(50.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(
                color = (if (selected.value) Color.Gray else color),
                shape = RoundedCornerShape(5.dp)
            )
        ){
            Image(painter = img, contentDescription = title, modifier = Modifier
                .padding(12.5.dp, 12.5.dp, 0.dp, 0.dp)
                .size(25.dp))
        }
        Text(text = title,
            Modifier.padding(top = 8.dp), (if (selected.value) Color.Gray else color),
            fontSize = 10.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = integralcf
        )
    }
}
