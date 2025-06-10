package data.dataSource.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import data.dataSource.room.account.dao.AccountDao
import data.dataSource.room.account.dbo.AccountDbo
import data.dataSource.room.converter.Converters
import data.dataSource.room.transaction.dao.TransactionDao
import data.dataSource.room.transaction.dbo.TransactionDbo

@Database(entities = [AccountDbo::class, TransactionDbo::class], version = 1)
@TypeConverters(Converters::class)
abstract class ConverterDatabase: RoomDatabase() {
    abstract fun accountDao(): AccountDao
    abstract fun transactionDao(): TransactionDao
}