package com.semicolon.design.color.primary.purple

import androidx.compose.ui.graphics.Color
import com.semicolon.design.color.NumberOfColor


fun purple(numberOfColor: NumberOfColor): Color {
    return when (numberOfColor) {
        NumberOfColor.N50 -> purple50

        NumberOfColor.N100 -> purple100

        NumberOfColor.N200 -> purple200

        NumberOfColor.N300 -> purple300

        NumberOfColor.N400 -> purple400

        NumberOfColor.N500 -> purple500

        NumberOfColor.N600 -> purple600

        NumberOfColor.N700 -> purple700

        NumberOfColor.N800 -> purple800

        NumberOfColor.N900 -> purple900
    }
}