package com.example.learnjetpackcompose.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomDialogExample() {

    var showDialog by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Button(
            onClick = {
                showDialog = true
            }
        ) {
            Text("Open Dialog")
        }

        if (showDialog) {

            Dialog(

                onDismissRequest = {

                    showDialog = false

                }

            ) {

                Box(

                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Color.White,
                            RoundedCornerShape(16.dp)
                        )
                        .padding(20.dp)

                ) {

                    Column(

                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {

                        Text(
                            text = "Welcome Mohit",
                            style = MaterialTheme.typography.headlineSmall
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "This is a Custom Dialog"
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Button(
                            onClick = {

                                showDialog = false

                            },
                            modifier = Modifier.align(Alignment.Start)
                        ) {

                            Text("Close")

                        }

                    }

                }

            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun CustomDialogPreview() {

    CustomDialogExample()

}