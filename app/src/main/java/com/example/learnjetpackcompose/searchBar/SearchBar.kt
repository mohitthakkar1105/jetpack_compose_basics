package com.example.learnjetpackcompose.searchBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Searching() {

    var text by remember {
        mutableStateOf("")
    }
    val cityList = listOf(
        "Ahmedabad",
        "Surat",
        "Vadodara",
        "Rajkot",
        "Mumbai",
        "Pune",
        "Delhi",
        "Noida",
        "Gurgaon",
        "Jaipur",
        "Udaipur",
        "Jodhpur",
        "Indore",
        "Bhopal",
        "Lucknow",
        "Kanpur",
        "Patna",
        "Ranchi",
        "Kolkata",
        "Bhubaneswar",
        "Hyderabad",
        "Bengaluru",
        "Chennai",
        "Kochi",
        "Mysore",
        "Visakhapatnam",
        "Nagpur",
        "Nashik",
        "Amritsar",
        "Chandigarh"
    )

    val finalCityList = remember {
        mutableStateListOf<String>()
    }

    fun filterCityList(
        searchText: String,
        originalList: List<String>,
        filteredList: MutableList<String>
    ) {

        filteredList.clear()

        if (searchText.isBlank()) {

            filteredList.addAll(originalList)

        } else {

            filteredList.addAll(

                originalList.filter {

                    it.contains(searchText, ignoreCase = true)

                }

            )

        }

    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Column() {
            OutlinedTextField(

                value = text,

                onValueChange = {
                    text = it
                    filterCityList(
                        searchText = text,
                        originalList = cityList,
                        filteredList = finalCityList
                    )
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),

                placeholder = {
                    Text("Search here...")
                },

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search"
                    )
                },

                singleLine = true,

                shape = MaterialTheme.shapes.large,

                colors = OutlinedTextFieldDefaults.colors(

                    focusedBorderColor = Color(0xFFFF8C1A),

                    unfocusedBorderColor = Color.Gray,

                    focusedLabelColor = Color(0xFFFF8C1A),

                    cursorColor = Color(0xFFFF8C1A)

                )

            )
            if (!text.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .background(
                            color = Color.Gray,
                            shape = RoundedCornerShape(
                                10.dp
                            )
                        )
                ) {
                    Column() {
                        finalCityList.forEach {
                            Text(it,modifier = Modifier.padding(10.dp))
                        }
                    }
                }
            }

        }
    }

}
