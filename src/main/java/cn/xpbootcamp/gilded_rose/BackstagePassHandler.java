package cn.xpbootcamp.gilded_rose;

public class BackstagePassHandler {

    private Item item;

    public BackstagePassHandler(Item item) {
        this.item = item;
    }

    public void handle() {
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
    }
}
