package com.itsmike.kotlincalc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.itsmike.kotlincalc.ui.theme.KotlinCalcTheme
import com.itsmike.kotlincalc.ui.theme.SmoothBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinCalcTheme {
                val viewModel = viewModel<CalcVM>()
                val state = viewModel.state
                val defaultSpacing = 10.dp

                Calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    btnSpacing = defaultSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(SmoothBlue)
                        .padding(16.dp)
                    )
            }
        }
    }
}
