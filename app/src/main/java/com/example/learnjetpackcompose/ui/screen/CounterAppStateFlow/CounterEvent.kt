package com.example.learnjetpackcompose.ui.screen.CounterAppStateFlow

sealed interface CounterEvent {

    data object Increment : CounterEvent

    data object Decrement : CounterEvent

    data object Reset : CounterEvent

    data object MultiplyByTwo : CounterEvent

    data object Loading : CounterEvent

}