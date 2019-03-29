package com.fxy.baidu.testCase;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.business.BDErgodicPro;
import com.fxy.baidu.business.BDLoginPro;
import com.fxy.baidu.util.ProUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BDLogin extends CaseBase {
    public DriverBase driver;
    public BDLoginPro bdLogin;
    public BDErgodicPro bdErgodic;
    public ProUtil proUtil;
    @BeforeClass
    public void Login(){
        this.driver = InitDriver("chrome");
        bdLogin = new BDLoginPro(driver);
        bdErgodic = new BDErgodicPro(driver);
        proUtil = new ProUtil("D:\\WorkSpace\\BDSelenium\\BDlogin.properties");
    }
    @Test
    public void login() throws Exception {
        driver.get(proUtil.getPro("url"));
        driver.max();
        driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        bdLogin.login(proUtil.getPro("userName"), proUtil.getPro("passWord"));
        Thread.sleep(6000);
    }
    /*@Test(dependsOnMethods = {"login"})
    public void ergodic(){
        bdErgodic.ergodic();
    }*/
    /*@AfterClass
    public void Quit() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }*/
}
