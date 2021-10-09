package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.tiagodanin.example.jetpack.nucompose.R

@Composable
fun ActionViewList() {
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
    ) {
        Spacer(modifier = Modifier.width(14.dp))
        ActionViewButton(
            text = "Área Pix",
            ImageVector.vectorResource(id = R.drawable.ic_qrcode)
        )
        ActionViewButton(
            text = "Pagar",
            ImageVector.vectorResource(id = R.drawable.ic_barcode)
        )
        ActionViewButton(
            text = "Guardar dinheiro",
            ImageVector.vectorResource(id = R.drawable.ic_piggy_bank_outline)
        )
        ActionViewButton(
            text = "Recarga de celular",
            ImageVector.vectorResource(id = R.drawable.ic_cellphone)
        )
        ActionViewButton(
            text = "Transferir",
            ImageVector.vectorResource(id = R.drawable.ic_cash)
        )
        ActionViewButton(
            text = "Depositar",
            ImageVector.vectorResource(id = R.drawable.ic_cash)
        )
        ActionViewButton(
            text = "Pegar emprestado",
            ImageVector.vectorResource(id = R.drawable.ic_hand_heart)
        )
        ActionViewButton(
            text = "Doações",
            ImageVector.vectorResource(id = R.drawable.ic_heart_outline)
        )
        ActionViewButton(
            text = "Pedir Extrato",
            ImageVector.vectorResource(id = R.drawable.ic_file_outline)
        )
        ActionViewButton(
            text = "Transferir Internac.",
            ImageVector.vectorResource(id = R.drawable.ic_web)
        )
        ActionViewButton(
            text = "Encontrar atalhos",
            ImageVector.vectorResource(id = R.drawable.ic_help_circle_outline)
        )
        Spacer(modifier = Modifier.width(14.dp))
    }
}