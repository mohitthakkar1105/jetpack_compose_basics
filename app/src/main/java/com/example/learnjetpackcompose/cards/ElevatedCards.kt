package com.example.learnjetpackcompose.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCardExample(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ElevatedCard(
            onClick = {

            },
            elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
            ),
            modifier = Modifier.size(200.dp)
        ) {
            Text(
                "mohit thakkar",
                modifier = Modifier.padding(20.dp)
            )
        }
    }
}