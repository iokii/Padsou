package com.example.padsou

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.padsou.ui.components.LoginView
import com.example.padsou.ui.components.RegisterView

@Composable
fun MainNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "registerview") {
        composable("registerview") { RegisterView(navController) }
        composable("loginview") { LoginView(navController) }
    }
}