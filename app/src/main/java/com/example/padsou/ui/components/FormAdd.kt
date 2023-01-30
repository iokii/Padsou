package com.example.padsou.ui.components

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.GrayWhite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.R
import com.example.padsou.models.LoginViewModel
import com.example.padsou.models.Offer
import com.example.padsou.models.PageAddViewModel
import com.example.padsou.models.service.OfferService
import com.example.padsou.ui.theme.integralcf

@Composable
fun FormAdd(navController: NavController,pageId:Int, pageAddViewModel: PageAddViewModel){
    val mContext = LocalContext.current
    val offerService = OfferService()
    val label: State<String> = pageAddViewModel.label.collectAsState()
    val souslabel: State<String> = pageAddViewModel.souslabel.collectAsState()
    val link: State<String> = pageAddViewModel.link.collectAsState()

    var imageUri by remember {
        mutableStateOf<Uri?>(null)
    }

    val launcher = rememberLauncherForActivityResult(contract =
    ActivityResultContracts.GetContent()) { uri: Uri? ->
        imageUri = uri
    }
    if (pageId == 1){
        Surface(color = GrayWhite,modifier = Modifier.clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
            .verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .padding(bottom = 20.dp),
                verticalArrangement = Arrangement.spacedBy(25.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.width(150.dp).padding(top = 15.dp),
                    horizontalArrangement = Arrangement.SpaceAround){
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(Color.Gray)
                        .width(50.dp)
                        .height(10.dp)){
                    }
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(Color.Gray)
                        .width(50.dp)
                        .height(10.dp)){
                    }
                }
                Column() {
                    Text(text = "TITRE",
                        fontWeight = FontWeight.Bold,
                        fontFamily = integralcf)
                    TextField(
                        value = label.value,
                        onValueChange = { pageAddViewModel.onLabelChange(it) },
                        //label = { Text("Abonnement 1 an Basic-Fit")},
                        textStyle = TextStyle(color = Color.Gray,
                            fontWeight = FontWeight.Normal,
                            fontFamily = integralcf),
                        modifier = Modifier
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color.White)
                            .width(300.dp)
                            .height(50.dp)
                    )
                }
                Column() {
                    Text(text = "DESCRIPTION",
                        fontWeight = FontWeight.Bold,
                        fontFamily = integralcf)
                    TextField(
                        value = souslabel.value,
                        onValueChange = { pageAddViewModel.onSousLabelChange(it) },
                        //label = { Text("Ne soit pas trop bavard, on s’en fou, va à l’essentiel") },
                        textStyle = TextStyle(color = Color.Gray,
                            fontWeight = FontWeight.Normal,
                            fontFamily = integralcf),
                        modifier = Modifier
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color.White)
                            .width(300.dp)
                            .height(150.dp)
                    )
                }
                Column() {
                    Text(text = "LIEN",
                        fontWeight = FontWeight.Bold,
                        fontFamily = integralcf)
                    TextField(
                        value = link.value,
                        onValueChange = { pageAddViewModel.onLinkChange(it);println(it) },
                        //label = { Text("www.lienverstonbonplan.com") },
                        textStyle = TextStyle(color = Color.Gray,
                            fontWeight = FontWeight.Normal,
                            fontFamily = integralcf),
                        modifier = Modifier
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color.White)
                            .width(300.dp)
                            .height(50.dp)
                    )
                }

                PrimaryButton("Suivant",0){
                    if(label.value != "" && souslabel.value != "" && link.value != ""){
                        navController.navigate("addPlan/2/"+label.value+"/"+link.value+"/"+souslabel.value)
                    }
                    else{
                        Toast.makeText(mContext,"Veuillez remplir tous les champs",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }

    if (pageId == 2){
        Surface(color = GrayWhite,modifier = Modifier.clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(75.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.width(180.dp).padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceAround){
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(DarkBlue)
                        .width(50.dp)
                        .height(10.dp)){
                    }
                    Box(modifier = Modifier
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(Color.Gray)
                        .width(50.dp)
                        .height(10.dp)){
                    }
                }
                
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "PHOTO DU BON PLAN",
                        fontWeight = FontWeight.Bold,
                        fontFamily = integralcf)
                    Box(modifier = Modifier.clickable {
                        launcher.launch("image/*")
                    }
                        .clip(
                            RoundedCornerShape(25.dp)
                        )
                        .background(DarkBlue)
                        .width(200.dp)
                        .height(200.dp)){
                        Text(text = "+",
                            fontSize = 130.sp,
                            color = Color.White,
                            modifier = Modifier.padding(start = 65.dp))
                    }
                }

                PrimaryButton("AJOUTER CE BON PLAN",0){
                    var newOffer = Offer()
                    newOffer.label = label.value
                    newOffer.souslabel = souslabel.value
                    newOffer.link = link.value
                    offerService.create(newOffer)
                    navController.navigate("home")
                }
            }
        }
    }

}