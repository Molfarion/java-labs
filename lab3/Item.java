public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int increaseQualityByOne() {
        if (quality < 50) {
            quality++;
        }
        return quality;
    }
    
    public int decreaseQualityByOne() {
        if (quality > 0) {
            quality--;
        }
        return quality;
    }
    
    public int decreaseSellInByOne() {
        sellIn--;
        return sellIn;
    }
    
    
    public void updateParams() {
        decreaseQualityByOne(); 
        decreaseSellInByOne();
        if (sellIn < 0) {
            decreaseQualityByOne(); 
        }
    }
}
