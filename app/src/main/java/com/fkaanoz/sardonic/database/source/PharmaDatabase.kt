package com.fkaanoz.sardonic.database.source

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fkaanoz.sardonic.database.daos.CityDao
import com.fkaanoz.sardonic.database.daos.DistrictDao
import com.fkaanoz.sardonic.database.models.City
import com.fkaanoz.sardonic.database.models.District


@Database(entities = [City::class, District::class], version=1)
abstract class PharmaDatabase : RoomDatabase() {
    abstract fun cityDao() : CityDao
    abstract fun districtDao() : DistrictDao

    companion object {
        const val DB_NAME = "PharmaDatabase"
        @Volatile
        private var INSTANCE : PharmaDatabase? = null

        fun getDatabase(context : Context) : PharmaDatabase {
            val tempInstance = INSTANCE

            if(tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(context,PharmaDatabase::class.java, "PharmaDatabase").build()
                INSTANCE = instance
                return instance
            }
        }

    }
}