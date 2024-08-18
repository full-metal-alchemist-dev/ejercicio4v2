package com.catuses.ejercicio4v2.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Persona (

    @PrimaryKey
    var id: Int?,

    @ColumnInfo(name = "PrimerNombre")
    var primerNombre: String,

    @ColumnInfo(name = "SegundoNombre")
    var segundoNombre: String,

    @ColumnInfo(name = "PrimerApellido")
    var primerApellido: String,

    @ColumnInfo(name = "SegundoApellido")
    var segundoApellido: String,

    @ColumnInfo(name = "Sexo")
    var sexo: String,

    @ColumnInfo(name = "Telefono")
    var telefono: Int

    )