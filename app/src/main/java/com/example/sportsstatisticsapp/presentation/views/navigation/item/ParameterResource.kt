package com.example.sportsstatisticsapp.presentation.views.navigation.item

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun parameterResource(
    topEnd: Int,
    bottomStart: Int,
    topStart: Int,
    bottomEnd: Int
): RoundedCornerShape {

    return RoundedCornerShape(
        topEnd = topEnd.dp,
        bottomStart = bottomStart.dp,
        topStart = topStart.dp,
        bottomEnd = bottomEnd.dp
    )
}

@Composable
fun colorScreen(): List<Color> {

    return listOf(
        colorScheme.background,
        colorScheme.onBackground
    )
}
