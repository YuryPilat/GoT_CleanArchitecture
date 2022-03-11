package com.example.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
class CharacterEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val fullName: String,
    val age: Int,
    val house: String,
    val title: String,
    val imageUrl: String?
)