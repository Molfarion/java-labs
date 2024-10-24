public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateParams() {
        for (Item item : items) {
            item.updateParams();
        }
    }
}
