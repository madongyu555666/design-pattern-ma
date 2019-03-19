package com.design.pattern.adapter.demo.login;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
