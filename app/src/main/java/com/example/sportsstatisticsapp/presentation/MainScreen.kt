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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sportsstatisticsapp.presentation.bottom.colorScreen
import com.example.sportsstatisticsapp.presentation.bottom.parameterResource


@Composable
fun MainScreen() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.horizontalGradient(colors = colorScreen()))
    ) {

        CreateWorkoutButton(buttonShape = parameterResource(15,15,15,15))
        Spacer(modifier = Modifier.height(34.dp))
        FindWorkoutButton(buttonShape = parameterResource(15,15,15,15))
    }
}

@Composable
fun CreateWorkoutButton(
    buttonShape: RoundedCornerShape
) {

    val interactionSource = remember { MutableInteractionSource() }

    Box(modifier = Modifier
        .shadow(6.dp, buttonShape)
        .background(Color.White, shape = buttonShape)
        .clip(shape = buttonShape)
        .clickable(
            interactionSource = interactionSource,
            indication = rememberRipple(),
        ) {

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

    Box(modifier = Modifier
        .shadow(6.dp, buttonShape)
        .background(Color.White, shape = buttonShape)
        .clip(shape = buttonShape)
        .clickable(
            interactionSource = interactionSource,
            indication = rememberRipple(),
        ) {
        }
        .padding(PaddingValues(horizontal = 40.dp, vertical = 15.dp))

    ) {
        Text(
            text = "Find a Workout",
            fontSize = 26.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    MainScreen()
}

