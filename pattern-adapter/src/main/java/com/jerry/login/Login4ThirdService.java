package com.jerry.login;

import java.util.Date;

/**
 * 咕泡学员
 * Administrator
 * 2019/3/17 0017
 * 16:49
 */


public class Login4ThirdService {

    public ResultMsg registe(String username,String password,String addr,String email){
       return   new ResultMsg("200","注册成功","已注册成功，注册时间"+new Date());
    }

    public ResultMsg login(String username,String password){
        return   new ResultMsg("200","登录成功","已登录成功，登录时间"+new Date());
    }

    
}
