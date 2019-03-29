package com.fxy.xiecheng.page;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.util.GetLocator;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TrainPage extends BasePage {
    public TrainPage(DriverBase driverBase){
        super(driverBase);
    }
    //遍历出行方式
    public List<WebElement> webElementList(){
        WebElement modeType = element(GetLocator.GetLocator("modeType"));
        return modeType.findElements(GetLocator.GetLocator("modeTypes"));
    }
    //点击火车
    public WebElement Train(){
        return element(GetLocator.GetLocator("train"));
    }
}
