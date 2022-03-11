package com.example.gotcleanarchitecture.di.room

import com.example.gotcleanarchitecture.ui.room.RoomPresenter
import dagger.Subcomponent

@Subcomponent(modules = [ RoomModule::class ])
interface RoomComponent {

    fun roomPresenter(): RoomPresenter

}