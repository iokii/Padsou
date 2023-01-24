package com.example.padsou.ui.components

import AccountService
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.modules.auth.RegisterViewModel
import com.example.padsou.ui.theme.DarkBlue

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
            //.height(0.dp)
                ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        HeaderText("BIENVENUE 😎", "Inscris-toi pour avoir les \nmeilleurs plans étudiants !")
        FormRegister(registerViewModel)
        PrimaryButton("S'INSCRIRE", 20) {
            accountService.createAccount(
                email.value,
                password.value,
                secondPassword.value,
                mContext
            )
        }
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