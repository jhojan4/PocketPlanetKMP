package edu.unicauca.example.pocketplanet

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinPocketPlanet",
    ) {
        AppNavigation()
    }
}