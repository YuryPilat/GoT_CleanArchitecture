package com.example.gotcleanarchitecture.di

import android.content.Context

object Components {

    private lateinit var appComponent: AppComponent

    fun init(context: Context) {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(context))
            .build()
    }

    fun roomComponent() = appComponent.roomComponent()

    fun retrofitComponent() = appComponent.retrofitComponent()


}