package com.design.pattern.abstractfactory;

public class AudiIBus implements IBus {
    @Override
    public void ride() {
        System.out.println("乘坐奥迪公交");
    }
}
