/*
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf


val LocalColors = staticCompositionLocalOf<ExchangeColors> {
    error("Colors not provided")
}
// 4. Модифицируем AppTheme для поддержки тем
@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkPalette else lightPalette

    CompositionLocalProvider(
        LocalColors provides colors,
        content = content
    )
}

// 5. Объект для доступа к цветам
object Theme {
    val colors: ExchangeColors
        @Composable
        get() = LocalColors.current
}

*/
