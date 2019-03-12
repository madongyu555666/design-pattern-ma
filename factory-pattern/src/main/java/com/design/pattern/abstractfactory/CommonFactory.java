package com.design.pattern.abstractfactory;


import com.design.pattern.common.ICar;

/**
 * 公共工厂接口
 */
public interface CommonFactory {
    /**
     * 汽车
     * @return
     */
    ICar createCar();

    /**
     * 公共汽车
     * @return
     */
    IBus createBus();

}
