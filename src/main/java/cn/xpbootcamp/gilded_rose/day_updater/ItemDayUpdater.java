package cn.xpbootcamp.gilded_rose.day_updater;

import cn.xpbootcamp.gilded_rose.Item;

public interface ItemDayUpdater {

    String AGED_BRIE = "Aged Brie";
    String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    String SULFURAS_HAND = "Sulfuras, Hand of Ragnaros";

    void handle();

    static ItemDayUpdater createItemDayUpdater(Item item){
        if (item.name.equals(BACKSTAGE_PASSES)) {
            return new BackstagePassDayUpdater(item);
        } else if (item.name.equals(AGED_BRIE)) {
            return new AgedBrieDayUpdater(item);
        } else if (item.name.equals(SULFURAS_HAND)) {
            return new SulfurasHandDayUpdater(item);
        } else {
            return new OrdinaryProductDayUpdater(item);
        }
    }
}
