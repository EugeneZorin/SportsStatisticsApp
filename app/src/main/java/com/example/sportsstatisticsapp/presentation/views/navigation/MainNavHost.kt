package com.example.sportsstatisticsapp.presentation.views.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sportsstatisticsapp.presentation.views.navigation.item.Destination
import com.example.sportsstatisticsapp.presentation.views.screen.CreateWorkoutScreen
import com.example.sportsstatisticsapp.presentation.views.screen.FindWorkoutScreen
import com.example.sportsstatisticsapp.presentation.views.screen.MainScreen
import com.example.sportsstatisticsapp.presentation.views.screen.SettingScreen
import com.example.sportsstatisticsapp.presentation.views.screen.StatisticScreen
import com.example.sportsstatisticsapp.presentation.views.screen.addworkout.AddNewWorkout
import com.example.sportsstatisticsapp.presentation.views.screen.addworkout.ComposeWorkout


@Composable
fun MainNavHost() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destination.AddNewWorkout.route) {

        composable(Destination.MainScreen.route) { MainScreen(navController = navController) }
        composable(Destination.Statistic.route) { StatisticScreen(navController = navController) }
        composable(Destination.Setting.route) { SettingScreen(navController = navController) }
        composable(Destination.CreateWorkout.route) { CreateWorkoutScreen(navController = navController) }
        composable(Destination.FindWorkout.route) { FindWorkoutScreen(navController = navController) }

        composable(Destination.ComposeWorkout.route) { ComposeWorkout(navController = navController) }


        composable(Destination.AddNewWorkout.route) {
            AddNewWorkout(
                navController = navController,
            )
        }

    }
}

