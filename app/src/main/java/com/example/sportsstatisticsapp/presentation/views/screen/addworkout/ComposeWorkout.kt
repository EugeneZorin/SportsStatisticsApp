package com.example.sportsstatisticsapp.presentation.views.screen.addworkout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_BACK
import com.example.sportsstatisticsapp.presentation.views.navigation.item.Destination
import com.example.sportsstatisticsapp.presentation.views.navigation.bottomnavigation.BottomPanel
import com.example.sportsstatisticsapp.presentation.views.navigation.item.colorScreen

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