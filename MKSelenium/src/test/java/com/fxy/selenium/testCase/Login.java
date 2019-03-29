package com.fxy.selenium.testCase;

import com.fxy.selenium.base.DriverBase;
import com.fxy.selenium.business.LoginPro;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Login extends CaseBase {
    public DriverBase driver;
    public LoginPro loginPro;
    static Logger logger = Logger.getLogger(Login.class);
    public Login(){
        this.driver = InitDriver("chrome");
        loginPro = new LoginPro(driver);
    }
    /*@Test
    public void getLoginHome() throws Exception {
        driver.get("https://www.imooc.com/");
        driver.max();
        driver.findElement(By.id("js-signin-btn")).click();
        Thread.sleep(2000);
    }*/
    @Test
    public void testLogin() throws Exception {
        driver.get("https://coding.imooc.com/class/321.html");
        driver.max();
        String courseDetil = driver.findElement(By.className("path")).findElement(By.tagName("span")).getText();
        driver.findElement(By.id("buy-trigger")).click();
        //logger.debug("这是第一次使用log4j打印日志");
        loginPro.login("17301047637", "fanxiangyang520");
        Thread.sleep(2000);
        driver.get("https://order.imooc.com/myorder");
        driver.findElement(By.className("order-cancel")).click();
        driver.findElement(By.xpath("//*[@id=\"c_container\"]/div[2]/ul/li[7]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("确认")).click();
        Thread.sleep(1000);
        driver.get("https://coding.imooc.com/class/321.html");
        /*driver.quit();*/
    }
    //获取课程信息
    public String getCourseText(WebElement element){
        return element.getText();
    }
    //下单流程
    @Test(dependsOnMethods = {"testLogin"})
    public void buyCourse() throws Exception {
        /*driver.get("https://coding.imooc.com/class/321.html");*/
        String courseDetil = driver.findElement(By.className("path")).findElement(By.tagName("span")).getText();
        driver.findElement(By.id("buy-trigger")).click();
        driver.findElement(By.linkText("提交订单")).click();
        /*String orderText = driver.findElement(By.className("item")).findElement(By.tagName("dt")).getText();*/
        Thread.sleep(1000);
        String orderText = driver.findElement(By.className("item")).findElement(By.tagName("dt")).getText();
        if (orderText != null){
            Assert.assertEquals(courseDetil, orderText, "不一致");
        }
    }
}
