package cn.xpbootcamp.gilded_rose;

public class OrdinaryProductHandler {

    private Item item;

    public OrdinaryProductHandler(Item item) {
        this.item = item;
    }

    public void handle() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sell_in = item.sell_in - 1;
        if (item.sell_in < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}
