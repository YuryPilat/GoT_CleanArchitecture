package com.example.data.network

import com.example.domain.models.CharacterModelRetrofit
import com.example.domain.models.CharacterModelRoom
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET


interface RetrofitInterface {
    @GET("api/v2/Characters")
    fun getCharactersList() : Observable<List<CharacterModelRetrofit>>
}
