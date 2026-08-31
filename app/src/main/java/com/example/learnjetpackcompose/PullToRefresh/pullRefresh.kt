package com.example.learnjetpackcompose.pulltorefresh

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshExample() {

    var isRefreshing by remember {
        mutableStateOf(false)
    }

    val list =
        mutableStateListOf(
            "Android",
            "Flutter",
            "Compose",
            "Kotlin",
            "Java"
        )


    PullToRefreshBox(

        isRefreshing = isRefreshing,

        onRefresh = {

            isRefreshing = true

        }

    ) {

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {

            items(list) {

                Text(it)

            }

        }

    }

    LaunchedEffect(isRefreshing) {

        if (isRefreshing) {

            delay(2000)

            list.add("New Item")

            isRefreshing = false

        }

    }

}