fun main(){
    val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    val doubledNumbers = numbers.map { it * 2 }
    doubledNumbers.forEach { print("$it, ") }

    println("\nb.)")
    val capitalisedDays = days.map { it.uppercase() }
    capitalisedDays.forEach { print("$it, ") }

    println("\nc.)")

    val firstLetter = days.map{ it.first() }
    firstLetter.forEach { print("$it, ") }

    println("\nd.)")

    val lenOfDays = days.map{ it.length }
    lenOfDays.forEach { print("$it, ") }
}
