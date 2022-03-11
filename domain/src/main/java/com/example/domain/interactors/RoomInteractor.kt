package com.example.domain.interactors

import com.example.domain.models.CharacterModelRoom
import com.example.domain.repositories.RoomRepository
import io.reactivex.rxjava3.core.Observable

class RoomInteractor(private val roomRepository : RoomRepository) {

    fun saveCharacter(
        fullName: String,
        house: String,
        title: String,
        imageUrl: String
    ) {
        roomRepository.saveCharacter(fullName, house, title, imageUrl)
            .subscribe()
    }

    fun getAllCharactersObservable(): Observable<List<CharacterModelRoom>> {
        return roomRepository.getAllCharactersObservable()
    }

    fun getCharacterByHouse(house: String): Observable<List<CharacterModelRoom>> {
        return roomRepository.getCharacterByHouse(house)
    }

    fun getCharacterByAge(fromAge: Int, toAge: Int): Observable<List<CharacterModelRoom>> {
        return roomRepository.getCharacterByAge(fromAge, toAge)
    }
}