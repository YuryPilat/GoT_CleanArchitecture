package com.example.data.repositories

import com.example.data.database.dao.CharacterDAOWrapper
import com.example.domain.models.CharacterModelRoom
import com.example.domain.repositories.RoomRepository
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler

class RoomRepositoryImpl(
    private val characterDaoWrapper: CharacterDAOWrapper,
    private val dbScheduler: Scheduler
) : RoomRepository {
    override fun saveCharacter(
        fullName: String,
        house: String,
        title: String,
        imageUrl: String
    ): Completable {
        return Completable.fromAction { characterDaoWrapper.saveCharacter(fullName, house, title, imageUrl) }
            .subscribeOn(dbScheduler)
    }

    override fun getAllCharactersObservable(): Observable<List<CharacterModelRoom>> {
        return characterDaoWrapper.getAllCharactersObservable()
    }

    override fun getCharacterByHouse(house: String): Observable<List<CharacterModelRoom>> {
        return characterDaoWrapper.getCharacterByHouse(house)
    }

    override fun getCharacterByAge(fromAge: Int, toAge: Int): Observable<List<CharacterModelRoom>> {
        return characterDaoWrapper.getCharacterByAge(fromAge, toAge)
    }
}