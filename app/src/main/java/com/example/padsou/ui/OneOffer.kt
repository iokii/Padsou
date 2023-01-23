package com.example.padsou.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsou.ui.theme.PadsouTheme
import com.example.padsou.ui.components.*
import com.example.padsou.models.*


class OneOffer : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var TacoBell = Offer(
            "Vente Privé TacoBell",
            "Ticket d'entrée",
            listOf(Comment(
                User(
                    "Fitz",
                    "https://pbs.twimg.com/profile_images/1574997475697500161/AppQQjmp_400x400.jpg",
                    "Fitz@mushoku.net",
                    "lePluBo"
                ),
                3,
                "Sah Tacobell en France ça fait plaisir oulalalalalalalalalalalaalalalalalalalaalalalalalalalaalalal j'ai faim ça rasse j'ai hate de manger mes coquilettes au poulet en sah les pates directemment en intravaineuse"
            ), Comment(
                User(
                    "Fitz",
                    "https://pbs.twimg.com/profile_images/1574997475697500161/AppQQjmp_400x400.jpg",
                    "Fitz@mushoku.net",
                    "lePluBo"
                ),
                5,
                "boop"
            )
            ),
            666,
            "https://media-cdn.tripadvisor.com/media/photo-w/13/c1/2c/b6/taco-bell.jpg",
            Filter.COURSES
        )



        super.onCreate(savedInstanceState)
        setContent {
            PadsouTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    color = Color(0xFFEBE7FF)

                ) {
                    Column() {
                        HeaderOneOffer(TacoBell)
                        for (comment in TacoBell.listComment) {
                            commentOneOffer(comment)
                        }
                        Text("TESTÉE PAR ${TacoBell.nbrTested} GALÉRIENS",Modifier.padding(top = 20.dp, start = 70.dp), Color.Black, fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    }


                }
            }
        }
    }
}





