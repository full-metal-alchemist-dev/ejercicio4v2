package com.catuses.ejercicio4v2.AppDatabases

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.catuses.ejercicio4v2.DAOs.PersonaDAO
import com.catuses.ejercicio4v2.Entities.Persona

@Database(entities = [Persona::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun PersonaDAO(): PersonaDAO

    companion object {
        @Volatile
        private var INSTANCE : AppDataBase? = null

        fun getDatabase(context: Context) : AppDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "AppDatabase"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}