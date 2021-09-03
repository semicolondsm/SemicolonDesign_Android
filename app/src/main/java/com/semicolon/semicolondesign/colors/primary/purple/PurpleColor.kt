package com.semicolon.semicolondesign.colors.primary.purple

import androidx.compose.ui.graphics.Color
import com.semicolon.semicolondesign.colors.primary.black.black


fun purple(number: Int): Color {
    return when (number) {
        50 -> purple50
        100 -> purple100
        200 -> purple200
        300 -> purple300
        400 -> purple400
        500 -> purple500
        600 -> purple600
        700 -> purple700
        800 -> purple800
        900 -> purple900
        else -> black
    }
}

fun purple50(): Color = purple50

fun purple100(): Color = purple100

fun purple200(): Color = purple200

fun purple300(): Color = purple300

fun purple400(): Color = purple400

fun purple500(): Color = purple500

fun purple600(): Color = purple600

fun purple700(): Color = purple700

fun purple800(): Color = purple800

fun purple900(): Color = purple900