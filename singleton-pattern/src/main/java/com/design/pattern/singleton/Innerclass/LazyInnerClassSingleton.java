package com.design.pattern.singleton.Innerclass;

/**
 * 静态内部类
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        //当通过反射实例化时，可以通过判断显示创建多个实例
        if(LazyHolder.lazy != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static  final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }
    private static  class LazyHolder{
        private static final LazyInnerClassSingleton lazy=new LazyInnerClassSingleton();
    }

}
