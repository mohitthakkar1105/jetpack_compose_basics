package com.example.learnjetpackcompose.FloatingActionButton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.learnjetpackcompose.dialog.CustomDialogExample
import com.example.learnjetpackcompose.menus.DropDownMenuExample

@Composable
fun MyFab() {

    ExtendedFloatingActionButton(

        onClick = {
            print("k")
        },

        text = {
            Text("Add")
        },

        icon = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add"
            )
        }

    )

}

@Preview(showSystemUi = true)
@Composable
fun CustomDialogPreview() {
    DropDownMenuExample()

}