package sougou;

import com.fxy.baidu.base.DriverBase;
import sougou.LoginPage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginHandle {
    public DriverBase driverBase;
    public LoginPage loginPage;
    public LoginHandle(DriverBase driverBase){
        this.driverBase = driverBase;
        loginPage = new LoginPage(driverBase);
    }
    public void login(){
        driverBase.click(loginPage.login());
    }
    public void frame(){
        driverBase.frame(loginPage.wFrame());
        driverBase.frame(loginPage.nFrame());
    }
    public void UPLogin(){
        driverBase.click(loginPage.SGLogin());
    }
    public void userName(String userName){
        driverBase.clear(loginPage.userName());
        driverBase.sendKeys(loginPage.userName(), userName);
    }
    public void passWord(String passWord){
        driverBase.clear(loginPage.passWord());
        driverBase.sendKeys(loginPage.passWord(), passWord);
    }
    public void submit(){
        driverBase.click(loginPage.submit());
    }





    public void navigation(){
        List<WebElement> navigation = loginPage.navigation();
        for (WebElement el : navigation) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driverBase.click(el);
        }
    }

    /*public void QQLogin(){
        loginPage.click(loginPage.QQLogin());
    }
    public void UPLogin(){
        loginPage.click(loginPage.UPLogin());
    }*/
}
