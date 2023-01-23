package com.example.padsou.ui.components

import android.util.Log
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
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObjects
import com.google.firebase.ktx.Firebase

@Composable
fun RegisterView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            //.height(0.dp)
                ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderText("BIENVENUE 😎", "Inscris-toi pour avoir les \nmeilleurs plans étudiants !")
        FormRegister()
        PrimaryButton("S'INSCRIRE", 20)
        Row(modifier = Modifier.padding(top = 10.dp)) {
            Text(
                text = "Déjà un compte ? ",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Connecte-toi !", fontWeight = FontWeight.Bold, style = TextStyle(color = DarkBlue),
                modifier = Modifier.clickable { navController.navigate("loginview") }
            )
        }
    }
}