package com.design.pattern.factorymethod;


/**
 * 工厂方法测试类
 * 优点：符合开闭原则，降低了客户端和工厂的耦合性
 * 缺点：每增加一个产品，就增加一个工厂
 */
public class FactoryTest {

    public static void main(String[] args) {
        ICarFactory AudiFactory=new AudiFactory();
        AudiFactory.create().run();

        ICarFactory cadillacFactory=new CadillacFactory();
        cadillacFactory.create().run();
    }

}
