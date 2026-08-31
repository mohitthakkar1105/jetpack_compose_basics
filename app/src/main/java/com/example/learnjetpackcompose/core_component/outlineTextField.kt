package com.example.learnjetpackcompose.core_component
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by remember{
        mutableStateOf("")
    }

    val rainBowColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Green,
        Color.Blue,
        Color.Magenta
    )

    val brush = Brush.linearGradient(
        colors = rainBowColors
    )

    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        textStyle = TextStyle(
            brush = brush
        )
    )

//    OutlinedTextField(
//        value = text,
//        onValueChange = {
//            text = it
//        },
//        label = {
//            Text(text = "Name")
//        },
//        shape = RoundedCornerShape(30.dp),
//    )
}


@Composable
fun PasswordTextFieldSample() {
    var password by remember {
        mutableStateOf("")
    }

    TextField(
        value = password,
        onValueChange = {
            password = it
        },
        label = {
            Text(text = "Password")
        },
        visualTransformation = PasswordVisualTransformation(),//Ye sirf screen par text ko hide karta hai.
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        )
//        keyboardOptions:->
//        Password suggestions off ho sakti hain.
//        Auto-correct off ho sakta hai.
//        Keyboard password entry ke hisaab se behave karta hai.
    )
}


@Preview(showSystemUi = true)
@Composable
fun SimpleOutlinedTextFieldSamplePreview(){
    PasswordTextFieldSample()
}

