// Обновленный sealed class с новыми маршрутами
sealed class NavigationTree(val route: String) {



    // Вложенные маршруты для аутентификации
    object Screen {
        const val Currencies = "CurrenciesScreen"
        const val Exchange = "ExchangeScreen"
        const val Transactions = "TransactionsScreen"
    }

}