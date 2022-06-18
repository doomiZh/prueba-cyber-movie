package com.example.cybermovie.entity

class Pelicula {

    private var idPelicula = 0
    private var nom_peli: String? = null
    private var duracion: String? = null
    private var stock: String? = null
    private var imgPeli: String? = null


    fun getIdPelicula(): Int {
        return idPelicula
    }

    fun setIdPelicula(idPelicula: Int) {
        this.idPelicula = idPelicula
    }

    fun getNom_peli(): String? {
        return nom_peli
    }

    fun setNom_peli(nom_peli: String?) {
        this.nom_peli = nom_peli
    }

    fun getDuracion(): String? {
        return duracion
    }

    fun setDuracion(duracion: String?) {
        this.duracion = duracion
    }

    fun getStock(): String? {
        return stock
    }

    fun setStock(stock: String?) {
        this.stock = stock
    }

    fun getImgPeli(): String? {
        return imgPeli
    }

    fun setImgPeli(imgPeli: String?) {
        this.imgPeli= imgPeli
    }

}