package com.example.cybermovie.api

import com.example.cybermovie.entity.Idioma
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface ServiceIdiomaApi {
    @GET("idioma")
    fun listaIdioma(): Call<List<Idioma?>?>?

    @GET("idioma/{id}")
    fun buscaIdioma(id: String?): Call<Optional<Idioma?>?>?

    @POST("idioma")
    fun insertaIdioma(@Body obj: Idioma?): Call<Idioma?>?

    @PUT("idioma")
    fun actualizaIdioma(@Body obj: Idioma?): Call<Idioma?>?

    @DELETE("idioma/{id}")
    fun eliminaIdioma(@Path("id") id: Int): Call<Idioma?>?
}