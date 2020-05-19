package cn.xpbootcamp.gilded_rose;

public class Item {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND = "Sulfuras, Hand of Ragnaros";

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    void update_item_quality() {
        if (name.equals(BACKSTAGE_PASSES)) {
            if (quality < 50) {
                quality = quality + 1;
                if (sell_in < 11) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }

                if (sell_in < 6) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
            }
            sell_in = sell_in - 1;
            if (sell_in < 0) {
                quality = 0;
            }
        } else if (name.equals(AGED_BRIE)) {
            if (quality < 50) {
                quality = quality + 1;
            }
            sell_in = sell_in - 1;
            if (sell_in < 0) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        } else if (!name.equals(SULFURAS_HAND)) {
            if (quality > 0) {
                quality = quality - 1;
            }
            sell_in = sell_in - 1;
            if (sell_in < 0) {
                if (quality > 0) {
                    quality = quality - 1;
                }
            }
        }
    }
}
