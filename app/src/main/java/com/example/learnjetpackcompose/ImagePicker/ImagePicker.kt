package com.example.learnjetpackcompose.ImagePicker
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable

@Composable
fun rememberGalleryPicker(
    onImageSelected: (Uri) -> Unit
): () -> Unit   {
    val launcher =
        rememberLauncherForActivityResult(
            ActivityResultContracts.GetContent()
        ) { uri ->
            uri?.let(onImageSelected)
        }

    return {
        launcher.launch("image/*")
    }
}

//usage :->
//
//Step 1
//
//Screen me state bana
//
//var imageUri by remember {
//    mutableStateOf<Uri?>(null)
//}
//Step 2
//
//Function ko call kar
//
//val openGallery = rememberGalleryPicker { uri ->
//
//    imageUri = uri
//
//}
//
//Yahan:
//
//openGallery
//
//ke andar ye aa gaya:
//
//{
//    launcher.launch("image/*")
//}
//Step 3
//
//Button me use kar
//
//Button(
//onClick = {
//    openGallery()
//}
//) {
//    Text("Pick Image")
//}
//
//Ya shortcut:
//
//Button(
//onClick = openGallery
//) {
//    Text("Pick Image")
//}



//dhyan dena isme sirf value ya function return karna hai
// fun add(a: Int, b: Int):  Int = a + b

//fun rememberGalleryPicker(
//    onImageSelected: (Uri) -> Unit
//): () -> Unit {
//     kuch perform karwana hua to aise
//    return {
//        launcher.launch("image/*")
//    }
//
//}


//warna direct ais e :->

//fir isse wesa kese likhe
//fun rememberGalleryPicker(
//    onImageSelected: (Uri) -> Unit
//): () -> Unit = {
//
//    launcher.launch("image/*")
//
//}