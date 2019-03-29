package com.fxy.xiecheng.handle;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.page.TrainPage;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TrainHandle {
    public DriverBase driverBase;
    public TrainPage trainPage;
    public TrainHandle(DriverBase driverBase){
        this.driverBase = driverBase;
        trainPage = new TrainPage(driverBase);
    }
    public void webElementList(){
        List<WebElement> webElements = trainPage.webElementList();
        for (WebElement el : webElements) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            trainPage.click(el);
        }
    }
    public void Train(){
        trainPage.click(trainPage.Train());
    }
}
