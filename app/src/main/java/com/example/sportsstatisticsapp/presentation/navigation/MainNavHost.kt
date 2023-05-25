package com.example.sportsstatisticsapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sportsstatisticsapp.presentation.MainScreen
import com.example.sportsstatisticsapp.presentation.bottom.screen.CreateWorkoutScreen
import com.example.sportsstatisticsapp.presentation.bottom.screen.FindWorkoutScreen
import com.example.sportsstatisticsapp.presentation.bottom.screen.SettingScreen
import com.example.sportsstatisticsapp.presentation.bottom.screen.StatisticScreen


@Composable
fun MainNavHost(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = Destination.MainScreen.route) {

        composable(Destination.MainScreen.route){ MainScreen( navController = navController ) }
        composable(Destination.Statistic.route) { StatisticScreen() }
        composable(Destination.Setting.route) { SettingScreen() }
        composable(Destination.CreateWorkout.route) { CreateWorkoutScreen( navController = navController ) }
        composable(Destination.FindWorkout.route) { FindWorkoutScreen() }

    }
}

