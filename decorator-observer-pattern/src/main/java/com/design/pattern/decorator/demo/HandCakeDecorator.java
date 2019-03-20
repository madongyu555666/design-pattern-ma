package com.design.pattern.decorator.demo;

public abstract class HandCakeDecorator extends  HandCake {
      private  HandCake handCake;

    public HandCakeDecorator(HandCake handCake) {
        this.handCake=handCake;
    }

    void  HandCakeDecorator(HandCake handCake){
          this.handCake=handCake;
      }
      protected abstract void doSomeThing();

    @Override
    protected String describe() {
        return this.handCake.describe();
    }

    @Override
    protected int price() {
        return this.handCake.price();
    }
}
