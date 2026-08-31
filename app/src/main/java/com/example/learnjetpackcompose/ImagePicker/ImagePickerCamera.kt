package com.example.learnjetpackcompose.ImagePicker
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

@Composable
fun rememberCameraPicker(
    onImageCaptured: (Uri) -> Unit
): () -> Unit {

    val context = LocalContext.current

    var cameraImageUri by remember {
        mutableStateOf<Uri?>(null)
    }

    val launcher =
        rememberLauncherForActivityResult(
            contract = ActivityResultContracts.TakePicture()
        ) { success ->

            if (success) {
                cameraImageUri?.let(onImageCaptured)
//                or
//                cameraImageUri?.let {
//                    onImageCaptured(it)
//                }
            }

        }

    return {

        cameraImageUri = createImageUri(context)

        launcher.launch(cameraImageUri!!)

    }
}