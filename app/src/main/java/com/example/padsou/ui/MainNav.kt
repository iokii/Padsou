package com.example.padsou.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.padsou.models.Offer
import com.example.padsou.models.service.OfferService
import com.example.padsou.models.service.UserService
import com.example.padsou.ui.components.LoginView

@Composable
fun MainNav(){
    val navController = rememberNavController()
    val offerservice = OfferService()
    val userService = UserService()


    NavHost(navController = navController, startDestination = "onBoarding"){
        composable("home"){

            val offers : List<Offer> = offerservice.getAll()
            HomePage(navController = navController, offers = offers)

        }
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
        composable("profil") { Profile(navController) }
    }
}