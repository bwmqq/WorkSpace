package com.fxy.xiecheng.testCase;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.business.LoginPro;
import com.fxy.xiecheng.business.SearchPro;
import com.fxy.xiecheng.business.TrainPro;
import com.fxy.xiecheng.util.ProUtil;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginCase extends CaseBase {
    public DriverBase driver;
    public LoginPro loginPro;
    public TrainPro trainPro;
    public SearchPro searchPro;
    public ProUtil loginProUtil;
    public ProUtil searchProUtil;
    static Logger logger = Logger.getLogger(LoginCase.class);
    @BeforeClass
    public void LoginCase(){
        this.driver = InitDriver("chrome");
        loginPro = new LoginPro(driver);
        trainPro = new TrainPro(driver);
        searchPro = new SearchPro(driver);
        loginProUtil = new ProUtil("D:\\WorkSpace\\XCSelenium\\login.properties");
        searchProUtil = new ProUtil("D:\\WorkSpace\\XCSelenium\\search.properties");
    }
    @Test
    public void login(){
        driver.get(loginProUtil.getPro("url"));
        driver.max();
        loginPro.login(loginProUtil.getPro("userName"), loginProUtil.getPro("passWord"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = {"login"})
    public void train(){
        trainPro.train();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods = {"train"})
    public void search(){
        String chufazhan = loginProUtil.getPro("chufazhan");
        String daodazhan = loginProUtil.getPro("daodazhan");
        String chufariqi = loginProUtil.getPro("chufariqi");
        String fanhuiriqi = loginProUtil.getPro("fanhuiriqi");
        searchPro.search(chufazhan, daodazhan, chufariqi, fanhuiriqi);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterClass
    public void quit(){
        driver.quit();
    }
}
