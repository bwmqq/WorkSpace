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
        loginPage.click(loginPage.login());
    }
    public void frame(){
        loginPage.frame(loginPage.wFrame());
        loginPage.frame(loginPage.nFrame());
    }
    public void UPLogin(){
        loginPage.click(loginPage.SGLogin());
    }
    public void userName(String userName){
        loginPage.clear(loginPage.userName());
        loginPage.sendKeys(loginPage.userName(), userName);
    }
    public void passWord(String passWord){
        loginPage.clear(loginPage.passWord());
        loginPage.sendKeys(loginPage.passWord(), passWord);
    }
    public void submit(){
        loginPage.click(loginPage.submit());
    }





    public void navigation(){
        List<WebElement> navigation = loginPage.navigation();
        for (WebElement el : navigation) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            loginPage.click(el);
        }
    }

    /*public void QQLogin(){
        loginPage.click(loginPage.QQLogin());
    }
    public void UPLogin(){
        loginPage.click(loginPage.UPLogin());
    }*/
}
