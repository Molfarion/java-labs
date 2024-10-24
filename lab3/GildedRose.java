public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                item.increaseQualityByOne();
                if (item.sellIn < 0) {
                    item.increaseQualityByOne(); 
                }
                item.decreaseSellInByOne(); 
            } 

            else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.increaseQualityByOne();
                if (item.sellIn < 11) {
                    item.increaseQualityByOne(); 
                }
                if (item.sellIn < 6) {
                    item.increaseQualityByOne(); 
                }
                if (item.sellIn < 0) {
                    item.quality = 0; 
                }
                item.decreaseSellInByOne(); 
            } 

            else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
              // nothing to do for Sulfuras?
            }

            else {
                item.decreaseQualityByOne(); 
                item.decreaseSellInByOne();
                if (item.sellIn < 0) {
                    item.decreaseQualityByOne(); 
                }
            }
        }
    }
}
