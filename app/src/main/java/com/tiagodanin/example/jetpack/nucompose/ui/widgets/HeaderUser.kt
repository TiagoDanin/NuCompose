package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiagodanin.example.jetpack.nucompose.ui.theme.white

@Composable
fun HeaderUser() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.primary)
            .fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .paddingFromBaseline(top = 34.dp)
                .padding(horizontal = 15.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                UserAvatar()
                IconsTopMenu()
            }
        }
        Column() {
            Text(
                text = "Olá, Tiago Danin",
                modifier = Modifier
                    .padding(22.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    color = white
                )
            )
        }
    }
}
