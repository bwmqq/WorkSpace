package sougou;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.page.BasePage;
import com.fxy.baidu.util.GetLocator;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends BasePage {
    public LoginPage(DriverBase driverBase){
        super(driverBase);
    }
    //获取登录
    public WebElement login(){
        return element(GetLocator.GetLocator("Login"));
    }
    //获取搜狗账号密码登录
    public WebElement SGLogin(){
        return element(GetLocator.GetLocator("UPLogin"));
    }
    //切换frame
    public WebElement wFrame(){
        return element(GetLocator.GetLocator("wFrame"));
    }
    public WebElement nFrame(){
        return element(GetLocator.GetLocator("nFrame"));
    }
    //获取账号
    public WebElement userName(){
        return element(GetLocator.GetLocator("userName"));
    }
    //获取密码
    public WebElement passWord(){
        return element(GetLocator.GetLocator("passWord"));
    }
    //获取登录
    public WebElement submit(){
        return element(GetLocator.GetLocator("submit"));
    }








    //获取导航
    public List<WebElement> navigation(){
        return elementList(GetLocator.GetLocator("Ergodic"));
    }



    /*//获取QQ登录
    public WebElement QQLogin(){
        return element(GetLocator.GetLocator("QQ"));
    }*/
    //获取frame
    public WebElement frameUP(){
        return element(GetLocator.GetLocator("frameUP"));
    }
}
