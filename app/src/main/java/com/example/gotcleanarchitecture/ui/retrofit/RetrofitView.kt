package com.example.gotcleanarchitecture.ui.retrofit

import com.example.domain.models.CharacterModelRetrofit
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface RetrofitView : MvpView {

    @AddToEndSingle
    fun updateList(characterListRoom: List<CharacterModelRetrofit>)

}