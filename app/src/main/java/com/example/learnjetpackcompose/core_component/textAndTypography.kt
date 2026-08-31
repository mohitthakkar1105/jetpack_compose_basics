package com.example.learnjetpackcompose.core_component
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import com.example.learnjetpackcompose.R // Isko ADD karein
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SimpleText(){
    Box(
        modifier = Modifier.fillMaxSize().background(
            color = colorResource(R.color.white)
        ),
        contentAlignment = Alignment.Center,

    ){
        Text(
            text = "Mohit Thakkar is native android developer",
            color = colorResource(R.color.black),
            fontSize = 20.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            fontWeight = FontWeight.W400,
            style = TextStyle(
                shadow = Shadow(
                    color = colorResource(R.color.purple_500),
                    offset = Offset(3f,3f),
                    blurRadius = 8f
                )
            )
        )
    }
}

@Composable
fun ColoredFullText(){
    val rainBowColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Green,
        Color.Blue,
        Color.Magenta
    )
    Box(
        modifier = Modifier.fillMaxSize().background(
            color = colorResource(R.color.white)
        ),
        contentAlignment = Alignment.Center,
    ){
        Text(
            text = buildAnnotatedString {
                append("hello my name is mohit thakkar \n")
                withStyle(
                    style = SpanStyle(
                        brush = Brush.linearGradient(
                           colors =  rainBowColors
                        )
                    )
                ){
                    append("Mohit Thakkar")
                }
            }
        )
    }
}

@Composable
fun ScrollText(){
    Box(
        modifier = Modifier.fillMaxSize().background(
            color = colorResource(R.color.white)
        ),
        contentAlignment = Alignment.Center,
    ){
        Text(
            modifier = Modifier.width(200.dp).basicMarquee(),
            text = "mohit thakkar is android developer",
            fontSize = 20.sp,
        )
    }
}

@Composable
fun OverflowExample() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = "Mohit Thakkar is Android Developer and Learning Jetpack Compose",
            modifier = Modifier.width(180.dp),
            fontSize = 20.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis // overflow ke liye maxline zaruri hai
        )

    }
}
