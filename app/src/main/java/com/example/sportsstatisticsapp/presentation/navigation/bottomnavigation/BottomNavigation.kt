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
import androidx.compose.material3.MaterialTheme.colorScheme
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_SAVE
import com.example.sportsstatisticsapp.presentation.navigation.Destination
import com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation.buttoncontract.ButtonSaveContract
import com.example.sportsstatisticsapp.presentation.navigation.colorScreen
import com.example.sportsstatisticsapp.presentation.navigation.parameterResource
import com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel.AddNewWorkoutViewModel


@Composable
fun BottomNavigation(
    navController: NavHostController,
    currentRoute: String,
    navItems: SnapshotStateList<NavigationItems>,
    addNewWorkoutViewModel: AddNewWorkoutViewModel = viewModel()
) {

    val buttonSaveContract = object: ButtonSaveContract{
        override fun onButtonSave() {
            addNewWorkoutViewModel.onButtonSave()
        }
    }

    Box(
        modifier = Modifier
            .background(brush = Brush.horizontalGradient(colors = colorScreen()))
            .fillMaxWidth()
            .padding(vertical = 14.dp)
    ) {
        BottomNavigation(
            contentColor = Color.White,
            backgroundColor = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                navItems.forEachIndexed { index, item ->

                    val startPadding = if (index == 0) 16.dp else 50.dp
                    val endPadding = if (index == navItems.size - 1) 16.dp else 50.dp

                    BottomNavigationItem(
                        modifier = Modifier.padding(start = startPadding, end = endPadding),
                        icon = { AddItem(item) },
                        selected = item.route == currentRoute,
                        onClick = {
                            if (item.title == TITLE_SAVE){
                                buttonSaveContract.onButtonSave()
                            } else {
                                navController.navigate(item.route) {

                                }
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
    val parameter = parameterResource(15, 15, 15, 15)

    Row(
        modifier = Modifier
            .background(
                brush = Brush.horizontalGradient(colors = colorScreen()),
                shape = parameter
            )
            .clip(shape = parameter)
            .padding(PaddingValues(horizontal = 20.dp, vertical = 11.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = item.title,
            fontSize = 18.sp,
            color = colorScheme.onPrimary,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Rhombus(
    colorRhombus: List<Color>,
    navController: NavHostController
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
                navController.navigate(Destination.MainScreen.route)
            }

            .background(
                brush = Brush.horizontalGradient(colors = colorRhombus)
            )
            .padding(PaddingValues(horizontal = 30.dp, vertical = 30.dp)),
    )
}
