package com.voidhash.heartstone.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.voidhash.heartstone.framework.model.card.CardModel
import com.voidhash.heartstone.framework.network.HearthstoneService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {

    private val request = HearthstoneService.request

    val gameInfo = request.getInfo()
}
