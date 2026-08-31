package com.example.learnjetpackcompose.drawer

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerExample() {

    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed
    )

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(

        drawerState = drawerState,

        drawerContent = {

            ModalDrawerSheet {

                Text(
                    "Home",
                    modifier = Modifier.padding(16.dp)
                )

                Text(
                    "Profile",
                    modifier = Modifier.padding(16.dp)
                )

                Text(
                    "Settings",
                    modifier = Modifier.padding(16.dp)
                )

            }

        }

    ) {

        Scaffold(

            topBar = {

                TopAppBar(

                    title = {
                        Text("Drawer Example")
                    },

                    navigationIcon = {

                        IconButton(

                            onClick = {

                                scope.launch {
                                    drawerState.open()
                                }

                            }

                        ) {

                            Icon(
                                Icons.Default.Menu,
                                contentDescription = null
                            )

                        }

                    }

                )

            }

        ) { innerPadding ->

            Text(
                "Hello Mohit",
                modifier = Modifier.padding(innerPadding)
            )

        }

    }
}



//ModalNavigationDrawer
//│
//└── Scaffold
//├── AppBar
//├── Body
//├── BottomBar
//└── FAB