package com.semicolon.semicolondesign.colors.primary.grey

import androidx.compose.ui.graphics.Color
import com.semicolon.semicolondesign.colors.NumberOfColor


fun gray(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> grey50

        NumberOfColor.N100 -> grey100

        NumberOfColor.N200 -> grey200

        NumberOfColor.N300 -> grey300

        NumberOfColor.N400 -> grey400

        NumberOfColor.N500 -> grey500

        NumberOfColor.N600 -> grey600

        NumberOfColor.N700 -> grey700

        NumberOfColor.N800 -> grey800

        NumberOfColor.N900 -> grey900
    }
}