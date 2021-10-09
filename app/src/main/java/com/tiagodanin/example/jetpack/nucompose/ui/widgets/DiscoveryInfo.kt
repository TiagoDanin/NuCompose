package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DiscoveryInfo() {
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
        DiscoveryCard(
            title = "Indique seus amigos",
            description = "Mosque aos seus amigos como é fácil ter uma vida sem burocracia",
            buttonTitle = "Indicar amigos",
        )
        Spacer(modifier = Modifier.width(16.dp))
        DiscoveryCard(
            title = "Whastapp",
            description = "Pagamentos seguros, rápido e sem tarifa. A experiência NuBank se, nem sair da conversa",
            buttonTitle = "Quero conhecer",
        )
        Spacer(modifier = Modifier.width(16.dp))
        DiscoveryCard(
            title = "Débido Automático",
            description = "Suas contas no débito automático e você com tempo para curtir a vida, sem pagar juros por atraso",
            buttonTitle = "Saiba mais",
        )
        Spacer(modifier = Modifier.width(16.dp))
    }
}