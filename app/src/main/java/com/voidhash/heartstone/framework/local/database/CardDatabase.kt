package com.voidhash.heartstone.framework.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.voidhash.heartstone.framework.local.dao.CardDao
import com.voidhash.heartstone.framework.model.card.CardModel
import com.voidhash.heartstone.utils.converter.ListCardConverter

@Database(entities = [CardModel::class], version = 1)
@TypeConverters(ListCardConverter::class)
abstract class CardDatabase: RoomDatabase() {
    abstract fun cardDao(): CardDao
}