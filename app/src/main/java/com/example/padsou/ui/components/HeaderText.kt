package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsou.ui.theme.GrayWhite
import com.example.padsou.ui.theme.integralcf

@Composable
fun HeaderText(titre: String, description: String) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(GrayWhite),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Text(titre, fontSize = 30.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 50.dp),
                fontFamily = integralcf
            )
        }
        Row {
            Text(description, fontSize = 20.sp, textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = 50.dp),
                fontWeight = FontWeight.Normal,
                fontFamily = integralcf)
        }
    }
}