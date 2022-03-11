package com.example.gotcleanarchitecture.di

import android.content.Context
import com.example.data.database.AppDatabase
import com.example.data.database.DatabaseManager
import com.example.data.database.dao.CharacterDAO
import com.example.data.database.dao.CharacterDAOWrapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabaseManager(context: Context) = DatabaseManager(context)

    @Provides
    @Singleton
    fun appDatabase(dbManager: DatabaseManager) = dbManager.getAppDatabase()

    @Provides
    @Singleton
    fun characterDao(appDatabase: AppDatabase) = appDatabase.characterDAO()

    @Provides
    @Singleton
    fun characterDaoWrapper(
        appDatabase: AppDatabase,
        characterDao: CharacterDAO
    ) = CharacterDAOWrapper(appDatabase, characterDao)

}