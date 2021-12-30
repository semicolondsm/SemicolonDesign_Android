package com.semicolon.design.typography

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Title1(
    text: String,
    lineHeight: Int = 60,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W500,
        size = 40,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Title2(
    text: String,
    lineHeight: Int = 54,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W500,
        size = 36,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Title3(
    text: String,
    lineHeight: Int = 48,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W500,
        size = 32,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Subtitle1(
    text: String,
    lineHeight: Int = 48,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W400,
        size = 32,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Subtitle2(
    text: String,
    lineHeight: Int = 42,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W400,
        size = 28,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Subtitle3(
    text: String,
    lineHeight: Int = 36,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W400,
        size = 24,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Subtitle4(
    text: String,
    lineHeight: Int = 30,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W400,
        size = 20,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Body1(
    text: String,
    lineHeight: Int = 24,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W300,
        size = 16,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Body2(
    text: String,
    lineHeight: Int = 21,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W300,
        size = 14,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Body3(
    text: String,
    lineHeight: Int = 18,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W300,
        size = 12,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Botton(
    text: String,
    lineHeight: Int = 21,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W300,
        size = 14,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Caption(
    text: String,
    lineHeight: Int = 18,
    latterSpacing: Int = 0,
    color : Color = Color.Black
) {
    Typography(
        text = text,
        weight = FontWeight.W300,
        size = 12,
        color = color,
        lineHeight = lineHeight,
        letterSpacing = latterSpacing
    )
}

@Composable
fun Typography(
    text: String,
    weight: FontWeight,
    size: Int,
    color: Color,
    lineHeight: Int,
    letterSpacing: Int
) {
    Text(
        text = text,
        fontWeight = weight,
        fontSize = size.sp,
        color = color,
        lineHeight = lineHeight.sp,
        letterSpacing = letterSpacing.sp
    )
}

