package com.example.learnjetpackcompose.loader
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoaderExample() {

    var isLoading by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column() {

            Button(
                onClick = {
                    isLoading = true
                }
            ) {
                Text("Show Loader")
            }

            Spacer(modifier = Modifier.height(20.dp))

            if (isLoading) {

                CircularProgressIndicator(
                    color = Color.DarkGray
                )

            }

        }

    }

}