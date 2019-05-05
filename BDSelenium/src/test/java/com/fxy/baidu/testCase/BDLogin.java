package com.fxy.baidu.testCase;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.business.BDErgodicPro;
import com.fxy.baidu.business.BDLoginOutPro;
import com.fxy.baidu.business.BDLoginPro;
import com.fxy.baidu.util.HandleCookie;
import com.fxy.baidu.util.SendEmail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BDLogin extends CaseBase {
    public DriverBase driver;
    public BDLoginPro bdLogin;
    public BDErgodicPro bdErgodic;
    public BDLoginOutPro bdLoginOutPro;
    public HandleCookie handleCookie;
    @BeforeClass
    @Parameters({"driverName"})
    public void Login(String driverName){
        this.driver = InitDriver(driverName);
        bdLogin = new BDLoginPro(driver);
        bdErgodic = new BDErgodicPro(driver);
        bdLoginOutPro = new BDLoginOutPro(driver);
        handleCookie = new HandleCookie(driver);
    }
    @Test
    @Parameters({"userName", "passWord"})
    public void login(String userName, String passWord) throws Exception {
        driver.get("https://www.baidu.com/");
        driver.max();
        driver.timeouts();
        bdLogin.login(userName, passWord);
        /*handleCookie.writeCookie("");*/
        Thread.sleep(7000);
    }
    @Test(dependsOnMethods = {"login"})
    public void ergodic(){
        driver.defaultWindouws();
        driver.timeouts();
        bdErgodic.ergodic();
    }
    @Test(dependsOnMethods = {"login"})
    public void loginOut(){
        driver.defaultWindouws();
        driver.timeouts();
        bdLoginOutPro.loginOut();
    }
    @AfterClass
    public void Quit() throws Exception {
        Thread.sleep(5000);
        driver.quit();
        SendEmail.sendToEmail("测试结束");
    }
}