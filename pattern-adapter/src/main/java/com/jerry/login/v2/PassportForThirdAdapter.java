package com.jerry.login.v2;

import com.jerry.login.ResultMsg;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 17:01
 */
public interface IPassportForThird {

    public ResultMsg login4QQ(String qqToken);

    public ResultMsg login4WebChat(String webCharToken);

    public ResultMsg login4SinaChat(String sinaToken);
}
