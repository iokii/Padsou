package com.example.padsou.ui.components

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.integralcf

@Composable
fun PrimaryButton(text: String, personnalisedPadding: Int, onClick: () -> Unit) {
    Button(onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = DarkBlue),
        modifier = Modifier
            .padding(top = personnalisedPadding.dp)
            .width(300.dp)
            .height(70.dp)
            .clip(RoundedCornerShape(20.dp))
    ) {
        Text(text, style = TextStyle(color = Color.White),
            fontWeight = FontWeight.Bold,
            fontFamily = integralcf,
            fontSize = 20.sp)
    }
}