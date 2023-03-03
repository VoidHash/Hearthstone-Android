package com.voidhash.heartstone.ui.card

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.voidhash.heartstone.framework.local.database.CardDatabase
import com.voidhash.heartstone.framework.model.card.CardModel
import com.voidhash.heartstone.framework.network.HearthstoneService
import com.voidhash.heartstone.utils.converter.ListCardConverter
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableCompletableObserver
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.currentCoroutineContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.nio.FloatBuffer

class CardViewModel(application: Application): AndroidViewModel(application) {

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
                        saveCardsIntoDB(value)
                    }

                    override fun onError(e: Throwable) {
                        loadError.value = true
                        loading.value = false
                        e.printStackTrace()
                    }
                })
        )
    }

    private fun saveCardsIntoDB(value: CardModel) {
        val db = Room.databaseBuilder(
            getApplication<Application>().applicationContext,
            CardDatabase::class.java,
            "heartstone-db"
        )
        .build()

        db.cardDao()
            .addCard(value)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : DisposableCompletableObserver() {
              override fun onComplete() {
                  Log.e("DBG", "Feito")
              }

              override fun onError(e: Throwable) {
                  e.printStackTrace()
              }
            })
    }

    //encerra a conexao feita no metodo getAllCard()
    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}