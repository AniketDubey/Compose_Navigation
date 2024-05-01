package com.example.composepractice.Screens.ExploreScreenComposable.ExploreList

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.CommonUI.BoldText
import com.example.composepractice.CommonUI.RegularText
import com.example.composepractice.Models.ExploreListItem.ExploreListItem
import com.example.composepractice.R

@Composable
fun ExploreMountainsList() {
    val mountainList = ExploreListItem(
        "Mountains",
        "A place to wonder",
        listOf(
            "Mt.Everest",
            "Mt.Makalu",
            "Mt.Kanchenjunga",
            "Mt.Everest",
            "Mt.Makalu",
            "Mt.Kanchenjunga",
            "Mt.Everest",
            "Mt.Makalu",
            "Mt.Kanchenjunga",
            "Mt.Everest",
            "Mt.Makalu",
            "Mt.Kanchenjunga",
            "Mt.Everest",
            "Mt.Makalu",
            "Mt.Kanchenjunga",
            "Mt.Everest",
            "Mt.Makalu",
            "Mt.Kanchenjunga"
        )
    )

    Column(modifier = Modifier.padding(bottom = 15.dp)) {
        BoldText(
            text = mountainList.title,
            textSize = 26.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        RegularText(
            text = mountainList.subTitle,
            textSize = 20.sp,
            modifier = Modifier.padding(start = 10.dp)
        )
        ExploreRowItemComposable(mountainList.locationList, R.drawable.mountains_img)
    }
}