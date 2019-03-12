package com.design.pattern.singleton.lazy;

/**
 * 懒汉式
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy=null;

    private LazySimpleSingleton(){}

    public synchronized static LazySimpleSingleton getInstance(){
        if (lazy==null){
            return new LazySimpleSingleton();
        }
        return  lazy;
    }
}
