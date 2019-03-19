package com.fxy;

import com.fxy.selenium.util.ProUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListenerScreenShot.class})
public class LoginJianBan extends BaseDriver {
    public WebDriver driver;
    @Test
    public void InitDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Install\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imooc.com/");
        driver.manage().window().maximize();
        //Thread.sleep(1000);
    }
    @Test(dependsOnMethods = {"InitDriver"})
    public void LoginScript() throws Exception {
        String wenan = "慕圣7107086";
        //Thread.sleep(1000);
        this.Element(this.byStr("sy")).click();
        Thread.sleep(1000);
        WebElement email = this.Element(this.byStr("email"));
        //检测是否显示
        email.isDisplayed();
        WebElement pwd = this.Element(this.byStr("pwd"));
        pwd.isDisplayed();
        WebElement loginButton = this.Element(this.byStr("login"));
        loginButton.isDisplayed();
        ProUtil proUtil = new ProUtil("D:\\WorkSpace\\MKSelenium\\element.properties");
        String locator = proUtil.getPro("account");
        String userName = locator.split(">")[0];
        String passWord = locator.split(">")[1];
        email.sendKeys(userName);
        pwd.sendKeys(passWord);
        loginButton.click();
        Thread.sleep(1000);
        WebElement avators = this.Element(this.byStr("avator"));
        avators.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(avators).perform();
        String text = this.Element(this.byStr("text")).getText();
        if (text.equals(wenan)){
            this.takeScreenShot();
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }

    //封装By
    public By byStr(String key){
        ProUtil proUtil = new ProUtil("D:\\WorkSpace\\MKSelenium\\element.properties");
        String locator = proUtil.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if (locatorType.equals("id")){
            return By.id(locatorValue);
        }else if (locatorType.equals("name")){
            return By.name(locatorValue);
        }else if (locatorType.equals("className")){
            return By.className(locatorValue);
        }else if (locatorType.equals("xpath")){
            return By.xpath(locatorValue);
        }else if (locatorType.equals("cssSelector")){
            return By.cssSelector(locatorValue);
        }else if (locatorType.equals("linkText")){
            return By.linkText(locatorValue);
        }else if (locatorType.equals("partialLinkText")){
            return By.partialLinkText(locatorValue);
        }else {
            return By.tagName(locatorValue);
        }
    }
    //封装Element
    public WebElement Element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    public void SignOut() throws Exception {
        Thread.sleep(3000);
        //关闭驱动
        //driver.close();
        //退出浏览器
        driver.quit();
    }
    //psvm
    /*public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.InitDriver();
        login.LoginScript();
        login.SignOut();
    }*/
}
