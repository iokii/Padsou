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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
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
                    Column(verticalArrangement = Arrangement.spacedBy(50.dp)
                        ,modifier = Modifier.padding(start = 80.dp)
                    ){

                        Column(Modifier.padding(top = 100.dp)) {
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
                                .width(25.dp).height(5.dp)
                                .clip(shape = RectangleShape)
                                .background(Color.White)
                                .clip(
                                    RoundedCornerShape(25.dp)
                                ) ,
                            )
                            Box(modifier = Modifier
                                .width(25.dp).height(5.dp)
                                .clip(shape = RectangleShape)
                                .background(Color(0xFFb5b9b7))
                            )
                            Box(modifier = Modifier
                                .width(25.dp).height(5.dp)
                                .clip(shape = RectangleShape)
                                .background(Color(0xFFb5b9b7))
                            )
                        }



                        


                        
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
