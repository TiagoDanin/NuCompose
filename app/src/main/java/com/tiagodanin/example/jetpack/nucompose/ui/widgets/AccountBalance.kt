package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AccountBalance() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 20.dp)
        ,
    ) {
        Text(
            text = "R$ 224,14",
            modifier = Modifier
                .paddingFromBaseline(bottom = 28.dp),
            style = TextStyle(
                fontSize = 22.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
            )
        )
    }
}