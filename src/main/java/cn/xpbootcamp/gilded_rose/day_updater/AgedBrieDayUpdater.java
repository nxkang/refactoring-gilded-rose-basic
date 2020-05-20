package cn.xpbootcamp.gilded_rose.day_updater;

import cn.xpbootcamp.gilded_rose.Item;

class AgedBrieDayUpdater implements ItemDayUpdater {

    private Item item;

    public AgedBrieDayUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void handle() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }
}
