package com.example.composepractice.Screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composepractice.Models.BottomNavItems
import com.example.composepractice.Models.Routes
import com.example.composepractice.NavGraph.MainScreenNavGraph

@Composable
fun MainScreen(globalNavController: NavHostController) {
    val bottomItems = listOf(
        BottomNavItems(Icons.Filled.DateRange, "Plan"),
        BottomNavItems(Icons.Filled.LocationOn, "Explore"),
        BottomNavItems(Icons.Filled.Edit, "Review")
    )

    var curSelected by rememberSaveable {
        mutableIntStateOf(0)
    }

    val mainScreenNavController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                bottomItems.forEachIndexed { index, bottomNavItems ->
                    NavigationBarItem(
                        selected = (index == curSelected),
                        onClick = {
                            curSelected = index
                            if (index == 0) {
                                mainScreenNavController.navigate(Routes.PlanMainScreen.route)
                            } else if (index == 1) {
                                mainScreenNavController.navigate(Routes.ExploreMainScreen.route)
                            } else {
                                mainScreenNavController.navigate(Routes.ReviewMainScreen.route)
                            }
                        },
                        icon = {
                           Icon(imageVector =  bottomNavItems.icon, contentDescription = null)
                        }
                    )
                }
            }
        },
    ) {
        it.calculateBottomPadding()
        MainScreenNavGraph(mainScreenNavController,globalNavController)
    }
}