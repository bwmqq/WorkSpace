package com.fxy.xiecheng.business;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.handle.LoginHandle;

public class LoginPro {
    public LoginHandle loginHandle;
    public LoginPro(DriverBase driverBase){
        loginHandle = new LoginHandle(driverBase);
    }
    public void login(String userName, String passWord){
        loginHandle.clickToLogin();
        loginHandle.sendKeysName(userName);
        loginHandle.sendKeyPwd(passWord);
        loginHandle.clickLoginButton();
    }
}
