package com.semicolon.design.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    FillButton(
        text = text,
        defaultColor = gray100,
        pressedColor = gray300,
        disabledColor = gray50,
        defaultTextColor = gray700,
        disabledTextColor = gray300,
        isEnabled = isEnabled,
        onClick = onClick
    )
}

@Composable
fun ColoredFillButton(
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    FillButton(
        text = text,
        defaultColor = purple400,
        pressedColor = purple500,
        disabledColor = purple50,
        defaultTextColor = white,
        disabledTextColor = white,
        isEnabled = isEnabled,
        onClick = onClick
    )
}

@Composable
fun FillButton(
    text: String,
    defaultColor: Color,
    pressedColor: Color,
    disabledColor: Color,
    defaultTextColor: Color,
    disabledTextColor: Color,
    isEnabled: Boolean,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed = interactionSource.collectIsPressedAsState()
    val buttonColor =
        if (!isEnabled) disabledColor else if (isPressed.value) pressedColor else defaultColor
    val textColor = if (isEnabled) defaultTextColor else disabledTextColor

    Box(
        modifier = Modifier
            .height(52.dp)
            .fillMaxWidth()
            .background(buttonColor)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = isEnabled
            ) { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, fontSize = 14.sp, color = textColor)
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultFillButtonPreview() {
    DefaultFillButton("버튼") {}
}

@Preview(showBackground = true)
@Composable
private fun ColoredFillButtonPreview() {
    ColoredFillButton("버튼") {}
}