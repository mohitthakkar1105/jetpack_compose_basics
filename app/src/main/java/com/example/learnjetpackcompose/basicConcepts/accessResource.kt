package com.example.learnjetpackcompose.basicConcepts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.learnjetpackcompose.R

@Composable
fun AccessStringResource(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            text = stringResource(R.string.name),
            color = colorResource(R.color.teal_200)
        )
    }
}

@Composable
fun AccessImages(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = stringResource(R.string.name)
        )
    }
}