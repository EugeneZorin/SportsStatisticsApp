package com.example.sportsstatisticsapp.presentation.screen.addworkout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
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
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.horizontalGradient(colors = colorScreen()))
        ) {

            Spacer(modifier = Modifier.height(150.dp))


            Box(
                contentAlignment = Alignment.TopCenter
            ) {
                NewWorkoutInputFields("Name the workout", Modifier.width(290.dp))
            }

            Spacer(modifier = Modifier.height(75.dp))

            Row(
                modifier = Modifier.padding(horizontal = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                NewWorkoutInputFields("Replays", Modifier.weight(1f))
                Spacer(modifier = Modifier.width(15.dp))
                NewWorkoutInputFields("Approach", Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(35.dp))

            Row(
                modifier = Modifier.padding(horizontal = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                NewWorkoutInputFields("All Time", Modifier.weight(1f))
                Spacer(modifier = Modifier.width(15.dp))
                NewWorkoutInputFields("Time Approach", Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(35.dp))

            NewWorkoutInputFields("Distances", Modifier.width(150.dp))
        }

        BottomPanel(navController = navController)
    }
}

@Composable
fun NewWorkoutInputFields(
    testField: String,
    modifier: Modifier = Modifier,
) {

    var nameWorkout by rememberSaveable() { mutableStateOf("") }
    val parameter = parameterResource(15, 15, 15, 15)


    Box(
        modifier = modifier
            .shadow(30.dp, parameter)
            .background(Color.White, parameter)
            .padding(7.dp),
    ) {
        OutlinedTextField(
            singleLine = true,
            value = nameWorkout,
            onValueChange = {
                nameWorkout = it
            },
            label = {
                Text(
                    testField,
                    style = TextStyle(color = colorScheme.secondary),
                    fontSize = 17.sp,
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorScheme.onTertiary,
                unfocusedBorderColor = colorScheme.onBackground
            ),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNewWorkoutInputFields() {
    NewWorkoutInputFields("12", Modifier.width(150.dp))
}