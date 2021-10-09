package com.tiagodanin.example.jetpack.nucompose.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tiagodanin.example.jetpack.nucompose.ui.theme.white

@Composable
fun IconsTopMenu() {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            Icons.Filled.Visibility,
            "",
            tint = white,
            modifier = Modifier
                .size(46.dp)
                .padding(horizontal = 10.dp)
        )
        Icon(
            Icons.Filled.HelpOutline,
            "",
            tint = white,
            modifier = Modifier
                .size(46.dp)
                .padding(horizontal = 10.dp)
        )
        Icon(
            Icons.Filled.MailOutline,
            "",
            tint = white,
            modifier = Modifier
                .size(46.dp)
                .padding(horizontal = 10.dp)
        )
    }
}