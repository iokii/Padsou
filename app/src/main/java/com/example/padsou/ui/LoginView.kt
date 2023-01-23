package com.example.padsou.ui.components

import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.modules.auth.FormLogin
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.integralcf

@Composable
fun LoginView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderText(
            titre = "TE REVOILÀ ! 🔥",
            description = "Reviens vite pour profiter \ndes bons plans",
        )
        Column(modifier = Modifier.background(Color.White), horizontalAlignment = Alignment.CenterHorizontally) {
            FormLogin()
            PrimaryButton("SE CONNECTER", 43, Path = "home",navController)
            Row(modifier = Modifier.padding(top = 150.dp, bottom = 40.dp)) {
                Text(
                    text = "Pas encore inscrit ? ",
                    fontWeight = FontWeight.Bold,
                    fontFamily = integralcf
                )
                Text(
                    text = "Allez viens !",
                    fontWeight = FontWeight.Bold,
                    fontFamily = integralcf,
                    style = TextStyle(color = DarkBlue),
                    modifier = Modifier.clickable { navController.navigate("registerview") }
                )
            }
        }

    }
}