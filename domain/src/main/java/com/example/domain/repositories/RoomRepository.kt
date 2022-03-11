package com.example.domain.repositories

import com.example.domain.models.CharacterModelRoom
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

interface RoomRepository {

    fun saveCharacter(
            fullName: String,
            house: String,
            title: String,
            imageUrl: String
        ) : Completable

    fun getAllCharactersObservable(): Observable<List<CharacterModelRoom>>

    fun getCharacterByHouse(house: String): Observable<List<CharacterModelRoom>>

    fun getCharacterByAge(fromAge: Int, toAge : Int) : Observable<List<CharacterModelRoom>>
}