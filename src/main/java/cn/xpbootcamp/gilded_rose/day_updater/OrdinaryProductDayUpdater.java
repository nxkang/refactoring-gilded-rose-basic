package cn.xpbootcamp.gilded_rose.day_updater;

import cn.xpbootcamp.gilded_rose.Item;

class OrdinaryProductDayUpdater implements ItemDayUpdater {

    private Item item;

    public OrdinaryProductDayUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void handle() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}
