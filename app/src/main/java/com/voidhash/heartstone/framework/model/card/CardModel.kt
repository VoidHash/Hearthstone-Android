package com.voidhash.heartstone.framework.model.card

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "hearthstone_db")
data class CardBase(

	@PrimaryKey
	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("multiClassGroup")
	val multiClassGroup: String? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("howToGetSignature")
	val howToGetSignature: String? = null,

	@field:SerializedName("runeCost")
	val runeCost: RuneCost? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null
)

data class RuneCost(

	@field:SerializedName("frost")
	val frost: Int? = null,

	@field:SerializedName("unholy")
	val unholy: Int? = null,

	@field:SerializedName("blood")
	val blood: Int? = null
)

data class MechanicsItem(

	@field:SerializedName("name")
	val name: String? = null
)

data class CardModel(

	//December 2022 - Expansion
	@field:SerializedName("March of the Lich King")
	val marchOfTheLichKing: List<CardBase?>? = null,

	//August 2022 - Expansion
	@field:SerializedName("Murder at Castle Nathria")
	val murderAtCastleNathria: List<CardBase?>? = null,

	//April 2022 - Expansion
	@field:SerializedName("Voyage to the Sunken City")
	val voyageToTheSunkenCity: List<CardBase?>? = null,

	//December 2021 - Expansion
	@field:SerializedName("Fractured in Alterac Valley")
	val fracturedInAlteracValley: List<CardBase?>? = null,

	//August 2021 - Expansion
	@field:SerializedName("United in Stormwind")
	val unitedInStormwind: List<CardBase?>? = null,

	//March 2021 - Expansion
	@field:SerializedName("Forged in the Barrens")
	val forgedInTheBarrens: List<CardBase?>? = null,

	//November 2020 - Expansion
	@field:SerializedName("Madness At The Darkmoon Faire")
	val madnessAtTheDarkmoonFaire: List<CardBase?>? = null,

	//August 2020 - Expansion
	@field:SerializedName("Scholomance Academy")
	val scholomanceAcademy: List<CardBase?>? = null,

	//April 2020 - Expansion
	@field:SerializedName("Ashes of Outland")
	val ashesOfOutland: List<CardBase?>? = null,

	//January 2020 - Adventure
	@field:SerializedName("Galakrond's Awakening")
	val galakrondSAwakening: List<CardBase?>? = null,

	//December 2019 - Expansion
	@field:SerializedName("Descent of Dragons")
	val descentOfDragons: List<CardBase?>? = null,

	//August 2019 - Expansion
	@field:SerializedName("Saviors of Uldum")
	val saviorsOfUldum: List<CardBase?>? = null,

	//April 2019 - Expansion
	@field:SerializedName("Rise of Shadows")
	val riseOfShadows: List<CardBase?>? = null,

	//December 2018 - Expansion
	@field:SerializedName("Rastakhan's Rumble")
	val rastakhanSRumble: List<CardBase?>? = null,

	//July 2018 - Expansion
	@field:SerializedName("The Boomsday Project")
	val theBoomsdayProject: List<CardBase?>? = null,

	//April 2018 - Expansion
	@field:SerializedName("The Witchwood")
	val theWitchwood: List<CardBase?>? = null,

	//December 2017 - Expansion
	@field:SerializedName("Kobolds & Catacombs")
	val koboldsCatacombs: List<CardBase?>? = null,

	//August 2017 - Expansion
	@field:SerializedName("Knights of the Frozen Throne")
	val knightsOfTheFrozenThrone: List<CardBase?>? = null,

	//April 2017 - Expansion
	@field:SerializedName("Journey to Un'Goro")
	val journeyToUnGoro: List<CardBase?>? = null,

	//December 2016 - Expansion
	@field:SerializedName("Mean Streets of Gadgetzan")
	val meanStreetsOfGadgetzan: List<CardBase?>? = null,

	//August 2016 - Adventure
	@field:SerializedName("One Night in Karazhan")
	val oneNightInKarazhan: List<CardBase?>? = null,

	//April 2016 - Expansion
	@field:SerializedName("Whispers of the Old Gods")
	val whispersOfTheOldGods: List<CardBase?>? = null,

	//November 2015 - Adventure
	@field:SerializedName("The League of Explorers")
	val theLeagueOfExplorers: List<CardBase?>? = null,

	//August 2015 - Expansion
	@field:SerializedName("The Grand Tournament")
	val theGrandTournament: List<CardBase?>? = null,

	//April 2015 - Adventure
	@field:SerializedName("Blackrock Mountain")
	val blackrockMountain: List<CardBase?>? = null,

	//December 2014 - Expansion
	@field:SerializedName("Goblins vs Gnomes")
	val goblinsVsGnomes: List<CardBase?>? = null,

	//June 2014 - Adventure
	@field:SerializedName("Naxxramas")
	val naxxramas: List<CardBase?>? = null,

	@field:SerializedName("Classic")
	val classic: List<CardBase?>? = null
) {
	fun getCollection(): List<CardBase> {

		var collection = mutableListOf<CardBase>()

		marchOfTheLichKing?.forEach { card ->
			card?.let { collection.add(card) }
		}

		murderAtCastleNathria?.forEach { card ->
			card?.let { collection.add(card) }
		}

		voyageToTheSunkenCity?.forEach { card ->
			card?.let { collection.add(card) }
		}

		fracturedInAlteracValley?.forEach { card ->
			card?.let { collection.add(card) }
		}

		unitedInStormwind?.forEach { card ->
			card?.let { collection.add(card) }
		}

		forgedInTheBarrens?.forEach { card ->
			card?.let { collection.add(card) }
		}

		madnessAtTheDarkmoonFaire?.forEach { card ->
			card?.let { collection.add(card) }
		}

		scholomanceAcademy?.forEach { card ->
			card?.let { collection.add(card) }
		}

		ashesOfOutland?.forEach { card ->
			card?.let { collection.add(card) }
		}

		galakrondSAwakening?.forEach { card ->
			card?.let { collection.add(card) }
		}

		descentOfDragons?.forEach { card ->
			card?.let { collection.add(card) }
		}

		saviorsOfUldum?.forEach { card ->
			card?.let { collection.add(card) }
		}

		riseOfShadows?.forEach { card ->
			card?.let { collection.add(card) }
		}

		rastakhanSRumble?.forEach { card ->
			card?.let { collection.add(card) }
		}

		theBoomsdayProject?.forEach { card ->
			card?.let { collection.add(card) }
		}

		theWitchwood?.forEach { card ->
			card?.let { collection.add(card) }
		}

		koboldsCatacombs?.forEach { card ->
			card?.let { collection.add(card) }
		}

		knightsOfTheFrozenThrone?.forEach { card ->
			card?.let { collection.add(card) }
		}

		journeyToUnGoro?.forEach { card ->
			card?.let { collection.add(card) }
		}

		meanStreetsOfGadgetzan?.forEach { card ->
			card?.let { collection.add(card) }
		}

		oneNightInKarazhan?.forEach { card ->
			card?.let { collection.add(card) }
		}

		whispersOfTheOldGods?.forEach { card ->
			card?.let { collection.add(card) }
		}

		theLeagueOfExplorers?.forEach { card ->
			card?.let { collection.add(card) }
		}

		theGrandTournament?.forEach { card ->
			card?.let { collection.add(card) }
		}

		blackrockMountain?.forEach { card ->
			card?.let { collection.add(card) }
		}

		goblinsVsGnomes?.forEach { card ->
			card?.let { collection.add(card) }
		}

		naxxramas?.forEach { card ->
			card?.let { collection.add(card) }
		}

		classic?.forEach { card ->
			card?.let { collection.add(card) }
		}

		return collection.toList()
	}
}