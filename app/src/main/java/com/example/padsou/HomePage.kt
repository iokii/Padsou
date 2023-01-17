package com.example.padsou

import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsou.models.Filter
import com.example.padsou.models.Offer
import com.example.padsou.ui.components.OfferInList
import com.example.padsou.ui.theme.PadsouTheme


class HomePage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val integralcf = Typeface.createFromAsset(assets, "fonts/integralcf_regular.ttf")
        val integralcf_bold = Typeface.createFromAsset(assets, "fonts/integralcf_bold.otf")
        var offers: List<Offer> = listOf()
        val offer1 = Offer("label","sous label",listOf(), 15,"https://www.lequipe.fr/_medias/img-photo-jpg/choisir-sa-salle-de-sport-n-est-pas-une-mince-affaire-dr/1500000001493791/137:92,1860:1240-828-552-75/7d418.jpg","https://upload.wikimedia.org/wikipedia/commons/a/a3/Basic-Fit_logo.png",Filter.COURSES)
        val offer2 = Offer("a","aa",listOf(), 15,"https://www.ptitchef.com/imgupl/recipe/french-tacos--md-457637p713643.jpg","https://upload.wikimedia.org/wikipedia/commons/a/a3/Basic-Fit_logo.png",Filter.COURSES)
        val offer3 = Offer("a","aa",listOf(), 15,"https://www.challenges.fr/assets/img/2022/10/06/cover-r4x3w1200-633eeafb54371-sir-winston2-romainricard-09.jpg","https://upload.wikimedia.org/wikipedia/commons/a/a3/Basic-Fit_logo.png",Filter.COURSES)
        val offer4 = Offer("a","aa",listOf(), 15,"https://cf.bstatic.com/xdata/images/hotel/max1024x768/184305239.jpg?k=2d22fe63ae1f8960e057238c98fb436f7bd9f65854e3a5e918607c5cfa1d0a52&o=&hp=1","https://upload.wikimedia.org/wikipedia/commons/a/a3/Basic-Fit_logo.png",Filter.COURSES)
        val offer5 = Offer("a","aa",listOf(), 15,"https://cf.bstatic.com/xdata/images/hotel/max1024x768/184305239.jpg?k=2d22fe63ae1f8960e057238c98fb436f7bd9f65854e3a5e918607c5cfa1d0a52&o=&hp=1","https://upload.wikimedia.org/wikipedia/commons/a/a3/Basic-Fit_logo.png",Filter.COURSES)
        val offer6 = Offer("a","aa",listOf(), 15,"https://cf.bstatic.com/xdata/images/hotel/max1024x768/184305239.jpg?k=2d22fe63ae1f8960e057238c98fb436f7bd9f65854e3a5e918607c5cfa1d0a52&o=&hp=1","https://upload.wikimedia.org/wikipedia/commons/a/a3/Basic-Fit_logo.png",Filter.COURSES)
        val offer7 = Offer("a","aa",listOf(), 15,"https://cf.bstatic.com/xdata/images/hotel/max1024x768/184305239.jpg?k=2d22fe63ae1f8960e057238c98fb436f7bd9f65854e3a5e918607c5cfa1d0a52&o=&hp=1","https://upload.wikimedia.org/wikipedia/commons/a/a3/Basic-Fit_logo.png",Filter.COURSES)
        offers += offer1
        offers += offer2
        offers += offer3
        offers += offer4
        offers += offer5
        offers += offer6
        offers += offer7
        setContent {
            PadsouTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF5F67EA)
                ) {
                    Column() {
                        Text(text = "COUCOU TOI,",Modifier.padding(top = 60.dp, start = 50.dp), Color.White, fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily(integralcf_bold))
                        Text(text = "T'es en manque de thunes ?", Modifier.padding(top = 5.dp, start = 50.dp), Color.White, fontSize = 15.sp, fontWeight = FontWeight.Thin, fontFamily = FontFamily(integralcf))
                        Box(modifier= Modifier
                            .padding(top = 75.dp)
                            .fillMaxWidth()
                            .defaultMinSize(10.dp, 600.dp)
                            .clip(RoundedCornerShape(40.dp, 40.dp))
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(40.dp, 40.dp)
                            )
                        ){
                            Column() {
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 20.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                                    rectFilter(painterResource(R.drawable.shopping_bag), Color(0xFF5F67EA), "Courses", FontFamily(integralcf))
                                    rectFilter(painterResource(R.drawable.run), Color(0xFFF4696A), "Sport", FontFamily(integralcf))
                                    rectFilter(painterResource(R.drawable.train), Color(0xFF579BFE), "Trains", FontFamily(integralcf))
                                    rectFilter(painterResource(R.drawable.confetti), Color(0xFF7C8CF9), "Soirées", FontFamily(integralcf))
                                }
                                Row(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(20.dp, 10.dp), horizontalArrangement = Arrangement.SpaceBetween){
                                    Text(text = "Les plans du moment", modifier = Modifier, Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Normal, fontFamily = FontFamily(integralcf))
                                    Text(text = "Voir tout", modifier = Modifier, Color(0xFFFC6B68), fontSize = 15.sp, fontFamily = FontFamily(Font(R.font.inter)))
                                }
                                Column {
                                    LazyVerticalGrid(columns= GridCells.Fixed(2),
                                        contentPadding = PaddingValues(
                                            start = 10.dp,
                                            bottom = 16.dp
                                        ),
                                        modifier = Modifier.padding(20.dp).fillMaxSize(),
                                        content={
                                            items(offers.size) { index ->
                                                    OfferInList(offer = offers[index])
                                            }
                                        }
                                    )
                                    }
                                    }

                                }
                            }
                        }
                    }
                }
            }

}


@Composable
fun rectFilter(img: Painter, color: Color, title: String, font: FontFamily){
    val selected = remember { mutableStateOf(false) }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier= Modifier
            .clickable {
                selected.value = !selected.value
            }
            .size(50.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(
                color = (if (selected.value) Color.Gray else color),
                shape = RoundedCornerShape(5.dp)
            )
        ){
            Image(painter = img, contentDescription = title, modifier = Modifier
                .padding(12.5.dp, 12.5.dp, 0.dp, 0.dp)
                .size(25.dp))
        }
        Text(text = title, Modifier.padding(top = 8.dp), (if (selected.value) Color.Gray else color), fontSize = 10.sp, fontWeight = FontWeight.Normal, fontFamily = font)
    }
}
