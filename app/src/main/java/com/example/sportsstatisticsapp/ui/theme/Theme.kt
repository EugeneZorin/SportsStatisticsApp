package com.example.sportsstatisticsapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    background = AlmostWhite,
    onBackground = WhiteBlue,
    primary = White,
    onPrimary = LightGray,
    secondary = Grey,
    onSecondary = Black,
    tertiary = Blue,
    onTertiary = VioletBlue,
)

private val LightColorScheme = lightColorScheme(
    background = AlmostWhite,
    onBackground = WhiteBlue,
    primary = White,
    onPrimary = LightGray,
    secondary = Grey,
    onSecondary = Black,
    tertiary = Blue,
    onTertiary = VioletBlue,
)



@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (!darkTheme) {
        LightColorScheme
    } else {
        DarkColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}

