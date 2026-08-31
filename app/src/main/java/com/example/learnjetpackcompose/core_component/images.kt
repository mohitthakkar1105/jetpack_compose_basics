package com.example.learnjetpackcompose.core_component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjetpackcompose.R

@Composable
fun ShowImage(){
    Box(
        modifier = Modifier.fillMaxSize().background(
            color = Color.White
        ).padding(
            all = 40.dp
        ),

    ) {
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = "hello",
            contentScale = ContentScale.Crop,// poora box fil karegi baki bachega wo cutted
            modifier = Modifier.size(300.dp).clip(
                CircleShape
            ).border(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Red,
                        Color.Blue,
                        Color.Green
                    )
                    ),
                width = 5.dp,
                shape = CircleShape
            ),
            colorFilter = ColorFilter.colorMatrix(
                ColorMatrix().apply {
                    setToSaturation(5600f)
                }
            )
        )
    }
}

@Preview
@Composable
fun ShowImagePreview(){
    ShowImage()
}