package com.example.composepractice.NavGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.composepractice.Models.Routes
import com.example.composepractice.Screens.BottomNav.ExploreScreen
import com.example.composepractice.Screens.BottomNav.AccountScreen
import com.example.composepractice.Screens.BottomNav.ReviewScreen

@Composable
fun MainScreenNavGraph(
    mainScreenNavController: NavHostController,
    globalNavController: NavHostController
) {
    NavHost(
        navController = mainScreenNavController,
        startDestination = Routes.MainScreenNav.route
    ) {
        navigation(
            route = Routes.MainScreenNav.route,
            startDestination = Routes.ExploreMainScreen.route
        ) {
            composable(route = Routes.AccountMainScreen.route) {
                AccountScreen(globalNavController)
            }
            composable(route = Routes.ExploreMainScreen.route) {
                ExploreScreen(globalNavController)
            }
            composable(route = Routes.ReviewMainScreen.route) {
                ReviewScreen(globalNavController)
            }
        }
    }
}