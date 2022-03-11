package com.example.domain.interactors

import com.example.domain.models.CharacterModelRetrofit
import com.example.domain.repositories.RoomRepository
import com.example.domain.repositories.RetrofitRepository
import io.reactivex.rxjava3.core.Observable

class RetrofitInteractor(
    private val retrofitRepository: RetrofitRepository,
    private val roomRepository : RoomRepository
    ) {

    fun getData(): Observable<List<CharacterModelRetrofit>> {
       return retrofitRepository.getCharacterList()
    }

}