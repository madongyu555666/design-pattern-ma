package com.design.pattern.singleton.destructionsingle;


import com.design.pattern.singleton.Innerclass.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射破坏单例
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try{
            Class<?>  clazz= LazyInnerClassSingleton.class;
            Constructor c=clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object object1=c.newInstance();
            Object object2=c.newInstance();
            System.out.println(object1==object2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
