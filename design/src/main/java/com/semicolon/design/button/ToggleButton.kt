package com.semicolon.design.button

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.semicolon.design.color.primary.gray.gray100
import com.semicolon.design.color.primary.gray.gray700
import com.semicolon.design.color.primary.white.white

@Composable
fun ToggleButton(
    modifier: Modifier = Modifier,
    items: Array<String>,
    position: Int = 0,
    onSelectedItemChange: (position: Int) -> Unit = {}
) {
    val toggleItems = if (items.size > 4) items.sliceArray(0..3) else items
    BasicToggleButton(
        modifier = modifier,
        items = toggleItems,
        position = position,
        onSelectedItemChange = onSelectedItemChange
    )
}

@Composable
fun BasicToggleButton(
    modifier: Modifier = Modifier,
    items: Array<String>,
    position: Int = 0,
    onSelectedItemChange: (position: Int) -> Unit
) {
    var eachContentWidth by remember { mutableStateOf(0) }
    val eachContentDpWidth = LocalDensity.current.run { eachContentWidth.toDp() }
    var positionState by remember { mutableStateOf(position) }
    val emptySpaceWidth: Dp by animateDpAsState(((eachContentDpWidth.value * positionState) + (8 * positionState)).dp)
    Box(
        modifier = modifier
            .padding(horizontal = 24.dp)
            .height(44.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(22.dp))
            .background(gray100)
            .padding(4.dp)
            .onSizeChanged {
                if(items.isNotEmpty())
                    eachContentWidth = (it.width - (8 * items.size)) / items.size
            }
    ) {
        Row {
            Spacer(modifier = Modifier.width(emptySpaceWidth))
            Spacer(
                modifier = Modifier
                    .width(eachContentDpWidth)
                    .height(36.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(white)
            )
        }
        Row {
            for (i in items.indices) {
                ToggleItem(
                    modifier = Modifier
                        .height(36.dp)
                        .width(eachContentDpWidth),
                    text = items[i],
                    onClick = {
                        positionState = i
                        onSelectedItemChange(i)
                    }
                )
                if (i != items.lastIndex) Spacer(modifier = Modifier.size(8.dp))
                if (i == 3) break
            }
        }
    }
}

@Composable
private fun ToggleItem(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .clickable(
                interactionSource = MutableInteractionSource(),
                indication = null
            ) { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, fontSize = 14.sp, color = gray700)
    }
}