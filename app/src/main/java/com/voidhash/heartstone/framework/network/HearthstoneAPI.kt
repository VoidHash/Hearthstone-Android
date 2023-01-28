package com.voidhash.heartstone.framework.network

import com.voidhash.heartstone.framework.model.card.CardModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface HearthstoneAPI {

    @GET("/cards")
    fun getAllCards(): Call<CardModel>

    @GET("/info")
    fun getInfo(): Call<CardModel>
}