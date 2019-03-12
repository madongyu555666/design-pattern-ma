package com.design.pattern;


/**
 * 浅克隆
 */
public class ShallowSeafoodCommodity implements Commodity{
    private  String  name;
    private  long  number;
    private  long  weight;
    private  long  unitPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public Commodity clone() {
        ShallowSeafoodCommodity seafoodCommodity=new ShallowSeafoodCommodity();
        seafoodCommodity.setName(this.name);
        seafoodCommodity.setNumber(this.number);
        seafoodCommodity.setUnitPrice(this.unitPrice);
        seafoodCommodity.setWeight(this.weight);
        return seafoodCommodity;
    }
}
