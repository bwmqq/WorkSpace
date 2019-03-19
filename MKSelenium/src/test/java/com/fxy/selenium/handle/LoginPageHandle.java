package com.fxy.selenium.handle;

import com.fxy.selenium.base.DriverBase;
import com.fxy.selenium.page.LoginPage;

public class LoginPageHandle {
    public DriverBase driver;
    public LoginPage loginPage;
    public LoginPageHandle(DriverBase driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }
    //点击登录
    /*public void clickSy(){
        loginPage.click(loginPage.getSyElement());
    }*/
    //输入用户名
    public void sendKeysUser(String userName){
        loginPage.sendKeys(loginPage.getUserElement(), userName);
    }
    //输入密码
    public void sendKeysPwd(String pwd){
        loginPage.sendKeys(loginPage.getPwdElement(), pwd);
    }
    //登录
    public void clickLogin(){
        loginPage.click(loginPage.getLoginElement());
    }
    //判断是否是登录页面
    public Boolean assertLoginPage(){
        return loginPage.assertElement(loginPage.getUserElement());
    }
}
