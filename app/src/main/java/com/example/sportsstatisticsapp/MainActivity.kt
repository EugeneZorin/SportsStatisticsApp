package com.example.sportsstatisticsapp

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sportsstatisticsapp.presentation.navigation.MainNavHost
import com.example.sportsstatisticsapp.ui.theme.AppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                MainNavHost()
            }
        }
    }
}


