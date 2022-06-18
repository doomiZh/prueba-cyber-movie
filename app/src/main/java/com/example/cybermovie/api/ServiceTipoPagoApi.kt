package com.example.cybermovie.api

import com.example.cybermovie.entity.TipoPago
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface ServiceTipoPagoApi {
    @GET("tipopago")
    fun listaTipoPago(): Call<List<TipoPago?>?>?

    @GET("tipopago/{id}")
    fun buscaTipoPago(id: String?): Call<Optional<TipoPago?>?>?

    @POST("tipopago")
    fun insertaTipoPago(@Body obj: TipoPago?): Call<TipoPago?>?

    @PUT("tipopago")
    fun actualizaTipoPago(@Body obj: TipoPago?): Call<TipoPago?>?

    @DELETE("tipopago/{id}")
    fun eliminaTipoPago(@Path("id") id: Int): Call<TipoPago?>?
}