package com.example.padsou.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.integralcf

@Composable
fun RegisterView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            //.height(0.dp)
                ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderText("BIENVENUE 😎", "Inscris-toi pour avoir les \nmeilleurs plans étudiants !")
        FormRegister()
        PrimaryButton("S'INSCRIRE", 20,"home",navController)
        Row(modifier = Modifier.padding(top = 10.dp)
            .background(Color.White)
            .padding(top = 35.dp, bottom = 15.dp)) {
            Text(
                text = "Déjà un compte ? ",
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf
            )
            Text(
                text = "Connecte-toi !",
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf,
                style = TextStyle(color = DarkBlue),
                modifier = Modifier.clickable { navController.navigate("loginview") }
            )
        }
    }
}