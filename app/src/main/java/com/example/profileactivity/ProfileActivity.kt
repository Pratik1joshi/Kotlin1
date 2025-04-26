package com.example.profileactivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileactivity.ui.theme.ProfileactivityTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {innerPadding->
                ProfileBody(innerPadding)

            }
        }
    }
}

@Composable
fun ProfileBody(innerPadding: PaddingValues){
    Column(modifier = Modifier.padding(innerPadding).fillMaxSize().background(color = Color.White)) {
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                tint = Color.Red,
                contentDescription = null, modifier = Modifier.height(28.dp).width(28.dp))

            Text(text = "Patrik", style = TextStyle(
                fontSize = 20.sp,
//                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
            ))

            Icon(painter = painterResource(R.drawable.baseline_more_horiz_24),
                tint = Color.Red,
                contentDescription = null, modifier = Modifier.height(28.dp).width(28.dp))
        }

        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround) {
            Image(painter = painterResource(R.drawable.profile),
                contentDescription = null, modifier = Modifier.height(100.dp).width(100.dp).clip(
                    RoundedCornerShape(100.dp)
                ))

            Column ( verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "3", style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold))
                Text(text = "Posts")
            }
            Column ( verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "222", style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold))
                Text(text = "Followed")
            }
            Column( verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "225", style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold))
                Text(text = "Following")
            }
        }

        Column(modifier = Modifier.padding(horizontal = 15.dp, vertical = 8.dp)){
            Text(text = "Pratik Joshi", style = TextStyle(
                fontSize = 16.sp,
//                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Bold))
            Text(text = "he/his", modifier = Modifier.alpha(alpha = 0.5f).padding(vertical = 3.dp))
            Text(text = "Wanna eat Choco pie")
            Text(text="Meet me @ jcpratik777@gmail.com", style = TextStyle(
                fontStyle = FontStyle.Italic
            ), modifier = Modifier.alpha(alpha = 0.7f).padding(vertical = 3.dp))
        }

        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {
//                TODO
            }) { Text(text = "Follow") }

            OutlinedButton(onClick = {

            }) { Text(text = "Message") }

            OutlinedButton(onClick = {

            }) { Text(text = "Email") }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}