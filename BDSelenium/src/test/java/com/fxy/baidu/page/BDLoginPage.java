package com.fxy.baidu.page;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.util.GetLocator;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BDLoginPage extends BasePage {
    public BDLoginPage(DriverBase driverBase){
        super(driverBase);
    }
    //获取登录
    public WebElement login(){
        return element(GetLocator.GetLocator("Login"));
    }
    //点击QQ登录
    public WebElement QQlogin(){
        return nodeElement(GetLocator.GetLocator("QQul"), GetLocator.GetLocator("QQui"));
    }
    //切换第三方登录
    public WebElement frmae(){
        return element(GetLocator.GetLocator("nFrame"));
    }
    //点击账号密码登录
    public WebElement UPLogin(){
        return element(GetLocator.GetLocator("UPLogin"));
    }
    //点击账号
    public WebElement userName(){
        return element(GetLocator.GetLocator("userName"));
    }
    //点击密码
    public WebElement passWord(){
        return element(GetLocator.GetLocator("passWord"));
    }
    //点击登录
    public WebElement submit(){
        return element(GetLocator.GetLocator("submit"));
    }
}
