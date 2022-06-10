package com.fkaanoz.sardonic.database.repositories

import com.fkaanoz.sardonic.database.daos.CityDao
import com.fkaanoz.sardonic.database.models.City
import kotlinx.coroutines.flow.Flow

class CityRepository (private val cityDao : CityDao) {

    fun getAllCities() : Flow<List<City>> {
        return cityDao.getAllCities()
    }

    suspend fun getCityById(id : Int) : City? {
        return cityDao.getCityById(id)
    }
}