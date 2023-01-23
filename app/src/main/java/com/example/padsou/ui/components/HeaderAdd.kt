package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.padsou.ui.theme.DarkBlue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun HeaderAdd(){
    Column(modifier = Modifier.fillMaxWidth().height(150.dp).padding(start = 50.dp, top = 50.dp)) {
        Text(text = "AJOUTER", style = TextStyle(color = Color.White))
        Text(text = "Un bon plan pour en faire \nprofiter les autres", style = TextStyle(color = Color.White))
    }
}