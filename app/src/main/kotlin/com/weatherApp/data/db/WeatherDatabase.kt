package com.weatherApp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase

//TODO implement class WeatherDatabase using Room
@Database(entities = [WeatherEntity::class], version = 1)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}

