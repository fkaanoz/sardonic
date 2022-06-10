package com.fkaanoz.sardonic.database.daos

import androidx.room.Dao
import androidx.room.Query
import com.fkaanoz.sardonic.database.models.District
import kotlinx.coroutines.flow.Flow

@Dao
interface DistrictDao {

    @Query("SELECT * FROM District")
    fun getAllDistricts() : Flow<List<District>>

    @Query("SELECT * FROM District WHERE id = :id")
    suspend fun getDistrictById(id : Int) : District?
}