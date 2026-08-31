package com.example.learnjetpackcompose.carousal
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun Carousal(){
    val pagerState = rememberPagerState(
        pageCount = {5}
    )

    val scope = rememberCoroutineScope()

    Column() {
        HorizontalPager(
            state = pagerState,
            userScrollEnabled = true,
            modifier = Modifier.height(300.dp)
        ) { page ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp)
                    .background(Color.Gray)
            )
        }
        Row() {
            Button(
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(
                            pagerState.currentPage - 1
                        )
                    }
                },
                modifier = Modifier.background(
                    Color.Blue
                )
            ) {
                Text(
                    text = "Previous"
                )
            }
            Button(
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(
                            pagerState.currentPage + 1
                        )
                    }
                },
                modifier = Modifier.background(
                    Color.Blue
                )
            ) {
                Text(
                    text = "Next"
                )
            }
        }
    }
}