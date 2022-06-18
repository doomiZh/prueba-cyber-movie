package com.example.cybermovie.api

import com.example.cybermovie.entity.Genero
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface ServiceGeneroApi {

    @GET("genero")
    fun listaGenero(): Call<List<Genero?>?>?

    @GET("genero/{id}")
    fun buscaGenero(id: String?): Call<Optional<Genero?>?>?

    @POST("genero")
    fun insertaGenero(@Body obj: Genero?): Call<Genero?>?

    @PUT("genero")
    fun actualizaGenero(@Body obj: Genero?): Call<Genero?>?

    @DELETE("genero/{id}")
    fun eliminaGenero(@Path("id") id: Int): Call<Genero?>?
}