package com.fxy.baidu.page;

import com.fxy.baidu.base.DriverBase;
import com.fxy.baidu.util.GetLocator;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BDErgodicPage extends BasePage {
    public BDErgodicPage(DriverBase driverBase){
        super(driverBase);
    }
    //遍历导航
    public List<WebElement> ergodic(){
        WebElement er = element(GetLocator.GetLocator("er"));
        return er.findElements(GetLocator.GetLocator("Ergodic"));
    }
}
