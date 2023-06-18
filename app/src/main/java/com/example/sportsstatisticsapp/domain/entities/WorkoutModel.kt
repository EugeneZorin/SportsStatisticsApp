package com.example.sportsstatisticsapp.domain.entities

data class WorkoutModel(
    val name_the_workout: String,
    val replays: String,
    val approach: String,
    val all_time: Long,
    val time_approach: Long,
    val distances: Long
)
