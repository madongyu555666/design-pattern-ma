package com.design.pattern.factorymethod;


import com.design.pattern.common.AudiCar;
import com.design.pattern.common.ICar;

/**
 * 生产奥迪车的工厂
 */
public class AudiFactory implements ICarFactory {
    @Override
    public ICar create() {
        return new AudiCar();
    }
}
