package com.example.sportsstatisticsapp.presentation.views.navigation.bottomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.views.navigation.item.Destination
import com.example.sportsstatisticsapp.presentation.views.navigation.item.colorScreen
import com.example.sportsstatisticsapp.presentation.views.navigation.item.parameterResource

@Composable
fun BottomPanel (
    navController: NavHostController,
    routeRhombus: String = Destination.MainScreen.route,
    firstRoutBottomPanel: String,
    firstTitleBottomPanel: String,
    SecondRoutBottomPanel: String,
    SecondTitleBottomPanel: String,
){
    Box(){
        Row(
            modifier = Modifier
                .background(Color.White, shape = parameterResource(0, 0, 0, 0))
                .align(Alignment.BottomCenter)
        ) {
            ItemsBottomNavigation(
                navController = navController,
                firstRoutBottomPanel = firstRoutBottomPanel,
                firstTitleBottomPanel = firstTitleBottomPanel,
                SecondRoutBottomPanel = SecondRoutBottomPanel,
                SecondTitleBottomPanel = SecondTitleBottomPanel,

            )
        }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            ) {

                Rhombus(
                    colorRhombus = colorScreen(),
                    navController = navController,
                    route = routeRhombus
                )
            }
        }
    }
}