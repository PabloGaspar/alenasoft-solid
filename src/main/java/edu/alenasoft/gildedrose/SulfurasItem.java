package edu.alenasoft.gildedrose;

public class SulfurasItem extends ItemDecorator {
    protected static  final  int MAX_QUALITY = 80;

    public SulfurasItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        //"Sulfuras" does not change its quality over time
    }

    @Override
    public int getMaxQuality() {
        return MAX_QUALITY;
    }
}
