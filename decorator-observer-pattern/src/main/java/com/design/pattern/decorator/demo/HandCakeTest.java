package com.design.pattern.decorator.demo;

public class HandCakeTest {

    public static void main(String[] args) {
        HandCake handCake=new BaseHandCake();

        handCake=new EggDecorator(handCake);

        handCake=new SausageDecorator(handCake);

        System.out.println(handCake.describe()+"-------------"+handCake.price());
    }
}
