import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.Rgb

// 1. Обновленная data class с цветом ошибки
data class ExchangeColors(
    val primaryBackground: Color,
    val textColor: Color,
    val selectedIconColor: Color,
    val unselectedIconColor: Color,
    val primaryAction: Color,
    val errorColor: Color,
    val googleColors : Color,
    val linkColor : Color
)

// 2. Обновленные палитры
internal val darkPalette = ExchangeColors(
    primaryBackground = Color(0xFF191C20),
    textColor = Color.White,
    selectedIconColor = Color.White,
    unselectedIconColor = Color.Gray,
    primaryAction = Color(0xFFF4D144),
    errorColor = Color(0xFFff4444),
    googleColors = Color(0xFF131314),
    linkColor = Color(0xFFFFFFFF)
)

internal val lightPalette = ExchangeColors(
    primaryBackground = Color(0xFFFFFFFF),
    textColor = Color.Black,
    selectedIconColor = Color.Black,
    unselectedIconColor = Color.DarkGray,
    primaryAction = Color(0xFFF4D144),
    errorColor = Color(0xFFB00020) ,
    googleColors = Color(240, 240, 240),
            linkColor = Color(0xFF2196F3)

)