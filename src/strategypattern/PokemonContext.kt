package strategypattern

class PokemonContext(
        private val name: String,
        private val skill: Skill
) {

    fun attack() {
        println("$name uses ${skill.attack()}")
    }
}