package com.example.learnjetpackcompose.core_component

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

@Composable
fun PartiallySelectedText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        SelectionContainer {

            Column {

                Text("Mohit")

                Text("Rahul")

                Text("Android")

                DisableSelection {
                    Text("chinkara")
                }

            }

        }
    }
}


@Composable
fun LinkExample() {
    // Special Text banana
    val text = buildAnnotatedString {

        // Normal Text
        append("Hello Mohit, ")

        // URL Object
        val link = LinkAnnotation.Url(
            url = "https://www.google.com",
            styles = TextLinkStyles(
                style = SpanStyle(
                    color = Color.Blue
                )
            )
        )

        // Ye word clickable hoga
        withLink(link) {
            append("Android Developer")
        }

        // Fir normal text
        append(" Click here to learn.")
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = text
        )

    }
}


@Composable
fun OpenGoogle(){
    val uriHandler = LocalUriHandler.current

    Text(
        text = "Google",
        color = Color.Blue,
        modifier = Modifier.clickable {
            uriHandler.openUri("https://www.google.com")
        }
    )
}

@Composable
fun OpenWhatsApp() {

    val context = LocalContext.current

    Text(
        text = "Open WhatsApp",
        modifier = Modifier.clickable {

            Log.d("MOHIT123", "Text Clicked")

            val intent = context.packageManager
                .getLaunchIntentForPackage("com.android.settings")

            Log.d("MOHIT123", "Intent = $intent")

            if (intent != null) {

                Log.d("MOHIT123", "settings open")

                context.startActivity(intent)

            } else {

                Log.d("MOHIT123", "settings Not open")

            }

        }
    )
}