package com.example.sportsstatisticsapp.presentation.navigation

sealed class Destination(val route: String){
    object MainScreen: Destination("main_screen")
    object CreateWorkoutScreen: Destination("create_workout_screen")
    object ComposeWorkoutScreen: Destination("compose_workout_screen")
    object CombineWorkout: Destination("combine_workout")
    object SetCalendarScreen: Destination("set_calendar_screen")
    object InfoOneWorkout: Destination("info_one_workout")
    object AddNewWorkout: Destination("add_new_workout")
}