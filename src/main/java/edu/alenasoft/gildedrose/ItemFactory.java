package edu.alenasoft.gildedrose;

public class ItemFactory {
    public static final String  AGED_BRIE = "Aged Brie";
    public static final String  SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String  BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String  CONJURED = "Conjured Mana Cake";

    public static ItemDecorator createItemDecorator(Item item){
        switch(item.getName()) {
            case AGED_BRIE:
                return new AgedBrieItem(item);
            case SULFURAS:
                return new SulfurasItem(item);
            case BACKSTAGE_PASSES:
                return  new BackstagePassItem(item);
            case CONJURED:
                return new ConjuredItem(item);
            default:
                return  new ItemDecorator(item);
        }
    }
}
