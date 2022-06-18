package com.example.cybermovie.api

import com.example.cybermovie.entity.Venta
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface ServiceVentaApi {
    @GET("venta")
    fun listaVenta(): Call<List<Venta?>?>?

    @GET("venta/{id}")
    fun buscaVenta(id: String?): Call<Optional<Venta?>?>?

    @POST("venta")
    fun insertaVenta(@Body obj: Venta): Call<Venta?>?

    @PUT("venta")
    fun actualizaVenta(@Body obj: Venta?): Call<Venta?>?

    @DELETE("venta/{id}")
    fun eliminaVenta(@Path("id") id: Int): Call<Venta?>?
}