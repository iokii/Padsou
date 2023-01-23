package com.example.padsou.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.models.User
import coil.compose.AsyncImage
import com.example.padsou.ui.components.FooterAdd
import com.example.padsou.ui.theme.integralcf

@Composable
fun Profile (navController: NavController, userid: String) {
    // A surface container using the 'background' color from the theme

    val user = User("","","","")


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF5F67EA)
    ) {
        Column(
            Modifier.padding(top = 55.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 125.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                AsyncImage(
                    model = user.pdp,
                    contentDescription = "Image de profile",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(125.dp)
                )
                Text(
                    user.name, fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontFamily = integralcf

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                    .background(Color.White),
            ) {
                Column() {
                    Column(
                        Modifier.padding(start = 125.dp, top = 40.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(17.dp)
                    ) {
                        Text(
                            text = "Email :", fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = integralcf
                        )
                        Text(
                            text = user.email,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = integralcf
                        )
                        Text(
                            text = "Mot de Passe :", fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = integralcf
                        )
                        Text(text = user.password, fontSize = 15.sp)
                        Text(
                            text = "Offres abonnés :",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = integralcf
                        )
                        //Do show offres abonné

                }
                }

            }


        }


    }
    FooterAdd(navController)
}
