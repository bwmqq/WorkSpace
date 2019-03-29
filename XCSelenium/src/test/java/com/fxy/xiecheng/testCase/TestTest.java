package com.fxy.xiecheng.testCase;

import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class TestTest {
    static Logger logger = Logger.getLogger(TestTest.class);
    public void test01(){
        System.out.println("test01");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }
    @Test(dependsOnMethods = {"test02"})
    public void test03(){
        System.out.println("test03");
    }
    @Test(dependsOnMethods = {"test03"})
    public void test04(){
        logger.debug("你说什么,这为什么不能用");
        System.out.println("test04");
    }




    /*@Test(groups="group1")
    public void test1() {
        System.out.println("test1 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group1")
    public void test11() {
        System.out.println("test11 from group1");
        Assert.assertTrue(true);
    }

    @Test(groups="group2")
    public void test2()
    {
        System.out.println("test2 from group2");
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite");
    }

    //只对group1有效，即test1和test11
    @BeforeGroups(groups="group1")
    public void beforeGroups()
    {
        System.out.println("beforeGroups");
    }

    //只对group1有效，即test1和test11
    @AfterGroups(groups="group1")
    public void afterGroups()
    {
        System.out.println("afterGroups");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod");
    }*/
}
