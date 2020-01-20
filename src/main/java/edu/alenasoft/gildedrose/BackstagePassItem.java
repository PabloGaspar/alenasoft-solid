package edu.alenasoft.gildedrose;

public class BackstagePassItem extends ItemDecorator {

    private static  final  int TEN_DAYS = 10;
    private static  final  int FIVE_DAYS = 5;

    public BackstagePassItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        super.item.setQuality(super.item.getQuality()+1);
        if (super.item.getSellIn()<=TEN_DAYS)
            super.item.setQuality(super.item.getQuality()+1);
        if (super.item.getSellIn()<=FIVE_DAYS)
            super.item.setQuality(super.item.getQuality()+1);
        if (super.item.getSellIn()<=0)
            super.item.setQuality(0);

    }
}
