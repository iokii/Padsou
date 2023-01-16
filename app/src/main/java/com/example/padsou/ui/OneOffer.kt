package com.example.padsou.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.padsou.ui.theme.PadsouTheme
import com.example.padsou.ui.components.HeaderOneOffer

class OneOffer : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PadsouTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    HeaderOneOffer(img = "https://media-cdn.tripadvisor.com/media/photo-w/13/c1/2c/b6/taco-bell.jpg", Data = "Abonnement 1 an", SubData = "2 mois offerts")

                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PadsouTheme {
        HeaderOneOffer(img = "https://media-cdn.tripadvisor.com/media/photo-w/13/c1/2c/b6/taco-bell.jpg", Data = "Abonnement 1 an", SubData = "2 mois offerts")
    }
}
