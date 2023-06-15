fun main() {
val story=Story("Babu","12 minutes","it helps girls to be responsible","12-18 years")
    println(story.RecordStories())
    val story2=Story2("Korongo","12 minutes","it helps girls to be responsible","12-18 years")
    println(story2.RecordStories())

    val storyteller=StoryTeller("Denniss","babu","12 minutes","it helps girls to be responsible","12-18 years")
    println(storyteller.RecordStories())
    val storyteller2=StoryTeller2("David","babu","12 minutes","it helps girls to be responsible","12-18 years")
println(storyteller2.RecordStories())


    val translater=Translater("Grace","Kiswahili","Babu")
    println(translater.TranslateStories())


    val translater2=Translater2("Neema","Kiswahili","Babu")
    println(translater2.TranslateStories())
    val recipe=Recipe("cocoa","45 minutes","frying","healthy")
    println(recipe.AfricaCuisine())

    val morrocco=MorrocanRecipe("cocoa","45 minutes","frying","healthy")
    println(morrocco.MorrocanCuisine())

    val ethiopia=EthiopianRecipe("strawbwrry","45 minutes","frying","healthy")
    println(ethiopia.EthiopianCuisine())

    val nigeria=NigerianRecipe("cocoa","45 minutes","frying","healthy")
    println(nigeria.NigerianCuisine())

val specie=Species("plants","roaming","preditorlocation")
    println(specie.trackSpecies())
}

open class Story(var story:String,var length:String,var morallesson:String,var agegroup:String){
    open fun RecordStories():String{
        return "$story of length $length has $morallesson to $agegroup  agegroup"
    }
}
class Story2(story:String,length:String,morallesson:String,agegroup:String):Story(story,length,morallesson,agegroup){
    override fun RecordStories():String{
        return "$story of length $length has $morallesson to $agegroup  agegroup"
    }
}
 open class StoryTeller(var storyteller:String,var story:String,var length:String,var morallesson:String,var agegroup:String){
    open fun RecordStories():String{
        return "$story story is being narrated by $storyteller storyteller and is of length $length has $morallesson to $agegroup  agegroup"
    }
}
class StoryTeller2(storyteller:String,story:String, length:String,morallesson:String,agegroup:String):StoryTeller(storyteller,story,length,morallesson,agegroup){
    override fun RecordStories():String{
        return "$story story is being narrated by $storyteller storyteller and is of length $length has $morallesson to $agegroup  agegroup"
    }
}

open class Translater(var translater:String,var language:String,var story: String){
    open fun TranslateStories():String{
        return "$translater translates $story story to $language language"
    }
}
class Translater2(translater:String,language:String,story: String):Translater(translater,language,story){
    override fun TranslateStories():String{
        return "$translater translates $story story to $language language"
    }
}

open class Recipe(var ingredients:String,var preparationtime:String,var cookingmethod:String,var nutritionalinfo:String){
    fun AfricaCuisine():String{
        return "There is different kind of recipes with different $ingredients ingridients with different $preparationtime time with different $cookingmethod method and with diffent $nutritionalinfo"
    }
}

class MorrocanRecipe(ingredients:String, preparationtime:String, cookingmethod:String,nutritionalinfo:String):Recipe(ingredients,preparationtime,cookingmethod,nutritionalinfo){
    fun MorrocanCuisine():String{
        return "The Morrocan recipe is avery special recipe $ingredients ingridients which take $preparationtime time and $cookingmethod method and with diffent $nutritionalinfo"
    }
}
class EthiopianRecipe(ingredients:String, preparationtime:String, cookingmethod:String,nutritionalinfo:String):Recipe(ingredients,preparationtime,cookingmethod,nutritionalinfo){
    fun EthiopianCuisine():String{
        return "The Ethipoian recipe is avery special recipe $ingredients ingridients which take $preparationtime time and $cookingmethod method and with diffent $nutritionalinfo"
    }
}
class NigerianRecipe(ingredients:String, preparationtime:String, cookingmethod:String,nutritionalinfo:String):Recipe(ingredients,preparationtime,cookingmethod,nutritionalinfo){
    fun NigerianCuisine():String{
        return "The Nigerian recipe is avery special recipe $ingredients ingridients which take $preparationtime time and $cookingmethod method and with diffent $nutritionalinfo"
    }
}

class Species(var diet:String,var lifespan:String,var migrationpatterns:String){
    fun trackSpecies():String{
        return "Different species have different $diet with different $lifespan} lifespan and have different $migrationpatterns migration patterns"

    }
}

