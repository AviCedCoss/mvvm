package com.example.mvvm.backend

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import com.example.mvvm.main.di.movieModule
import com.example.mvvm.di.picassoModule
import com.example.mvvm.di.retrofitModule



class MyCustomApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyCustomApp)
            modules(listOf(retrofitModule, picassoModule, movieModule))
        }
    }
}