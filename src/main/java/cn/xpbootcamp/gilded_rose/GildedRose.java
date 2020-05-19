package cn.xpbootcamp.gilded_rose;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (int i = 0; i < items.length; i++) {
            update_item_quality(items[i]);
        }
    }

    private void update_item_quality(Item item) {
        if (item.name.equals(BACKSTAGE_PASSES)) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
                if (item.sell_in < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }

                if (item.sell_in < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
            item.sell_in = item.sell_in - 1;
            if (item.sell_in < 0) {
                item.quality = 0;
            }
        } else if (item.name.equals(AGED_BRIE)) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
            item.sell_in = item.sell_in - 1;
            if (item.sell_in < 0) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        } else if (!item.name.equals(SULFURAS_HAND)) {
            item.sell_in = item.sell_in - 1;
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
            if (item.sell_in < 0) {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
            }
        }
    }
}
