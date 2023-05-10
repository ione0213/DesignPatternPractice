package prototypepattern

fun main() {
    // Shallow Clone
    val carOne = Car(4, Engine())
    val carTwo = carOne.clone() as Car

    println("car one wheel ${carOne.wheelNumber}")
    println("car two wheel ${carTwo.wheelNumber}")

    println("carOne == carTwo: ${carOne == carTwo}")
    println("carOne === carTwo: ${carOne === carTwo}")
    println("carOne.engine == carTwo.engine: ${carOne.engine == carTwo.engine}")


    // Deep clone
    val playerOne = Player("Nick", 18, Address("333", "Taiwan"))
    val playerTwo = playerOne.clone() as Player

    println("playerOne Name: ${playerOne.playerName}, age: ${playerOne.age}, Address : ${playerOne.address.zipCode}, ${playerOne.address.address}")
    println("playerTwo Name: ${playerTwo.playerName}, age: ${playerTwo.age}, Address : ${playerTwo.address.zipCode}, ${playerTwo.address.address}")

    println("playerOne == playerTwo: ${playerOne == playerTwo}")
    println("playerOne === playerTwo: ${playerOne === playerTwo}")
    println("playerOne.address == playerTwo.address: ${playerOne.address == playerTwo.address}")
}