package com.design.pattern.dynamicproxy;


import com.design.pattern.staticproxyinstance.DataSourceService;
import com.design.pattern.staticproxyinstance.DynamicDataSourceEntry;
import com.design.pattern.staticproxyinstance.IDataSourceService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 数据源动态代理类
 */
public class DataSourceServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target){
        this.target=target;
        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);

    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }


    private void before(Object target){
        try {
            System.out.println("代理前");
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
            DynamicDataSourceEntry.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void after(){
        System.out.println("代理后");
    }
}
