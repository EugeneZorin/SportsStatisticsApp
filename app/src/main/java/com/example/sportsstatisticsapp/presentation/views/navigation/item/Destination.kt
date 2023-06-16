package com.example.sportsstatisticsapp.presentation.views.navigation.item

import com.example.sportsstatisticsapp.presentation.models.Constants.ROUT_ADD_NEW_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.ROUT_COMPOSE_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.ROUT_CREATE_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.ROUT_FIND_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.ROUT_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.models.Constants.ROUT_SETTING
import com.example.sportsstatisticsapp.presentation.models.Constants.ROUT_STATISTIC
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_ADD_NEW_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_COMPOSE_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_CREATE_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_FIND_WORKOUT
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_MAIN_SCREEN
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_SETTING
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_STATISTIC


sealed class Destination(var route: String,var title: String) {
    object Setting : Destination(ROUT_SETTING,TITLE_SETTING)
    object Statistic : Destination(ROUT_STATISTIC, TITLE_STATISTIC)
    object MainScreen: Destination(ROUT_MAIN_SCREEN, TITLE_MAIN_SCREEN)
    object CreateWorkout: Destination(ROUT_CREATE_WORKOUT, TITLE_CREATE_WORKOUT)
    object FindWorkout: Destination(ROUT_FIND_WORKOUT, TITLE_FIND_WORKOUT)
    object ComposeWorkout: Destination(ROUT_COMPOSE_WORKOUT, TITLE_COMPOSE_WORKOUT)
    object AddNewWorkout: Destination(ROUT_ADD_NEW_WORKOUT, TITLE_ADD_NEW_WORKOUT)


}
