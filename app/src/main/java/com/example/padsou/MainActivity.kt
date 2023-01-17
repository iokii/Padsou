package com.example.padsou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsou.ui.theme.PadsouTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PadsouTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF5F67EA),
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(35.dp)
                        ,modifier = Modifier
                            .padding(start = 80.dp)
                            .fillMaxWidth()
                    ){

                        Column(Modifier.padding(top = 40.dp)) {
                            Text(
                                text = "PAS DE SOUS ?",
                                color = Color.White,
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Y'A PADSOU !!!!!",
                                color = Color(0xFFFC77A6),
                                fontSize = 35.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(5.dp),
                            modifier = Modifier
                                .padding(start = 80.dp)) {
                            Box(modifier = Modifier
                                .width(25.dp)
                                .height(5.dp)
                                .clip(shape = RectangleShape)
                                .background(Color.White)
                                .clip(
                                    RoundedCornerShape(25.dp)
                                ) ,
                            )
                            Box(modifier = Modifier
                                .width(25.dp)
                                .height(5.dp)
                                .clip(shape = RectangleShape)
                                .background(Color(0xFFb5b9b7))
                            )
                            Box(modifier = Modifier
                                .width(25.dp)
                                .height(5.dp)
                                .clip(shape = RectangleShape)
                                .background(Color(0xFFb5b9b7))
                            )
                        }

                        Box(
                            Modifier
                                .padding(start = 15.dp)
                                .width(225.dp)
                                .height(225.dp)
                                .background(Color.White)
                                .clip(RoundedCornerShape(20.dp))
                        ){
                                // Mettres les offres exemples
                        }

                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(start = 25.dp)
                                    .width(200.dp)
                                    .fillMaxWidth()
                            ) {
                            Text(
                                text = "Accède aux 500 bons plans qu’on te propose chaque mois",
                                fontSize = 15.sp,
                                textAlign = TextAlign.Center,
                                color = Color.White
                            )

                        }


                        //Bouton



                        
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PadsouTheme {

    }
}
