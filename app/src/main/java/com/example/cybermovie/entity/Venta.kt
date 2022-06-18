package com.example.cybermovie.entity

class Venta {

    private var idVenta = 0
    private var valor: String? = null
    private var fechaPedido: String? = null





    fun getIdVenta(): Int {
        return idVenta
    }

    fun setIdVenta(idVenta: Int) {
        this.idVenta = idVenta
    }

    fun getValor(): String? {
        return valor
    }

    fun setValor(valor: String?) {
        this.valor = valor
    }
    fun getFechaPedido(): String? {
        return fechaPedido
    }

    fun setFechaPedido(fechaPedido: String?) {
        this.fechaPedido = fechaPedido
    }




}