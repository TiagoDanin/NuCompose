package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiagodanin.example.jetpack.nucompose.ui.theme.NuBackgroundColor01

@Composable
fun ButtonAccount() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxWidth()
            .padding(horizontal = 6.dp)
            .paddingFromBaseline(
                top = 45.dp,
                bottom = 20.dp,
            )
    ) {
        Text(
            text = "Conta",
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
            )
        )
        Icon(
            Icons.Filled.ChevronRight,
            "",
            tint = NuBackgroundColor01,
            modifier = Modifier
                .size(32.dp)
        )
    }
}