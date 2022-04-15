package com.curiousyuvi.superherochat.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Yellow500,
    primaryVariant = Yellow700,
    secondary = Green500,
    background = Grey700,
    surface = Dark,
    onPrimary = Light,
    onSecondary = Light,
    onBackground = Light,
    onSurface = Light,
)

private val LightColorPalette = lightColors(
    primary = Yellow500,
    primaryVariant = Yellow700,
    secondary = Green500,
    background = Grey200,
    surface = Light,
    onPrimary = Light,
    onSecondary = Light,
    onBackground = Dark,
    onSurface = Dark

)

@Composable
fun SuperHeroChatTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    if(darkTheme){
        rememberSystemUiController().setSystemBarsColor(color = Yellow700)
    }else{
        rememberSystemUiController().setSystemBarsColor(color = Yellow200)

    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}