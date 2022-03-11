package com.example.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.domain.models.CharacterModelRoom
import io.reactivex.rxjava3.core.Observable

@Dao
interface CharacterDAO {

    @Query("""
        INSERT INTO characters (fullName, house, title, imageUrl) 
        VALUES (:fullName, :house, :title, :imageUrl)
    """)
    fun insertCharacter(
        fullName: String,
        house: String,
        title: String,
        imageUrl: String
    )

    @Query("""
        SELECT
        id AS id,
        fullName AS fullName,
        age AS age,
        house AS house,
        title AS title,
        imageUrl AS imageUrl
        FROM characters
    """)
    fun getAllCharactersObservable(): Observable<List<CharacterModelRoom>>

    @Query(value = "SELECT * FROM characters WHERE house = :house")
    fun getCharacterByHouse(house: String) : Observable<List<CharacterModelRoom>>

    @Query(value = "SELECT * FROM characters WHERE age BETWEEN :fromAge AND :toAge")
    fun getCharacterByAge(fromAge: Int, toAge : Int) : Observable<List<CharacterModelRoom>>

}