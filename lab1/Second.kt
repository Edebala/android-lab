fun main() {
	var daysOfWeek = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
    var tDays = daysOfWeek.filter{it.first() == 'T'};
    println(tDays);
    var containsE = daysOfWeek.filter{it.contains('e')};
    println(containsE);
    var lengthSix = daysOfWeek.filter{it.length==6};
    println(lengthSix);
}
