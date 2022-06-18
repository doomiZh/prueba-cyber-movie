package com.example.cybermovie.entity

class Genero {

    private var idGenero = 0
    private var tipo_genero: String? = null

    fun getIdGenero(): Int {
        return idGenero
    }

    fun setIdGenero(idGenero: Int) {
        this.idGenero= idGenero
    }

    fun getTipo_genero(): String? {
        return tipo_genero
    }

    fun setTipo_genero(tipo_genero: String) {
        this.tipo_genero = tipo_genero
    }

}