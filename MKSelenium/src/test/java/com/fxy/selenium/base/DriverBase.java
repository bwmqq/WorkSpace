package com.fxy.selenium.base;

import org.openqa.selenium.*;

public class DriverBase {
    public WebDriver driver;
    //获取driver
    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }
    //关闭驱动
    public void close(){
        System.out.println("stop webdriver");
        driver.close();
    }
    //退出浏览器
    public void quit(){
        System.out.println("stop webdriver");
        driver.quit();
    }
    //封装Element
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    /*//截图
    public void takeScreenShot(){
        //获取当前时间
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        //文件名加后缀
        path = path + ".png";
        //获取当前路径
        String curPath = System.getProperty("user.dir");
        String screenPath = curPath + "/" + path;
        //生成图片文件
        File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotAs, new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    //访问地址
    public void get(String url){
        driver.get(url);
    }
    //网页最大化
    public void max(){
        driver.manage().window().maximize();
    }
}
