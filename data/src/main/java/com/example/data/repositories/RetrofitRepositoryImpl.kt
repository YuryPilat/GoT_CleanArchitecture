package com.example.data.repositories

import com.example.data.network.RetrofitHelper
import com.example.domain.models.CharacterModelRetrofit
import com.example.domain.repositories.RetrofitRepository
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler

class RetrofitRepositoryImpl(private val scheduler: Scheduler) : RetrofitRepository {

    override fun getCharacterList() : Observable<List<CharacterModelRetrofit>> {
        return RetrofitHelper.getRetrofit().getCharactersList().subscribeOn(scheduler)
    }

}