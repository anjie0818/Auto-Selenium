package com.selenium.mukePageObject.page;

import com.selenium.mukePageObject.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class BasePage {
    public DriverBase driver;

    public BasePage(DriverBase driver) {
        this.driver = driver;
    }
    public WebElement element(By by){
        return driver.element(by);
    }
    public void click(WebElement webElement){
        if (webElement!=null) {
            webElement.click();
        }else {
            System.out.println("元素定位失败");
        }
    }
    public void sendKeys(WebElement webElement,String value){
        if (webElement!=null) {
            webElement.sendKeys(value);
        }else {
            System.out.println("元素定位失败");
        }
    }
    public boolean assertElementIs(WebElement webElement){
        return webElement.isDisplayed();
    }
}
