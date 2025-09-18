package com.ivan.foodapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Colores para la app
val RedPrimary = Color(0xFFE74C3C)
val RedSecondary = Color(0xFFC0392B)
val Orange = Color(0xFFF39C12)
val Background = Color(0xFFF8F9FA)
val Surface = Color(0xFFFFFFFF)
val OnBackground = Color(0xFF2C3E50)

private val LightColorScheme = lightColorScheme(
    primary = RedPrimary,
    secondary = Orange,
    tertiary = RedSecondary,
    background = Background,
    surface = Surface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = OnBackground,
    onSurface = OnBackground,
    errorContainer = RedPrimary,
    onErrorContainer = Color.White
)

private val DarkColorScheme = darkColorScheme(
    primary = RedPrimary,
    secondary = Orange,
    tertiary = RedSecondary,
    background = Color(0xFF1A1A1A),
    surface = Color(0xFF2D2D2D),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    errorContainer = RedPrimary,
    onErrorContainer = Color.White
)

@Composable
fun FoodAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography(),
        content = content
    )
}