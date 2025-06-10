package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ilya.compose_utils.R




val YourFontFamily = FontFamily(
    Font(R.font.robotomono_medium, FontWeight.Medium),
)


val AppTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = YourFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        letterSpacing = 0.15.sp
    ),
    displayMedium = TextStyle(
        fontFamily = YourFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = YourFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = YourFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    )
)