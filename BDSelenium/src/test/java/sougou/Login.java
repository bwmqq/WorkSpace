package sougou;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.testCase.CaseBase;
import com.fxy.baidu.util.HandleCookie;
import com.fxy.baidu.util.ProUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends CaseBase {
    public DriverBase driver;
    public LoginPro loginPro;
    public ProUtil proUtil;
    public HandleCookie handleCookie;
    @BeforeClass
    public void Login(){
        this.driver = InitDriver("chrome");
        loginPro = new LoginPro(driver);
        handleCookie = new HandleCookie(driver);
        proUtil = new ProUtil("D:\\WorkSpace\\BDSelenium\\login.properties");
    }
    @Test
    public void login() throws Exception {
        driver.get(proUtil.getPro("url"));
        driver.max();
        loginPro.login(proUtil.getPro("userName"), proUtil.getPro("passWord"));
        /*handleCookie.writeCookie();*/
    }
    @AfterClass
    public void quit(){
        driver.quit();
    }
}
