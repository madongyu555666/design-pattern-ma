package com.design.pattern.singleton.seriable;


import java.io.Serializable;

/**
 * 使用序列化破坏单例
 */
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return instance;
    }

    /**
     * 填加该方法，防止序列化破坏
     * @return
     */
    private Object readResolve(){
        return instance;
    }
}
