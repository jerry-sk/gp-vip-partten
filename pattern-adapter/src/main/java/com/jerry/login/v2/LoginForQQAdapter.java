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
public class PassportForThirdAdapter implements IPassportForThird {
    private LoginService loginService;

    public PassportForThirdAdapter(LoginService loginService) {
        this.loginService = loginService;
    }


    public ResultMsg login4QQ(String qqToken) {
        return null;
    }

    public ResultMsg login4WebChat(String webCharToken) {
        return null;
    }

    public ResultMsg login4SinaChat(String sinaToken) {
        return null;
    }
}
