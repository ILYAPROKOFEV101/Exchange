import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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

@Composable
fun CurrencyListContent() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            CurrencyItem(
                flagResId = R.drawable.images,
                currencyCode = "USD",
                currencyName = "US Dollar",
                balance = "$143,44",
                exchangeRate = "$1"
            )
        }
        item {
            CurrencyItem(
                flagResId = R.drawable.images,
                currencyCode = "EUR",
                currencyName = "Euro",
                balance = "€512,29",
                exchangeRate = "€0,88033"
            )
        }
        item {
            CurrencyItem(
                flagResId = R.drawable.images,
                currencyCode = "GBP",
                currencyName = "Great Britain Pound",
                balance = "£512,29",
                exchangeRate = "£0,74279"
            )
        }
        item {
            CurrencyItem(
                flagResId = R.drawable.images,
                currencyCode = "RUB",
                currencyName = "Russia Rouble",
                balance = "₽43.788,11",
                exchangeRate = "₽78,66135"
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
    exchangeRate: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White)
            .border(width = 1.dp, color = Color.LightGray),
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

