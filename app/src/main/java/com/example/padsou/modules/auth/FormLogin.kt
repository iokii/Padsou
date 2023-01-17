package com.example.padsou.modules.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun FormLogin() {
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

    Text(text = "Mot de passe oublié ?",
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
            .padding(end = 20.dp),
        textAlign = TextAlign.End
    )
}