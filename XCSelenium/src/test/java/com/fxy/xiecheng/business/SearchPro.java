package com.fxy.xiecheng.business;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.handle.SearchHandle;

public class SearchPro {
    public DriverBase driverBase;
    public SearchHandle searchHandle;
    public SearchPro(DriverBase driverBase){
        this.driverBase = driverBase;
        searchHandle = new SearchHandle(driverBase);
    }
    public void search(String chuFaZhan, String daoDaZhan, String chuFaRiQi, String fanHuiRiQi){
        searchHandle.wangfan();
        searchHandle.chufazhan(chuFaZhan);
        searchHandle.chufariqi(chuFaRiQi);
        searchHandle.fanhuiriqi(fanHuiRiQi);
        searchHandle.daodazhan(daoDaZhan);
        searchHandle.shijiao();
        searchHandle.search();
    }
}
