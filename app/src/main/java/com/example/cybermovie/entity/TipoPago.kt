package com.example.cybermovie.entity

class TipoPago {

    private var idTipoPago = 0
    private var nom_tpago: String? = null


    fun getIdTipoPago (): Int {
        return idTipoPago
    }

    fun setIdTipoPago (idTipoPago : Int) {
        this.idTipoPago = idTipoPago
    }

    fun getNom_tpago(): String? {
        return nom_tpago
    }

    fun setNom_tpago(nom_tpago: String?) {
        this.nom_tpago = nom_tpago
    }

}