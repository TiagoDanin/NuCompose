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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiagodanin.example.jetpack.nucompose.ui.theme.NuBackgroundColor01
import com.tiagodanin.example.jetpack.nucompose.ui.theme.NuColor05
import com.tiagodanin.example.jetpack.nucompose.R

@Composable
fun CreditInfo01() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxWidth()
            .padding(horizontal = 6.dp)
            .paddingFromBaseline(
                top = 65.dp,
                bottom = 24.dp,
            )
    ) {
        Icon(
            ImageVector.vectorResource(id = R.drawable.ic_credit_card_outline),
            "Cartão de crédito",
            modifier = Modifier
                .size(34.dp)
                .padding(start = 8.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Cartão de crédito",
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
        Text(
            text = "Fatura atual",
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(),
            style = TextStyle(
                color = NuColor05,
                fontSize = 16.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = -0.5.sp,
            )
        )
        Text(
            text = "R$ 202,73",
            modifier = Modifier
                .padding(top = 2.dp)
                .fillMaxWidth(),
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                letterSpacing = -0.5.sp,
            )
        )
        Text(
            text = "Limite disponível de R$ 3797,27",
            modifier = Modifier
                .fillMaxWidth(),
            style = TextStyle(
                color = NuColor05,
                fontSize = 14.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = -0.5.sp,
            )
        )
    }
}