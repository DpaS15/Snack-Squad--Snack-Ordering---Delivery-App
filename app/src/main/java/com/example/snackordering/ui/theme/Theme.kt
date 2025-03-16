package com.example.snackordering.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define custom green color values
val Green200 = Color(0xFFA5D6A7) // Light green shade for dark theme primary
val Green500 = Color(0xFF4CAF50) // Medium green shade for light theme primary
val Green700 = Color(0xFF388E3C) // Darker green shade as a primary variant
val YellowGreen200 = Color(0xFFCDDC39) // Complementary secondary color

private val DarkColorPalette = darkColors(
    primary = Green200,
    primaryVariant = Green700,
    secondary = YellowGreen200
)

private val LightColorPalette = lightColors(
    primary = Green500,
    primaryVariant = Green700,
    secondary = YellowGreen200

    /* Other default colors to override
    background = Color(0xFFE8F5E9), // Light greenish background
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun SnackOrderingTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
