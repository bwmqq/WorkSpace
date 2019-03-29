package com.fxy.xiecheng.handle;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.page.SearchPage;

public class SearchHandle {
    public DriverBase driverBase;
    public SearchPage searchPage;
    public SearchHandle(DriverBase driverBase){
        this.driverBase = driverBase;
        searchPage = new SearchPage(driverBase);
    }
    public void wangfan(){
        searchPage.click(searchPage.wangfan());
    }
    public void chufazhan(String chuFaZhan){
        searchPage.clear(searchPage.chufazhan());
        searchPage.sendKeys(searchPage.chufazhan(), chuFaZhan);
    }
    public void daodazhan(String daoDaZhan){
        searchPage.clear(searchPage.daodazhan());
        searchPage.sendKeys(searchPage.daodazhan(), daoDaZhan);
    }
    public void chufariqi(String chuFaRiQi){
        searchPage.clear(searchPage.chufariqi());
        searchPage.sendKeys(searchPage.chufariqi(), chuFaRiQi);
    }
    public void fanhuiriqi(String fanHuiRiQi){
        searchPage.clear(searchPage.fanhuiriqi());
        searchPage.sendKeys(searchPage.fanhuiriqi(), fanHuiRiQi);
    }
    public void shijiao(){
        searchPage.click(searchPage.shiJiao());
    }
    public void search(){
        searchPage.click(searchPage.search());
    }
}
