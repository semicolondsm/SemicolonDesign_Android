package com.semicolon.design.color.primary.dark

import androidx.compose.ui.graphics.Color
import com.semicolon.design.color.NumberOfColor


fun dark(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> dark50

        NumberOfColor.N100 -> dark100

        NumberOfColor.N200 -> dark200

        NumberOfColor.N300 -> dark300

        NumberOfColor.N400 -> dark400

        NumberOfColor.N500 -> dark500

        NumberOfColor.N600 -> dark600

        NumberOfColor.N700 -> dark700

        NumberOfColor.N800 -> dark800

        NumberOfColor.N900 -> dark900
    }
}