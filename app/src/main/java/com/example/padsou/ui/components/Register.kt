package com.example.padsou.ui.components

import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TexteEnHaut() {

    Column(
        modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Text("BIENVENUE 😎", fontSize = 30.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 50.dp))
        }
        Row {
            Text("Inscris-toi pour avoir les meilleurs plans étudiants !", fontSize = 15.sp,
                modifier = Modifier
                    .padding(bottom = 50.dp))
        }
    }
}

@Composable
fun Form() {
    var mail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var secondPassword by remember { mutableStateOf("") }

    TextField(
        value = mail,
        onValueChange = { mail = it },
        label = { Text("Ton adresse e-mail") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )

    TextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Ton mot de passe") },
        visualTransformation = PasswordVisualTransformation()
    )

    TextField(
        value = secondPassword,
        onValueChange = { secondPassword = it },
        label = { Text("Confirme ton mot de passe") },
        visualTransformation = PasswordVisualTransformation()
    )
    
    Text(text = "En t'inscrivant, tu acceptes les Conditions générales d'utilisation de Padsou",
        modifier = Modifier
        .padding(top = 60.dp))
}