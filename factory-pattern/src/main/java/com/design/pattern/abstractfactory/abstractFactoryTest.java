package com.design.pattern.abstractfactory;

import java.util.ConcurrentModificationException;

/**
 * 抽象工厂测试类
 * 优点：易于扩展
 * 缺点：添加新产品，需要修改抽象工厂的接口，不符合开闭原则
 */
public class abstractFactoryTest {
    public static void main(String[] args) {
         CommonFactory commonFactory=new AudiFactory();
         commonFactory.createCar().run();
         commonFactory.createBus().ride();
    }
}
