package com.example.padsou.modules.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.padsou.models.LoginViewModel

@Composable
fun FormLogin(loginViewModel: LoginViewModel) {
    val email: State<String> = loginViewModel.email.collectAsState()
    val password: State<String> = loginViewModel.password.collectAsState()

    Column(horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.spacedBy(20.dp)) {
        TextField(
            value = email.value,
            onValueChange = { loginViewModel.onEmailChange(it) },
            label = { Text("Ton adresse e-mail",color = Color.Gray) },
            textStyle = TextStyle(color = Color.Gray),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(Color.White)
                .width(300.dp)
                .height(60.dp)
        )


        TextField(
            value = password.value,
            onValueChange = { loginViewModel.onPasswordChange(it) },
            label = { Text("Ton mot de passe",color = Color.Gray) },
            textStyle = TextStyle(color = Color.Gray),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(Color.White)
                .width(300.dp)
                .height(60.dp)
        )



        Text(text = "Mot de passe oublié ?",
            modifier = Modifier
                .padding(end = 20.dp)
                .fillMaxWidth() ,
            textAlign = TextAlign.End,
        )
    }




}