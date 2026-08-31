package com.example.learnjetpackcompose.DatePicker

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun DatePickerDemo() {

    var showDatePicker by remember {
        mutableStateOf(false)
    }

    var selectedDate by remember {
        mutableStateOf("No Date Selected")
    }

    Column {

        Text(text = selectedDate)

        Button(
            onClick = {
                showDatePicker = true
            }
        ) {
            Text("Pick Date")
        }
    }

    if (showDatePicker) {

        DatePickerDialog(
            onDismissRequest = {
                showDatePicker = false
            },
            confirmButton = {
                Button(
                    onClick = {
                        selectedDate = "Date Selected"
                        showDatePicker = false
                    }
                ) {
                    Text("OK")
                }
            }
        ) {

            DatePicker(
                state = rememberDatePickerState()
            )

        }
    }
}