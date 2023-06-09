package com.example.sportsstatisticsapp.presentation.views.screen.addworkout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.sportsstatisticsapp.presentation.contract.ContractSavingEnteredDataMap
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_BACK
import com.example.sportsstatisticsapp.presentation.models.Constants.TITLE_SAVE
import com.example.sportsstatisticsapp.presentation.models.ConstantsWorkout.ALL_TIME
import com.example.sportsstatisticsapp.presentation.models.ConstantsWorkout.APPROACH
import com.example.sportsstatisticsapp.presentation.models.ConstantsWorkout.DISTANCES
import com.example.sportsstatisticsapp.presentation.models.ConstantsWorkout.NAME
import com.example.sportsstatisticsapp.presentation.models.ConstantsWorkout.REPLAYS
import com.example.sportsstatisticsapp.presentation.models.ConstantsWorkout.TIME_APPROACH
import com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel.AddNewWorkoutViewModel
import com.example.sportsstatisticsapp.presentation.views.navigation.bottomnavigation.BottomPanel
import com.example.sportsstatisticsapp.presentation.views.navigation.item.Destination
import com.example.sportsstatisticsapp.presentation.views.navigation.item.colorScreen
import com.example.sportsstatisticsapp.presentation.views.navigation.item.parameterResource


@Composable
fun AddNewWorkout(
    navController: NavHostController,
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.horizontalGradient(colors = colorScreen()))
        ) {

            Spacer(modifier = Modifier.height(150.dp))


            Box(
                contentAlignment = Alignment.TopCenter
            ) {
                NewWorkoutInputFields(
                    textFieldLabel = "Name the workout",
                    modifier = Modifier.width(290.dp),
                    spText = 22.sp,
                    rowID = NAME,

                    )
            }

            Spacer(modifier = Modifier.height(75.dp))

            Row(
                modifier = Modifier.padding(horizontal = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                NewWorkoutInputFields(
                    textFieldLabel = "Replays",
                    modifier = Modifier.weight(1f),
                    spText = 20.sp,
                    rowID = REPLAYS,
                )
                Spacer(modifier = Modifier.width(15.dp))
                NewWorkoutInputFields(
                    textFieldLabel = "Approach",
                    modifier = Modifier.weight(1f),
                    spText = 20.sp,
                    rowID = APPROACH,
                )
            }

            Spacer(modifier = Modifier.height(35.dp))

            Row(
                modifier = Modifier.padding(horizontal = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                NewWorkoutInputFields(
                    textFieldLabel = "All Time",
                    modifier = Modifier.weight(1f),
                    spText = 20.sp,
                    rowID = ALL_TIME,
                )

                Spacer(modifier = Modifier.width(15.dp))

                NewWorkoutInputFields(
                    textFieldLabel = "Time Approach",
                    modifier = Modifier.weight(1f),
                    spText = 15.sp,
                    rowID = TIME_APPROACH,
                )
            }

            Spacer(modifier = Modifier.height(35.dp))

            NewWorkoutInputFields(
                textFieldLabel = "Distances",
                modifier = Modifier.width(150.dp),
                spText = 20.sp,
                rowID = DISTANCES,
            )
        }

        BottomPanel(
            navController = navController,
            firstRoutBottomPanel = Destination.ComposeWorkout.route,
            firstTitleBottomPanel = TITLE_BACK,
            SecondRoutBottomPanel = Destination.AddNewWorkout.route,
            SecondTitleBottomPanel = TITLE_SAVE
        )
    }
}


@Composable
fun NewWorkoutInputFields(
    textFieldLabel: String,
    modifier: Modifier = Modifier,
    spText: TextUnit,
    rowID: String,
) {

    val addNewWorkoutViewModel = hiltViewModel<AddNewWorkoutViewModel>()
    var nameWorkout by rememberSaveable { mutableStateOf("") }
    val shapeParameter = parameterResource(15, 15, 15, 15)

    val contract = remember {
        object : ContractSavingEnteredDataMap {
            override fun onSavingEnteredDataMap(rowID: String, nameWorkout: String) {
                addNewWorkoutViewModel.addNewWorkout(rowID, nameWorkout)
            }
        }
    }

    val customTextFieldColors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = colorScheme.onTertiary,
        unfocusedBorderColor = colorScheme.onBackground,
        backgroundColor = colorScheme.primary,
        cursorColor = colorScheme.secondary
    )

    Box(
        modifier = modifier.shadow(31.dp),
    ) {
        TextField(
            shape = shapeParameter,
            singleLine = true,
            value = nameWorkout,
            onValueChange = {
                nameWorkout = it
                contract.onSavingEnteredDataMap(rowID, nameWorkout)
            },
            textStyle = TextStyle(
                textAlign = TextAlign.Center, fontSize = spText, color = colorScheme.onSecondary
            ),

            label = {
                Text(
                    textFieldLabel, modifier = Modifier.fillMaxWidth(1f), style = TextStyle(
                        textAlign = TextAlign.Center,
                        fontSize = spText,
                        color = colorScheme.secondary
                    )
                )
            },
            colors = customTextFieldColors,
        )
    }
}




