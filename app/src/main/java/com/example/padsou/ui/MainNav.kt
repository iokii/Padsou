package com.example.padsou.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.padsou.models.Offer
import com.example.padsou.ui.components.LoginView
import com.example.padsou.ui.components.RegisterView

@Composable
fun MainNav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "onBoarding"){
        composable("home"){ HomePage(navController = navController, offers = listOf<Offer>())}
        composable("oneOffer/{offerId}"){
                navBackStackEntry  ->
            val offerid = navBackStackEntry.arguments?.getString("offerId")

            if (offerid != null) {
                OneOffer(navController,offerid)
            }
        }
        composable("onBoarding"){ onBoarding(navController)}
        composable("addPlan/{pageId}"){navBackStackEntry  ->
            val pageId = navBackStackEntry.arguments?.getString("pageId")

            if (pageId != null) {
                AddPlan(navController,pageId.toInt())
            }
        }
        composable("registerview") { RegisterView(navController) }
        composable("loginview") { LoginView(navController) }
        composable("profil") { Profile(navController,"boop") }
    }
}