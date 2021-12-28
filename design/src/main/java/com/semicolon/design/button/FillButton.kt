package com.semicolon.design.button


import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.semicolon.design.color.primary.gray.gray100
import com.semicolon.design.color.primary.gray.gray300
import com.semicolon.design.color.primary.gray.gray50
import com.semicolon.design.color.primary.gray.gray700
import com.semicolon.design.color.primary.purple.purple400
import com.semicolon.design.color.primary.purple.purple50
import com.semicolon.design.color.primary.purple.purple500
import com.semicolon.design.color.primary.white.white

@Composable
fun DefaultFillButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicFillButton(
        text = text,
        defaultColor = gray100,
        pressedColor = gray300,
        disabledColor = gray50,
        defaultTextColor = gray700,
        disabledTextColor = gray300,
        isEnabled = isEnabled,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun ColoredFillButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicFillButton(
        text = text,
        defaultColor = purple400,
        pressedColor = purple500,
        disabledColor = purple50,
        defaultTextColor = white,
        disabledTextColor = white,
        isEnabled = isEnabled,
        modifier = modifier,
        onClick = onClick
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultFillButtonPreview() {
    DefaultFillButton(text = "버튼") {}
}

@Preview(showBackground = true)
@Composable
private fun ColoredFillButtonPreview() {
    ColoredFillButton(text = "버튼") {}
}