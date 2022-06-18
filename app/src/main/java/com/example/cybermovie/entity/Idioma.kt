package com.example.cybermovie.entity

class Idioma {

    private var idIidoma = 0
    private var nom_idioma: String? = null

    fun getIdIidoma(): Int {
        return idIidoma
    }

    fun setIdIidoma(idIidoma: Int) {
        this.idIidoma= idIidoma
    }

    fun getNom_idioma(): String? {
        return nom_idioma
    }

    fun setNom_idioma(nom_idioma: String) {
        this.nom_idioma= nom_idioma
    }
}