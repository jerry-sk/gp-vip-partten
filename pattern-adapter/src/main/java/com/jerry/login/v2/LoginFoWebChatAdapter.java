package com.jerry.login.v2;

import com.jerry.login.LoginService;
import com.jerry.login.ResultMsg;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 17:01
 */
public class LoginForQQAdapter implements LoginAdapter {

    public boolean support(Object adapter) {
        return adapter instanceof LoginAdapter;
    }

    public ResultMsg login(String token, Object adapter) {
        return null;
    }
}
