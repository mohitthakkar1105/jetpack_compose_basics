import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.learnjetpackcompose.ui.screen.CounterApp.CounterEvent

@Composable
fun CounterScreen() {

    val viewModel = viewModel<CounterViewModel>()

    Column(

        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center

    ) {

        Text(
            text = viewModel.uiState.count.toString()
        )

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

        }

    }

}