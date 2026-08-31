import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.learnjetpackcompose.ui.screen.CounterApp.CounterEvent
import com.example.learnjetpackcompose.ui.screen.CounterApp.CounterUiState

class CounterViewModel : ViewModel() {

    var uiState by mutableStateOf(
        CounterUiState()
    )
        private set

    fun onEvent(event: CounterEvent) {

        when (event) {

            CounterEvent.Increment -> {

                uiState = uiState.copy(

                    count = uiState.count + 1

                )

            }

            CounterEvent.Decrement -> {

                uiState = uiState.copy(

                    count = uiState.count - 1

                )

            }

            CounterEvent.Reset -> {

                uiState = CounterUiState()

            }

        }

    }

}