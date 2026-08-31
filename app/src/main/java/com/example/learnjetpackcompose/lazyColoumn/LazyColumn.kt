package com.example.learnjetpackcompose.lazyColoumn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text

//@Composable
//fun LazyColoumnCheck(){
//    LazyColumn {
//        items(200) { index ->
//            Text("Item $index")
//        }
//    }
//}

//@Composable
//fun LazyColoumnCheck(){
//    val names = listOf(
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//        "Mohit",
//        "Rahul",
//        "Aman",
//    )
//    LazyColumn {
//        items(names) { name ->
//            Text("Item $name")
//        }
//    }
//}

@Composable
fun LazyColoumnCheck(){
    LazyColumn {
        item {
            Text("Header")
        }

        items(20) { index ->
            Text("Item $index")
        }

        item {
            Text("Footer")
        }
    }
}