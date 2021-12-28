package com.semicolon.design.util

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CircularProgressBar(
    progressColor: Color,
    backgroundColor: Color,
    modifier: Modifier
) {
    Box{
        Spacer(
            modifier = modifier
                .border(1.dp, backgroundColor, RoundedCornerShape(7.dp))
        )
        CircularProgressIndicator(
            strokeWidth = 1.dp,
            color = progressColor,
            modifier = modifier
        )
    }
}