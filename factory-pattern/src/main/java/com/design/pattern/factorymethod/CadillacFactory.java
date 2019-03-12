package com.design.pattern.factorymethod;


import com.design.pattern.common.CadillacCar;
import com.design.pattern.common.ICar;

/**
 * 生产凯迪拉克的工厂
 */
public class CadillacFactory  implements ICarFactory{
    @Override
    public ICar create() {
        return new CadillacCar();
    }
}
