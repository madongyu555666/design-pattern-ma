package com.design.pattern.simplefactory;


import com.design.pattern.common.AudiCar;
import com.design.pattern.common.ICar;

/**
 * 简单工厂模式测试类
 * 优点：把创建代码封装到工厂里，调用者感应不到，只需要传入响应的类型即可
 * 缺点：不符合开闭原则，没增加一个产品都要修改工厂代码，不易于扩展
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        ICar iCar= simpleFactory.create("Audi");
        iCar.run();

        //通过反射调用
        ICar iCar1=simpleFactory.createByclazz("com.design.pattern.common.AudiCar");
        iCar1.run();

        ICar iCar2=simpleFactory.create(AudiCar.class);
        iCar2.run();
    }
}
