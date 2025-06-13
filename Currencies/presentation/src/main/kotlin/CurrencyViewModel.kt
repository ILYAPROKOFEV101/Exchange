import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.dataSource.remote.RatesService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import data.dataSource.remote.RemoteRatesServiceImpl
import data.dataSource.remote.dto.RateDto

class CurrencyViewModel(
    private val ratesService: RatesService = RemoteRatesServiceImpl()
) : ViewModel() {

    private val _selectedCurrency = MutableStateFlow("USD")
    val selectedCurrency: StateFlow<String> = _selectedCurrency

    private val _rates = MutableStateFlow<List<RateDto>>(emptyList())
    val rates: StateFlow<List<RateDto>> = _rates

    init {
        loadRates()
    }

    fun selectCurrency(currencyCode: String) {
        _selectedCurrency.value = currencyCode
        loadRates()
    }

    private fun loadRates() {
        viewModelScope.launch {
            val result = ratesService.getRates(_selectedCurrency.value, 1.0)
            _rates.value = result
        }
    }

    private fun RatesService.getRates(string: String, d: Double) {}
}
