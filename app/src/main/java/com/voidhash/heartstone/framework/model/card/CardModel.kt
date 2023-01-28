package com.voidhash.heartstone.framework.model.card

import com.google.gson.annotations.SerializedName

data class CardModel(

	@field:SerializedName("Knights of the Frozen Throne")
	val knightsOfTheFrozenThrone: List<KnightsOfTheFrozenThroneItem?>? = null,

	@field:SerializedName("Whispers of the Old Gods")
	val whispersOfTheOldGods: List<WhispersOfTheOldGodsItem?>? = null,

	@field:SerializedName("Legacy")
	val legacy: List<LegacyItem?>? = null,

	@field:SerializedName("Saviors of Uldum")
	val saviorsOfUldum: List<SaviorsOfUldumItem?>? = null,

	@field:SerializedName("The Boomsday Project")
	val theBoomsdayProject: List<TheBoomsdayProjectItem?>? = null,

	@field:SerializedName("Mercenaries")
	val mercenaries: List<MercenariesItem?>? = null,

	@field:SerializedName("Unknown")
	val unknown: List<UnknownItem?>? = null,

	@field:SerializedName("Scholomance Academy")
	val scholomanceAcademy: List<ScholomanceAcademyItem?>? = null,

	@field:SerializedName("Descent of Dragons")
	val descentOfDragons: List<DescentOfDragonsItem?>? = null,

	@field:SerializedName("Core")
	val core: List<CoreItem?>? = null,

	@field:SerializedName("Galakrond's Awakening")
	val galakrondSAwakening: List<GalakrondSAwakeningItem?>? = null,

	@field:SerializedName("Demo")
	val demo: List<Any?>? = null,

	@field:SerializedName("Demon Hunter Initiate")
	val demonHunterInitiate: List<DemonHunterInitiateItem?>? = null,

	@field:SerializedName("The Witchwood")
	val theWitchwood: List<TheWitchwoodItem?>? = null,

	@field:SerializedName("The Grand Tournament")
	val theGrandTournament: List<TheGrandTournamentItem?>? = null,

	@field:SerializedName("Murder at Castle Nathria")
	val murderAtCastleNathria: List<MurderAtCastleNathriaItem?>? = null,

	@field:SerializedName("Taverns of Time")
	val tavernsOfTime: List<TavernsOfTimeItem?>? = null,

	@field:SerializedName("Blackrock Mountain")
	val blackrockMountain: List<BlackrockMountainItem?>? = null,

	@field:SerializedName("Rise of Shadows")
	val riseOfShadows: List<RiseOfShadowsItem?>? = null,

	@field:SerializedName("March of the Lich King")
	val marchOfTheLichKing: List<MarchOfTheLichKingItem?>? = null,

	@field:SerializedName("Wailing Caverns")
	val wailingCaverns: List<Any?>? = null,

	@field:SerializedName("Mean Streets of Gadgetzan")
	val meanStreetsOfGadgetzan: List<MeanStreetsOfGadgetzanItem?>? = null,

	@field:SerializedName("Ashes of Outland")
	val ashesOfOutland: List<AshesOfOutlandItem?>? = null,

	@field:SerializedName("Basic")
	val basic: List<BasicItem?>? = null,

	@field:SerializedName("Battlegrounds")
	val battlegrounds: List<BattlegroundsItem?>? = null,

	@field:SerializedName("Vanilla")
	val vanilla: List<VanillaItem?>? = null,

	@field:SerializedName("Naxxramas")
	val naxxramas: List<NaxxramasItem?>? = null,

	@field:SerializedName("System")
	val system: List<Any?>? = null,

	@field:SerializedName("Hero Skins")
	val heroSkins: List<HeroSkinsItem?>? = null,

	@field:SerializedName("Wild Event")
	val wildEvent: List<Any?>? = null,

	@field:SerializedName("Path of Arthas")
	val pathOfArthas: List<PathOfArthasItem?>? = null,

	@field:SerializedName("Madness At The Darkmoon Faire")
	val madnessAtTheDarkmoonFaire: List<MadnessAtTheDarkmoonFaireItem?>? = null,

	@field:SerializedName("Debug")
	val debug: List<Any?>? = null,

	@field:SerializedName("Goblins vs Gnomes")
	val goblinsVsGnomes: List<GoblinsVsGnomesItem?>? = null,

	@field:SerializedName("United in Stormwind")
	val unitedInStormwind: List<UnitedInStormwindItem?>? = null,

	@field:SerializedName("Kobolds & Catacombs")
	val koboldsCatacombs: List<KoboldsCatacombsItem?>? = null,

	@field:SerializedName("Classic")
	val classic: List<ClassicItem?>? = null,

	@field:SerializedName("Missions")
	val missions: List<MissionsItem?>? = null,

	@field:SerializedName("Journey to Un'Goro")
	val journeyToUnGoro: List<JourneyToUnGoroItem?>? = null,

	@field:SerializedName("Forged in the Barrens")
	val forgedInTheBarrens: List<ForgedInTheBarrensItem?>? = null,

	@field:SerializedName("One Night in Karazhan")
	val oneNightInKarazhan: List<OneNightInKarazhanItem?>? = null,

	@field:SerializedName("Tavern Brawl")
	val tavernBrawl: List<TavernBrawlItem?>? = null,

	@field:SerializedName("Rastakhan's Rumble")
	val rastakhanSRumble: List<RastakhanSRumbleItem?>? = null,

	@field:SerializedName("Hall of Fame")
	val hallOfFame: List<HallOfFameItem?>? = null,

	@field:SerializedName("Credits")
	val credits: List<CreditsItem?>? = null,

	@field:SerializedName("Promo")
	val promo: List<Any?>? = null,

	@field:SerializedName("Fractured in Alterac Valley")
	val fracturedInAlteracValley: List<FracturedInAlteracValleyItem?>? = null,

	@field:SerializedName("Voyage to the Sunken City")
	val voyageToTheSunkenCity: List<VoyageToTheSunkenCityItem?>? = null,

	@field:SerializedName("The League of Explorers")
	val theLeagueOfExplorers: List<TheLeagueOfExplorersItem?>? = null
)

data class HallOfFameItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null
)

data class KnightsOfTheFrozenThroneItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null
)

data class ClassicItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null
)

data class VoyageToTheSunkenCityItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null
)

data class TheLeagueOfExplorersItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class LegacyItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class TavernBrawlItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null,

	@field:SerializedName("multiClassGroup")
	val multiClassGroup: String? = null
)

data class TheWitchwoodItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("faction")
	val faction: String? = null
)

data class SaviorsOfUldumItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null
)

data class CoreItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("runeCost")
	val runeCost: RuneCost? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("howToGetSignature")
	val howToGetSignature: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null
)

data class RuneCost(

	@field:SerializedName("frost")
	val frost: Int? = null,

	@field:SerializedName("unholy")
	val unholy: Int? = null,

	@field:SerializedName("blood")
	val blood: Int? = null
)

data class KoboldsCatacombsItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null
)

data class DescentOfDragonsItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("faction")
	val faction: String? = null
)

data class UnknownItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class MissionsItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("race")
	val race: String? = null
)

data class MarchOfTheLichKingItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("runeCost")
	val runeCost: RuneCost? = null,

	@field:SerializedName("howToGetSignature")
	val howToGetSignature: String? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("faction")
	val faction: String? = null
)

data class PathOfArthasItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("runeCost")
	val runeCost: RuneCost? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("howToGetSignature")
	val howToGetSignature: String? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null
)

data class ScholomanceAcademyItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("multiClassGroup")
	val multiClassGroup: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null
)

data class MurderAtCastleNathriaItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("faction")
	val faction: String? = null
)

data class DemonHunterInitiateItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null
)

data class MercenariesItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null
)

data class FracturedInAlteracValleyItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null
)

data class RastakhanSRumbleItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null
)

data class GoblinsVsGnomesItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class NaxxramasItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null
)

data class AshesOfOutlandItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class ForgedInTheBarrensItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null,

	@field:SerializedName("multiClassGroup")
	val multiClassGroup: String? = null
)

data class CreditsItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null
)

data class HeroSkinsItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null
)

data class UnitedInStormwindItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null
)

data class TavernsOfTimeItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null
)

data class OneNightInKarazhanItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class WhispersOfTheOldGodsItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class BasicItem(

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class TheBoomsdayProjectItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null
)

data class MeanStreetsOfGadgetzanItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null,

	@field:SerializedName("multiClassGroup")
	val multiClassGroup: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null
)

data class VanillaItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("howToGetDiamond")
	val howToGetDiamond: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class BlackrockMountainItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class GalakrondSAwakeningItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null
)

data class TheGrandTournamentItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null
)

data class JourneyToUnGoroItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null
)

data class RiseOfShadowsItem(

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("armor")
	val armor: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("howToGetGold")
	val howToGetGold: String? = null
)

data class MadnessAtTheDarkmoonFaireItem(

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("collectible")
	val collectible: Boolean? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("durability")
	val durability: Int? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("classes")
	val classes: List<String?>? = null,

	@field:SerializedName("multiClassGroup")
	val multiClassGroup: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null
)

data class BattlegroundsItem(

	@field:SerializedName("playerClass")
	val playerClass: String? = null,

	@field:SerializedName("img")
	val img: String? = null,

	@field:SerializedName("cost")
	val cost: Int? = null,

	@field:SerializedName("cardSet")
	val cardSet: String? = null,

	@field:SerializedName("cardId")
	val cardId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("dbfId")
	val dbfId: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("locale")
	val locale: String? = null,

	@field:SerializedName("race")
	val race: String? = null,

	@field:SerializedName("health")
	val health: Int? = null,

	@field:SerializedName("mechanics")
	val mechanics: List<MechanicsItem?>? = null,

	@field:SerializedName("elite")
	val elite: Boolean? = null,

	@field:SerializedName("attack")
	val attack: Int? = null,

	@field:SerializedName("rarity")
	val rarity: String? = null,

	@field:SerializedName("imgGold")
	val imgGold: String? = null,

	@field:SerializedName("faction")
	val faction: String? = null,

	@field:SerializedName("artist")
	val artist: String? = null,

	@field:SerializedName("flavor")
	val flavor: String? = null,

	@field:SerializedName("otherRaces")
	val otherRaces: List<String?>? = null,

	@field:SerializedName("spellSchool")
	val spellSchool: String? = null,

	@field:SerializedName("howToGet")
	val howToGet: String? = null
)

data class MechanicsItem(

	@field:SerializedName("name")
	val name: String? = null
)
