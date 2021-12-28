package com.semicolon.design.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semicolon.design.util.CircularProgressBar

@Composable
fun BasicFillButton(
    text: String,
    defaultColor: Color,
    pressedColor: Color,
    disabledColor: Color,
    defaultTextColor: Color,
    disabledTextColor: Color,
    isEnabled: Boolean,
    modifier: Modifier,
    onClick: () -> Unit
) {
    BasicBigButton(
        text = text,
        defaultColor = defaultColor,
        pressedColor = pressedColor,
        disabledColor = disabledColor,
        defaultTextColor = defaultTextColor,
        disabledTextColor = disabledTextColor,
        isEnabled = isEnabled,
        modifier = modifier
            .fillMaxWidth(),
        onClick = onClick
    )
}

@Composable
fun BasicLargeButton(
    text: String,
    defaultColor: Color,
    pressedColor: Color,
    disabledColor: Color,
    defaultTextColor: Color,
    disabledTextColor: Color,
    outlineColor: Color? = null,
    isEnabled: Boolean,
    modifier: Modifier,
    onClick: () -> Unit
) {
    var fixedModifier = modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
        .clip(RoundedCornerShape(12.dp))
    if (outlineColor != null && isEnabled)
        fixedModifier = fixedModifier.border(1.dp, outlineColor, RoundedCornerShape(12.dp))
    BasicBigButton(
        text = text,
        defaultColor = defaultColor,
        pressedColor = pressedColor,
        disabledColor = disabledColor,
        defaultTextColor = defaultTextColor,
        disabledTextColor = disabledTextColor,
        isEnabled = isEnabled,
        modifier = fixedModifier,
        onClick = onClick
    )
}

@Composable
fun BasicMediumButton(
    text: String,
    defaultColor: Color,
    pressedColor: Color,
    disabledColor: Color,
    defaultTextColor: Color,
    disabledTextColor: Color,
    outlineColor: Color? = null,
    isEnabled: Boolean,
    modifier: Modifier,
    onClick: () -> Unit
) {
    var fixedModifier = modifier
        .width(160.dp)
        .clip(RoundedCornerShape(12.dp))
    if (outlineColor != null && isEnabled)
        fixedModifier = fixedModifier.border(1.dp, outlineColor, RoundedCornerShape(12.dp))
    BasicBigButton(
        text = text,
        defaultColor = defaultColor,
        pressedColor = pressedColor,
        disabledColor = disabledColor,
        defaultTextColor = defaultTextColor,
        disabledTextColor = disabledTextColor,
        isEnabled = isEnabled,
        modifier = fixedModifier,
        onClick = onClick
    )
}

@Composable
fun BasicBigButton(
    text: String,
    defaultColor: Color,
    pressedColor: Color,
    disabledColor: Color,
    defaultTextColor: Color,
    disabledTextColor: Color,
    isEnabled: Boolean,
    modifier: Modifier,
    onClick: () -> Unit
) {
    val textColor = if (isEnabled) defaultTextColor else disabledTextColor
    BasicButton(
        defaultColor = defaultColor,
        pressedColor = pressedColor,
        disabledColor = disabledColor,
        isEnabled = isEnabled,
        modifier = modifier
            .height(52.dp),
        onClick = onClick
    ) {
        Text(text = text, fontSize = 14.sp, color = textColor)
    }
}

@Composable
fun BasicSmallButton(
    text: String,
    defaultColor: Color,
    pressedColor: Color,
    disabledColor: Color,
    defaultContentColor: Color,
    disabledContentColor: Color,
    outlineColor: Color? = null,
    progressBarColor: Color = Color.Black,
    progressBarBackgroundColor: Color = Color.Transparent,
    isEnabled: Boolean,
    isLoading: Boolean,
    underlineEffect: Boolean = false,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    modifier: Modifier,
    onClick: () -> Unit
) {
    var fixedModifier = modifier
        .clip(RoundedCornerShape(4.dp))
    if (outlineColor != null && isEnabled)
        fixedModifier = fixedModifier.border(1.dp, outlineColor, RoundedCornerShape(4.dp))
    val contentColor = if (isEnabled) defaultContentColor else disabledContentColor
    Box(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        BasicButton(
            defaultColor = defaultColor,
            pressedColor = pressedColor,
            disabledColor = disabledColor,
            isEnabled = isEnabled,
            isLoading = isLoading,
            modifier = fixedModifier
                .height(36.dp)
                .wrapContentWidth(),
            onClick = onClick
        ) {
            Row(
                modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (!isLoading && icon != null && iconPosition == IconPosition.LEFT) {
                    Icon(
                        painter = icon,
                        tint = contentColor,
                        contentDescription = "",
                        modifier = Modifier
                            .width(16.dp)
                            .height(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                }
                Text(
                    text = text,
                    fontSize = 14.sp,
                    color = contentColor,
                    style = TextStyle(textDecoration = if (it && underlineEffect) TextDecoration.Underline else TextDecoration.None)
                )
                if (!isLoading && icon != null && iconPosition == IconPosition.RIGHT) {
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        painter = icon,
                        tint = contentColor,
                        contentDescription = "",
                        modifier = Modifier
                            .width(16.dp)
                            .height(16.dp)
                    )
                }
                if (isLoading) {
                    Row {
                        Spacer(modifier = Modifier.width(4.dp))
                        CircularProgressBar(
                            progressColor = progressBarColor,
                            backgroundColor = progressBarBackgroundColor,
                            modifier = Modifier
                                .height(14.dp)
                                .width(14.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BasicButton(
    defaultColor: Color,
    pressedColor: Color,
    disabledColor: Color,
    isEnabled: Boolean,
    isLoading: Boolean = false,
    modifier: Modifier,
    onClick: () -> Unit,
    contents: @Composable (isPressed: Boolean) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed = interactionSource.collectIsPressedAsState()
    val buttonColor =
        if (!isEnabled) disabledColor else if (isPressed.value) pressedColor else defaultColor
    Box(
        modifier = modifier
            .background(buttonColor)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = isEnabled && !isLoading
            ) { onClick() },
        contentAlignment = Alignment.Center
    ) {
        contents(isPressed.value)
    }
}
