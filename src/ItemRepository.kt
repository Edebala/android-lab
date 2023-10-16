import java.io.File
import java.util.Random;
import kotlin.random.Random.Default.nextInt

class ItemRepository() {
    val items = mutableListOf<Item>();
    init{
        val lines = File("Items.txt").useLines{it.toList()};
        for(i in lines.indices step 6){
            val question = lines[i];
            val ans1 = lines[i+1];
            val ans2 = lines[i+2];
            val ans3 = lines[i+3];
            val ans4 = lines[i+4];
            val correct = lines[i+5];
            save(Item(question,listOf(ans1,ans2,ans3,ans4),correct?.toInt()))
        }
    };
    fun randomItem():Item{
        return items.random();
    }
    fun save(item: Item):Unit{
        items.add(item)
    }
    fun size():Int{
        return items.size;
    }
}