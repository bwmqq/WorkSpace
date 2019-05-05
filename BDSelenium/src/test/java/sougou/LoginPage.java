package sougou;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.util.GetLocator;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage{
    public DriverBase driverBase;
    public LoginPage(DriverBase driverBase){
        this.driverBase = driverBase;
    }
    //获取登录
    public WebElement login(){
        return driverBase.findElement(GetLocator.GetLocator("Login"));
    }
    //获取搜狗账号密码登录
    public WebElement SGLogin(){
        return driverBase.findElement(GetLocator.GetLocator("UPLogin"));
    }
    //切换frame
    public WebElement wFrame(){
        return driverBase.findElement(GetLocator.GetLocator("wFrame"));
    }
    public WebElement nFrame(){
        return driverBase.findElement(GetLocator.GetLocator("nFrame"));
    }
    //获取账号
    public WebElement userName(){
        return driverBase.findElement(GetLocator.GetLocator("userName"));
    }
    //获取密码
    public WebElement passWord(){
        return driverBase.findElement(GetLocator.GetLocator("passWord"));
    }
    //获取登录
    public WebElement submit(){
        return driverBase.findElement(GetLocator.GetLocator("submit"));
    }








    //获取导航
    public List<WebElement> navigation(){
        return driverBase.findElements(GetLocator.GetLocator("Ergodic"));
    }



    /*//获取QQ登录
    public WebElement QQLogin(){
        return element(GetLocator.GetLocator("QQ"));
    }*/
    //获取frame
    public WebElement frameUP(){
        return driverBase.findElement(GetLocator.GetLocator("frameUP"));
    }
}
