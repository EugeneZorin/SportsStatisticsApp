package com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportsstatisticsapp.domain.contract.NewWorkoutDataContract
import com.example.sportsstatisticsapp.domain.usecase.NewWorkoutDataImpl
import com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation.buttoncontract.ButtonSaveContract
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddNewWorkoutViewModel @Inject constructor(
    private val newWorkoutDataContract: NewWorkoutDataContract
) : ViewModel(), ButtonSaveContract {
    constructor() : this(NewWorkoutDataImpl())

    private val inputFieldMap = mutableMapOf<String, String>()
    fun addNewWorkout(rowID: String, nameWorkout: String) {
        inputFieldMap[rowID] = nameWorkout
    }

    override fun onButtonSave() {
        viewModelScope.launch {

        }
    }
}