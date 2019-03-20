package com.design.pattern.decorator.demo.old;

public interface ISigninForThirdService extends ISigninService {

    /**
     * QQ 登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);
    /**
     * 微信登录
     * @param id
     * @return
     */
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

    ResultMsg loginForRegist(String username, String passport);
}
