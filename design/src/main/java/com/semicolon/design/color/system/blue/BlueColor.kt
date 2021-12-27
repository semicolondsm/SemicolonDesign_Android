package com.semicolon.design.color.system.blue

import androidx.compose.ui.graphics.Color
import com.semicolon.design.color.NumberOfColor

fun blue(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> blue50
        NumberOfColor.N100 -> blue100
        NumberOfColor.N200 -> blue200
        NumberOfColor.N300 -> blue300
        NumberOfColor.N400 -> blue400
        NumberOfColor.N500 -> blue500
        NumberOfColor.N600 -> blue600
        NumberOfColor.N700 -> blue700
        NumberOfColor.N800 -> blue800
        NumberOfColor.N900 -> blue900
    }
}