package com.fxy.selenium.testCase;

import com.fxy.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCourseList extends CaseBase {
    public DriverBase driver;
    public TestCourseList(){
        this.driver = InitDriver("chrome");
    }
    @Test
    public void CourseList() throws Exception {
        driver.get("https://coding.imooc.com/");
        driver.max();
        List<String> strings = this.listElement();
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//*[contains(text(), '" + strings.get(i) + "')]")).click();
            driver.back();
        }
        Thread.sleep(2000);
        driver.quit();
    }
    //获取所有课程的list
    public List<String> listElement(){
        List<String> sList = new ArrayList<String>();
        WebElement element = driver.findElement(By.className("index-list-wrap"));
        List<WebElement> elements = element.findElements(By.className("shizhan-intro-box"));
        for (WebElement el : elements) {
            sList.add(el.findElement(By.className("shizan-name")).getText());
        }
        return sList;
    }
}
