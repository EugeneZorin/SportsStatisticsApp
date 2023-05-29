package com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.R
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.navigation.colorScreen
import com.example.sportsstatisticsapp.presentation.navigation.parameterResource


@Composable
fun BottomNavigation(
    navController: NavHostController,
    currentRoute: String,
    navItems: SnapshotStateList<NavigationItems>
) {

    Box(
        modifier = Modifier
            .background(brush = Brush.horizontalGradient(colors = colorScreen()))
            .fillMaxWidth()
            .padding(vertical = 14.dp)
    ) {

        Box(
            modifier = Modifier.align(Alignment.BottomCenter),
        ) {
            BottomNavigation(
                contentColor = Color.White,
                backgroundColor = Color.White,
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
}


@Composable
fun AddItem(
    item: NavigationItems,
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
    }
}

@Composable
fun Rhombus(
    colorRhombus: List<Color>,
    label: String
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

            }

            .background(
                brush = Brush.horizontalGradient(colors = colorRhombus)
            )
            .padding(PaddingValues(horizontal = 30.dp, vertical = 30.dp)),
    )
}