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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.modules.auth.FormLogin
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.GrayWhite
import com.example.padsou.ui.theme.integralcf

@Composable
fun LoginView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderText(
            titre = "TE REVOILÀ ! 🔥",
            description = "Reviens vite pour profiter \ndes bons plans"
        )
        Column(modifier = Modifier.background(GrayWhite), horizontalAlignment = Alignment.CenterHorizontally) {
        FormLogin()
        PrimaryButton("SE CONNECTER", 43){
            navController.navigate("home")
        }
        Row(modifier = Modifier.padding(top = 200.dp, bottom = 40.dp).fillMaxHeight()) {
            Text(
                text = "Pas encore inscrit ? ",
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default,
                fontSize = 15.sp
            )
            Text(
                text = "Allez viens !",
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default,
                style = TextStyle(color = DarkBlue, fontSize = 15.sp),
                modifier = Modifier.clickable { navController.navigate("registerview") }
            )
        }}
    }
}