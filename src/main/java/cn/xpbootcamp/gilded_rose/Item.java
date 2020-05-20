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
            new BackstagePassHandler(this).handle();
        } else if (name.equals(AGED_BRIE)) {
            new AgedBrieHandler(this).handle();
        } else if (name.equals(SULFURAS_HAND)) {
            new SulfurasHandHandler(this).handle();
        } else {
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
