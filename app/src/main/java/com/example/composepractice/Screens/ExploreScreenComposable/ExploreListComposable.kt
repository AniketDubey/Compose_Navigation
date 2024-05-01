package com.example.composepractice.Screens.ExploreScreenComposable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composepractice.Screens.ExploreScreenComposable.ExploreList.ExploreMountainsList
import com.example.composepractice.Screens.ExploreScreenComposable.ExploreList.ExploreStarList
import com.example.composepractice.Screens.ExploreScreenComposable.ExploreList.ExploreValleysList

@Composable
fun ExploreListComposable() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(top = 20.dp, start = 10.dp)
    ) {
        ExploreMountainsList()
        ExploreValleysList()
        ExploreStarList()
    /*ExploreAdventureSportsList()
    TopRecommended()
    ExploreCityList()*/
    }
}

@Composable
fun ExploreAdventureSportsList() {
    TODO("Not yet implemented")
}

@Composable
fun ExploreCityList() {
    TODO("Not yet implemented")
}

@Composable
fun TopRecommended() {
    TODO("Not yet implemented")
}

@Composable
fun ExploreStarsList() {
    TODO("Not yet implemented")
}


