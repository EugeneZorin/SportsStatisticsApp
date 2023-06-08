package com.example.sportsstatisticsapp.presentation.screen.addworkout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_BACK
import com.example.sportsstatisticsapp.presentation.navigation.Destination
import com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation.BottomPanel
import com.example.sportsstatisticsapp.presentation.navigation.colorScreen
import com.example.sportsstatisticsapp.presentation.navigation.parameterResource
import com.example.sportsstatisticsapp.presentation.screen.CreateWorkoutButton
import com.example.sportsstatisticsapp.presentation.screen.FindWorkoutButton

@Composable
fun ComposeWorkout(navController: NavHostController) {
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

            LazyColumn() {

            }

        }

        BottomPanel(
            navController = navController,
            firstRoutBottomPanel = Destination.CreateWorkout.route,
            firstTitleBottomPanel = TITLE_BACK,
            SecondRoutBottomPanel = Destination.AddNewWorkout.route,
            SecondTitleBottomPanel = Destination.AddNewWorkout.title
        )
    }
}