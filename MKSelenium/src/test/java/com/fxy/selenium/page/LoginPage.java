package com.fxy.selenium.page;

import com.fxy.selenium.base.DriverBase;
import com.fxy.selenium.util.GetLocator;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(DriverBase driver){
        super(driver);
    }
    //获取登录页面
    /*public WebElement getSyElement(){
        return element(GetLocator.GetLocator("sy"));
    }*/
    //获取用户名输入框
    public WebElement getUserElement(){
        return element(GetLocator.GetLocator("email"));
    }
    //获取密码输入框
    public WebElement getPwdElement(){
        return element(GetLocator.GetLocator("pwd"));
    }
    //获取登录按钮
    public WebElement getLoginElement(){
        return element(GetLocator.GetLocator("login"));
    }
    //获取详情
    public WebElement getAvatorElement(){
        return element(GetLocator.GetLocator("avator"));
    }
    //获取内容
    public WebElement getTextElement(){
        return element(GetLocator.GetLocator("text"));
    }
}
