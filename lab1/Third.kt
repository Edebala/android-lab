fun isPrime(n: Int): Boolean {
    if (n < 2)
        return false

    for(i in 2..n/2)
        if(n % i == 0)
            return false

    return true
}

fun main() {
    for(i in 1..100)
    	if(isPrime(i))
        	print("$i, ")
}
