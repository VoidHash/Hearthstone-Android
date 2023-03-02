package com.voidhash.heartstone.utils.converter

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.voidhash.heartstone.framework.model.card.CardBase
import com.voidhash.heartstone.framework.model.card.MechanicsItem
import com.voidhash.heartstone.framework.model.card.RuneCost
import java.lang.reflect.Type

class ListCardConverter {

    private val gson = Gson()
    private val typeCardBase: Type = object : TypeToken<List<CardBase>>() {}.type
    private val typeMechanics: Type = object : TypeToken<List<MechanicsItem>>() {}.type
    private val typeString: Type = object : TypeToken<List<String>>() {}.type
    private val typeRuneCost: Type = object : TypeToken<RuneCost>() {}.type

    //CardBase
    @TypeConverter
    fun fromStringToCardBase(json: String?): List<CardBase> {
        return gson.fromJson(json, typeCardBase)
    }

    @TypeConverter
    fun fromListCardBaseToString(list: List<CardBase?>?): String {
        return gson.toJson(list, typeCardBase)
    }

    //Mechanics
    @TypeConverter
    fun fromMechanicsToStringList(json: String?): List<MechanicsItem> {
        return gson.fromJson(json, typeMechanics)
    }

    @TypeConverter
    fun fromListMechanicsToString(list: List<MechanicsItem?>?): String {
        return gson.toJson(list, typeMechanics)
    }

    //String
    @TypeConverter
    fun fromStringToStringList(json: String?): List<String> {
        return gson.fromJson(json, typeString)
    }

    @TypeConverter
    fun fromListStringToString(list: List<String?>?): String {
        return gson.toJson(list, typeString)
    }

    //RuneCost
    @TypeConverter
    fun fromStringToRuneCost(json: String?): RuneCost {
        return gson.fromJson(json, typeRuneCost)
    }

    @TypeConverter
    fun fromRuneCostToString(list: RuneCost?): String {
        return gson.toJson(list, typeRuneCost)
    }
}