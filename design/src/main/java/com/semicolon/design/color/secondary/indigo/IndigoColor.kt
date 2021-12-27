package com.semicolon.design.color.secondary.indigo

import androidx.compose.ui.graphics.Color
import com.semicolon.design.color.NumberOfColor


fun indigo(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> indigo50
        NumberOfColor.N100 -> indigo100
        NumberOfColor.N200 -> indigo200
        NumberOfColor.N300 -> indigo300
        NumberOfColor.N400 -> indigo400
        NumberOfColor.N500 -> indigo500
        NumberOfColor.N600 -> indigo600
        NumberOfColor.N700 -> indigo700
        NumberOfColor.N800 -> indigo800
        NumberOfColor.N900 -> indigo900
    }
}