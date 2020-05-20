package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.day_updater.ItemDayUpdater;

import java.util.Arrays;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        Arrays.stream(items).forEach(item -> {
            ItemDayUpdater.createItemDayUpdater(item).handle();
        });
    }
}
