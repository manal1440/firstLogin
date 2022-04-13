package com.example.loginfirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.tiles.material.Text
import com.example.loginfirst.ui.theme.LoginFirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LoginImage()
            WelcomeTextField()
            ButtonLogin()
        }
    }
}

@Composable
fun LoginImage() {
    Column( verticalArrangement = Arrangement.Top) {
        Image(
            painter = painterResource(id = R.drawable.login_image),
            contentDescription = "Logo"
        )
    }

}
//@Composable
//fun WelcomeText(name:String){
//   Text(text = "Hello $name!",
//   color = Color.Gray)
//}
@Composable
fun WelcomeTextField(){
    Column(verticalArrangement = Arrangement.Center) {
        var name = remember{
            mutableStateOf("")
        }
        Text(text = "Hello $name!",
            color = Color.Gray)
        OutlinedTextField(value = name.value, onValueChange = {name.value = it},
            label = {Text(text="name")})
    }

}
@Composable
fun ButtonLogin(){
    Column(verticalArrangement = Arrangement.Bottom) {
        
    }
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.secondary)) {
       Text(text ="Login")
    }
}


@Preview (showBackground = true)
    @Composable
fun previewImage(){
        LoginImage()
        WelcomeTextField()
        ButtonLogin()
}
