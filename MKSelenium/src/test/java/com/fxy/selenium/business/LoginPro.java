package com.fxy.selenium.business;

import com.fxy.selenium.base.DriverBase;
import com.fxy.selenium.handle.LoginPageHandle;

public class LoginPro {
    public LoginPageHandle lph;
    public LoginPro(DriverBase driver){
        lph = new LoginPageHandle(driver);
    }
    public void login(String username, String password){
        if (lph.assertLoginPage()){
            /*lph.clickSy();*/
            lph.sendKeysUser(username);
            lph.sendKeysPwd(password);
            lph.clickLogin();
        }else {
            System.out.println("页面不存在或者状态错误!");
        }
    }
}
