package com.example.app.feature.home


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.app.navigation.Profile


@Composable
fun HomeScreen(
    navController: NavController
) {


    Button(
        onClick = {


            navController.navigate(
                Profile(
                    userId = "101"
                )
            )


        }
    ) {


        Text(
            "Open Profile"
        )


    }


}