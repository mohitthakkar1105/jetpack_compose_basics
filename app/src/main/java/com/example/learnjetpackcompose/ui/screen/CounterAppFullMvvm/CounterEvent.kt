package com.example.learnjetpackcompose.ui.screen.CounterAppFullMvvm


sealed interface CounterEvent {

    data object Increment : CounterEvent

    data object Decrement : CounterEvent

    data object Reset : CounterEvent

    data object Loading : CounterEvent

}