public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateParams() {
        increaseQualityByOne();
        if (sellIn < 0) {
            increaseQualityByOne(); 
        }
        decreaseSellInByOne(); 
    }
}