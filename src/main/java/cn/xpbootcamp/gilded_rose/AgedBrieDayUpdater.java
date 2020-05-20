package cn.xpbootcamp.gilded_rose;

public class AgedBrieDayUpdater implements ItemDayUpdater {

    private Item item;

    public AgedBrieDayUpdater(Item item) {
        this.item = item;
    }

    @Override
    public void handle() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        item.sell_in = item.sell_in - 1;
        if (item.sell_in < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }
}
