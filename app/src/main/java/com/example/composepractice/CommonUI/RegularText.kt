package com.example.composepractice.CommonUI

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun RegularText(
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = Color.Black,
    textMaxLine: Int = 1,
    textFontWeight: FontWeight = FontWeight.Normal,
    textOverflow: TextOverflow = TextOverflow.Visible,
    textSize: TextUnit = 16.sp
) {
    Text(
        text = text,
        color = textColor,
        modifier = modifier,
        maxLines = textMaxLine,
        overflow = textOverflow,
        fontWeight = textFontWeight,
        fontSize = textSize
    )
}