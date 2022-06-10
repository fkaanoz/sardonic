package com.fkaanoz.sardonic.di

import android.app.Application
import androidx.room.Room
import com.fkaanoz.sardonic.database.source.PharmaDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideTransactionDatabase(app : Application) : PharmaDatabase {
        return Room.databaseBuilder(
            app,
            PharmaDatabase::class.java,
            PharmaDatabase.DB_NAME
        ).build()
    }
}