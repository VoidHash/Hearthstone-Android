package com.voidhash.heartstone.framework.local.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.voidhash.heartstone.framework.model.card.CardModel
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface CardDao {

    @Query("SELECT * FROM hearthstone")
    fun getAllCards(): Flowable<CardModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCard(cardList: CardModel) : Completable

    @Query("DELETE FROM hearthstone")
    fun deleteAll() : Completable

    @Delete
    fun delete(cardEntity: CardModel) : Completable
}