package com.selenium.mukePageObject.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @创建人 anjie
 * @创建时间 2019/2/20
 * @描述
 */
public class SelectDriver {
    public WebDriver driverName(String browser){
        if (browser.equalsIgnoreCase("chrome"))
        System.setProperty("webdriver.chrome.driver", "F:\\IdeaProjects\\Auto-Selenium\\image\\chromedriver.exe");
        return new ChromeDriver();
    }
}
