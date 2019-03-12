package com.design.pattern;

public class CommodityTest {
    public static void main(String[] args) {
        ShallowSeafoodCommodity seafoodCommodity=new ShallowSeafoodCommodity();
        seafoodCommodity.setName("巴沙鱼");
        seafoodCommodity.setNumber(10);
        seafoodCommodity.setUnitPrice(10);
        seafoodCommodity.setWeight(20);
        EstablishCommodity establishCommodity=new EstablishCommodity(seafoodCommodity);
        ShallowSeafoodCommodity seafoodCommodityCopy=(ShallowSeafoodCommodity)establishCommodity.startClone(seafoodCommodity);
        //浅克隆
        System.out.println(seafoodCommodityCopy);
        System.out.println("克隆对象中的引用类型地址值：" + seafoodCommodityCopy.getName());
        System.out.println("原对象中的引用类型地址值：" + seafoodCommodity.getName());
        System.out.println("对象地址比较："+(seafoodCommodityCopy.getName() ==
                seafoodCommodity.getName()));
    }
}
