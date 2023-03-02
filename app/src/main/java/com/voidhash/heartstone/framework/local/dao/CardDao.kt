package com.voidhash.heartstone.framework.local.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.voidhash.heartstone.framework.model.card.CardModel

@Dao
interface CardDao {

    @Query("SELECT * FROM hearthstone")
    fun getAllCards(): LiveData<CardModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCard(cardList: CardModel)

    @Query("DELETE FROM hearthstone")
    fun deleteAll()

    @Delete
    fun delete(cardEntity: CardModel)
}