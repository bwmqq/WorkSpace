package com.fxy.xiecheng.util;

import java.io.*;
import java.util.Properties;

public class ProUtil {
    private Properties prop;
    private String filePath;
    //构造方法
    public ProUtil(String filePath){
        //传进来的filePath = 当前的filePath
        this.filePath = filePath;
        this.prop = readProperties();
    }
    //读取配置文件
    private Properties readProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            BufferedInputStream in = new BufferedInputStream(inputStream);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
    //读取配置文件
    public String getPro(String key) {
        if (prop.containsKey(key)){
            String sy = prop.getProperty(key);
            return sy;
        }else {
            System.out.println("你获取的key不存在");
            return "";
        }
    }
    //写入内容
    public void writePro(String key,String value){
        Properties pro = new Properties();
        try {
            FileOutputStream file = new FileOutputStream(filePath);
            pro.setProperty(key, value);
            pro.store(file, key);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
