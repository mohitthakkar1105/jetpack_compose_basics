package com.example.learnjetpackcompose.ImagePicker
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun TakeImage() {

    val context = LocalContext.current

    var selectedImageUri by remember {
        mutableStateOf<Uri?>(null)
    }

    var cameraImageUri by remember {
        mutableStateOf<Uri?>(null)
    }

    // Gallery
    val galleryLauncher =
        rememberLauncherForActivityResult(
            contract = ActivityResultContracts.GetContent()
        ) { uri ->

            if (uri != null) {
                selectedImageUri = uri
            }

        }

    // Camera
    val cameraLauncher =
        rememberLauncherForActivityResult(
            contract = ActivityResultContracts.TakePicture()
        ) { success ->

            if (success) {
                selectedImageUri = cameraImageUri
            }

        }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row {

            Button(
                onClick = {
                    galleryLauncher.launch("image/*")
                }
            ) {
                Text("Pick Image Gallery")
            }

            Spacer(
                modifier = Modifier.width(30.dp)
            )

            Button(
                onClick = {

                    cameraImageUri = createImageUri(context)

                    cameraLauncher.launch(
                        cameraImageUri!!
                    )

                }
            ) {
                Text("Pick Image Camera")
            }

        }

        selectedImageUri?.let { uri ->

            Spacer(
                modifier = Modifier.width(20.dp)
            )

            AsyncImage(
                model = uri,
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop
            )

        }
    }
}

//
//var name: String? = null
//
//name?.let {
//    println(it)
//}

//output->Kuch nahi