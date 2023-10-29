fun main(){
    val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    val mutableDays = days.toMutableList()
    mutableDays.removeIf{ it.contains("n") }
    mutableDays.sort()

    for((index, value) in mutableDays.withIndex()) {
        println("$index: $value")
    }
}
