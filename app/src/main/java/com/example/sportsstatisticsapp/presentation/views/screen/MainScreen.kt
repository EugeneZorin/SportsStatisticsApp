package com.example.sportsstatisticsapp.presentation.views.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.views.navigation.item.Destination
import com.example.sportsstatisticsapp.presentation.views.navigation.bottomnavigation.BottomPanel
import com.example.sportsstatisticsapp.presentation.views.navigation.item.colorScreen
import com.example.sportsstatisticsapp.presentation.views.navigation.item.parameterResource


@Composable
fun MainScreen(
    navController: NavHostController,
) {

    val parameter = parameterResource(15,15,15,15)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.horizontalGradient(colors = colorScreen()))
        ) {
            CreateWorkoutButton(
                buttonShape = parameter,
                navController = navController
            )

            Spacer(modifier = Modifier.height(34.dp))

            FindWorkoutButton(
                buttonShape = parameter,
                navController = navController
            )
        }

        BottomPanel(
            navController = navController,
            firstRoutBottomPanel = Destination.Statistic.route,
            firstTitleBottomPanel = Destination.Statistic.title,
            SecondRoutBottomPanel = Destination.Setting.route,
            SecondTitleBottomPanel = Destination.Setting.title
        )
    }

}

@Composable
fun CreateWorkoutButton(
    buttonShape: RoundedCornerShape,
    navController: NavHostController
) {

    val interactionSource = remember { MutableInteractionSource() }

    Box(modifier = Modifier
        .shadow(6.dp, buttonShape)
        .background( colorScheme.primary, shape = buttonShape)
        .clip(shape = buttonShape)
        .clickable(
            interactionSource = interactionSource,
            indication = rememberRipple(),
        ) {
            navController.navigate(Destination.CreateWorkout.route)
        }
        .padding(PaddingValues(horizontal = 40.dp, vertical = 15.dp)),


    ) {
        Text(
            text = "Create a Workout",
            fontSize = 26.sp,
            color = colorScheme.onSecondary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun FindWorkoutButton(
    buttonShape: RoundedCornerShape,
    navController: NavHostController
) {

    val interactionSource = remember { MutableInteractionSource() }

    Box(modifier = Modifier
        .shadow(6.dp, buttonShape)
        .background(colorScheme.primary, shape = buttonShape)
        .clip(shape = buttonShape)
        .clickable(
            interactionSource = interactionSource,
            indication = rememberRipple(),
        ) {
            navController.navigate(Destination.FindWorkout.route)
        }
        .padding(PaddingValues(horizontal = 40.dp, vertical = 15.dp))

    ) {
        Text(
            text = "  Find a Workout  ",
            fontSize = 26.sp,
            color = colorScheme.onSecondary,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

