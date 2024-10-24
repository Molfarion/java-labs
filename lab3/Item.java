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
        if(quality < 50) {
            return quality++;
        }
        return quality;
    }

    public int decreaseQualityByOne() {
        if(quality > 0) {
            return quality--;
        }
        return quality;
    }

    public int decreaseSellInByOne() {
        return sellIn--;
    }
    
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
