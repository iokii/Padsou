package com.example.padsou.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.padsou.models.Comment
import com.example.padsou.models.Filter
import com.example.padsou.models.Offer
import com.example.padsou.ui.components.FooterAdd
import com.example.padsou.ui.components.OfferInList
import com.example.padsou.ui.components.OfferOnBoarding
import com.example.padsou.ui.components.PrimaryButton
import com.example.padsou.ui.theme.DarkBlue
import com.example.padsou.ui.theme.PadsouTheme
import com.example.padsou.ui.theme.integralcf

@Composable
fun onBoarding(navController: NavController){
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
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf
            )
            Text(
                text = "Y'A PADSOU !!!!!",
                color = Color(0xFFFC77A6),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf
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
                .width(250.dp)
                .height(270.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(Color.White)
        ){
            LazyVerticalGrid(columns= GridCells.Fixed(2),
                contentPadding = PaddingValues(
                    start = 10.dp,
                    bottom = 16.dp
                ),
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxSize(),
                content={
                    item {
                        OfferOnBoarding(
                            offer = Offer(
                                "Abonnement 1 an",
                                "2 mois offert",
                                listOf<Comment>(),
                                666,
                                "https://s3-alpha-sig.figma.com/img/a27a/ec98/8d39579645891972d626eef3f3b84891?Expires=1675641600&Signature=SEBTu0FSFAH57syQ6LC8RpAmqMbsDhwcNYKLA4CUnuCG9M~x6eteFM9XQaEWy7xrn5G6uWZ3bcT8zcr3XgzqmzaQ~udlOf7wCMvqsxCcTLfyYow8HKuAhBrncRz12pggmIBgevEgd7~pVlEj-z9oHUCObwBmBPVoS8IhUSrTirBjN9~kz36i8OQ6abOoW8oxtE4QbZYfGyRUHp7AHzCOWEzTSZhjC994E-plEcD~OmR6c0FXUjQIdp3e7g7pplEDo37t6rGBLei-DdDTPLs~-6H8L1yWGmccWS68vxK~zvrYXmuoJmV1T96aPI95uECQEGfdPXoTvPaRD2r-qe-5Uw__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4",
                                Filter.SPORT,
                                "https://s3-alpha-sig.figma.com/img/5a33/b14a/181361326f223ef0f1b1698109211842?Expires=1675641600&Signature=b6wEgpBPTGaLXsPHXBp-Ik03pW-05U6vVfDKhie6SI4GlRdx1CuxGY3bx~coy977a48bfxCo3XiT7R7JSm4flNGsnAUDTxIXRxHvVmLziSPU5KwE09-KLRoZezvfWPds7DQw1aftD9~x8Uj46kuSu5bn2OtogjLmJArl6VHkF7ihTBsMQZ-~mKmQqd8DKye6~cDQEhYx0QZAJrs1mkuLFm~rrxrsbrYtTFvsRTNFU9SQ7CJvQ16tIjAvC-EQ99Zgw08IqOiPB4TW~XgGuIkOofrp2XR0~CxX21Cnc023KeJZGPa4MddUK4U2Qk3xOIeKvGlsTQDb5ofPL3W7eNxysg__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
                            )
                        )
                    }
                    item{
                        OfferOnBoarding(
                            offer = Offer(
                                "Le grand barathon",
                                "1 verre acheté = 1 offert",
                                listOf<Comment>(),
                                666,
                                "https://s3-alpha-sig.figma.com/img/0173/41ca/634e2da6e7136a26f43442e52e23007c?Expires=1675641600&Signature=UGYp1sWAklEQrOixDUA-EwIxdimseUOEfhsDvxDiYR22NinlJHqPpdqdEuXgLJWJt1qvpYzP1j4wlXNQ3UaObK7lqdnxXv4E1Pv0vdLedXAoYrVpE67sqBkbzHXl-TeDb~INKgo-9k07jKTKq0qp5e0GZqxu9-Bqo7h8PNaeEY~OxJKX-UNhIur7Je64PfFUW6-E2BFW7fA2DvNNUnCVYwZKjt~MhPoAs4VBN4r0ANziBXAJbd4aNQFbbjRwRP8hzybRcSuXu7k2nBm~2FJXuav1tHDCcMRHRTJP3HURmQtp3HXXWvM3kBURCUVaUce1KwAmTlGjJi8FAkjVKSS8lA__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4",
                                Filter.SOIRÉE,
                                "https://s3-alpha-sig.figma.com/img/760b/1f6c/624e0cd7f22637f397e66f65df014969?Expires=1675641600&Signature=hWexwhMsRPDAwsGc3893DbpP23HAR9zBOf8RJP4mPS4KvTWNrTsACxTDQ2UV42X3N~bvv6bnzYwX5VAgRd6aWHQnG2vfJzmlLy5Yvb15O7kOV2NZoNX5jJfktGyIDZzrh8~BwteVxCnvKsGzyM9z7IwUadGu-3ofFzJWr6qF2j~Cu6z7F3vo58n--E~-eeYvQwQpjMIJZxprbUUJdcQzJ4tmYDmuTF9VZ-Tg6aX7nF~qY2Fc41BrMbetSOafPjxQ6HBs-khGjN3XOf~RywiT4Afra5MMmPAneFQZsZJwgpEYQa~a1AttSrFG7pOcVhSqtQyWV5GXtfbWg-PuoBQp8w__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
                            )
                        )
                    }
                    item{
                        OfferOnBoarding(
                            offer = Offer(
                                "Garantie appart",
                                "Pas besoin de garants",
                                listOf<Comment>(),
                                666,
                                "https://s3-alpha-sig.figma.com/img/af5f/d208/876c12a67cf3897f249e6c4c85bd3a17?Expires=1675641600&Signature=KeSWozzTEc19PxH0hxJIFbU7~BeJwX7vcYsOyYSwvdi2aQqkUwXs3uzrgbK0oPJYr7qSKpQaAy2I15WwtopMqn9PCAhOUKaEvisjf3mpB2cA8g1iI5FSPKBMW6yw~PYOaHwWH~j6CHg3CHK7Ql61qrTC8je2CPkHoOXyBzsADM3h4wF4hoQ0doyy6Xalt95WtYbchRsFKdTB5m4LdK4Kg2Bt6myW9EyAkMcxF3VThBtY2ONg85Femox~kvj0RT3CIA0GCd0IimY7w2E4slihR24pToPUXHCGtXh6JnSQU68sflu4k1it~ssVHw2rAodx1w~Xu60Z17jlk-NNh~81WA__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4",
                                Filter.COURSES,
                                "https://s3-alpha-sig.figma.com/img/65e2/5834/041d99eeca3789028278eaf91615aa43?Expires=1675641600&Signature=LuRSOvOfWO0IKjXManubXrGurGJADgPCV7zeCED4vi6J7eLQXF9PSwV6mk1TpjpHKW~9P0XDC0AFmz4Ul84imhstwbnq2je~cWFPT7RmM9l-4tquKGaN~UOXbeVh9ggeV8aj6q3386JuOXy08oVDK7XGc0ieFns4RAscxDqIfJaNapWAkvjhB2aDpWsu13b9sjKQY4IfajUZOnMlP2F24f6aMybB8PrY36YqdrvkXziGz3hbS414yLu1s1YnjcRGmQCmg3aHZJxQHWqlpFasioz4wggoCkDCR4ADTGd3GXq29i0V8Y0Sa5HPRkEZhMxkr1SdQ~5tnmalCVsUhe1rYg__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
                            )
                        )
                    }
                    item{
                        OfferOnBoarding(
                            offer = Offer(
                                "Giga MAXI Tacos",
                                "5€99, dépêche toi !",
                                listOf<Comment>(),
                                666,
                                "https://s3-alpha-sig.figma.com/img/09be/26ca/2681806bece28616098b285a3fbdaa12?Expires=1675641600&Signature=EMhkoMuU2NqAT1kHX7KouemdwrHN0bkv5xxtdFXAnUWjy8g7wr79jv3vkajrVSkrqhIZ8y337dv2uYpahQm4Ijr5NjS3-bE3AgWxht-sj14U8~DWYHwJIiKcse9dJlmaEmjUVBytnyUQj2J~lyzfVDMhZByCFtQSbChdDbyPXVEGx~A2g3rQsZt78GENF-Av6eWq8CgAZ2g3rZeQ0NBX291zvySpE03IA9vRs7v3YMRsBYt0eqDnF1NOkQDXHgypVa6ZWA9fILVpxX2-dguI0Gn251lc6r-otDcpO9SN0BYdimiw8foSR0HKRvpveawH~fadoajhCe7zhhm5InioFg__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4",
                                Filter.SPORT,
                                "https://s3-alpha-sig.figma.com/img/ffb5/1e07/baa4f851440fb8c897d33984096e15dc?Expires=1675641600&Signature=BO-VoKy~bQbV-UQw-ZiusGga0npl2WhoOjP4kO2ir-el3HJxuo8kS17kUO46j1~4eIVbUmMakcRj0MGwlcnkJEUPxz-PbIEaMyEWIE3Fyon0dEJvwEAEvSaOHBoVbaqzx8LY66RjyoaxJDJmyYR8uCYwdzacivVGFn7Aw3qRM7XqbKkN3g5CzFQRD4tiJ-~VlolUkFCowqAB2FMR6iVC0gfprsdb58wUIskFfYcrJsZmMOopbwrsG-RIytXyRe2b3tA1vZiTCxFfgnOsRie7KHgOzP09ZRqbeLpMEhbAPSOQ47X0uO~hUoQA996cNUWCFdkU0IISGwpusd-aSE0dtQ__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
                            )
                        )
                }})

            }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(start = 20.dp)
                .width(200.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Accède aux 500 bons plans qu’on te propose chaque mois",
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Normal,
                fontFamily = integralcf
            )

        }

        Box(modifier = Modifier.padding(bottom = 15.dp)){
            Button(onClick = { navController.navigate("loginview") },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF9709C)),
            modifier = Modifier
                .width(250.dp)
                .height(70.dp)
                .clip(RoundedCornerShape(20.dp))
        ) {
            Text("C'est parti !", style = TextStyle(color = Color.White),
                fontWeight = FontWeight.Bold,
                fontFamily = integralcf,
                fontSize = 20.sp)
        }
        }


    }
}
}

