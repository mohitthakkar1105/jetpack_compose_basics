package com.example.learnjetpackcompose.layouts

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutExample() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        // References
        val (hello, mohit, android) = createRefs()

        // Top Left
        Text(
            text = "Hello",
            modifier = Modifier.constrainAs(hello) {
                top.linkTo(parent.top, margin = 20.dp)
                start.linkTo(parent.start, margin = 20.dp)
            }
        )

        // Hello ke niche
        Text(
            text = "Mohit",
            modifier = Modifier.constrainAs(mohit) {
                top.linkTo(hello.bottom, margin = 20.dp)
                start.linkTo(parent.start, margin = 20.dp)
            }
        )

        // Bottom Right
        Text(
            text = "Android",
            modifier = Modifier.constrainAs(android) {
                bottom.linkTo(parent.bottom, margin = 20.dp)
                end.linkTo(parent.end, margin = 20.dp)
            }
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ConstraintLayoutPreview() {
    ConstraintLayoutExample()
}