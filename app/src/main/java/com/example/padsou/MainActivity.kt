package com.example.padsou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.padsou.models.User
import com.example.padsou.ui.theme.PadsouTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val user = User(
            "Fitz",
            "https://pbs.twimg.com/profile_images/1574997475697500161/AppQQjmp_400x400.jpg",
            "Fitz@mushoku.net",
            "lePluBo"
        )

        super.onCreate(savedInstanceState)
        setContent {
            PadsouTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF5F67EA)
                ) {
                    Column(Modifier.padding(top = 70.dp),
                        verticalArrangement = Arrangement.spacedBy(15.dp)
                    ) {
                        AsyncImage(model = user.pdp,
                            contentDescription = "Image de profile",
                            modifier = Modifier
                                .padding(start = 145.dp)
                                .clip(CircleShape)
                                .size(125.dp)
                        )
                        Text(user.name, fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 185.dp)
                        )

                        Box(
                            Modifier
                                .fillMaxWidth()
                                .height(500.dp)
                                .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                                .background(Color.White)
                            ) {
                            Column(Modifier.padding(start = 110.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(10.dp)) {
                                Text(text = "Email :", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                                Text(text = user.email, fontSize = 25.sp)
                                Text(text = "Mot de Passe :", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                                Text(text = user.password, fontSize = 25.sp)
                                Text(text = "Offres abonnés :", fontSize=25.sp, fontWeight = FontWeight.Bold)
                                //Do show offres abonné


                            }
                        }

                    }



                }
            }
        }
    }
}


