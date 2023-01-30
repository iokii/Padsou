package com.example.padsou.ui

import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.padsou.R
import com.example.padsou.models.*
import com.example.padsou.ui.components.*
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.GrayWhite
import com.example.padsou.ui.theme.integralcf
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


@Composable
fun HomePage(navController: NavController) {

        var profileViewModel = ProfileViewModel()
        var idUser = Firebase.auth.currentUser?.uid
        LaunchedEffect(Unit){
            if (idUser != null) {
                profileViewModel.get(idUser)
            }
        }


        var user = profileViewModel.user.collectAsState()



        val homeViewModel = viewModel<HomeViewModel>()
        homeViewModel.getAll()
        val offers: State<List<Offer>> = homeViewModel.offers.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(DarkBlue)
        ) {
            Column() {
                Row(Modifier.width(300.dp)) {
                    Column() {
                        Text(text = "COUCOU TOI,",Modifier.padding(top = 60.dp, start = 50.dp), Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold, fontFamily = integralcf)
                        Text(text = "T'es en manque de thunes ?", Modifier.padding(top = 5.dp, start = 50.dp), Color.White, fontSize = 15.sp, fontWeight = FontWeight.Thin, fontFamily = integralcf)
                    }
                    AsyncImage(model = user.value?.pdp,
                        contentDescription = "Profile picture",
                        modifier = Modifier
                            .size(55.dp)
                            .clip(CircleShape)
                            .padding(start = 0.dp))
                }
                Box(modifier= Modifier
                    .padding(top = 75.dp)
                    .fillMaxWidth()
                    .defaultMinSize(10.dp, 600.dp)
                    .clip(RoundedCornerShape(40.dp, 40.dp))
                    .background(
                        color = GrayWhite,
                        shape = RoundedCornerShape(40.dp, 40.dp)
                    )
                ){
                    Column() {
                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                                rectFilter(painterResource(R.drawable.shopping_bag), Color(0xFF5F67EA), "Courses", integralcf)
                                rectFilter(painterResource(R.drawable.run), Color(0xFFF4696A), "Sport", integralcf)
                                rectFilter(painterResource(R.drawable.train), Color(0xFF579BFE), "Trains", integralcf)
                                rectFilter(painterResource(R.drawable.confetti), Color(0xFF7C8CF9), "Soirées", integralcf)
                            }
                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp, 10.dp), horizontalArrangement = Arrangement.SpaceBetween){
                                Text(text = "Les plans du moment", modifier = Modifier, Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Normal, fontFamily = integralcf)
                                Text(text = "Voir tout", modifier = Modifier, Color(0xFFFC6B68), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.inter)))
                            }
                            Column {
                                LazyVerticalGrid(columns= GridCells.Fixed(2),
                                    contentPadding = PaddingValues(
                                        start = 10.dp,
                                        bottom = 16.dp
                                    ),
                                    modifier = Modifier
                                        .padding(20.dp)
                                        .fillMaxSize(),
                                    content={
                                        items(offers.value.size) { index ->
                                                OfferInList(offer = offers.value[index],navController,offers.value[index].id)

                                        }
                                    }
                                )
                                }
                            }

                        }

                    }

                }
    FooterAdd(navController)
}


