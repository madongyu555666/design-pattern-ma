package com.design.pattern.highsimulationproxy;


import java.lang.reflect.Method;

/**
 * 实现该接口，来增强被代理的类
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
