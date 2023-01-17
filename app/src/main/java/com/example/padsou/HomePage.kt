package com.example.padsou

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
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
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsou.ui.theme.PadsouTheme


class HomePage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val integralcf = Typeface.createFromAsset(assets, "fonts/integralcf_regular.ttf")
        val integralcf_bold = Typeface.createFromAsset(assets, "fonts/integralcf_bold.otf")


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
                            .clip(RoundedCornerShape(40.dp,40.dp))
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
