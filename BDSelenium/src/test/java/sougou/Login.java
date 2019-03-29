package sougou;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.testCase.CaseBase;
import com.fxy.baidu.util.ProUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends CaseBase {
    public DriverBase driver;
    public LoginPro loginPro;
    public ProUtil proUtil;
    @BeforeClass
    public void Login(){
        this.driver = InitDriver("chrome");
        loginPro = new LoginPro(driver);
        proUtil = new ProUtil("D:\\WorkSpace\\BDSelenium\\login.properties");
    }
    @Test
    public void login() throws Exception {
        driver.get(proUtil.getPro("url"));
        driver.max();
        loginPro.login(proUtil.getPro("userName"), proUtil.getPro("passWord"));
        /*driver.close();*/
    }
}
