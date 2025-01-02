package com.Fika.crud_berita.service

import com.Fika.crud_berita.model.LoginResponse
import com.Fika.crud_berita.model.RegisterResponse
import com.Fika.crud_berita.model.ResponseBerita
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface BeritaService {

    @GET("getBerita.php")
    fun getAllBerita() : Call<ResponseBerita>

    @FormUrlEncoded
    @POST("register.php")
    fun registerUser(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("fullname") fullname: String,
        @Field("email") email: String,
    ):Call<RegisterResponse>

    @FormUrlEncoded
    @POST("Login.php")
    fun Login(
        @Field("username") username: String,
        @Field("password") password: String,
    ):Call<LoginResponse>
}