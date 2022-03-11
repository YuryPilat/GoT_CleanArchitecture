package com.example.data.database.dao

import com.example.data.database.AppDatabase
import com.example.domain.models.CharacterModelRoom
import io.reactivex.rxjava3.core.Observable
import java.lang.Exception

class CharacterDAOWrapper(
    private val appDatabase: AppDatabase,
    private val characterDAO: CharacterDAO
) {

    fun saveCharacter(
                 fullName: String,
                 house: String,
                 title: String,
                 imageUrl: String
    ) {
       try {
           appDatabase.runInTransaction {
               characterDAO.insertCharacter(
                   fullName,
                   house,
                   title,
                   imageUrl
               )
           }
       } catch (e : Exception) {
           val u = 0
       }
    }

    fun getAllCharactersObservable(): Observable<List<CharacterModelRoom>> {
        return characterDAO.getAllCharactersObservable()
    }

    fun getCharacterByHouse(house: String): Observable<List<CharacterModelRoom>> {
        return characterDAO.getCharacterByHouse(house)
    }

    fun getCharacterByAge(fromAge: Int, toAge : Int) : Observable<List<CharacterModelRoom>> {
        return characterDAO.getCharacterByAge(fromAge, toAge)
    }

}