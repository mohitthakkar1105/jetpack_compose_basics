package com.example.learnjetpackcompose.bottomsheet

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetExample() {

    var showBottomSheet by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Button(
            onClick = {
                showBottomSheet = true
            },
            modifier = Modifier
                .padding(20.dp)

        ) {
            Text("Open Bottom Sheet")
        }

        if (showBottomSheet) {

            ModalBottomSheet(

                onDismissRequest = {
                    showBottomSheet = false
                },
//                modifier = Modifier.fillMaxHeight()
                ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(20.dp)
                ) {

                    Text(
                        text = "Hello Mohit",
                        modifier = Modifier.padding(20.dp)
                    )
                }
            }

        }

    }

}

