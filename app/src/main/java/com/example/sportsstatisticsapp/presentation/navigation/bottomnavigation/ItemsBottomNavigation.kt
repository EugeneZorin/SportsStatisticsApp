package com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.constants.Constants
import com.example.sportsstatisticsapp.presentation.navigation.Destination

@Composable
fun ItemsBottomNavigation(
    navController: NavHostController
) {

    val navItems = remember { mutableStateListOf<NavigationItems>() }
    val currentRoute = navController.currentBackStackEntry?.destination?.route ?: ""

    LaunchedEffect(currentRoute) {

        val newNavItems = when (currentRoute) {
            Constants.ROUT_MAIN_SCREEN -> listOf(
                NavigationItems(Destination.Setting.route, Destination.Setting.title),
                NavigationItems(Destination.Statistic.route, Destination.Statistic.title)
            )

            Constants.ROUT_CREATE_WORKOUT -> listOf(
                NavigationItems(Destination.Setting.route, Destination.Setting.title),
                NavigationItems(Destination.Statistic.route, Destination.Statistic.title)
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