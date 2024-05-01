package com.example.composepractice.Screens.ExploreScreenComposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.CommonUI.BoldText
import com.example.composepractice.CommonUI.RegularText
import com.example.composepractice.Models.ExploreListItem.ExploreListItem
import com.example.composepractice.R

@Composable
fun ExploreListComposable() {
    ExploreMountainsList()
    /*ExploreValleysList()
    ExploreStartsList()
    ExploreAdventureSportsList()
    TopRecommended()
    ExploreCityList()*/
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
fun ExploreStartsList() {
    TODO("Not yet implemented")
}

@Composable
fun ExploreValleysList() {
    TODO("Not yet implemented")
}

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

    Column(Modifier.padding(top = 20.dp, start = 10.dp)) {
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
        LazyRow(Modifier.padding(top = 10.dp)) {
            items(mountainList.locationList.size) {
                Card(
                    Modifier
                        .size(height = 200.dp, width = 220.dp)
                        .padding(start = 10.dp),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.places_img),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 8.dp, bottom = 8.dp),
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Card(
                                shape = RoundedCornerShape(8.dp), colors = CardDefaults.cardColors(
                                    Color(colorResource(id = R.color.img_bg).value)
                                )
                            ) {
                                RegularText(
                                    textColor = Color.White,
                                    text = mountainList.locationList[it],
                                    modifier = Modifier.padding(4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
