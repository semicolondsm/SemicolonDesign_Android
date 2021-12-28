package com.semicolon.design.button


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.semicolon.design.color.primary.gray.gray100
import com.semicolon.design.color.primary.gray.gray300
import com.semicolon.design.color.primary.gray.gray50
import com.semicolon.design.color.primary.gray.gray700
import com.semicolon.design.color.primary.purple.*
import com.semicolon.design.color.primary.white.white

@Composable
fun DefaultLargeButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicLargeButton(
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
fun ColoredLargeButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicLargeButton(
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

@Composable
fun PaleColoredLargeButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicLargeButton(
        text = text,
        defaultColor = purple50,
        pressedColor = purple100,
        disabledColor = gray50,
        defaultTextColor = purple300,
        disabledTextColor = gray300,
        isEnabled = isEnabled,
        modifier = modifier,
        onClick = onClick
    )
}


@Composable
fun OutlinedLargeButton(
    modifier: Modifier = Modifier,
    text: String,
    isEnabled: Boolean = true,
    onClick: () -> Unit
) {
    BasicLargeButton(
        text = text,
        defaultColor = white,
        pressedColor = gray100,
        disabledColor = gray50,
        defaultTextColor = gray700,
        disabledTextColor = gray300,
        outlineColor = gray100,
        isEnabled = isEnabled,
        modifier = modifier,
        onClick = onClick
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultLargeButtonPreview() {
    DefaultLargeButton(text = "버튼") {}
}

@Preview(showBackground = true)
@Composable
private fun ColoredLargeButtonPreview() {
    ColoredLargeButton(text = "버튼") {}
}

@Preview(showBackground = true)
@Composable
private fun PaleColoredLargeButtonPreview() {
    PaleColoredLargeButton(text = "버튼") {}
}

@Preview(showBackground = true)
@Composable
private fun OutlinedLargeButtonPreview() {
    OutlinedLargeButton(text = "버튼") {}
}
