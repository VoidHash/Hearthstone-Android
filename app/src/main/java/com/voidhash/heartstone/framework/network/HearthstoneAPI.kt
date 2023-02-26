package com.voidhash.heartstone.framework.network

import com.voidhash.heartstone.framework.model.card.CardModel
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.GET

interface HearthstoneAPI {

    @GET("/cards")
    fun getAllCards(): Single<CardModel>

    @GET("/info")
    fun getInfo(): Call<CardModel>
}