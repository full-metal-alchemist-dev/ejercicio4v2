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
    fun insertUser(persona : Persona)

    @Update
    fun updateUser (persona : Persona )

    @Delete
    fun deleteUser(persona : Persona )

    @Query(" SELECT * FROM Persona ")
    fun selectAllUsers(): List<Persona>

    @Query(" SELECT * FROM Persona WHERE id = :id")
    fun selectUsers(id : Int) : Persona
}