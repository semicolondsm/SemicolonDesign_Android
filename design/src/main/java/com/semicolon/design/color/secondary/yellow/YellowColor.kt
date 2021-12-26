package com.semicolon.design.color.secondary.yellow

import androidx.compose.ui.graphics.Color
import com.semicolon.design.color.NumberOfColor

fun yellow(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> yellow50
        NumberOfColor.N100 -> yellow100
        NumberOfColor.N200 -> yellow200
        NumberOfColor.N300 -> yellow300
        NumberOfColor.N400 -> yellow400
        NumberOfColor.N500 -> yellow500
        NumberOfColor.N600 -> yellow600
        NumberOfColor.N700 -> yellow700
        NumberOfColor.N800 -> yellow800
        NumberOfColor.N900 -> yellow900
    }
}