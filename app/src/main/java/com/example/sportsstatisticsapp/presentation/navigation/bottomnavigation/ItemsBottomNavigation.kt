package com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.constants.Constants
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_ADD_NEW_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_COMPOSE_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_CREATE_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_FIND_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_SETTING
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_STATISTIC
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_BACK
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_SAVE
import com.example.sportsstatisticsapp.presentation.navigation.Destination

@Composable
fun ItemsBottomNavigation(
    navController: NavHostController
) {

    val navItems = remember { mutableStateListOf<NavigationItems>() }
    val currentRoute = navController.currentBackStackEntry?.destination?.route ?: ""

    LaunchedEffect(currentRoute) {

        val newNavItems = when (currentRoute) {

            ROUT_MAIN_SCREEN -> listOf(
                NavigationItems(Destination.Setting.route, Destination.Setting.title),
                NavigationItems(Destination.Statistic.route, Destination.Statistic.title)
            )

            ROUT_CREATE_WORKOUT -> listOf(
                NavigationItems(Destination.Setting.route, Destination.Setting.title),
                NavigationItems(Destination.Statistic.route, Destination.Statistic.title)
            )

            ROUT_FIND_WORKOUT -> listOf(
                NavigationItems(Destination.Setting.route, Destination.Setting.title),
                NavigationItems(Destination.Statistic.route, Destination.Statistic.title)
            )

            ROUT_SETTING -> listOf(
                NavigationItems(Destination.Setting.route, Destination.Setting.title),
                NavigationItems(Destination.Statistic.route, Destination.Statistic.title)
            )

            ROUT_STATISTIC -> listOf(
                NavigationItems(Destination.Setting.route, Destination.Setting.title),
                NavigationItems(Destination.Statistic.route, Destination.Statistic.title)
            )

            // Compose a Workout screen
            ROUT_COMPOSE_WORKOUT -> listOf(
                NavigationItems(Destination.CreateWorkout.route, TITLE_BACK),
                NavigationItems(Destination.AddNewWorkout.route, Destination.AddNewWorkout.title)
            )

            // AddNewWorkout screen
            ROUT_ADD_NEW_WORKOUT -> listOf(
                NavigationItems(Destination.ComposeWorkout.route, TITLE_BACK),
                NavigationItems(Destination.AddNewWorkout.route, TITLE_SAVE)
            )



            else -> listOf(
                NavigationItems(Destination.MainScreen.route, Destination.MainScreen.route),
            )
        }
        navItems.clear()
        navItems.addAll(newNavItems)
    }


    BottomNavigation(
        navController = navController,
        currentRoute = currentRoute,
        navItems = navItems
    )

}