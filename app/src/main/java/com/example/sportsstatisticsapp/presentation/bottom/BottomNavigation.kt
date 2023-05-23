package com.example.sportsstatisticsapp.presentation.bottom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sportsstatisticsapp.R
import com.example.sportsstatisticsapp.presentation.navigation.Destination
import com.example.sportsstatisticsapp.presentation.navigation.MainNavHost


@Composable
fun BottomNavigationBarScreen() {

    val navController = rememberNavController()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.horizontalGradient(colors = colorScreen()))
    ) {
        Card(
            Modifier
                .fillMaxHeight(0.985f)
                .background(Color.White, shape = parameterResource(0, 0, 0, 0))
                .clip(parameterResource(0, 0, 0, 0))
        ) {
            Scaffold(
                modifier = Modifier,
                bottomBar = { BottomNavigationBar(navController) },
                content = { padding ->
                    Box(
                        modifier = Modifier.padding(padding),
                    ) {
                        MainNavHost(navController)
                    }
                },
            )
        }
    }
}

@Composable
fun BottomNavigationBar(
    navController: NavHostController
) {

    val items = listOf(
        Destination.Setting,
        Destination.Statistic,
    )

    Box {
        BottomNavigation(
            backgroundColor = Color.White,
        ) {

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            items.forEach { item ->
                BottomNavigationItem(
                    icon = { ButtonBar(item.title) },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White.copy(0.4f),
                    selected = currentRoute == item.route,
                    onClick = {
                        navController.navigate(item.route) {
                            navController.graph.startDestinationRoute?.let { route ->
                                popUpTo(route) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    }
                )
            }
        }
    }
}


@Composable
fun ButtonBar(
    title: String,
) {

    val backgroundScreen = listOf(
        colorResource(id = R.color.almostWhite),
        colorResource(id = R.color.whiteBlue)
    )

    Box(
        modifier = Modifier
            .background(
                brush = Brush.horizontalGradient(colors = backgroundScreen),
                shape = parameterResource(15,15,15,15)
            )
            .clip(shape = parameterResource(15,15,15,15))
            .padding(PaddingValues(horizontal = 30.dp, vertical = 7.dp))
    ) {
        Text(
            text = title,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBarScreen()
}

