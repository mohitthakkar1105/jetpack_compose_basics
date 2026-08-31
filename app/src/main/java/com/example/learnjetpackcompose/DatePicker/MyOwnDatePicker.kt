package com.example.learnjetpackcompose.DatePicker
import android.util.Log
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
fun MyOwnDatePicker() {
    var showDatePickerDialog by remember() {
        mutableStateOf(false)
    }

    Column() {
        Button(
            onClick = {
                showDatePickerDialog = true
                Log.d("MOHIT123", "after click val of showDatePickerDialog : $showDatePickerDialog")
            }
        ) {
            Text(
                text = "Pick Date The Date"
            )
        }
        if (showDatePickerDialog) {
            val datePickerState = rememberDatePickerState()
            DatePickerDialog(
                onDismissRequest = {
                    showDatePickerDialog = false
                },
                confirmButton = {
                    Button(
                        onClick = {

                            showDatePickerDialog = false
                        }
                    ) {
                        Text(
                            text = "ok"
                        )
                    }
                }
            ) {
                DatePicker(
                    state = datePickerState
                )
            }
        }
    }
}