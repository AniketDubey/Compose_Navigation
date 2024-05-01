package com.example.composepractice.Screens.ExploreScreenComposable.ExploreList

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
fun ExploreValleysList() {
    val valleyList = ExploreListItem(
        "Valley",
        "A place to wonder",
        listOf(
            "Rupin Pass",
            "Bali Pass",
            "Saar Pass",
            "Hampta Pass",
        )
    )
    BoldText(
        text = valleyList.title,
        textSize = 26.sp,
        modifier = Modifier.padding(start = 10.dp)
    )
    RegularText(
        text = valleyList.subTitle,
        textSize = 20.sp,
        modifier = Modifier.padding(start = 10.dp)
    )
    ExploreRowItemComposable(valleyList.locationList, R.drawable.valley_img)
}