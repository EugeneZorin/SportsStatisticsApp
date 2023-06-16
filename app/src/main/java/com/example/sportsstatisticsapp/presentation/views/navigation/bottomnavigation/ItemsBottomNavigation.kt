package com.example.sportsstatisticsapp.presentation.views.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.views.navigation.item.NavigationItems

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
        navItems = navItems,

    )

}