package com.fkaanoz.sardonic.database.daos

import androidx.room.Dao
import androidx.room.Query
import com.fkaanoz.sardonic.database.models.City
import kotlinx.coroutines.flow.Flow

@Dao
interface CityDao {

    @Query("SELECT * FROM City")
    fun getAllCities() : Flow<List<City>>

    @Query("SELECT * FROM City WHERE id = :id" )
    suspend fun getCityById(id :Int) : City?
}