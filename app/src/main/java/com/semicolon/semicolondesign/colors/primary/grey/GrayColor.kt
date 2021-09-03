package com.semicolon.semicolondesign.colors.primary.grey

import androidx.compose.ui.graphics.Color
import com.semicolon.semicolondesign.colors.primary.black.black


fun gray(number: Int): Color {
    return when (index) {
        50 -> grey50
        100 -> grey100
        200 -> grey200
        300 -> grey300
        400 -> grey400
        500 -> grey500
        600 -> grey600
        700 -> grey700
        800 -> grey800
        900 -> grey900
        else -> black
    }
}

fun gray50() = grey50

fun gray100() = grey100

fun gray200() = grey200

fun gray300() = grey300

fun gray400() = grey400

fun gray500() = grey500

fun gray600() = grey600

fun gray700() = grey700

fun gray800() = grey800

fun gray900() = grey900
