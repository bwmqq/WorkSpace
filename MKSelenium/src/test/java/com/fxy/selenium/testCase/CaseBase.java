package com.fxy.selenium.testCase;

import com.fxy.selenium.base.DriverBase;

public class CaseBase {
    public DriverBase InitDriver(String browser){
        return new DriverBase(browser);
    }
}
