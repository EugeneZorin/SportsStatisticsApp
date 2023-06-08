package com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.navigation.Destination

@Composable
fun Rhombus(
    colorRhombus: List<Color>,
    navController: NavHostController,
    route: String = Destination.MainScreen.route,

) {

    var clicked by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(if (clicked) 0.8f else 1.0f)

    val interactionSource = remember { MutableInteractionSource() }

    Box(
        modifier = Modifier
            .padding(vertical = 40.dp)
            .rotate(degrees = 45f)
            .graphicsLayer {
                scaleX = scale
                scaleY = scale
            }
            .clickable(
                interactionSource = interactionSource,
                indication = rememberRipple(),
            ) {
                clicked = !clicked
                navController.navigate(route)
            }

            .background(
                brush = Brush.horizontalGradient(colors = colorRhombus)
            )
            .padding(PaddingValues(horizontal = 30.dp, vertical = 30.dp)),
    )
}
