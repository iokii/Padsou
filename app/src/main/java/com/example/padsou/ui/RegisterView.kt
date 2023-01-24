package com.example.padsou.ui

import androidx.compose.foundation.background
import AccountService
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.ui.components.FormRegister
import com.example.padsou.ui.components.HeaderText
import com.example.padsou.ui.components.PrimaryButton
import com.example.padsou.ui.components.RegisterViewModel
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.GrayWhite

@Composable
fun RegisterView(navController: NavController) {
    val registerViewModel = viewModel<RegisterViewModel>()
    val mContext = LocalContext.current
    val email: State<String> = registerViewModel.email.collectAsState()
    val password: State<String> = registerViewModel.password.collectAsState()
    val secondPassword: State<String> = registerViewModel.secondPassword.collectAsState()
    var accountService = AccountService()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(GrayWhite)
            .fillMaxHeight()
            //.height(0.dp)
                ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderText("BIENVENUE 😎", "Inscris-toi pour avoir les \nmeilleurs plans étudiants !")
        FormRegister(registerViewModel)
        PrimaryButton("S'INSCRIRE", 20) {
            var success = accountService.createAccount(
                email.value,
                password.value,
                secondPassword.value,
                mContext,
                navController
            )
            if(success){
                navController.navigate("home")
            }

        }
            Row(modifier = Modifier.padding(top = 50.dp)
                .background(GrayWhite)
                .padding(top = 35.dp, bottom = 15.dp)) {
            Text(
                text = "Déjà un compte ? ",
                fontWeight = FontWeight.Normal,
            )
            Text(
                text = "Connecte-toi !",
                fontWeight = FontWeight.Normal,
                style = TextStyle(color = DarkBlue),
                modifier = Modifier.clickable { navController.navigate("loginview") }
            )
        }
    }
}