package com.design.pattern.decorator.demo.old;

public interface ISigninService {
    ResultMsg regist(String username, String password);
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
