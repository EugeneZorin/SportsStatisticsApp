package com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
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
import com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel.AddNewWorkoutViewModel

@Composable
fun ItemsBottomNavigation(
    navController: NavHostController,
    firstRoutBottomPanel: String,
    firstTitleBottomPanel: String,
    SecondRoutBottomPanel: String,
    SecondTitleBottomPanel: String,
) {

    val navItems = remember { mutableStateListOf<NavigationItems>() }
    val currentRoute = navController.currentBackStackEntry?.destination?.route ?: ""

    LaunchedEffect(currentRoute) {


        val newNavItems = listOf(
            NavigationItems(firstRoutBottomPanel, firstTitleBottomPanel),
            NavigationItems(SecondRoutBottomPanel, SecondTitleBottomPanel)
        )

        navItems.clear()
        navItems.addAll(newNavItems)
    }

    BottomNavigation(
        navController = navController,
        currentRoute = currentRoute,
        navItems = navItems
    )

}