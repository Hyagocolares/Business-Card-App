package me.hyago.businesscard

import android.app.Application
import me.hyago.businesscard.data.AppDatabase
import me.hyago.businesscard.data.BusinessCardRepository

class App : Application() {
    private val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}