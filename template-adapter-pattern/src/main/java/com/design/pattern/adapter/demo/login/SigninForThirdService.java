package com.design.pattern.adapter.demo.login;

/**
 * 适配器模式：在原来代码不变的情况下，继承老的类，来扩展
 */
public class SigninForThirdService extends SiginService{

    public ResultMsg loginForQQ(String openId){
//1、openId 是全局唯一，我们可以把它当做是一个用户名(加长)
//2、密码默认为QQ_EMPTY
//3、注册（在原有系统里面创建一个用户）
//4、调用原来的登录方法


        return loginForRegist(openId,null);
    }
    public ResultMsg loginForWechat(String openId){
        return null;
    }
    public ResultMsg loginForToken(String token){
//通过token 拿到用户信息，然后再重新登陆了一次
        return null;
    }
    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

    /**
     * 调用老方法去注册登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }
}
