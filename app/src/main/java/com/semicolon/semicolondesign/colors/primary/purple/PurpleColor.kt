package com.semicolon.semicolondesign.colors.primary.purple

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.semicolon.semicolondesign.colors.Number
import com.semicolon.semicolondesign.colors.primary.black.black


fun purple(number: Number): Color {
    return when (number) {
        Number.N50 -> purple50
        Number.N100 -> purple100
        Number.N200 -> purple200
        Number.N300 -> purple300
        Number.N400 -> purple400
        Number.N500 -> purple500
        Number.N600 -> purple600
        Number.N700 -> purple700
        Number.N800 -> purple800
        Number.N900 -> purple900
    }
}