package com.example.sportsstatisticsapp.presentation.navigation

import androidx.compose.material.icons.Icons
import com.example.sportsstatisticsapp.R


sealed class Destination(var route: String, var icon: Int ,var title: String) {
    object Setting : Destination("settings", android.R.drawable.btn_star_big_on,"Settings")
    object Statistic : Destination("statistic", android.R.drawable.btn_star_big_on,"Statistic")
    object MainScreen: Destination("MainScreen", android.R.drawable.btn_star_big_on,"MainScreen")

}
