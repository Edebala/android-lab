import java.util.TreeSet
import java.util.HashSet

interface IDictionary {
	fun size() : Int
	fun add(word:String) : Boolean
	fun find(word:String) : Boolean
}

enum class DictionaryType {ARRAY_LIST, TREE_SET, HASH_SET}

object ListDictionary: IDictionary {
	private val words = mutableListOf<String>()
	override fun add(word:String) : Boolean{return words.add(word)}
	
	override fun find(word:String) : Boolean{return words.find{it == word} != null }
	
	override fun size() : Int{return words.count()}
    
    init{
    	listOf("Hello","Darkness","My","Old","Friend","I","Have","Come","To","Talk","With","You","Again").forEach{this.add(it)};
    }
}

object TreeSetDictionary: IDictionary {
	private val words = TreeSet<String>()
	override fun add(word:String) : Boolean{return words.add(word)}
	
	override fun find(word:String) : Boolean{return words.find{it == word} != null }
	
	override fun size() : Int{return words.count()}
    
    init{
    	listOf("Hello","Darkness","My","Old","Friend","I","Have","Come","To","Talk","With","You","Again").forEach{this.add(it)};
    }
}

object HashSetDictionary: IDictionary {
	private val words = HashSet<String>()
	override fun add(word:String) : Boolean{return words.add(word)}
	
	override fun find(word:String) : Boolean{return words.find{it == word} != null }
	
	override fun size() : Int{return words.count()}
    
    init{
    	listOf("Hello","Darkness","My","Old","Friend","I","Have","Come","To","Talk","With","You","Again").forEach{this.add(it)};
    }
}

class DictionaryProvider{
    companion object {
        fun createDictionary(type: DictionaryType): IDictionary{
            return when (type) {
                DictionaryType.ARRAY_LIST -> ListDictionary
                DictionaryType.TREE_SET -> TreeSetDictionary
                DictionaryType.HASH_SET -> HashSetDictionary
            }
        }
    }
}

fun main(){
    val ld : IDictionary = DictionaryProvider.createDictionary(DictionaryType.ARRAY_LIST);
    println(ld.find("Wazaaaap"));
	println(ld.add("Wazaaaap"));
    println(ld.find("Wazaaaap"));
}
