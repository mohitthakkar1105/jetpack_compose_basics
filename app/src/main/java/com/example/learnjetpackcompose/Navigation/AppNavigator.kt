package com.example.app.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app.feature.auth.LoginScreen
import com.example.app.feature.home.HomeScreen


@Composable
fun AppNavigation() {


    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Login
    ) {


        composable<Login> {


            LoginScreen(
                navController = navController
            )


        }


        composable<Home> {


            HomeScreen(
                navController = navController
            )


        }



//        composable<Profile> {
//
//
//            val profile =
//                it.toRoute<Profile>()
//
//
//            ProfileScreen(
//                userId = profile.userId
//            )
//
//
//        }


    }

}