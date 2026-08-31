package com.example.learnjetpackcompose.ui.screen.CounterAppStateFlow

data class CounterUiState(

    val count: Int = 0,

    val loading: Boolean = false,

    val isEven: Boolean = true

)