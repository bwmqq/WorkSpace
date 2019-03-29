package com.fxy.xiecheng.page;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.util.GetLocator;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    public SearchPage(DriverBase driverBase){
        super(driverBase);
    }
    //获取行程类型
    public WebElement wangfan(){
        return element(GetLocator.GetLocator("wangfan"));
    }
    //获取出发站
    public WebElement chufazhan(){
        return element(GetLocator.GetLocator("chufazhan"));
    }
    //获取到达站
    public WebElement daodazhan(){
        return element(GetLocator.GetLocator("daodazhan"));
    }
    //获取出发时间
    public WebElement chufariqi(){
        return element(GetLocator.GetLocator("chufariqi"));
    }
    //获取返回日期
    public WebElement fanhuiriqi(){
        return element(GetLocator.GetLocator("fanhuiriqi"));
    }
    //失去焦点
    public WebElement shiJiao(){
        return element(GetLocator.GetLocator("shijiao"));
    }
    //获取搜索
    public WebElement search(){
        return element(GetLocator.GetLocator("search"));
    }
}
