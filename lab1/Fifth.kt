fun isEven(a: Int): Boolean = a % 2 == 0

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    numbers.filter { isEven(it) }
    .forEach{ print("$it ") }
}
