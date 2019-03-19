package com.fxy.selenium.testCase;

import com.fxy.selenium.base.DriverBase;
import com.fxy.selenium.business.LoginPro;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Login extends CaseBase {
    public DriverBase driver;
    public LoginPro loginPro;
    //static Logger logger = Logger.getLogger(Login.class);
    public Login(){
        this.driver = InitDriver("chrome");
        loginPro = new LoginPro(driver);
    }
    @Test
    public void getLoginHome() throws Exception {
        driver.get("https://www.imooc.com/");
        driver.max();
        driver.findElement(By.id("js-signin-btn")).click();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"getLoginHome"})
    public void testLogin() throws Exception {
        //logger.debug("这是第一次使用log4j打印日志");
        loginPro.login("17301047637", "fanxiangyang520");
        Thread.sleep(2000);
        driver.quit();
    }
}
