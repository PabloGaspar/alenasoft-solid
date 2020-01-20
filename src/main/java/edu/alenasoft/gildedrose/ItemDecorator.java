package edu.alenasoft.gildedrose;

public class ItemDecorator implements  QualityUpdatable {
    protected Item item;
    public  ItemDecorator(Item item){
        this.item = item;
    }

    @Override
    public void updateQuality() {
        this.item.updateQuality();
    }

    @Override
    public int getMaxQuality() {
        return item.getMaxQuality();
    }

    @Override
    public int getMinQuality() {
        return item.getMinQuality();
    }

    public void updateQualityTemplate(){
        this.updateQuality();
        this.controlQualityLimits();
        this.item.updateSellIn();
    }

    public  void controlQualityLimits(){
        if (this.item.getQuality() < this.getMinQuality())
            this.item.setQuality(this.getMinQuality());
        else if (this.item.getQuality() > this.getMaxQuality())
            this.item.setQuality(this.getMaxQuality());
    }
}
