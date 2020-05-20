package cn.xpbootcamp.gilded_rose.day_updater;

import cn.xpbootcamp.gilded_rose.Item;

class SulfurasHandDayUpdater implements ItemDayUpdater {

    private Item item;

    public SulfurasHandDayUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void handle() {
        // do nothing
    }
}
