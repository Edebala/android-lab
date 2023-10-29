import kotlin.random.Random

fun main(){
    val random = Random(System.currentTimeMillis())
    val arraySize = 10
    val randomNumbers = IntArray(arraySize) { random.nextInt(101) }
    randomNumbers.sort()
    
    randomNumbers.forEach{ println(it) }

    var containsEven: Boolean = false
    var allNumbersEven: Boolean = true

    randomNumbers.forEach {
        if(it % 2 == 0)
            containsEven = true
        else
            allNumbersEven = false
    }

    if(containsEven) println("Contains even numbers!") else println("Doesn't contain even numbers!")
    if(allNumbersEven) println("All numbers are even!") else println("Not every number is even!")

    var sumFloat: Float = 0.0f
    randomNumbers.forEach{ sumFloat += it }

    print("Average: ${sumFloat / randomNumbers.size}")
}
