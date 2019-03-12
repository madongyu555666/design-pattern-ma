package com.design.pattern.abstractfactory;


import com.design.pattern.common.CadillacCar;
import com.design.pattern.common.ICar;

/**
 * 生产凯迪拉克牌的汽车和公交车
 */
public class CadillacFactory implements CommonFactory {
    @Override
    public ICar createCar() {
        return new CadillacCar();
    }

    @Override
    public IBus createBus() {
        return new CadillacIBus();
    }
}
