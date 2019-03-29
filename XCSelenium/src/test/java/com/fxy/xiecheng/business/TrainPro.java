package com.fxy.xiecheng.business;

import com.fxy.xiecheng.base.DriverBase;
import com.fxy.xiecheng.handle.TrainHandle;

public class TrainPro {
    public TrainHandle trainHandle;
    public TrainPro(DriverBase driverBase){
        trainHandle = new TrainHandle(driverBase);
    }
    public void train(){
        trainHandle.webElementList();
        trainHandle.Train();
    }
}
