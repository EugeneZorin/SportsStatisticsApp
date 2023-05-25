package com.example.sportsstatisticsapp.presentation.bottom

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.sportsstatisticsapp.R
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_MAIN_SCREEN
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
                bottomBar = { BottomBar(navController = navController) }
            ) { padding ->
                Box(modifier = Modifier.padding(padding)) {
                    MainNavHost(navController = navController)
                }
            }
        }
    }

}

@Composable
fun BottomBar(
    navController: NavHostController
) {

    val items = listOf(
        Destination.Setting,
        Destination.MainScreen,
        Destination.Statistic
    )

    Row(
        modifier = Modifier
            .padding(start = 0.dp, end = 0.dp, top = 10.dp, bottom = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        items.forEach { item ->
            AddItem(
                item = item,
                navController = navController
            )
        }
    }

}

@Composable
fun AddItem(
    item: Destination,
    navController: NavHostController,
) {

    if (item.title != TITLE_MAIN_SCREEN) {
        Row(
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(colors = colorScreen()),
                    shape = parameterResource(15, 15, 15, 15)
                )
                .clip(shape = parameterResource(15, 15, 15, 15))
                .clickable(onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                    }
                })
                .padding(PaddingValues(horizontal = 34.dp, vertical = 11.dp)),
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
                .clickable(onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                    }
                })
                .padding(PaddingValues(horizontal = 30.dp, vertical = 30.dp)),

        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBarScreen()
}
