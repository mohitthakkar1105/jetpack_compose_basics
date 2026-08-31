package com.example.app.feature.auth


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.app.navigation.Home


@Composable
fun LoginScreen(
    navController: NavController
) {


    Button(
        onClick = {


            navController.navigate(
                Home
            )


        }
    ) {


        Text(
            "Login"
        )


    }


}