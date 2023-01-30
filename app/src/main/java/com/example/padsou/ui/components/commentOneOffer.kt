package com.example.padsou.ui.components

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.padsou.models.CommentViewModel
import com.example.padsou.models.Commentaire
import com.example.padsou.models.Offer
import com.example.padsou.models.User
import com.example.padsou.ui.components.*
import com.example.padsou.ui.theme.integralcf

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun commentOneOffer(comment : Commentaire,commentViewModel : CommentViewModel){

            LaunchedEffect(Unit){
                commentViewModel.get(comment.userid)
            }

        var user: State<User?> = commentViewModel.user.collectAsState()


        Column(verticalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier
                .padding(top = 40.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(10)
                )
                .background(Color.White)) {

            Row(horizontalArrangement = Arrangement.spacedBy(15.dp),
                modifier = Modifier.
                padding(top = 20.dp, start = 20.dp)) {
                AsyncImage(model = user.value?.pdp,
                    contentDescription = "Profile picture",
                    Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                )

                Column(
                    Modifier
                        .padding(top = 5.dp)
                ) {
                    Text(text = "Proposé par ",Modifier, Color.Black)
                    user.value?.name?.let { Text(text = it,Modifier,Color.Black,fontWeight = FontWeight.Bold) }
                }
                stars(comment.note.toInt())

            }

            Text(text = comment.desc,
                fontWeight = FontWeight.Normal,
                fontFamily = integralcf,
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 25.dp, end = 20.dp)
            )
            
        }




}