package com.example.sportsstatisticsapp.presentation.bottom

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.R
import com.example.sportsstatisticsapp.presentation.constants.Constants
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_CREATE_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_SETTING
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.navigation.Destination

data class NavItem(
    val route: String,
    val title: String,
    var selected: Boolean = false
)

@Composable
fun BottomNavigationBarScreen(
    navController: NavHostController
) {

    val navItems = remember { mutableStateListOf<NavItem>() }
    val currentRoute = navController.currentBackStackEntry?.destination?.route ?: ""

    LaunchedEffect(currentRoute) {

        val newNavItems = when (currentRoute) {
            ROUT_MAIN_SCREEN -> listOf(
                NavItem(Destination.Setting.route, Destination.Setting.title),
                NavItem(Destination.MainScreen.route, Destination.MainScreen.title),
                NavItem(Destination.Statistic.route, Destination.Statistic.title)
            )

            ROUT_CREATE_WORKOUT -> listOf(
                NavItem(Destination.Setting.route, Destination.Setting.title),
                NavItem(Destination.MainScreen.route, Destination.MainScreen.title),
                NavItem(Destination.Statistic.route, Destination.Setting.title)
            )

            else -> listOf(
                NavItem(Destination.MainScreen.route, Destination.MainScreen.route),
            )
        }
        navItems.clear()
        navItems.addAll(newNavItems)
    }


    BottomBar(
        navController = navController,
        currentRoute = currentRoute,
        navItems = navItems
    )


}


@Composable
fun BottomBar(
    navController: NavHostController,
    currentRoute: String,
    navItems: SnapshotStateList<NavItem>
) {

    Row(
        modifier = Modifier
            .background(brush = Brush.horizontalGradient(colors = colorScreen()))
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomNavigation(
            contentColor = Color.White,
            backgroundColor = Color.White // Set the desired background color for the BottomNavigation
        ) {
            navItems.forEach { item ->
                BottomNavigationItem(
                    icon = { AddItem(item) },
                    selected = item.route == currentRoute,
                    onClick = {
                        navController.navigate(item.route) {

                        }
                    }
                )
            }
        }
    }
}

@Composable
fun AddItem(
    item: NavItem,
) {

    if (item.title != TITLE_MAIN_SCREEN) {
        Row(
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(colors = colorScreen()),
                    shape = parameterResource(15, 15, 15, 15)
                )
                .clip(shape = parameterResource(15, 15, 15, 15))
                .padding(PaddingValues(horizontal = 20.dp, vertical = 11.dp)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = item.title,
                fontSize = 18.sp,
                color = colorResource(id = R.color.lightGray),
                fontWeight = FontWeight.Bold
            )
        }
    } else {

        Row(
            modifier = Modifier
                .offset(y = (-40).dp)
                .rotate(degrees = 45f)
                .background(
                    brush = Brush.horizontalGradient(colors = colorScreen()),
                    shape = parameterResource(0, 0, 0, 0)
                )
                .clip(shape = parameterResource(0, 0, 0, 0))
                .padding(PaddingValues(horizontal = 30.dp, vertical = 30.dp)),

            ) {

        }
    }
}


