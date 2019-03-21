package com.jerry.login.v2;

import com.jerry.login.ResultMsg;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 17:01
 */
public class LoginFoWebChatAdapter implements LoginAdapter {

    public boolean support(Object adapter) {
        return adapter instanceof LoginFoWebChatAdapter;
    }

    public ResultMsg login(String token, Object adapter) {
        return null;
    }
}
