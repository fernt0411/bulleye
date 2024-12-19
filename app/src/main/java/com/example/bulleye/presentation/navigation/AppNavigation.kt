package com.example.bulleye.presentation.navigation

enum class Screen {
    HOME,
    LOGIN,
    INFO,
    GAME
}

sealed class NavigationItem(val route: String) {
    data object Home : NavigationItem(Screen.HOME.name)
    data object Game : NavigationItem(Screen.GAME.name)
    data object Login : NavigationItem(Screen.LOGIN.name)
    data object Info : NavigationItem(Screen.INFO.name)
}