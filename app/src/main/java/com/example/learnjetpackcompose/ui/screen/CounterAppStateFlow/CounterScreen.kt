package com.example.learnjetpackcompose.ui.screen.CounterAppStateFlow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreenMvvMStateFlow() {

    val viewModel = viewModel<CounterViewModel>()

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column(

        modifier = Modifier.fillMaxSize(),

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(
            text = uiState.count.toString()
        )
        if(uiState.isEven){
            Text(text = "Even")
        }

        Row {

            Button(

                onClick = {

                    viewModel.onEvent(
                        CounterEvent.Decrement
                    )

                }

            ) {

                Text("-")

            }

            Button(

                onClick = {

                    viewModel.onEvent(
                        CounterEvent.Increment
                    )

                }

            ) {

                Text("+")

            }

            Button(

                onClick = {

                    viewModel.onEvent(
                        CounterEvent.Reset
                    )

                }

            ) {

                Text("Reset")

            }

//            Button(
//                onClick = {
//                    viewModel.onEvent(CounterEvent.MultiplyByTwo)
//                }
//            ) {
//                Text("Multiply By 2")
//            }

            Button(
                onClick = {
                    viewModel.onEvent(CounterEvent.Loading)
                }
            ) {
                if (uiState.loading){
                    Text("Loading....")
                }else{
                    Text("Load it")
                }
            }

        }

    }

}