package strategypattern

class PokemonContext(
        private val name: String,
        secretType: SecretType
) {
    private var skill: Skill = when (secretType) {
        SecretType.CUT -> Secret01()
        SecretType.FLY -> Secret02()
        SecretType.SURF -> Secret03()
    }

    fun attack() {
        println("$name uses ${skill.attack()}")
    }
}