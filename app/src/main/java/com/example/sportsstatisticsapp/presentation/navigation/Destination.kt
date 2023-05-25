package com.example.sportsstatisticsapp.presentation.navigation

import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_BACK_CW
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_COMPOSE_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_CREATE_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_FIND_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_NEXT_CW
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_SETTING
import com.example.sportsstatisticsapp.presentation.constants.Constants.ROUT_STATISTIC
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_BACK_CW
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_COMPOSE_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_CREATE_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_FIND_WORKOUT
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_NEXT_CW
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_SETTING
import com.example.sportsstatisticsapp.presentation.constants.Constants.TITLE_STATISTIC


sealed class Destination(var route: String,var title: String) {
    object Setting : Destination(ROUT_SETTING,TITLE_SETTING)
    object Statistic : Destination(ROUT_STATISTIC, TITLE_STATISTIC)
    object MainScreen: Destination(ROUT_MAIN_SCREEN, TITLE_MAIN_SCREEN)
    object CreateWorkout: Destination(ROUT_CREATE_WORKOUT, TITLE_CREATE_WORKOUT)
    object FindWorkout: Destination(ROUT_FIND_WORKOUT, TITLE_FIND_WORKOUT)
    object ComposeWorkout: Destination(ROUT_COMPOSE_WORKOUT, TITLE_COMPOSE_WORKOUT)

    object BackComposeWorkout: Destination(ROUT_BACK_CW, TITLE_BACK_CW)
    object NextComposeWorkout: Destination(TITLE_NEXT_CW, ROUT_NEXT_CW)



}
