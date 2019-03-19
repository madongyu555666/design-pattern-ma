package com.design.pattern.adapter.demo.login;

public interface IPassportForThird {

    ResultMsg loginForQQ(String id);

    ResultMsg loginForWechat(String id);
    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);
    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}
