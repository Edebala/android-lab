class ItemController(itemServ:ItemService) {
    val itemService:ItemService
    init{
        itemService = itemServ
    }
    fun quiz(n:Int){
        var points = 0
        val list = itemService.selectRandomItems(n)
        for(item in list){
            println(item.question)
            for(answer in item.answers)
                println(answer)
            var ans = readLine()?.toInt()
            if(ans == item.correct)
                points++
        }
        println("You answered correctly to $points questions. grat")
    }
}