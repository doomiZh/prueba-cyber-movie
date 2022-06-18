package com.example.cybermovie.api

import com.example.cybermovie.entity.User
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface ServiceUserApi {
    @GET("users")
    fun listaUser(): Call<List<User?>?>?

    @GET("users/{id}")
    fun buscaUser(id: String?): Call<Optional<User?>?>?

    @POST("users")
    fun insertaUser(@Body obj: User?): Call<User?>?

    @PUT("users")
    fun actualizaUser(@Body obj: User?): Call<User?>?

    @DELETE("users/{id}")
    fun eliminaUser(@Path("id") id: Int): Call<User?>?
}