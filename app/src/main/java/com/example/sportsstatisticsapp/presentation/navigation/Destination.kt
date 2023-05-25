package com.example.sportsstatisticsapp.presentation.navigation

import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_SETTING
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_STATISTIC
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_SETTING
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_STATISTIC


sealed class Destination(var route: String,var title: String) {
    object Setting : Destination(ROUT_SETTING,TITLE_SETTING)
    object Statistic : Destination(ROUT_STATISTIC, TITLE_STATISTIC)
    object MainScreen: Destination(ROUT_MAIN_SCREEN, TITLE_MAIN_SCREEN)

}
