package com.itsmike.kotlincalc

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.sp

@Composable
fun CalcButton(
    calcSymbol: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RectangleShape)
            .clickable { onClick }
            .then(modifier)
            ){
            Text(
                text = calcSymbol,
                fontSize = 36.sp,
                color = Color.White
            )
    }
}