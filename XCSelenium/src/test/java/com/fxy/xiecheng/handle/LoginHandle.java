package com.fxy.xiecheng.handle;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.page.LoginPage;

public class LoginHandle {
    public DriverBase driverBase;
    public LoginPage loginPage;
    public LoginHandle(DriverBase driverBase){
        this.driverBase = driverBase;
        loginPage = new LoginPage(driverBase);
    }
    //点击登录入口
    public void clickToLogin(){
        loginPage.click(loginPage.toLogin());
    }
    //输入用户名
    public void sendKeysName(String userName){
        loginPage.sendKeys(loginPage.userName(), userName);
    }
    //输入密码
    public void sendKeyPwd(String passWord){
        loginPage.sendKeys(loginPage.passWord(), passWord);
    }
    //点击登录按钮
    public void clickLoginButton(){
        loginPage.click(loginPage.loginButton());
    }
}
