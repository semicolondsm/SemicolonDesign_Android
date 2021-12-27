package com.semicolon.semicolondesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.semicolon.design.button.ColoredFillButton
import com.semicolon.design.button.DefaultFillButton

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                ColoredFillButton("버튼", isEnabled = false) {
                    makeToast("컬러 버튼 눌림")
                }
                DefaultFillButton("버튼", isEnabled = false) {
                    makeToast("기본 버튼 눌림")
                }
            }
        }
    }

    fun makeToast(message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}