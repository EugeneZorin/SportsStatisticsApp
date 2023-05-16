package com.example.sportsstatisticsapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sportsstatisticsapp.presentation.MainScreen


@Composable
fun MainNavHost(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destination.MainScreen.route ){

        composable(Destination.MainScreen.route) { MainScreen(navController) }
        composable(Destination.CreateWorkoutScreen.route) { TODO() }
        composable(Destination.ComposeWorkoutScreen.route) { TODO() }
        composable(Destination.CombineWorkout.route) { TODO() }
        composable(Destination.SetCalendarScreen.route) { TODO() }
        composable(Destination.InfoOneWorkout.route) { TODO() }
        composable(Destination.AddNewWorkout.route) { TODO() }

    }
}