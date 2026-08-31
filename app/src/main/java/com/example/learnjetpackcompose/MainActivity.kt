package com.example.learnjetpackcompose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.learnjetpackcompose.DatePicker.DatePickerDemo
import com.example.learnjetpackcompose.DatePicker.MyOwnDatePicker
import com.example.learnjetpackcompose.ImagePicker.TakeImage
import com.example.learnjetpackcompose.bottomsheet.BottomSheetExample
import com.example.learnjetpackcompose.lazyColoumn.LazyColoumnCheck
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            LearnJetpackComposeTheme {
                BottomSheetExample()
            }
        }
    }
}



