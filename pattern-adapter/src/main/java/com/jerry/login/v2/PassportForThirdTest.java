package com.jerry.login.v2;

import com.jerry.login.LoginService;
import com.jerry.login.ResultMsg;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 17:01
 */
//适配器  关键一点是要兼容已有的功能，我们可以继承来达到此目的亦可持有改对象来达到此目的
public class PassportForThirdTest implements IPassportForThird {
    private LoginService loginService;

    public PassportForThirdTest(LoginService loginService) {
        this.loginService = loginService;
    }


    public ResultMsg login4QQ(String qqToken) {
        LoginAdapter adapter =  createAdapter(LoginForSinaAdapter.class);
        return adapter.login(qqToken,adapter);
    }

    public ResultMsg login4WebChat(String webCharToken) {
        LoginAdapter adapter =  createAdapter(LoginFoWebChatAdapter.class);
        return adapter.login(webCharToken,adapter);
    }

    public ResultMsg login4SinaChat(String sinaToken) {
        LoginAdapter adapter =  createAdapter(LoginForSinaAdapter.class);
        return adapter.login(sinaToken,adapter);
    }

    /**
     * 简单工厂
     * @param clz
     * @return
     */
    public  LoginAdapter createAdapter(Class<? extends LoginAdapter> clz)  {
       try {
           LoginAdapter loginAdapter = clz.newInstance();
           return loginAdapter;
       }catch (Exception e){
           e.fillInStackTrace();
       }
       return  null ;
    }
}
