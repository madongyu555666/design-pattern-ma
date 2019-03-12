package com.design.pattern.abstractfactory;

public class CadillacIBus implements  IBus {
    @Override
    public void ride() {
        System.out.println("乘坐凯迪拉克公交");
    }
}
