fun main(){
    val ic = ItemController(ItemService(ItemRepository()));
    ic.quiz(5);
}