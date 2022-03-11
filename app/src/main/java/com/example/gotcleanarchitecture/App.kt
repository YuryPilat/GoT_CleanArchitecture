package com.example.gotcleanarchitecture

import android.app.Application
import com.example.gotcleanarchitecture.di.Components

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Components.init(applicationContext)
    }
}