package com.example.composepractice.Screens.ExploreScreenComposable.ExploreList

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import com.example.composepractice.CommonUI.RegularText
import com.example.composepractice.R

@Composable
fun ExploreRowItemComposable(locationList: List<String>, placesImg: Int) {
    LazyRow(Modifier.padding(top = 10.dp)) {
        items(locationList.size) {
            Card(
                Modifier
                    .size(height = 200.dp, width = 220.dp)
                    .padding(start = 10.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = placesImg),
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
                                text = locationList[it],
                                modifier = Modifier.padding(4.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}