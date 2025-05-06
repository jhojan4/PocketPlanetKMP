package edu.unicauca.example.pocketplanet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform