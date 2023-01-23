package com.example.padsou.ui.components

import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.modules.auth.FormLogin
import com.example.padsou.ui.theme.DarkBlue

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
        FormLogin()
        PrimaryButton("SE CONNECTER", 43)
        Row(modifier = Modifier.padding(top = 280.dp)) {
            Text(
                text = "Pas encore inscrit ? ",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Allez viens !", fontWeight = FontWeight.Bold, style = TextStyle(color = DarkBlue),
                modifier = Modifier.clickable { navController.navigate("registerview") }
            )
        }
    }
}