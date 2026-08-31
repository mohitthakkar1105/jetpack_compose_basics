package com.example.learnjetpackcompose.snackbar

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.launch

@Composable
fun MyScreen() {

    val snackbarHostState = remember {
        SnackbarHostState()
    }

    val scope = rememberCoroutineScope()

    Scaffold(

        snackbarHost = {

            SnackbarHost(
                hostState = snackbarHostState
            ) { snackbarData ->

                Snackbar(

                    containerColor = Color.Red,

                    contentColor = Color.White,

                    action = {

                        Text(
                            text = snackbarData.visuals.actionLabel ?: "",
                            color = Color.Yellow
                        )

                    }

                ) {

                    Text(
                        text = snackbarData.visuals.message
                    )

                }

            }

        },

        floatingActionButton = {

            FloatingActionButton(

                onClick = {

                    scope.launch {

                        val result = snackbarHostState.showSnackbar(

                            message = "Saved Successfully",

                            actionLabel = "Undo",

                            duration = SnackbarDuration.Short



                        )

                        if (result == SnackbarResult.ActionPerformed) {
                            println("Undo Clicked")

                        } else {

                            println("Snackbar Dismissed")

                        }

                    }

                }

            ) {

                Text("+")

            }

        }

    ) { }

}