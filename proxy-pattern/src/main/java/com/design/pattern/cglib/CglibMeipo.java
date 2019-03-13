package com.design.pattern.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用Cglib代理
 */
public class CglibMeipo implements MethodInterceptor {


    public Object getInstance(Class<?> clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
        before();
        Object obj = methodProxy.invokeSuper(o,objects);//调用父类

        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }
}
