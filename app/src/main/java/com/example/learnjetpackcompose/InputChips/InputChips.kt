package com.example.learnjetpackcompose.InputChips

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessibilityNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputChipExample() {

    var selected by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        InputChip(

            selected = selected,

            onClick = {
                selected = !selected
            },

            label = {
                Text("Android")
            },

            trailingIcon = {

                if (selected) {

                    Icon(
                        imageVector = Icons.Default.AccessibilityNew,
                        contentDescription = "Remove",
                        modifier = Modifier.size(18.dp)
                    )

                }

            }

        )

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InputChipPreview() {
    InputChipExample()
}