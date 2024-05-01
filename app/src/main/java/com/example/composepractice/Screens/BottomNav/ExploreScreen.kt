package com.example.composepractice.Screens.BottomNav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composepractice.Screens.ExploreScreenComposable.ExploreListComposable
import com.example.composepractice.Screens.ExploreScreenComposable.HeaderComposable

@Composable
fun ExploreScreen(globalNavController: NavHostController) {
    //HeaderComposable()
    Column(
        Modifier
            .fillMaxSize()
            .padding(bottom = 100.dp)) {
        HeaderComposable()
        ExploreListComposable()
    }
}