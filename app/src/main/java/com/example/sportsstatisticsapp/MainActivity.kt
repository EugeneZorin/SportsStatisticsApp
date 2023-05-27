package com.example.sportsstatisticsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sportsstatisticsapp.presentation.bottom.BottomNavigationBarScreen
import com.example.sportsstatisticsapp.presentation.navigation.MainNavHost


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainNavHost()
        }
    }
}


