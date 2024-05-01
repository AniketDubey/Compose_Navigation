package com.example.composepractice.NavGraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.composepractice.Models.Routes
import com.example.composepractice.Screens.InsideExploreScreen
import com.example.composepractice.Screens.InsideAccountScreen
import com.example.composepractice.Screens.InsideReviewScreen
import com.example.composepractice.Screens.Auth.LoginScreen
import com.example.composepractice.Screens.MainScreen

@Composable
fun GlobalNavGraph() {
    val globalNavController = rememberNavController()
    NavHost(navController = globalNavController, startDestination = Routes.MainScreenNav.route) {
        navigation(route = Routes.ParentNav.route, startDestination = Routes.LoginScreen.route) {
            composable(route = Routes.LoginScreen.route) {
                LoginScreen(globalNavController)
            }
        }

        navigation(route = Routes.MainScreenNav.route, startDestination = Routes.MainScreen.route) {
            composable(route = Routes.MainScreen.route) {
                MainScreen(globalNavController)
            }
        }

        navigation(
            route = Routes.InsideExploreNav.route,
            startDestination = Routes.InsideExploreScreen.route
        ) {
            composable(route = Routes.InsideExploreScreen.route) {
                InsideExploreScreen()
            }
        }

        navigation(
            route = Routes.InsideAccountNav.route,
            startDestination = Routes.InsideAccountScreen.route
        ) {
            composable(route = Routes.InsideAccountScreen.route) {
                InsideAccountScreen()
            }
        }

        navigation(
            route = Routes.InsideReviewNav.route,
            startDestination = Routes.InsideReviewScreen.route
        ) {
            composable(route = Routes.InsideReviewScreen.route) {
                InsideReviewScreen()
            }
        }
    }
}