package com.selenium.mukePageObject.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class DriverBase {
    public WebDriver driver;
    public DriverBase(String  driverName) {
        SelectDriver selectDriver=new SelectDriver();
        this.driver = selectDriver.driverName(driverName);
    }
    public WebElement element(By by){
        return driver.findElement(by);
    }
    public void stop(){
        driver.close();
    }
    public void open(String url){
        driver.get(url);
    }
    public void maximize(){
        driver.manage().window().maximize();
    }

}
