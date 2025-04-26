package com.example.profileactivity

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileactivity.ui.theme.ProfileactivityTheme
import java.nio.file.WatchEvent
import java.time.format.TextStyle
import kotlin.io.encoding.Base64

val customGreen= androidx.compose.ui.graphics.Color(0xFF1BD29A)


class Card : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Scaffold{ innerPadding->
                card(innerPadding)


            }
        }
    }
}

@Composable
fun card(innerPadding: PaddingValues){
    Column(
        modifier = Modifier.padding(innerPadding)
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color(0xFF1BD29A))
    )

    {
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 80.dp)
        )
        {
            Text(text = "Card",
                style = androidx.compose.ui.text.TextStyle(fontSize = 50.sp,
                    color = androidx.compose.ui.graphics.Color.White,
                    fontWeight = FontWeight.SemiBold


                )



            )
            Image(
                painter = painterResource(R.drawable.cardprofileimg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.offset(x=200.dp, y=-60.dp)
                    .height(60.dp)
                    .width(60.dp)
                    .clip(RoundedCornerShape(80.dp))

            )



        }

    }

    Column {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 150.dp)
        )

        {
            Text(text = "Simple and easy to use app. ",
                style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp,
                    color = androidx.compose.ui.graphics.Color.White,
//                    fontWeight = FontWeight.SemiBold


                )
            )
        }
    }
    Column {
        Row (
            modifier = Modifier
//                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 200.dp)
        ) {
            Card(

                modifier = Modifier
                    .height(160.dp)
                    .width(160.dp),
//                    .weight(1f),
                shape = RoundedCornerShape(15.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = androidx.compose.ui.graphics.Color.White
                )

            )
            {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                )

                {
                    Image(
                        painter = painterResource(R.drawable.book),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(110.dp)


                    )
                    Text(text = "Text", style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp) ,
                        modifier = Modifier.offset(x=0.dp, y=70.dp)
                    )

                }
            }
            Card(

                modifier = Modifier
                    .offset(x=35.dp)
                    .height(160.dp)
                    .width(160.dp),
//                    .weight(1f),
                shape = RoundedCornerShape(15.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = androidx.compose.ui.graphics.Color.White
                )

            ){
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(R.drawable.address),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp)
//                            .offset(x=10.dp, y=100.dp)
                    )
                    Text(text = "Address", style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)
                        , modifier = Modifier.offset(y=70.dp))
                }

            }




        }



    }
    Column {
        Row(

            modifier = Modifier
//                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp)
        )
        {
            Card (

                modifier = Modifier
                    .offset(x=10.dp, y=375.dp)
                    .height(160.dp)
                    .width(160.dp),
//                    .weight(1f),
                shape = RoundedCornerShape(15.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = androidx.compose.ui.graphics.Color.White
                )

            )
            {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(R.drawable.character),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp)
//                            .offset(x=10.dp, y=100.dp)
                    )
                    Text(text = "Character", style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)
                        , modifier = Modifier.offset(y=70.dp))
                }


            }




            Card(

                modifier = Modifier
                    .offset(x=45.dp, y=375.dp)
                    .height(160.dp)
                    .width(160.dp),
//                    .weight(1f),
                shape = RoundedCornerShape(15.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = androidx.compose.ui.graphics.Color.White
                )

            ){
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(R.drawable.card),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp)
//                            .offset(x=10.dp, y=100.dp)
                    )
                    Text(text = "Bank Card", style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)
                        , modifier = Modifier.offset(y=70.dp))
                }


            }



        }
    }


    Column {
        Row(

            modifier = Modifier
//                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp)
        )
        {
            Card (

                modifier = Modifier
                    .offset(x=10.dp, y=560.dp)
                    .height(160.dp)
                    .width(160.dp),
//                    .weight(1f),
                shape = RoundedCornerShape(15.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = androidx.compose.ui.graphics.Color.White
                )

            )
            {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(R.drawable.password),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp)
//                            .offset(x=10.dp, y=100.dp)
                    )
                    Text(text = "Password", style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)
                        , modifier = Modifier.offset(y=70.dp))
                }


            }




            Card(

                modifier = Modifier
                    .offset(x=44.dp, y=560.dp)
                    .height(160.dp)
                    .width(160.dp),
//                    .weight(1f),
                shape = RoundedCornerShape(15.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = androidx.compose.ui.graphics.Color.White
                )

            ){
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(R.drawable.logistics),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp)
//                            .offset(x=10.dp, y=100.dp)
                    )
                    Text(text = "Logistics", style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)
                        , modifier = Modifier.offset(y=70.dp))
                }


            }



        }
    }
    Column {
        Row {
            Card (
                modifier = Modifier
                    .offset(x=17.dp,y=740.dp)
                    .height(100.dp)
                    .width(360.dp),
//                    .weight(1f),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 15.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = androidx.compose.ui.graphics.Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(R.drawable.settings),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(100.dp)
//                            .offset(x=10.dp, y=100.dp)
                    )
                    Text(
                        text = "Settings",
                        style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                        modifier = Modifier.offset(x = 150.dp, y = 40.dp)
                    )

                }
            }
        }
    }



}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    card(innerPadding = PaddingValues(0.dp))
}