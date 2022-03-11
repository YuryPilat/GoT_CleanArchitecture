package com.example.gotcleanarchitecture.ui.room

import com.example.domain.models.CharacterModelRoom
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface RoomView : MvpView {

    @AddToEndSingle
    fun updateList(characterListRoom: List<CharacterModelRoom>)

}