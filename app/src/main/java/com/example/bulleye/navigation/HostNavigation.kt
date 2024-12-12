package com.example.bulleye.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bulleye.game.GameScreen
import com.example.bulleye.info.InfoScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Game.route,

    ) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Game.route) {
            GameScreen(navController = navController)
        }
        composable(NavigationItem.Info.route) {
            InfoScreen(navController = navController)
        }
    }

}