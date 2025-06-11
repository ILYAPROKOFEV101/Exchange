
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


@Composable
fun NavigationScreen(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationTree.Currencies.route
    ) {
        composable(NavigationTree.Currencies.route) {
            CurrencyListContent()
        }
        composable(NavigationTree.Exchange.route) {
            // Добавьте экран обмена валют
        }
        composable(NavigationTree.Transactions.route) {
            // Добавьте экран транзакций
        }
    }
}

