package edu.alenasoft.gildedrose;

public class Item implements QualityUpdatable{

  protected static  final  int MIN_QUALITY = 0;
  protected static  final  int MAX_QUALITY = 50;

  public String name;
  public int sellIn;
  public int quality;

  public Item(String name, int sellIn, int quality) {
    this.setName(name);
    this.setSellIn(sellIn);
    this.setQuality(quality);
  }

  /* Generated getter and setter code */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSellIn() {
    return sellIn;
  }

  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }

  public int getQuality() {
    return quality;
  }

  public void setQuality(int quality) { this.quality = quality; }

  @Override
  public String toString() {
    return "Item{" + "name='" + name + '\'' + ", sellIn=" + sellIn + ", quality=" + quality + '}';
  }

  @Override
  public void updateQuality() {
    this.setQuality(this.getQuality()-1);
    if (this.getSellIn()<=0)
      this.setQuality(this.getQuality()-1);
  }

  @Override
  public int getMaxQuality() {
    return MAX_QUALITY;
  }

  @Override
  public int getMinQuality() {
    return MIN_QUALITY;
  }

  public void updateSellIn(){
    this.setSellIn(this.getSellIn()-1);
  }
}
