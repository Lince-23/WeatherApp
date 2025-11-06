package com.weatherApp.utils

import android.content.Context
import android.content.SharedPreferences

class PreferencesManager(context: Context) {

    val sharedPreferences =
        context.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)

    //TODO save data in SharedPreferences
    fun saveLocation(city: String, latitude: Double, longitude: Double) {
        with(sharedPreferences.edit()) {
            putString("city", city)
            putFloat("latitude", latitude.toFloat())
            putFloat("longitude", longitude.toFloat())
            apply()
        }
    }

    fun getCityName(): String? {
        return sharedPreferences.getString("city", "N/A")
    }

    fun getLatitude(): Float? {
        return sharedPreferences.getFloat("latitude", 0.0f)
    }

    fun getLongitude(): Float? {
        return sharedPreferences.getFloat("longitude", 0.0f)
    }
}
