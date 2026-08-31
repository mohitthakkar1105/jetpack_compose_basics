package com.example.learnjetpackcompose.core_component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SingleSelectionCheckBox() {

    val options = listOf(
        "Android",
        "Flutter",
        "Kotlin",
        "Java"
    )

    var selectedOption by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {

        options.forEach { option ->

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        selectedOption = option
                    }
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Checkbox(
                    checked = selectedOption == option,
                    onCheckedChange = {
                        if(selectedOption.isEmpty()){
                            selectedOption = option
                        }else{
                            if (selectedOption==option){
                                selectedOption = ""
                            }else{
                                selectedOption = option
                            }
                        }
                    }
                )

                Text(
                    text = option,
                    modifier = Modifier.padding(start = 8.dp)
                )

            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewSingleSelection() {
    SingleSelectionCheckBox()
}