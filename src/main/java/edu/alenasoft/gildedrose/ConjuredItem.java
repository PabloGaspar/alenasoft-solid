package edu.alenasoft.gildedrose;

public class ConjuredItem extends ItemDecorator {
    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        this.item.setQuality(this.item.getQuality()-2);
        if (this.item.getSellIn()<=0)
            this.item.setQuality(this.item.getQuality()-2);
    }
}
