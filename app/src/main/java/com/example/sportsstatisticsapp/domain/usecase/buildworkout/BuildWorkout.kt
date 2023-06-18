package com.example.sportsstatisticsapp.domain.usecase.buildworkout

import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.APPROACH
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.DISTANCES
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.REPLAYS
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.TIME_APPROACH
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractBuildWorkout
import javax.inject.Inject

class BuildWorkout @Inject constructor() : ContractBuildWorkout {

    override fun contractBuildWorkout(mapWorkout: MutableMap<String, String>): MutableMap<String, String> {

        if (!mapWorkout.containsKey(DISTANCES)) mapWorkout[DISTANCES] = 0.toString()
        if (!mapWorkout.containsKey(REPLAYS)) mapWorkout[REPLAYS] = 1.toString()
        if (!mapWorkout.containsKey(APPROACH)) mapWorkout[APPROACH] = 1.toString()
        if (!mapWorkout.containsKey(TIME_APPROACH)) mapWorkout[TIME_APPROACH] = 30.toString()

        return mapWorkout
    }
}