package edu.alenasoft.gildedrose;

public class AgedBrieItem extends ItemDecorator{
    public AgedBrieItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        super.item.setQuality(super.item.getQuality()+1);
        super.updateQuality();
    }
}
