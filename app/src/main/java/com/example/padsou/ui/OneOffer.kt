package com.example.padsou.ui

import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.ui.theme.PadsouTheme
import com.example.padsou.ui.components.*
import com.example.padsou.models.*
import com.example.padsou.models.service.OfferService
import com.example.padsou.ui.theme.integralcf

@Composable
fun OneOffer (navController: NavController,offerId: String) {
                // A surface container using the 'background' color from the theme
    var offerService = OfferService()


    val Dataoffer: Offer? = offerService.get(offerId)
    var offer : Offer = Offer("","", listOf(),0,"",Filter.NULL,"")

    if (Dataoffer != null) {
        offer = Dataoffer
    }else{
        Toast.makeText(LocalContext.current,"Erreur sur la récupération des datas", Toast.LENGTH_LONG).show()
        navController.navigate("home")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        color = Color(0xFFEBE7FF)

    ) {
        Column() {

                HeaderOneOffer(offer)
            for (comment in offer.listComment) {
                commentOneOffer(comment)
            }
            Text("TESTÉE PAR ${offer.nbrTested} GALÉRIENS",
                Modifier.padding(top = 20.dp, start = 70.dp), Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf,
                fontSize = 20.sp)

            Box(Modifier.padding(top = 70.dp)){
                PrimaryButton(text = "Profiter de l'offre", personnalisedPadding = 0){
                    navController.navigate("offer")
                }
            }

            
            
        }


    }
}






