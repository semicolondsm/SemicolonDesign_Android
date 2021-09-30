package com.semicolon.semicolondesign.colors.primary.gray

import androidx.compose.ui.graphics.Color
import com.semicolon.semicolondesign.colors.NumberOfColor


fun gray(number: NumberOfColor): Color {
    return when (number) {
        NumberOfColor.N50 -> gray50

        NumberOfColor.N100 -> gray100

        NumberOfColor.N200 -> gray200

        NumberOfColor.N300 -> gray300

        NumberOfColor.N400 -> gray400

        NumberOfColor.N500 -> gray500

        NumberOfColor.N600 -> gray600

        NumberOfColor.N700 -> gray700

        NumberOfColor.N800 -> gray800

        NumberOfColor.N900 -> gray900
    }
}