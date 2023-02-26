package com.voidhash.heartstone.ui.card

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.voidhash.heartstone.framework.model.card.CardModel
import com.voidhash.heartstone.framework.network.HearthstoneService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CardViewModel: ViewModel() {

    private val request = HearthstoneService.request
    private val disposable = CompositeDisposable()

    val loading = MutableLiveData<Boolean>()
    val loadError = MutableLiveData<Boolean>()
    val cardCollection: MutableLiveData<CardModel> by lazy {
        MutableLiveData<CardModel>()
    }

    fun getAllCard() {
        loading.value = true
        disposable.add(
            request.getAllCards()
                //cria uma nova thread para rodar em background
                .subscribeOn(Schedulers.newThread())
                //o resultado dessa nova thread será mostrada na thread principal
                .observeOn(AndroidSchedulers.mainThread())
                //define o q vamos fazer com o resuldado dessa thread
                .subscribeWith(object: DisposableSingleObserver<CardModel>(){
                    override fun onSuccess(value: CardModel) {
                        cardCollection.value = value
                        loadError.value = false
                        loading.value = false
                    }

                    override fun onError(e: Throwable) {
                        loadError.value = true
                        loading.value = false
                        e.printStackTrace()
                    }
                })
        )
    }

    //encerra a conexao feita no metodo getAllCard()
    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}