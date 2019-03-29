package com.fxy.xiecheng.page;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.util.GetLocator;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(DriverBase driverBase){
        super(driverBase);
    }
    //获取登录入口
    public WebElement toLogin(){
        return element(GetLocator.GetLocator("toLogin"));
    }
    //获取账号框
    public WebElement userName(){
        return element(GetLocator.GetLocator("userName"));
    }
    //获取密码框
    public WebElement passWord(){
        return element(GetLocator.GetLocator("passWord"));
    }
    //获取账号框
    public WebElement loginButton(){
        return element(GetLocator.GetLocator("loginButton"));
    }
}
