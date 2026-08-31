package com.example.learnjetpackcompose.ui.screen.CounterAppFullMvvm
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun CounterScreen(

) {

    val viewModel = viewModel<CounterViewModel>()

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    val snackbarHostState = remember {
        SnackbarHostState()
    }

    LaunchedEffect(Unit) {
        viewModel.uiEffect.collect { effect ->
            when (effect) {
                is CounterUiEffect.ShowSnackbar -> {
                    snackbarHostState.showSnackbar(
                        effect.message
                    )
                }
            }
        }
    }

    Scaffold(
        snackbarHost = {
            SnackbarHost(
                hostState = snackbarHostState
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),

            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text(
                text = "Count : ${uiState.count}"
            )

            if (uiState.loading) {

                CircularProgressIndicator()

            }

            Button(

                onClick = {

                    viewModel.onEvent(
                        CounterEvent.Increment
                    )

                }

            ) {

                Text("Increment")

            }

            Button(

                onClick = {

                    viewModel.onEvent(
                        CounterEvent.Decrement
                    )

                }

            ) {

                Text("Decrement")

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

            Button(

                onClick = {

                    viewModel.onEvent(
                        CounterEvent.Loading
                    )

                }

            ) {

                Text("Loading")

            }

        }

    }

}