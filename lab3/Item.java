public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void increaseQualityByOne() {
        if(quality < 50) {
            quality++;
        }
    }

    public void decreaseQualityByOne() {
        if(quality > 0) {
            quality--;
        }
    }

    public void decreaseSellInByOne() {
        sellIn--;
    }
    
    public void updateQuality() {
        decreaseQualityByOne(); 
        decreaseSellInByOne();
        if (sellIn < 0) {
            decreaseQualityByOne(); 
        }
    }
}
