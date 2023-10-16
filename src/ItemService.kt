class ItemService (itemRepo:ItemRepository) {
    private val itemRepository:ItemRepository;
    init{
        itemRepository = itemRepo;
    }
    fun selectRandomItems(n:Int):List<Item>{
        val buffer = mutableListOf<Item>();
        while(buffer.size < n){
            var newItem = itemRepository.randomItem();
            if(!buffer.contains(newItem))
                buffer.add(itemRepository.randomItem());
        }
        return buffer.toList();
    }
}