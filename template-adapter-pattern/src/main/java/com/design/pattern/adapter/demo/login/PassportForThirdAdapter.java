package com.design.pattern.adapter.demo.login;


/**
 * 通过继承老版的类，在实现新的第三方接口，在实现的接口中来调用老版的方法
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }
    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForTelAdapter.class);
    }


    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }



    //这里用到了简单工厂模式及策略模式
    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)) {//进入qq登录的方法中比较一下是不是qq登录的实例（是不是兼容）
                return adapter.login(key, adapter);
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



}
