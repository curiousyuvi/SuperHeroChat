package com.curiousyuvi.superherochat.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.curiousyuvi.superherochat.R

val AksharFontFamily = FontFamily(
    Font(R.font.akshar_medium, FontWeight.Medium),
    Font(R.font.akshar_light, FontWeight.Light),
    Font(R.font.akshar_regular, FontWeight.Normal),
    Font(R.font.akshar_semibold, FontWeight.SemiBold),
    Font(R.font.akshar_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = AksharFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    body2 = TextStyle(
        fontFamily = AksharFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),

    h1 = TextStyle(
        fontFamily = AksharFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),

    h2 = TextStyle(
        fontFamily = AksharFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),

    button = TextStyle(
        fontFamily = AksharFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),

    /* Other default text styles to override
    caption = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp
)
*/
)


