fun String.makeMonogram() : String 
= this.split(" ").map{it.first()}.joinToString("")

fun List<String>.concat() : String 
= this.joinToString("#")

fun List<String>.longest() : String 
= this.map(it.length())

fun main() {
    println(("John Smith").makeMonogram())
    println(listOf("John","Smith").concat())
}
