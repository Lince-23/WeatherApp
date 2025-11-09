package com.weatherApp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

//TODO define WeatherDao interface
/**
 * It needs three functions:
 * insertWeatherData: inserts a list of WeatherEntity values.
 * retrieveWeatherData: gets all the data stored on the weather_data table,
 * ordered by time (ascending).
 * clearDatabase: deletes all the data on the weather_data table
 */
@Dao
interface WeatherDao {
    @Insert
    suspend fun insertWeatherData(data: List<WeatherEntity>)
    fun retrieveWeatherData(): LiveData<List<WeatherEntity>>
    @Delete
    suspend fun clearDatabase()
}
