package com.example.learnjetpackcompose.ui.screen.CounterAppStateFlow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {


    private val _uiState = MutableStateFlow(
        CounterUiState()
    )

    val uiState = _uiState.asStateFlow()

    fun onEvent(event: CounterEvent) {

        when (event) {

            CounterEvent.Increment -> {

                if(_uiState.value.count<=9){
                    _uiState.update {

                        it.copy(
                            count = it.count + 1
                        )

                    }

                    if(_uiState.value.count%2==0){
                        _uiState.update {

                            it.copy(
                                isEven = true
                            )

                        }
                    }else{
                        _uiState.update {

                            it.copy(
                                isEven = false
                            )

                        }
                    }
                }

            }

            CounterEvent.Decrement -> {
                 if(_uiState.value.count>0) {
                     _uiState.update {

                         it.copy(
                             count = it.count - 1
                         )

                     }
                     if(_uiState.value.count%2==0){
                         _uiState.update {

                             it.copy(
                                 isEven = true
                             )

                         }
                     }else{
                         _uiState.update {

                             it.copy(
                                 isEven = false
                             )

                         }
                     }
                 }
            }

            CounterEvent.Reset -> {

                _uiState.value = CounterUiState()

            }

            CounterEvent.MultiplyByTwo -> {
                _uiState.update {
                    it.copy(
                        count = it.count*2
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
                }
            }
        }

    }

}