package com.example.padsou.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.padsou.models.Offer
import com.example.padsou.models.service.OfferService
import com.example.padsou.models.service.UserService
import com.example.padsou.ui.components.LoginView
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@Composable
fun MainNav(){
    val navController = rememberNavController()
    val offerservice = OfferService()
    val userService = UserService()


    NavHost(navController = navController, startDestination = "onBoarding"){
        composable("home"){

            HomePage(navController = navController)

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
                AddPlan(navController,pageId.toInt(),"","","")
            }
        }
        composable("addPlan/{pageId}/{label}/{img}/{souslabel}"){navBackStackEntry  ->
            val pageId = navBackStackEntry.arguments?.getString("pageId")
            val label = navBackStackEntry.arguments?.getString("label")
            val img = navBackStackEntry.arguments?.getString("img")
            val souslabel = navBackStackEntry.arguments?.getString("souslabel")

            if (pageId != null) {
                if(label!=null && souslabel !=null && img!=null)
                AddPlan(navController,pageId.toInt(),label,souslabel,img)
            }
        }
        composable("registerview") { RegisterView(navController) }
        composable("loginview") { LoginView(navController) }
        composable("profil") {
            var id = Firebase.auth.currentUser?.uid
            if(id!=null){
                Profile(navController,id)
            }
            else{
                onBoarding(navController)
            }
        }
    }
}