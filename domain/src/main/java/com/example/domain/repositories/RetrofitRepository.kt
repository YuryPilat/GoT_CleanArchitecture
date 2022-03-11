package com.example.domain.repositories

import com.example.domain.models.CharacterModelRetrofit
import com.example.domain.models.CharacterModelRoom
import io.reactivex.rxjava3.core.Observable

interface RetrofitRepository {

    fun getCharacterList() : Observable<List<CharacterModelRetrofit>>
}