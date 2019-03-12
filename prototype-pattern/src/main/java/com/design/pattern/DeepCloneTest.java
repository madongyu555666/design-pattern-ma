package com.design.pattern;

public class DeepCloneTest {

    public static void main(String[] args) {
        DeepSeafoodCommodity deepSeafoodCommodity = new DeepSeafoodCommodity();
        try {
            DeepSeafoodCommodity clone = (DeepSeafoodCommodity)deepSeafoodCommodity.clone();
            System.out.println("深克隆：" + (deepSeafoodCommodity.good == clone.good));
        } catch (Exception e) {
            e.printStackTrace();
        }
        DeepSeafoodCommodity d = new DeepSeafoodCommodity();
        DeepSeafoodCommodity n = d.shallowClone(d);
        System.out.println("浅克隆：" + (d.good == n.good));
    }
}
