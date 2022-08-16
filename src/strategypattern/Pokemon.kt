package strategypattern

fun main() {
    val pikachu = PokemonContext("Pikachu", SecretType.CUT)
    val Pidgey = PokemonContext("Pidgey", SecretType.FLY)
    val Lapras = PokemonContext("Lapras", SecretType.SURF)

    pikachu.attack()
    Pidgey.attack()
    Lapras.attack()
}