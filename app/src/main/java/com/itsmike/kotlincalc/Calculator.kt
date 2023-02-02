package com.itsmike.kotlincalc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.itsmike.kotlincalc.ui.theme.MediumGray
import com.itsmike.kotlincalc.ui.theme.Orange300
import com.itsmike.kotlincalc.ui.theme.Orange500


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
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp,
                color = Color.White,
                maxLines = 2
            )
            Divider (
                color = Black,
                thickness = 2.dp
                    )
            // First row (AC - Del - /)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(btnSpacing)
            ) {
                CalcButton(
                    calcSymbol = "AC",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalcAction.Clear)
                    }
                )
                CalcButton(
                    calcSymbol = "Del",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Delete)
                    }
                )
                CalcButton(
                    calcSymbol = "/",
                    modifier = Modifier
                        .background(Orange300)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Operation(CalcOperation.Divide))
                    }
                )
            }
            // Second row (7, 8, 9, x)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(btnSpacing)
            ) {
                CalcButton(
                    calcSymbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(7))
                    }
                )
                CalcButton(
                    calcSymbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(8))
                    }
                )
                CalcButton(
                    calcSymbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(9))
                    }
                )
                CalcButton(
                    calcSymbol = "x",
                    modifier = Modifier
                        .background(Orange300)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Operation(CalcOperation.Multiply))
                    }
                )
            }
            // Third row (4, 5, 6, -)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(btnSpacing)
            ) {
                CalcButton(
                    calcSymbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(4))
                    }
                )
                CalcButton(
                    calcSymbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(5))
                    }
                )
                CalcButton(
                    calcSymbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(6))
                    }
                )
                CalcButton(
                    calcSymbol = "-",
                    modifier = Modifier
                        .background(Orange300)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Operation(CalcOperation.Substract))
                    }
                )
            }
            // Fourth row (1, 2, 3, +)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(btnSpacing)
            ) {
                CalcButton(
                    calcSymbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(1))
                    }
                )
                CalcButton(
                    calcSymbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(2))
                    }
                )
                CalcButton(
                    calcSymbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Number(3))
                    }
                )
                CalcButton(
                    calcSymbol = "+",
                    modifier = Modifier
                        .background(Orange300)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Operation(CalcOperation.Add))
                    }
                )
            }
            // Fifth row (0, decimal, equals)
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(btnSpacing)
            ) {
                CalcButton(
                    calcSymbol = "0",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalcAction.Number(0))
                    }
                )
                CalcButton(
                    calcSymbol = ".",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.DecimalPoint)
                    }
                )
                CalcButton(
                    calcSymbol = "=",
                    modifier = Modifier
                        .background(Orange500)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcAction.Calculate)
                    }
                )
            }
        }
        }
    }
