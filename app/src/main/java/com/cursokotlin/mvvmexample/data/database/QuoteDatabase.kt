package com.cursokotlin.mvvmexample.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cursokotlin.mvvmexample.data.database.dao.QuoteDao
import com.cursokotlin.mvvmexample.data.database.entities.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDatabase: RoomDatabase() {

    abstract fun getQuoteDao():QuoteDao
}