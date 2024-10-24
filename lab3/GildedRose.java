public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item:items) {
            if (item.name.equals("Aged Brie")) {
                item.increaseQualityByOne();
            }
            
            else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.increaseQualityByOne();
        
                if (item.sellIn < 11) {
                    item.increaseQualityByOne();
                }
        
                if (item.sellIn < 6) {
                    item.increaseQualityByOne();
                }
            }

            else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.decreaseQualityByOne();
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.decreaseSellInByOne();
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                            item.decreaseQualityByOne();
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    item.increaseQualityByOne();
                }
            }
        }
    }
}
