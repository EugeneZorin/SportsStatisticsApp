package com.example.sportsstatisticsapp.presentation

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MainScreen(
    navController: NavHostController,
) {

    val buttonShape = RoundedCornerShape(
        topEnd = 15.dp, bottomStart = 15.dp, topStart = 15.dp, bottomEnd = 15.dp
    )

    val backgroundScreen = listOf(Color(0xFFE0E8F5), Color(0xFFCFDCF1))


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.horizontalGradient(colors = backgroundScreen))
    ) {

        CreateWorkoutButton(buttonShape = buttonShape)
        Spacer(modifier = Modifier.height(34.dp))
        FindWorkoutButton(buttonShape = buttonShape)



    }
}

@Composable
fun CreateWorkoutButton(
    buttonShape: RoundedCornerShape
) {

    val interactionSource = remember { MutableInteractionSource() }
    var enabled by remember { mutableStateOf(true) }

    Box(modifier = Modifier
        .shadow(6.dp, buttonShape)
        .background(Color.White, shape = buttonShape)
        .clip(shape = buttonShape)
        .clickable(
            enabled = enabled,
            interactionSource = interactionSource,
            indication = rememberRipple(),
        ) {
            enabled = true
        }
        .padding(PaddingValues(horizontal = 40.dp, vertical = 15.dp))

    ) {
        Text(
            text = "Create a Workout",
            fontSize = 26.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun FindWorkoutButton(
    buttonShape: RoundedCornerShape
) {

    val interactionSource = remember { MutableInteractionSource() }
    var enabled by remember { mutableStateOf(true) }

    Box(modifier = Modifier
        .shadow(6.dp, buttonShape)
        .background(Color.White, shape = buttonShape)
        .clip(shape = buttonShape)
        .clickable(
            enabled = enabled,
            interactionSource = interactionSource,
            indication = rememberRipple(),
        ) {
            enabled = true
        }
        .padding(PaddingValues(horizontal = 40.dp, vertical = 15.dp))

    ) {
        Text(
            text = "Create a Workout",
            fontSize = 26.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}


