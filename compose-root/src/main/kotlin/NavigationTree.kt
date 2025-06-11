// Обновленный sealed class с новыми маршрутами
sealed class NavigationTree(val route: String) {
    object Currencies : NavigationTree("CurrenciesScreen")
    object Exchange : NavigationTree("ExchangeScreen")
    object Transactions : NavigationTree("TransactionsScreen")
}