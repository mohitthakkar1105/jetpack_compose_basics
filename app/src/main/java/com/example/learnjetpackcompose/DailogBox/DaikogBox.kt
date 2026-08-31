package com.example.learnjetpackcompose.dialog
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DialogExample() {

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

            AlertDialog(

                onDismissRequest = {
                    showDialog = false
                },

                title = {
                    Text( "Delete Item")
                },

                text = {
                    Text("Are you sure you want to delete this item?")
                },

                confirmButton = {

                    Button(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text("Yes")
                    }
                },

                dismissButton = {
                    Button(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text("No")
                    }
                }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DialogPreview() {
    DialogExample()
}