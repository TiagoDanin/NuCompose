package com.tiagodanin.example.jetpack.nucompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiagodanin.example.jetpack.nucompose.ui.theme.*
import com.tiagodanin.example.jetpack.nucompose.ui.widgets.*
import com.valentinilk.shimmer.ShimmerBounds
import com.valentinilk.shimmer.rememberShimmer
import com.valentinilk.shimmer.shimmer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NuComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun MenuList() {
    Column() {
        ButtonAccount()
        AccountBalance()
        ActionViewList()
        CreditCard()
        Info()
        Divider(color = NuColor03, thickness = 2.dp)
        CreditInfo01()
        Divider(color = NuColor03, thickness = 2.dp)
        CreditInfo02()
        Divider(color = NuColor03, thickness = 2.dp)
        ServiceInfo02()
        Divider(color = NuColor03, thickness = 2.dp)
        DiscoveryInfo()
    }
}

@Composable
fun Home() {
    val scrollState = rememberScrollState()

    LaunchedEffect(Unit) {
        scrollState.animateScrollTo(0)
    }

    Column(
        modifier = Modifier
            .background(Color(0xFF223322))
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        HeaderUser()
        MenuList()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NuComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Home()
        }
    }
}