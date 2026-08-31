package com.example.learnjetpackcompose.ui.screen.CounterApp

sealed interface CounterEvent {

    data object Increment : CounterEvent

    data object Decrement : CounterEvent

    data object Reset : CounterEvent

}