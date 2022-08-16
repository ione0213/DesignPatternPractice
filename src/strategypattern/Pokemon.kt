package strategypattern

fun main() {
    val pikachu = PokemonContext("Pikachu", Secret01())
    val Pidgey = PokemonContext("Pidgey", Secret02())
    val Lapras = PokemonContext("Lapras", Secret03())

    pikachu.attack()
    Pidgey.attack()
    Lapras.attack()
}