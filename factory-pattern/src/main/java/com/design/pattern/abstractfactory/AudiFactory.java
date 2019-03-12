package com.design.pattern.abstractfactory;


import com.design.pattern.common.AudiCar;
import com.design.pattern.common.ICar;

/**
 * 生产奥迪牌汽车公交车
 */
public class AudiFactory implements CommonFactory {
    @Override
    public ICar createCar() {
        return new AudiCar();
    }

    @Override
    public IBus createBus() {
        return new AudiIBus();
    }
}
