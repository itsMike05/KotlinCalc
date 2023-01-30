package com.itsmike.kotlincalc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CalcState,
    modifier: Modifier = Modifier,
    btnSpacing: Dp = 10.dp,
    onAction: (CalcAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(btnSpacing),
        )
        {
            Text(
                text = state.number1 + (state.operation?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 25.dp),
                fontWeight = FontWeight.Light,
                fontSize = 85.sp,
                color = Color.White,
                maxLines = 2
            )
            
            Row(modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(btnSpacing)
            ) {
                CalcButton(
                    calcSymbol = "AC",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalcAction.Clear)
                    }
                )
            }
            }

        }
    }
