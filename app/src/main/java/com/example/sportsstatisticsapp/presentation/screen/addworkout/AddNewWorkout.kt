package com.example.sportsstatisticsapp.presentation.screen.addworkout

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.R
import com.example.sportsstatisticsapp.presentation.navigation.Destination
import com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation.BottomPanel
import com.example.sportsstatisticsapp.presentation.navigation.colorScreen
import com.example.sportsstatisticsapp.presentation.navigation.parameterResource

@Composable
fun AddNewWorkout(
    navController: NavHostController
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.horizontalGradient(colors = colorScreen()))
        ) {

            NewWorkoutInputFields()


        }

        BottomPanel(navController = navController)
    }
}

@Composable
fun NewWorkoutInputFields() {

    val cardNumberRemember by rememberSaveable() { mutableStateOf("123") }


    Box(
        modifier = Modifier
            .shadow(30.dp, parameterResource(15, 15, 15, 15))
            .background(Color.White, parameterResource(15, 15, 15, 15))
            .padding(7.dp),
    ) {
        OutlinedTextField(
            value = cardNumberRemember,
            onValueChange = {
            },
            label = {
                Text(
                    "Name the workout",
                    style = TextStyle(color = Color.Gray) // Set the desired text color for the label
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Red,
                unfocusedBorderColor = Color.Yellow
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNewWorkoutInputFields() {
    NewWorkoutInputFields()
}