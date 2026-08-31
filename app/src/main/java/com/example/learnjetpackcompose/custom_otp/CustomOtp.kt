package com.example.learnjetpackcompose.custom_otp
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomOtp() {

    var text by remember {
        mutableStateOf("")
    }

    BasicTextField(
        value = text,
        onValueChange = {
            text = it
        },
        decorationBox = {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                repeat(6) {i->
                    var digit = text.getOrNull(i)
                    Box(
                        modifier = Modifier
                            .size(55.dp)
                            .border(
                                width = if(text.length==i) 2.dp else 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(12.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        if (digit!=null){
                            Text(
                                text = digit.toString()
                            )
                        }else if(text.length==i){
                            Text(
                                text = "|",
                                fontSize = 30.sp
                            )
                        }
                    }
                }
            }
        }
    )
}