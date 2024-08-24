package com.remziakgoz.currencyapp

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import darkScheme
import di.initializeKoin
import lightScheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import presentation.screen.HomeScreen

@Composable
@Preview
fun App() {
//    val colors = if (!isSystemInDarkTheme()) lightScheme else darkScheme
    initializeKoin()

    MaterialTheme  {
        Navigator(HomeScreen())
    }
}