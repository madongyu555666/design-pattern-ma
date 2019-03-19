package com.design.pattern.adapter.demo.login;

public class LoginForQQAdapter implements LoginAdapter{

    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        System.out.println("qq登录");//进入qq登录的适配器，在该方法中可以调用以前的老版本方法
        return null;
    }
}
