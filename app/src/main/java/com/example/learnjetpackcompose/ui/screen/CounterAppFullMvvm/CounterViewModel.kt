package com.example.learnjetpackcompose.ui.screen.CounterAppFullMvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        CounterUiState()
    )

    val uiState = _uiState.asStateFlow()

    private val _uiEffect =
        MutableSharedFlow<CounterUiEffect>()

    val uiEffect = _uiEffect.asSharedFlow()

    fun onEvent(event: CounterEvent) {

        when (event) {

            CounterEvent.Increment -> {

                val newCount =
                    _uiState.value.count + 1

                _uiState.update {

                    it.copy(
                        count = newCount
                    )

                }

                viewModelScope.launch {

                    _uiEffect.emit(

                        CounterUiEffect.ShowSnackbar(
                            "Counter Incremented"
                        )

                    )
                }

            }

            CounterEvent.Decrement -> {

                if (_uiState.value.count > 0) {

                    val newCount =
                        _uiState.value.count - 1

                    _uiState.update {

                        it.copy(
                            count = newCount
                        )

                    }

                    viewModelScope.launch {

                        _uiEffect.emit(

                            CounterUiEffect.ShowSnackbar(
                                "Counter Decremented"
                            )

                        )

                    }

                }

            }

            CounterEvent.Reset -> {

                _uiState.value =
                    CounterUiState()

                viewModelScope.launch {

                    _uiEffect.emit(

                        CounterUiEffect.ShowSnackbar(
                            "Counter Reset"
                        )

                    )

                }

            }

            CounterEvent.Loading -> {

                viewModelScope.launch {

                    _uiState.update {

                        it.copy(
                            loading = true
                        )

                    }

                    delay(3000)

                    _uiState.update {

                        it.copy(
                            loading = false
                        )

                    }

                    _uiEffect.emit(

                        CounterUiEffect.ShowSnackbar(
                            "Loading Finished"
                        )

                    )

                }

            }

        }

    }

}