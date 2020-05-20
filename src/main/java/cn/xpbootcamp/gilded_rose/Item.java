package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.day_updater.ItemDayUpdater;

public class Item {

    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItemQuality() {
        ItemDayUpdater.createItemHandler(this).handle();
    }

}
