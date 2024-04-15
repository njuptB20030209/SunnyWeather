package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    @SuppressLint("StaticFieldLeak")
    companion object{
        lateinit var context: Context
        const val TOKEN = "P6Qmvv6n4aSnbrB0"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}