package com.design.pattern.decorator.demo;

public class SausageDecorator extends HandCakeDecorator {

    public SausageDecorator(HandCake handCake) {
        super(handCake);
    }

    @Override
    protected void doSomeThing() {}



    @Override
    protected String describe() {
        return super.describe()+"加一根香肠";
    }

    @Override
    protected int price() {
        return super.price()+1;
    }
}
