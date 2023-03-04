package com.voidhash.heartstone.framework.local.dao

import androidx.room.*
import com.voidhash.heartstone.framework.model.card.CardBase
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

@Dao
interface CardDao {

    @Query("SELECT (SELECT COUNT(*) FROM hearthstone_db) == 0")
    fun isEmpty(): Single<Boolean>

    @Query("SELECT * FROM hearthstone_db")
    fun getAllCards(): Single<List<CardBase>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addCard(cardList: List<CardBase>) : Completable

    @Query("DELETE FROM hearthstone_db")
    fun deleteAll() : Completable

    @Delete
    fun delete(cardEntity: CardBase) : Completable
}