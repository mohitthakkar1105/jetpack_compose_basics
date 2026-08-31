package com.example.learnjetpackcompose.menus

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DropDownMenuExample() {

    var expanded by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ) {

        Box(
            modifier = Modifier.wrapContentSize()
        ) {

            IconButton(
                onClick = {
                    expanded = true
                }
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Menu"
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                }
            ) {

                DropdownMenuItem(
                    text = {
                        Text("Profile")
                    },
                    onClick = {
                        expanded = false
                    }
                )

                DropdownMenuItem(
                    text = {
                        Text("Settings")
                    },
                    onClick = {
                        expanded = false
                    }
                )

                DropdownMenuItem(
                    text = {
                        Text("Logout")
                    },
                    onClick = {
                        expanded = false
                    }
                )

            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun DropDownPreview() {
    DropDownMenuExample()
}