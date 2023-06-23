package com.example.sportsstatisticsapp.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workouts")
data class WorkoutEntity(
    @PrimaryKey val id: Long,
    val workoutModel: String
)