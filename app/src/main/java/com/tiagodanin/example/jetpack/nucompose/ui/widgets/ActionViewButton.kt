package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiagodanin.example.jetpack.nucompose.ui.theme.NuColor03

@Composable
fun ActionViewButton(text: String, icon: ImageVector) {
    Column(
        modifier = Modifier
            .padding(bottom = 24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
            modifier = Modifier
                .padding(start = 10.dp)
                .padding(bottom = 8.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(NuColor03)
            ) {
                Icon(
                    icon,
                    text,
                    modifier = Modifier
                        .size(35.dp)
                        .background(NuColor03)
                )
            }
        }
        Text(
            text = text,
            modifier = Modifier
                .width(80.dp)
                .wrapContentSize(Alignment.Center),
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                letterSpacing = -1.5.sp,
            )
        )
    }
}