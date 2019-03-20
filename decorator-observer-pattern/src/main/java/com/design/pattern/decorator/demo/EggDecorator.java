package com.design.pattern.decorator.demo;

public class EggDecorator extends HandCakeDecorator {



    public EggDecorator(HandCake handCake){
          super(handCake);
    }


    @Override
    protected void doSomeThing() {}


    @Override
    protected String describe() {
        return super.describe()+"加一个鸡蛋";
    }

    @Override
    protected int price() {
        return super.price()+1;
    }
}
