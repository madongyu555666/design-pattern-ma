package com.design.pattern.singleton.hungry;


/**
 * 饿汉式（利用静态代码块）
 */
public class HungrySingletonStatic {
    private static final HungrySingletonStatic hungrySingleton;
    static {
        hungrySingleton = new HungrySingletonStatic();
    }
    private HungrySingletonStatic(){}

    public  static HungrySingletonStatic getInstance(){
        return hungrySingleton;
    }
}
