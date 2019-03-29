package com.fxy.selenium.handle;

import com.fxy.selenium.base.DriverBase;
import com.fxy.selenium.page.CoursePage;

public class CoursePageHandle {
    public DriverBase driver;
    public CoursePage coursePage;
    public CoursePageHandle(DriverBase driver){
        this.driver = driver;
        coursePage = new CoursePage(driver);
    }
}
