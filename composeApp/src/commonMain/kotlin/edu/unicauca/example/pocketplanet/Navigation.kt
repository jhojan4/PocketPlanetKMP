package edu.unicauca.example.pocketplanet

import androidx.compose.runtime.*
import androidx.compose.runtime.Composable

enum class Screen {
    PRESENTACION,
    REGISTRO
}

@Composable
fun AppNavigation() {
    var currentScreen by remember { mutableStateOf(Screen.PRESENTACION) }

    when (currentScreen) {
        Screen.PRESENTACION -> PresentacionScreen(
            onNavigateToRegistro = { currentScreen = Screen.REGISTRO }
        )
        Screen.REGISTRO -> RegistroScreen(
            onNavigateToLogin = { currentScreen = Screen.PRESENTACION }
        )
    }
}
