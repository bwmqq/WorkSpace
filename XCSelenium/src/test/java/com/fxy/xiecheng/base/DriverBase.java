package com.fxy.xiecheng.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class DriverBase {
    public WebDriver driver;
    //获取driver
    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }
    //获取driver
    public WebDriver getDriver(){
        return driver;
    }
    //关闭驱动
    public void close(){
        System.out.println("close webdriver");
        driver.close();
    }
    //退出浏览器
    public void quit(){
        System.out.println("quit webdriver");
        driver.quit();
    }
    //封装Element
    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    //封装定位一组elements的方法
    public List<WebElement> findElements(By by){
        return driver.findElements(by);
    }
    //截图
    public void takeScreenShot() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String dateStr = sf.format(date);
        String path = this.getClass().getSimpleName() + "_" + dateStr + ".png";
        takeScreenShot((TakesScreenshot) this.getDriver(), path);
        //takeScreenShot((TakesScreenshot) driver, path);
    }
    //传入截图参数
    public void takeScreenShot(TakesScreenshot drivername, String path) {
        String currentPath = System.getProperty("user.dir"); // get current work
        File scrFile = drivername.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(currentPath + "\\" + path));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	System.out.println("截图成功");
        }
    }
    //访问地址
    public void get(String url){
        driver.get(url);
    }
    //网页最大化
    public void max(){
        driver.manage().window().maximize();
    }
    //点击返回
    public void back(){
        driver.navigate().back();
    }
    //获取当前url
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    //获取title
    public String getTitle(){
        return driver.getTitle();
    }
    //获取当前系统窗口list
    public List<String> getWindowsHandles(){
        Set<String> winHandels = driver.getWindowHandles();
        List<String> handles = new ArrayList<String>(winHandels);
        return handles;
    }
    //获取当前窗口
    public String getWindowHandle(){
        return driver.getWindowHandle();
    }
    //切换windows窗口
    public void switchWindows(String name){
        driver.switchTo().window(name);
    }
    //切换alert窗口
    public void switchAlert(){
        driver.switchTo().alert();
    }
    //模态框切换
    public void awitchToMode(){
        driver.switchTo().activeElement();
    }
    //移动鼠标
    public void moveToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    //获取Cookie
    public Set<Cookie> getCookie(){
        return driver.manage().getCookies();
    }
    //设置Cookie
    public void setCookies(Cookie cookies){
        driver.manage().addCookie(cookies);
    }
    //删除Cookie
    public void deleteCookies(Cookie cookie){
        driver.manage().deleteCookie(cookie);
    }
}
