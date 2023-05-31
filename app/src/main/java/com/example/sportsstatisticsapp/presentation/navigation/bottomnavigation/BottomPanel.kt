package com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.navigation.colorScreen
import com.example.sportsstatisticsapp.presentation.navigation.parameterResource

@Composable
fun BottomPanel (
    navController: NavHostController
){

    Box(){
        Row(
            modifier = Modifier
                .background(Color.White, shape = parameterResource(0, 0, 0, 0))
                .align(Alignment.BottomCenter)
        ) {
            ItemsBottomNavigation(navController = navController)
        }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            ) {

                Rhombus( colorRhombus = colorScreen(), navController = navController )
            }
        }
    }
}