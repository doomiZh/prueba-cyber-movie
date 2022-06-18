package com.example.cybermovie.api

import com.example.cybermovie.entity.Pelicula
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface ServicePeliculaApi {
    @GET("pelicula")
    fun listaPelicula(): Call<List<Pelicula?>?>?

    @GET("pelicula/{id}")
    fun buscaPelicula(id: String?): Call<Optional<Pelicula?>?>?

    @POST("pelicula")
    fun insertaPelicula(@Body obj: Pelicula?): Call<Pelicula?>?

    @PUT("pelicula")
    fun actualizaPelicula(@Body obj: Pelicula?): Call<Pelicula?>?

    @DELETE("pelicula/{id}")
    fun eliminaPelicula(@Path("id") id: Int): Call<Pelicula?>?
}