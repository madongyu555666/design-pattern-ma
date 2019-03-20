package com.design.pattern.decorator.demo.old;


/**
 * 实现新的扩展接口
 */
public class SigninForThirdService implements ISigninForThirdService {
    private ISigninService signin;
    public SigninForThirdService(ISigninService iSignin){
        this.signin = iSignin;
    }
    @Override
    public ResultMsg loginForQQ(String id) {
        signin.regist("aa","1111");
        System.out.println("qq");
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return signin.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signin.login(username,password);
    }


}
