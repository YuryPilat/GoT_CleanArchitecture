package com.example.gotcleanarchitecture.di.retrofit

import com.example.gotcleanarchitecture.ui.retrofit.RetrofitPresenter
import com.example.gotcleanarchitecture.ui.room.RoomPresenter
import dagger.Subcomponent

@Subcomponent(modules = [ RetrofitModule::class ])
interface RetrofitComponent {

    fun retrofitPresenter(): RetrofitPresenter

}