package com.example.sportsstatisticsapp.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.navigation.Destination
import com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation.BottomPanel
import com.example.sportsstatisticsapp.presentation.navigation.colorScreen
import com.example.sportsstatisticsapp.presentation.navigation.parameterResource

@Composable
fun FindWorkoutScreen(
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

        }

        BottomPanel(
            navController = navController,
            firstRoutBottomPanel = Destination.Statistic.route,
            firstTitleBottomPanel = Destination.Statistic.title,
            SecondRoutBottomPanel = Destination.Setting.route,
            SecondTitleBottomPanel = Destination.Setting.title
        )
    }
}