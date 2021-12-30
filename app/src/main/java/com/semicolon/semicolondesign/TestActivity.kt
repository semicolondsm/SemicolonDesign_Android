package com.semicolon.semicolondesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.semicolon.design.button.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Dropdown(
                    items = arrayOf("선택1", "선택2"),
                    defaultItemIndex = 1
                )
                Dropdown(
                    items = arrayOf("선택1", "선택1234567890"),
                    placeholder = "드롭다운",
                    menuDirection = MenuDirection.RIGHT
                )

                DefaultFillButton(text = "버튼") { makeToast("기본 꽉찬 버튼 눌림") }
                DefaultFillButton(text = "버튼", isEnabled = false) {}
                ColoredFillButton(text = "버튼") { makeToast("컬러 꽉찬 버튼 눌림") }
                ColoredFillButton(text = "버튼", isEnabled = false) {}

                DefaultLargeButton(text = "버튼") { makeToast("기본 큰 버튼 눌림") }
                DefaultLargeButton(text = "버튼", isEnabled = false) {}
                ColoredLargeButton(text = "버튼") { makeToast("색깔 큰 버튼 눌림") }
                ColoredLargeButton(text = "버튼", isEnabled = false) {}
                PaleColoredLargeButton(text = "버튼") { makeToast("연한 큰 버튼 눌림") }
                PaleColoredLargeButton(text = "버튼", isEnabled = false) {}
                OutlinedLargeButton(text = "버튼") { makeToast("테두리 큰 버튼 눌림") }
                OutlinedLargeButton(text = "버튼", isEnabled = false) {}

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    DefaultMediumButton(text = "버튼") { makeToast("기본 중간 버튼 눌림") }
                    DefaultMediumButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ColoredMediumButton(text = "버튼") { makeToast("색깔 중간 버튼 눌림") }
                    ColoredMediumButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    PaleColoredMediumButton(text = "버튼") { makeToast("연한 중간 버튼 눌림") }
                    PaleColoredMediumButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedMediumButton(text = "버튼") { makeToast("테두리 중간 버튼 눌림") }
                    OutlinedMediumButton(text = "버튼", isEnabled = false) {}
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ClearDefaultSmallButton(text = "버튼") { makeToast("배경x 기본 작은 버튼 눌림") }
                    ClearDefaultSmallButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ClearDefaultSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.LEFT
                    ) {
                        makeToast("왼쪽 아이콘 배경x 기본 작은 버튼 눌림")
                    }
                    ClearDefaultSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.RIGHT
                    ) {
                        makeToast("오른쪽 아이콘 배경x 기본 작은 버튼 눌림")
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ClearColoredSmallButton(text = "버튼") { makeToast("배경x 색깔 작은 버튼 눌림") }
                    ClearColoredSmallButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ClearColoredSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.LEFT
                    ) {
                        makeToast("왼쪽 아이콘 배경x 색깔 작은 버튼 눌림")
                    }
                    ClearColoredSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.RIGHT
                    ) {
                        makeToast("오른쪽 아이콘 배경x 색깔 작은 버튼 눌림")
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    LinkSmallButton(text = "버튼") { makeToast("링크 작은 버튼 눌림") }
                    LinkSmallButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    LinkSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_north_east),
                        iconPosition = IconPosition.LEFT
                    ) {
                        makeToast("왼쪽 아이콘 링크 작은 버튼 눌림")
                    }
                    LinkSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_north_east),
                        iconPosition = IconPosition.RIGHT
                    ) {
                        makeToast("오른쪽 아이콘 링크 작은 버튼 눌림")
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    DefaultSmallButton(text = "버튼") { makeToast("기본 작은 버튼 눌림") }
                    DefaultSmallButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    DefaultSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.LEFT
                    ) {
                        makeToast("왼쪽 아이콘 기본 작은 버튼 눌림")
                    }
                    DefaultSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.RIGHT
                    ) {
                        makeToast("오른쪽 아이콘 기본 작은 버튼 눌림")
                    }
                    DefaultSmallButton(
                        text = "버튼",
                        isLoading = true
                    ) {
                        makeToast("로딩중 기본 작은 버튼 눌림")
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ColoredSmallButton(text = "버튼") { makeToast("색깔 작은 버튼 눌림") }
                    ColoredSmallButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ColoredSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.LEFT
                    ) {
                        makeToast("왼쪽 아이콘 색깔 작은 버튼 눌림")
                    }
                    ColoredSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.RIGHT
                    ) {
                        makeToast("오른쪽 아이콘 색깔 작은 버튼 눌림")
                    }
                    ColoredSmallButton(
                        text = "버튼",
                        isLoading = true
                    ) {
                        makeToast("로딩중 색깔 작은 버튼 눌림")
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    PaleColoredSmallButton(text = "버튼") { makeToast("연한 색깔 작은 버튼 눌림") }
                    PaleColoredSmallButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    PaleColoredSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.LEFT
                    ) {
                        makeToast("왼쪽 아이콘 연한 색깔 작은 버튼 눌림")
                    }
                    PaleColoredSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.RIGHT
                    ) {
                        makeToast("오른쪽 아이콘 연한 색깔 작은 버튼 눌림")
                    }
                    PaleColoredSmallButton(
                        text = "버튼",
                        isLoading = true
                    ) {
                        makeToast("로딩중 연한 색깔 작은 버튼 눌림")
                    }
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedSmallButton(text = "버튼") { makeToast("테두리 작은 버튼 눌림") }
                    OutlinedSmallButton(text = "버튼", isEnabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.LEFT
                    ) {
                        makeToast("왼쪽 아이콘 테두리 작은 버튼 눌림")
                    }
                    OutlinedSmallButton(
                        text = "버튼",
                        icon = painterResource(id = R.drawable.ic_favorite),
                        iconPosition = IconPosition.RIGHT
                    ) {
                        makeToast("오른쪽 아이콘 테두리 작은 버튼 눌림")
                    }
                    OutlinedSmallButton(
                        text = "버튼",
                        isLoading = true
                    ) {
                        makeToast("로딩중 테두리 작은 버튼 눌림")
                    }
                }

                ToggleSwitch()
                ToggleButton(items = arrayOf("버튼", "버튼"))
                ToggleButton(items = arrayOf("버튼", "버튼", "버튼"))
                ToggleButton(items = arrayOf("버튼", "버튼", "버튼", "버튼"))
                ToggleButton(items = arrayOf())
            }
        }
    }

    private fun makeToast(message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}