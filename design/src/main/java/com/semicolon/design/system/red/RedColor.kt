package com.semicolon.design.system.red

import androidx.compose.ui.graphics.Color
import com.semicolon.design.NumberOfColor

fun red(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> red50
        NumberOfColor.N100 -> red100
        NumberOfColor.N200 -> red200
        NumberOfColor.N300 -> red300
        NumberOfColor.N400 -> red400
        NumberOfColor.N500 -> red500
        NumberOfColor.N600 -> red600
        NumberOfColor.N700 -> red700
        NumberOfColor.N800 -> red800
        NumberOfColor.N900 -> red900
    }
}