package com.fkaanoz.sardonic.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fkaanoz.sardonic.R

val LexendDeca = FontFamily(
    Font(R.font.lexenddeca_black),
    Font(R.font.lexenddeca_bold, FontWeight.Bold),
    Font(R.font.lexenddeca_light, FontWeight.Light),
    Font(R.font.lexenddeca_thin, FontWeight.Thin),
)






// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = LexendDeca,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    )

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)