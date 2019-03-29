package com.fxy.selenium.testCase;

import org.testng.Assert;

public class TestAssert {
    public static void main(String[] args) {
        //当两个不一样时输出后值
        Assert.assertEquals("1", "1", "这两个值不一样");
        Assert.assertNotNull(null, "这是空值");
    }
}
