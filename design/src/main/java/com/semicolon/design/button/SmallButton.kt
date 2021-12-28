package com.semicolon.design.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.semicolon.design.color.primary.gray.*
import com.semicolon.design.color.primary.purple.purple100
import com.semicolon.design.color.primary.purple.purple400
import com.semicolon.design.color.primary.purple.purple50
import com.semicolon.design.color.primary.purple.purple500
import com.semicolon.design.color.primary.white.white
import com.semicolon.design.color.system.blue.blue400

@Composable
fun ClearDefaultSmallButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicSmallButton(
        text = text,
        defaultColor = Color.Transparent,
        pressedColor = gray50,
        disabledColor = Color.Transparent,
        defaultContentColor = gray700,
        disabledContentColor = gray300,
        isEnabled = isEnabled,
        isLoading = false,
        icon = icon,
        iconPosition = iconPosition,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun ClearColoredSmallButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicSmallButton(
        text = text,
        defaultColor = Color.Transparent,
        pressedColor = purple50,
        disabledColor = Color.Transparent,
        defaultContentColor = purple400,
        disabledContentColor = gray300,
        isEnabled = isEnabled,
        isLoading = false,
        icon = icon,
        iconPosition = iconPosition,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun LinkSmallButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicSmallButton(
        text = text,
        defaultColor = Color.Transparent,
        pressedColor = Color.Transparent,
        disabledColor = Color.Transparent,
        defaultContentColor = blue400,
        disabledContentColor = gray300,
        isEnabled = isEnabled,
        isLoading = false,
        underlineEffect = true,
        icon = icon,
        iconPosition = iconPosition,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun DefaultSmallButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    onClick: () -> Unit
) {
    BasicSmallButton(
        text = text,
        defaultColor = gray100,
        pressedColor = gray300,
        disabledColor = gray50,
        defaultContentColor = gray700,
        disabledContentColor = gray300,
        progressBarColor = gray300,
        progressBarBackgroundColor = gray500,
        isEnabled = isEnabled,
        isLoading = isLoading,
        icon = icon,
        iconPosition = iconPosition,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun ColoredSmallButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    onClick: () -> Unit
) {
    BasicSmallButton(
        text = text,
        defaultColor = purple400,
        pressedColor = purple500,
        disabledColor = purple50,
        defaultContentColor = white,
        disabledContentColor = white,
        progressBarColor = white,
        progressBarBackgroundColor = purple500,
        isEnabled = isEnabled,
        isLoading = isLoading,
        icon = icon,
        iconPosition = iconPosition,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun PaleColoredSmallButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    onClick: () -> Unit
) {
    BasicSmallButton(
        text = text,
        defaultColor = gray50,
        pressedColor = purple100,
        disabledColor = gray50,
        defaultContentColor = purple400,
        disabledContentColor = gray300,
        progressBarColor = purple400,
        progressBarBackgroundColor = purple100,
        isEnabled = isEnabled,
        isLoading = isLoading,
        icon = icon,
        iconPosition = iconPosition,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
fun OutlinedSmallButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    isEnabled: Boolean = true,
    isLoading: Boolean = false,
    onClick: () -> Unit
) {
    BasicSmallButton(
        text = text,
        defaultColor = white,
        pressedColor = gray100,
        disabledColor = gray50,
        defaultContentColor = gray700,
        disabledContentColor = gray300,
        outlineColor = gray100,
        progressBarColor = gray500,
        progressBarBackgroundColor = gray300,
        isEnabled = isEnabled,
        isLoading = isLoading,
        icon = icon,
        iconPosition = iconPosition,
        modifier = modifier,
        onClick = onClick
    )
}