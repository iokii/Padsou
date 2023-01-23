package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase




@Composable
fun FormRegister() {
    var mail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var secondPassword by remember { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = mail,
            onValueChange = { mail = it },
            label = { Text("Ton adresse e-mail") },
            textStyle = TextStyle(color = Color.Gray),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(Color.White)
                .width(300.dp)
                .height(50.dp)
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Ton mot de passe") },
            textStyle = TextStyle(color = Color.Gray),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(Color.White)
                .width(300.dp)
                .height(50.dp)
        )

        TextField(
            value = secondPassword,
            onValueChange = { secondPassword = it },
            label = {  Text("Confirme ton mot de passe") },
            textStyle = TextStyle(color = Color.Gray),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(Color.White)
                .width(300.dp)
                .height(50.dp)
        )

        Row() {
            Text(
                text = "En t'inscrivant, tu acceptes les Conditions générales d'utilisation de Padsou",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 60.dp, start = 15.dp)
            )
        }



    }

}