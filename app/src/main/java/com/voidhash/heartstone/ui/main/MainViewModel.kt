package com.voidhash.heartstone.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.voidhash.heartstone.framework.model.card.CardModel
import com.voidhash.heartstone.framework.network.HeartstoneService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainViewModel: ViewModel() {

    private val request = HeartstoneService.request

    fun getInfo() {
        val call = request.getInfo()
        call.enqueue(object : Callback<CardModel> {
            override fun onResponse(call: Call<CardModel>, response: Response<CardModel>) {

            }

            override fun onFailure(call: Call<CardModel>, t: Throwable) {
                Log.e("TAG", "failure: " + t.message)
            }

        })
    }

    fun getAllCard() {
        val call = request.getAllCards()
        call.enqueue(object : Callback<CardModel> {
            override fun onResponse(
                call: Call<CardModel>,
                response: Response<CardModel>
            ) {

            }
            override fun onFailure(call: Call<CardModel>, t: Throwable) {
                Log.e("TAG", "failure: " + t.message)
            }

        })
    }
}
