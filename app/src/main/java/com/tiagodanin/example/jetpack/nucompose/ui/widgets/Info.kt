package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiagodanin.example.jetpack.nucompose.ui.theme.NuColor02
import com.tiagodanin.example.jetpack.nucompose.ui.theme.NuColor03

@Composable
fun Info() {
    val scrollState = rememberScrollState()
    LaunchedEffect(Unit) {
        scrollState.animateScrollTo(0)
    }

    Row(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
            .padding(vertical = 10.dp)
            .horizontalScroll(scrollState)
            .padding(bottom = 10.dp)
    ) {
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(NuColor03)
                .width(240.dp)
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                buildAnnotatedString {
                    append("Você tem ")
                    withStyle(style = SpanStyle(color = NuColor02)) {
                        append("R\$ 16.700,00")
                    }
                    append(" disponível para empréstimo")
                },
                modifier = Modifier
                    .padding(
                        vertical = 10.dp,
                        horizontal = 10.dp,
                    )
                    .fillMaxSize(),
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    letterSpacing = -0.5.sp,
                )
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(NuColor03)
                .width(240.dp)
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                buildAnnotatedString {
                    append("Salve seus amigos da burocracia.")
                    withStyle(style = SpanStyle(color = NuColor02)) {
                        append("Faça um convite para o NuBank")
                    }
                },
                modifier = Modifier
                    .padding(
                        vertical = 10.dp,
                        horizontal = 10.dp,
                    )
                    .fillMaxSize(),
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    letterSpacing = -0.5.sp,
                )
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
    }
}