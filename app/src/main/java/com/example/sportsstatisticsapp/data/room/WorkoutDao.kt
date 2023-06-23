package com.example.sportsstatisticsapp.data.room

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface WorkoutDao {

    @Insert
    suspend fun insert(workout: WorkoutEntity)


}