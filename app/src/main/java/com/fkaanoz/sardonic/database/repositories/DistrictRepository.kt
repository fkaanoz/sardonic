package com.fkaanoz.sardonic.database.repositories

import com.fkaanoz.sardonic.database.daos.DistrictDao
import com.fkaanoz.sardonic.database.models.District
import kotlinx.coroutines.flow.Flow

class DistrictRepository(private val districtDao : DistrictDao) {

    fun getAllDistricts() : Flow<List<District>> {
        return districtDao.getAllDistricts()
    }

    suspend fun getDistrictById(id : Int) : District? {
        return districtDao.getDistrictById(id)
    }
}