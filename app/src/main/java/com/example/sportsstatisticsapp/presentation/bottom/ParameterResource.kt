package com.example.sportsstatisticsapp.presentation.bottom

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.sportsstatisticsapp.R

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
        colorResource(id = R.color.almostWhite),
        colorResource(id = R.color.whiteBlue)
    )
}