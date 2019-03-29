package com.fxy.selenium.page;

import com.fxy.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public DriverBase driver;
    public BasePage(DriverBase driver){
        this.driver = driver;
    }
    //定位Element
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }
    //层级定位, 通过父节点定位子节点
    //需要传入父节点和子节点的By
    public WebElement nodeElement(By by, By nodeBy){
        WebElement element = this.element(by);
        return element.findElement(nodeBy);
    }
    //封装点击
    public void click(WebElement element){
        if (element != null){
            element.click();
        }else {
            System.out.println("元素没有定位到,点击失败!");
        }
    }
    //封装输入
    public void sendKeys(WebElement element, String value){
        if (element != null){
            element.sendKeys(value);
        }else {
            System.out.println("元素没有定位到,输入失败!");
        }
    }
    //判断元素是否显示
    public boolean assertElement(WebElement element){
        return element.isDisplayed();
    }
}
