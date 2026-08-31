package com.example.learnjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumnExample() {

    val names = listOf(
        "Mohit",
        "Rahul",
        "Aman",
        "Rohit",
        "Akash",
        "Sohan",
        "Vikas",
        "Ankit",
        "Deepak",
        "Karan"
    )

    LazyColumn(
        modifier = Modifier.size(300.dp)
    ) {
        items(count = names.size){
            index->
            Box(
                modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.LightGray)
        ) {

            Text(
                text = names[index],
                fontSize = 20.sp,
                modifier = Modifier.padding(20.dp)
            )

        }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun LazyColumnPreview() {
    LazyColumnExample()
}