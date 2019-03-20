package com.design.pattern.decorator.demo;

/**
 * 基本类
 */
public class BaseHandCake extends HandCake {
    @Override
    protected String describe() {
        return "手抓饼";
    }

    @Override
    public int price() {
        return 5;
    }
}
