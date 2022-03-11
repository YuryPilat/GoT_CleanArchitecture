package com.example.gotcleanarchitecture.di

import com.example.gotcleanarchitecture.di.retrofit.RetrofitComponent
import com.example.gotcleanarchitecture.di.retrofit.RetrofitModule
import com.example.gotcleanarchitecture.di.room.RoomComponent
import com.example.gotcleanarchitecture.di.room.RoomModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    SchedulersModule::class,
    DatabaseModule::class,
    RoomModule::class,
    RetrofitModule::class
])
interface AppComponent {

    fun roomComponent(): RoomComponent

    fun retrofitComponent() : RetrofitComponent


}