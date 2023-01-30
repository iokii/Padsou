package com.example.padsou.ui

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.ui.components.*
import com.example.padsou.models.*
import com.example.padsou.ui.theme.integralcf

@Composable
fun OneOffer (navController: NavController,offerId: String) {
    // A surface container using the 'background' color from the theme

    var commentViewModel = CommentViewModel()
    val oneOfferViewModel = OneOfferViewModel()
    oneOfferViewModel.get(offerId)
    val offer: State<Offer> = oneOfferViewModel.offer.collectAsState()




    Surface(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        color = Color(0xFFEBE7FF)

    ) {
        Column {

            HeaderOneOffer(offer)

            for (comment in offer.value.listComment) {
                commentOneOffer(comment,commentViewModel)
            }

            Text(
                "TESTÉE PAR ${offer.value.nbrTested} GALÉRIENS",
                Modifier.padding(top = 20.dp, start = 60.dp), Color.Black,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf,
                fontSize = 20.sp
            )

            Box(modifier = Modifier.padding(top = 70.dp, start = 60.dp),) {
                PrimaryButton(text = "Profiter de l'offre", personnalisedPadding = 0) {
                    navController.navigate("offer")
                }
            }


        }


    }
}






