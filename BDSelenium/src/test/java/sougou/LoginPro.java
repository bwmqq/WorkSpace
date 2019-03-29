package sougou;

import com.fxy.baidu.base.DriverBase;
import sougou.LoginHandle;

public class LoginPro {
    public DriverBase driverBase;
    public LoginHandle loginHandle;
    public LoginPro(DriverBase driverBase){
        this.driverBase = driverBase;
        loginHandle = new LoginHandle(driverBase);
    }
    public void login(String userName, String passWord){
        loginHandle.login();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginHandle.frame();
        loginHandle.UPLogin();
        loginHandle.userName(userName);
        loginHandle.passWord(passWord);
        loginHandle.submit();










        /*loginHandle.QQLogin();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        /*loginHandle.UPLogin();*/
        /*loginHandle.navigation();*/
    }
}
