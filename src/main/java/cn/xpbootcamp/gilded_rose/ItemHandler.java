package cn.xpbootcamp.gilded_rose;

public interface ItemHandler {

    String AGED_BRIE = "Aged Brie";
    String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    String SULFURAS_HAND = "Sulfuras, Hand of Ragnaros";

    void handle();

    static ItemHandler createItemHandler(Item item){
        if (item.name.equals(BACKSTAGE_PASSES)) {
            return new BackstagePassHandler(item);
        } else if (item.name.equals(AGED_BRIE)) {
            return new AgedBrieHandler(item);
        } else if (item.name.equals(SULFURAS_HAND)) {
            return new SulfurasHandHandler(item);
        } else {
            return new OrdinaryProductHandler(item);
        }
    }
}
