package com.example.data.database

import android.content.Context
import androidx.room.Room

private const val DATABASE_NAME = "got_db"

class DatabaseManager(private val context: Context) {

    fun getAppDatabase(): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
            .build()
}