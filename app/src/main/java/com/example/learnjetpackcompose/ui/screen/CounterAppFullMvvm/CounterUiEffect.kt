package com.example.learnjetpackcompose.ui.screen.CounterAppFullMvvm

sealed interface CounterUiEffect {

    data class ShowSnackbar(

        val message: String

    ) : CounterUiEffect
}