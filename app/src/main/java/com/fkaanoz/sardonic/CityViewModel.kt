package com.fkaanoz.sardonic

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fkaanoz.sardonic.database.models.City
import com.fkaanoz.sardonic.database.repositories.CityRepository
import com.fkaanoz.sardonic.database.source.PharmaDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class CityViewModel(application : Application) : AndroidViewModel(application) {

    private lateinit var cities : Flow<List<City>>
    private val cityRepository : CityRepository

    init {
        val cityDao = PharmaDatabase.getDatabase(application).cityDao()
        cityRepository = CityRepository(cityDao)
        viewModelScope.launch(Dispatchers.IO) {
            cities = cityRepository.getAllCities()
        }
    }

}