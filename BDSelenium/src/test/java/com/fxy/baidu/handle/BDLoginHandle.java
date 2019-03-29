package com.fxy.baidu.handle;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.page.BDLoginPage;

import java.util.List;

public class BDLoginHandle {
    public DriverBase driverBase;
    public BDLoginPage bdLoginPage;
    public BDLoginHandle(DriverBase driverBase){
        this.driverBase = driverBase;
        bdLoginPage = new BDLoginPage(driverBase);
    }
    public void login(){
        bdLoginPage.click(bdLoginPage.login());
    }
    public void QQlogin(){
        bdLoginPage.click(bdLoginPage.QQlogin());
    }
    public void frame(){
        List<String> windowsHandles = bdLoginPage.driver.getWindowsHandles();
        for (String win : windowsHandles) {
            String title = bdLoginPage.driver.driver.switchTo().window(win).getTitle();
            /*if (title.contains("QQ账号安全登录")){
                bdLoginPage.driver.switchWindows(win);
            }*/
            if (title.equals("百度一下，你就知道")){
                driverBase.switchWindows(win);
            }
        }
        System.out.println(driverBase.getTitle());
        bdLoginPage.frame(bdLoginPage.frmae());
    }
    public void UPLogin(){
        bdLoginPage.click(bdLoginPage.UPLogin());
    }
    public void userName(String userName){
        bdLoginPage.clear(bdLoginPage.userName());
        bdLoginPage.sendKeys(bdLoginPage.userName(), userName);
    }
    public void passWord(String passWord){
        bdLoginPage.clear(bdLoginPage.passWord());
        bdLoginPage.sendKeys(bdLoginPage.passWord(), passWord);
    }
    public void submit(){
        bdLoginPage.click(bdLoginPage.submit());
    }
}
