public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateParams() {
        increaseQualityByOne();
        if (sellIn < 11) {
            increaseQualityByOne(); 
        }
        if (sellIn < 6) {
            increaseQualityByOne(); 
        }
        if (sellIn < 0) {
            quality = 0; 
        }
        decreaseSellInByOne();
    }
}
