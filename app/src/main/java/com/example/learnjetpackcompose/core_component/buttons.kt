package com.example.learnjetpackcompose.core_component

import android.util.Log
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FilledButtonSample(){
    Button(
        onClick = {
            Log.d("MOHIT123", "Button Clicked")
        },
        modifier = Modifier.width(300.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFF6B00), // Button Background
            contentColor = Color.White          // Text Color
        )
    ) {
        Text(text = "Click Me")
    }
}

@Composable
fun TonalButton(){
    FilledTonalButton(
        onClick = {

        }
    ) {
        Text(text = "Click Me")
    }
}

@Composable
fun OutlinedButtoned(){
    OutlinedButton(
        onClick = {

        }
    ) {
        Text(text = "Click Me")
    }
}


@Composable
fun Elevatedbuttoned(){
    ElevatedButton(
        onClick = {

        }
    ) {
        Text(text = "Click Me")
    }
}

@Composable
fun TextedButtoned(){
    TextButton(
        onClick = {

        }
    ) {
        Text(text = "Click Me")
    }
}