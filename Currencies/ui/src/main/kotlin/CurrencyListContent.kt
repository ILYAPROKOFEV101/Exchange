import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ilya.compose_utils.R
import androidx.compose.material3.Text

import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.items

@Composable
fun CurrencyListContent(
    viewModel: CurrencyViewModel = viewModel()
) {
    val selectedCurrency by viewModel.selectedCurrency.collectAsState()
    val rates by viewModel.rates.collectAsState()

    LazyColumn {
        items(rates) { rate ->
            CurrencyItem(
                flagResId = getFlagResource(rate.currency),
                currencyCode = rate.currency,
                currencyName = getCurrencyName(rate.currency),
                balance = formatBalance(rate.value),
                exchangeRate = formatExchangeRate(rate.value, rate.currency == selectedCurrency),
                onClick = { viewModel.selectCurrency(rate.currency) }
            )
        }
    }
}

@Composable
fun CurrencyItem(
    flagResId: Int,
    currencyCode: String,
    currencyName: String,
    balance: String,
    exchangeRate: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White)
            .border(width = 1.dp, color = Color.LightGray)
            .clickable(onClick = onClick),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Флаг
        Image(
            painter = painterResource(id = flagResId),
            contentDescription = null,
            modifier = Modifier.run {
                size(40.dp)
                    .padding(8.dp)
            }
        )

        // Информация о валюте
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = currencyCode,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = currencyName,
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "Balance: $balance",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }

        // Курс валюты
        Text(
            text = exchangeRate,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(end = 16.dp)
        )
    }
}

// Вспомогательные функции
private fun getFlagResource(currencyCode: String): Int {
    return when (currencyCode) {
        "USD" -> R.drawable.usd_flag
        "EUR" -> R.drawable.eur_flag
        "GBP" -> R.drawable.gbp_flag
        "RUB" -> R.drawable.rub_flag
        else -> R.drawable.default_flag
    }
}

private fun getCurrencyName(currencyCode: String): String {
    return when (currencyCode) {
        "USD" -> "US Dollar"
        "EUR" -> "Euro"
        "GBP" -> "Great Britain Pound"
        "RUB" -> "Russia Rouble"
        else -> "Unknown Currency"
    }
}

private fun formatBalance(value: Double): String {
    return "%.2f".format(value)
}

private fun formatExchangeRate(value: Double, isSelected: Boolean): String {
    return if (isSelected) "1" else "%.5f".format(value)
}