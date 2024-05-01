package com.example.composepractice.Screens.ExploreScreenComposable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.CommonUI.BoldText
import com.example.composepractice.CommonUI.RegularText
import com.example.composepractice.Models.BasicExplore.BasicExplore
import com.example.composepractice.R

@Composable
fun HeaderComposable() {
    Box(
        Modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.teal_200))
            .padding(top = 20.dp, bottom = 10.dp, start = 22.dp, end = 22.dp)
    ) {
        Column {
            AccountIconComposable()
            BoldText(
                text = "Explore",
                textSize = 30.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            BasicThingsToExploreComposable()
        }
    }
}

@Composable
fun BasicThingsToExploreComposable() {
    val exploreList =
        listOf(
            BasicExplore(icon = painterResource(id = R.drawable.hotel_icon), title = "Hotels"),
            BasicExplore(icon = painterResource(id = R.drawable.culture_icon), title = "Culture")
        )

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        exploreList.forEach {
            Card(
                shape = RoundedCornerShape(30.dp),
                colors = CardDefaults.cardColors(
                    Color.White
                )
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(15.dp)
                        .width(120.dp)
                ) {
                    Icon(
                        painter = it.icon,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    RegularText(text = it.title)
                }
            }
        }
    }
}

@Composable
fun AccountIconComposable() {
    Row(
        Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
    ) {
        Image(
            painter = painterResource(id = R.drawable.account_image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Black, CircleShape)
        )
    }
}
