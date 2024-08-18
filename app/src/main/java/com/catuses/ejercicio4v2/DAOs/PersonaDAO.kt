package com.catuses.ejercicio4v2.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.catuses.ejercicio4v2.Entities.Persona

@Dao
interface PersonaDAO {

    @Insert
    fun insertPersona(persona : Persona)

    @Update
    fun updatePersona (persona : Persona )

    @Delete
    fun deletePersona(persona : Persona )

    @Query(" SELECT * FROM Persona ")
    fun selectAllPersonas(): List<Persona>

    @Query(" SELECT * FROM Persona WHERE id = :id")
    fun selectPersona(id : Int) : Persona
}