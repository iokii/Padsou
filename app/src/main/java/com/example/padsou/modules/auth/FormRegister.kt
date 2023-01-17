package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun FormRegister() {
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

    Row() {
        Text(
            text = "En t'inscrivant, tu acceptes les Conditions générales d'utilisation de Padsou",
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 60.dp, start = 15.dp)
        )
    }
}