package com.semicolon.semicolondesign.colors.system.green

import androidx.compose.ui.graphics.Color
import com.semicolon.semicolondesign.colors.NumberOfColor

fun green(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> green50
        NumberOfColor.N100 -> green100
        NumberOfColor.N200 -> green200
        NumberOfColor.N300 -> green300
        NumberOfColor.N400 -> green400
        NumberOfColor.N500 -> green500
        NumberOfColor.N600 -> green600
        NumberOfColor.N700 -> green700
        NumberOfColor.N800 -> green800
        NumberOfColor.N900 -> green900
    }
}